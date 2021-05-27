package controller;

import java.awt.Graphics;
import java.util.Arrays;
import java.util.List;

import template.MonstroIA;
import view.Tela;

public class Controller implements Runnable {

	Tela tela;
	Thread thread;
	Graphics graficos;
	List<MonstroIA> monstros;

	public Controller(MonstroIA... monstro) {

		this.monstros = Arrays.asList(monstro);

		tela = new Tela();
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void run() {

		tela.getPainel().requestFocus();
		graficos = tela.getPainel().getFundo();

		while (true) {

			try {
				drawMonstros(graficos);
				gameDraw();
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	private void drawMonstros(Graphics g) {
		for (MonstroIA m : monstros) {
			m.render(g);
		}
	}

	private void gameDraw() {

		tela.getPainel().repaint();
	}

}
