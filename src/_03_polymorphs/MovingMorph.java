package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingMorph extends Polymorph{

	protected MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	
	}
	

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.yellow);
		g.fillRect(getx(), getx(), getwidth(), getheight());
		
	}

	public void update(){
		if(x<500) {
			x+=5;
		}
		else {
			x=0;
		}
	}
	
}
