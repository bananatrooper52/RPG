package dev.bt52.rpg.entities.animate;

import java.awt.Graphics;

import dev.bt52.rpg.Organizer;

public class Player extends Animate {

	public Player(int x, int y, int width, int height, Organizer organizer) {
		
		super(x, y, width, height, organizer);
		
		System.out.println("Adding player");
		
	}
	
	public void tick() {
		
		if(organizer.getGame().getKeyHandler().left == true) {
			
			x -= speed;
			
		}
		
		if(organizer.getGame().getKeyHandler().right == true) {
			
			x += speed;
			
		}

		if(organizer.getGame().getKeyHandler().up == true) {
	
			y -= speed;
	
		}

		if(organizer.getGame().getKeyHandler().down == true) {
	
			y += speed;
	
		}
		
	}
	
	public void render(Graphics g) {
		
		g.drawRect(x, y, width, height);
		
	}
	
}
