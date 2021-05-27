package template;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.image.BufferedImage;

public class Org extends MonstroIA {

	@Override
	public Point position() {
		return new Point(300, 100);
	}

	@Override
	public Dimension dimension() {
		return new Dimension(50, 50);
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
		return new Point(50, 50);
	}

	@Override
	public BufferedImage image() {
		return null;
	}

	@Override
	public Color colorFill() {
		return new Color(36, 92, 1, 36);
	}

	@Override
	public Color colorBorder() {
		return Color.RED;
	}

	@Override
	public String name() {
		return "Org";
	}

	@Override
	public Color colorName() {
		return Color.BLACK;
	}

}
