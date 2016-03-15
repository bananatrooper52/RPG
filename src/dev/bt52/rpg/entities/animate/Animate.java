package dev.bt52.rpg.entities.animate;

import java.awt.Graphics;

import dev.bt52.rpg.Game;
import dev.bt52.rpg.entities.Entity;

public abstract class Animate extends Entity {

	public static final double DEFAULT_SPEED = 2;
	
	protected double speed;
	
	public Animate(double x, double y, int width, int height, Game game) {
		
		super(x, y, width, height, game);
		speed = DEFAULT_SPEED;
		
	}

	@Override
	public void tick() {
		
		move();
		
	}

	@Override
	public void render(Graphics g) {
		
	}
	
	public void move() {
		
		moveX();
		moveY();
		
	}
	
	public void moveX() {
		
	}
	
	public void moveY() {
		
	}
	
}
