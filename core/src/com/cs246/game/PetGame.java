package com.cs246.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.cs246.game.Screens.PlayScreen;

public class PetGame extends Game {
	public SpriteBatch batch;

	@Override
	public void create () {
		//gameScreen = new GameScreen();
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	//@Override
	//public void dispose() {
	    //super.render();
		//gameScreen.dispose();
	//}

	@Override
	public void render() {
		super.render();
	}

	//@Override
	//public void resize(int width, int height) {
	//	gameScreen.resize(width, height);
	//}
}


/*  //libGDX generated defaults
public class PetGame extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("dog1.png"); //only difference is dog1.png
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
*/