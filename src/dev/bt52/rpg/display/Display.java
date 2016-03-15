package dev.bt52.rpg.display;

import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

import dev.bt52.rpg.Organizer;

public class Display {

	public JFrame f;
	public Canvas c;
	public Organizer organizer;
	
	public Display(int width, int height, String title, Organizer organizer) {
		
		this.organizer = organizer;
		
		f = new JFrame();
		c = new Canvas();
		
		c.setMaximumSize(new Dimension(width, height));
		c.setMinimumSize(new Dimension(width, height));
		c.setPreferredSize(new Dimension(width, height));
		c.setFocusable(false);
		
		f.setSize(width, height);
		f.setTitle(title);
		f.setResizable(false);
		f.setFocusable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setFocusable(true);
		f.requestFocus();
		f.add(c);
		f.pack();
		
	}
	
	public Canvas getCanvas() {
		
		return c;
		
	}
	
	public JFrame getFrame() {
		
		return f;
		
	}
	
}
