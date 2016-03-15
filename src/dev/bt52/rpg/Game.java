package dev.bt52.rpg;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import dev.bt52.rpg.assets.Assets;
import dev.bt52.rpg.display.Display;
import dev.bt52.rpg.entities.EntityManager;
import dev.bt52.rpg.input.KeyHandler;
import dev.bt52.rpg.states.GameState;
import dev.bt52.rpg.states.State;

public class Game implements Runnable {

	public boolean running;
	public int width;
	public int height;
	
	public Display display;
	public Thread thread;
	public Graphics g;
	public BufferStrategy bs;
	public String title;
	public KeyHandler keyHandler;
	public EntityManager entityManager;
	
	public Game(int width, int height, String title) {
		
		this.width = width;
		this.height = height;
		this.title = title;
		
		start();
		
	}
	
	public void init() {
		
		System.out.println("Initializing");
		entityManager = new EntityManager(this);
		State.setState(new GameState(this));
		keyHandler = new KeyHandler();
		display = new Display(width, height, title, this);
		display.getFrame().addKeyListener(keyHandler);
		
	}
	
	public void tick() {
		
		keyHandler.tick();
		State.getState().tick();
		
	}
	
	public void render(Graphics g) {
		
		bs = display.getCanvas().getBufferStrategy();
		
		if(bs == null) {
			
			display.getCanvas().createBufferStrategy(3);
			return;
			
		}
		
		g = bs.getDrawGraphics();
		g.clearRect(0, 0, width, height);
		
		State.getState().render(g);
		
		bs.show();
		g.dispose();
		
	}
	
	public void run() {
		
		init();
		
		int fps = Assets.fps;
		long lt = System.nanoTime();
		long now;
		double tpt = 1000000000 / fps;
		double delta = 0;
		
		while(running) {
			
			now = System.nanoTime();
			delta += (now - lt) / tpt;
			lt = now;
			
			if(delta >= 1) {
				
				tick();
				render(g);
				delta--;
				
			}
			
		}
		
		stop();
		
	}
	
	public synchronized void start() {
		
		if(running) {
			
			return;
			
		}
		
		thread = new Thread();
		running = true;
		thread.start();
		run();
		
	}
	
	public synchronized void stop() {
		
		if(!running) {
			
			return;
			
		}
		
		try {
			
			thread.join();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			
		}
		
		running = false;
		
	}
	
	public KeyHandler getKeyHandler() {
		
		return keyHandler;
		
	}
	
	public EntityManager getEntityManager() {
		
		return entityManager;
		
	}
	
}
