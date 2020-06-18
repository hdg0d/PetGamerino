package com.cs246.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.cs246.game.PetGame;
import com.cs246.game.Scenes.Hud;

public class PlayScreen implements Screen {

    private PetGame game;
    //Texture texture;
    Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;
    public PlayScreen(PetGame game){
        this.game = game;
        //texture = new Texture("dog1.png");
        //texture = new Texture("dog1.png");
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(PetGame.V_WIDTH, PetGame.V_HEIGHT, gamecam);
        hud = new Hud(game.batch);
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //game.batch.setProjectionMatrix(gamecam.combined);
        //game.batch.setProjectionMatrix(gamecam.combined);
        //game.batch.begin();
        //game.batch.draw(texture, 0,0);
        //game.batch.draw(texture, 0,0);
        //game.batch.end();
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);
        hud.stage.draw();
    }

    @Override
    public void resize(int width, int height) {
        gamePort.update(width, height);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
