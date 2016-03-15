package dev.bt52.rpg.states;

import java.awt.Graphics;

import dev.bt52.rpg.Game;
import dev.bt52.rpg.entities.animate.Player;

public class GameState extends State {

	public GameState(Game game) {
		
		super(game);
		game.getEntityManager().addEntity(new Player(20, 20, 20, 20, game));
		
	}

	@Override
	public void tick() {
		
		game.getEntityManager().tick();
		
	}

	@Override
	public void render(Graphics g) {
		
		game.getEntityManager().render(g);
		
	}
	
}
