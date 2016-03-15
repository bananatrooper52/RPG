package dev.bt52.rpg.entities;

import java.awt.Graphics;
import java.util.ArrayList;

import dev.bt52.rpg.Organizer;

public class EntityManager {

	public ArrayList<Entity> entities;
	public Organizer organizer;
	
	public EntityManager(Organizer organizer) {
		
		this.organizer = organizer;
		
		entities = new ArrayList<Entity>();
		
	}
	
	public void tick() {
		
		for(Entity e : entities) {
			
			e.tick();
			
		}
		
	}
	
	public void render(Graphics g) {
		
		for(Entity e : entities) {
			
			e.render(g);
			
		}
		
	}
	
	public void addEntity(Entity e) {
		
		entities.add(e);
		
	}
	
}
