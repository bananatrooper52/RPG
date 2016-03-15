package dev.bt52.rpg.entities;

import java.awt.Graphics;

import dev.bt52.rpg.Organizer;

public abstract class Entity {

	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	protected Organizer organizer;
	
	public Entity(int x, int y, int width, int height, Organizer organizer) {
		
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.organizer = organizer;
		
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
}
