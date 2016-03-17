package dev.bt52.rpg.entities.animate;

import java.awt.Graphics;

import dev.bt52.rpg.Game;

public class Player extends Animate {

	public Player(double x, double y, int width, int height, Game game) {
		
		super(x, y, width, height, game);
		
	}
	
	public void tick() {
		
		super.tick();
		
		if(game.getKeyHandler().left == true) {
			
			x -= speed;
			
		}
		
		if(game.getKeyHandler().right == true) {
			
			x += speed;
			
		}

		if(game.getKeyHandler().up == true) {
	
			y -= speed;
	
		}

		if(game.getKeyHandler().down == true) {
	
			y += speed;
	
		}
		
	}
	
	public void render(Graphics g) {
		
		g.drawRect((int) x, (int) y, width, height);
		
	}
	
}
