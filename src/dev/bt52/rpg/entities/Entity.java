package dev.bt52.rpg.entities;

import java.awt.Graphics;

import dev.bt52.rpg.Game;

public abstract class Entity {

	protected double x;
	protected double y;
	protected int width;
	protected int height;
	
	protected Game game;
	
	public Entity(double x, double y, int width, int height, Game game) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.game = game;
		
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
