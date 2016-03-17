package dev.bt52.rpg.blocks;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Block {

	public static Block[] blocks = new Block[256];
	
	public static final int TILESIZE = 64;
	
	protected final int id;
	protected BufferedImage texture;
	
	public Block(BufferedImage texture, int id) {
		
		this.id = id;
		this.texture = texture;
		
	}
	
	public void render(Graphics g, int x, int y) {
		
		g.drawImage(texture, x / TILESIZE, y / TILESIZE, TILESIZE, TILESIZE, null);
		
	}
	
	public boolean isSolid() {
		
		return false;
		
	}
	
	public int getId() {
		
		return id;
		
	}
	
}
