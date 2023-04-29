package _03_polymorphs;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{
	
	BufferedImage image;
	
	

	protected ImageMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
		loadImage("monkey.jpeg");
	}

	@Override
	public void draw(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(image, getx(), gety(), getwidth(), getheight(), null);
		
	}
	
	void loadImage(String imageFile) {
	    
	    try {
	        image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));

	    } catch (Exception e) {
	        
	    }
	}

}

