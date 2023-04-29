package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class CircleMorph extends Polymorph{

	protected CircleMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
int angle=0;

	public void draw(Graphics g) {
		g.setColor(Color.orange);
		angle++;
		g.fillRect((int) (x+Math.sin(angle/4)*90),(int) (y+Math.cos(angle/4)*90), 50, 50);

	
		
	}

}
