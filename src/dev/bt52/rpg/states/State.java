package dev.bt52.rpg.states;

import java.awt.Graphics;

import dev.bt52.rpg.Game;

public abstract class State {

	public static State state;
	
	protected Game game;
	
	public State(Game game) {
		
		this.game = game;
		
	}
	
	public abstract void tick();
	
	public abstract void render(Graphics g);
	
	public static void setState(State state) {
		
		State.state = state;
		
	}
	
	public static State getState() {
		
		return state;
		
	}
	
}
