package template;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.image.BufferedImage;

public abstract class MonstroIA {

	protected int x, y, largura, altura;
	protected BufferedImage image;

	public void render(Graphics g) {
		Point p = position();
		Dimension d = dimension();

		g.setColor(colorFill());

		if (isImage())
			g.drawImage(image(), p.x, p.y, d.height, d.width, colorFill(), null);
		else if (isRound()) {
			Point r = round();
			g.fillRoundRect(p.x, p.y, d.height, d.width, r.x, r.y);
			g.setColor(colorBorder());
			g.drawRoundRect(p.x, p.y, d.height, d.width, r.x, r.y);

		} else {
			g.fillRect(p.x, p.y, d.height, d.width);
			g.setColor(colorBorder());
			g.drawRect(p.x, p.y, d.height, d.width);
		}

		g.setColor(colorName());
		String name = name();
		g.drawString(name, p.x + d.width / 2 - name.length() * 2, p.y + d.height + name.length() * 2 + 10);
	}

	public abstract Point position();

	public abstract Dimension dimension();

	public abstract boolean isImage();

	public abstract boolean isRound();

	public abstract Point round();

	public abstract BufferedImage image();

	public abstract String name();

	public abstract Color colorFill();

	public abstract Color colorBorder();

	public abstract Color colorName();
}
