package view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Painel extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage fundo;

	public Painel() {
		setSize(Tela.LARGURA, Tela.ALTURA);

		fundo = new BufferedImage(Tela.LARGURA, Tela.ALTURA, BufferedImage.TYPE_4BYTE_ABGR);

		setLayout(null);

		setVisible(true);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(fundo, 0, 0, Color.WHITE, null);
	}

	public Graphics getFundo() {
		return fundo.getGraphics();
	}

}
