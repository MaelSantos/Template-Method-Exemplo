package view;

import javax.swing.JFrame;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final int LARGURA = 500;
	public static final int ALTURA = 500;

	private Painel painel;

	public Tela() {

		super("Renderizamento de Mosntros");

		setSize(LARGURA, ALTURA);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setResizable(false);

		setLocationRelativeTo(null);

		painel = new Painel();
		add(painel);

		setVisible(true);

	}

	public Painel getPainel() {
		return painel;
	}

}
