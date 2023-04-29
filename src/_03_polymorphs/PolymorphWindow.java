package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;

	ArrayList<Polymorph> polymorphs = new ArrayList<Polymorph>(5);

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}
	FollowMorph follow = new FollowMorph(0,0,50,50);
	ClickMorph click = new ClickMorph(400,400,50,50);

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseMotionListener(follow);
		window.addMouseListener(click);

		polymorphs.add(new BluePolymorph(50, 50, 50, 50));
		polymorphs.add(new RedMorph(200,100,50,50));
		polymorphs.add(new MovingMorph(200,200,50,50));
		polymorphs.add(new CircleMorph(250,250,50,50));
		polymorphs.add(follow);
		polymorphs.add(new ImageMorph(50,200,50,50));
		polymorphs.add(click);
		
	
		
		timer = new Timer(1000 / 60, this);
		timer.start();

	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);

		// draw polymorph
		for (int i = 0; i < polymorphs.size(); i++) {

			polymorphs.get(i).draw(g);

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (int i = 0; i < polymorphs.size(); i++) {

			polymorphs.get(i).update();

		}

	}
}
