package template;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class Goblin extends MonstroIA {

	@Override
	public Point position() {
		return new Point(100, 100);
	}

	@Override
	public Dimension dimension() {
		return new Dimension(20, 20);
	}

	@Override
	public boolean isImage() {
		return false;
	}

	@Override
	public boolean isRound() {
		return true;
	}

	@Override
	public Point round() {
		return new Point(5, 5);
	}

	@Override
	public BufferedImage image() {
		return null;
	}

	@Override
	public Color colorFill() {
		return new Color(118, 156, 6, 61);
	}

	@Override
	public Color colorBorder() {
		return Color.BLACK;
	}

	@Override
	public String name() {
		return "Goblin";
	}

	@Override
	public Color colorName() {
		return Color.BLACK;
	}

}
