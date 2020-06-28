package com.cs246.game.Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.maps.MapObject;
import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.cs246.game.PetGame;
import com.cs246.game.Scenes.Hud;

public class PlayScreen implements Screen {

    private PetGame game;
    //private Texture texture;
    private Texture texture;
    private OrthographicCamera gamecam;
    private Viewport gamePort;
    private Hud hud;

    //6/18/2020 added variables
    private TmxMapLoader mapLoader;
    private TiledMap map;
    private OrthogonalTiledMapRenderer renderer;

    //6/19/2020 box2d variables
    private World world;
    private Box2DDebugRenderer b2dr;


    public PlayScreen(PetGame game){
        this.game = game;
        //texture = new Texture("dog1.png");
        texture = new Texture("dog1.png");
        gamecam = new OrthographicCamera();
        gamePort = new FitViewport(PetGame.V_WIDTH, PetGame.V_HEIGHT, gamecam);
        hud = new Hud(game.batch);

        //6/18/2020 added more rendering
       mapLoader = new TmxMapLoader();
       map = mapLoader.load("bg1.tmx");
       renderer = new OrthogonalTiledMapRenderer(map);
       gamecam.position.set(gamePort.getWorldWidth() / 2, gamePort.getWorldHeight() /2, 0);
       world = new World(new Vector2(0,0), true);
       b2dr = new Box2DDebugRenderer();

        BodyDef bdef = new BodyDef();
        PolygonShape shape = new PolygonShape();
        FixtureDef fdef = new FixtureDef();
        Body body;

        for(MapObject object : map.getLayers().get(4).getObjects().getByType(RectangleMapObject.class)){
            Rectangle rect = ((RectangleMapObject) object).getRectangle();
            bdef.type = BodyDef.BodyType.StaticBody;
            bdef.position.set(rect.getWidth() /2, rect.getY() + rect.getHeight() / 2);
            body = world.createBody(bdef);
            shape.setAsBox(rect.getWidth() / 2, rect.getHeight() / 2);
            fdef.shape = shape;
            body.createFixture(fdef);
        }
    }

    @Override
    public void show() {

    }

    public void handleInput(float dt){
        if(Gdx.input.isTouched())
            gamecam.position.x += 100 * dt;
    }

    public void update(float dt){
        handleInput(dt);
        world.step(1/60f, 6, 2);
        gamecam.update();
        renderer.setView(gamecam);
    }

    @Override
    public void render(float delta) {
        update(delta);
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.render();

        b2dr.render(world, gamecam.combined);

        //game.batch.setProjectionMatrix(gamecam.combined);
        //game.batch.setProjectionMatrix(gamecam.combined);
        //game.batch.begin();
        //game.batch.draw(texture, 0,0);
        //game.batch.end();
        game.batch.setProjectionMatrix(hud.stage.getCamera().combined);

        hud.stage.draw();

        //temporary sprite render
        game.batch.begin();
        game.batch.draw(texture, 140,145);
        game.batch.end();
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
