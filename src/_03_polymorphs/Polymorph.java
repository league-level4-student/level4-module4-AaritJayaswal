package _03_polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    
    protected Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.width = width;
   	 this.height = height;
    }
    
    public void update(){
   	 
    }
    
    public abstract void draw(Graphics g);

	int getx() {
		return x;
	}
	int gety() {
		return y;
	}
	void setx(int i) {
		x=i;
	}
	void sety(int i) {
		y=i;
	}
	int getwidth() {
		return width;
	}
	int getheight() {
		return height;
	}
	void setwidth(int i) {
		width=i;
	}
	void setheight(int i) {
		height=i;
	}
}