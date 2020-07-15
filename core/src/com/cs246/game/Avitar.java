package com.cs246.game;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;

public class Avitar extends Sprite {
    public World world;
    public Body b2body;

    public Avitar(World world) {
        this.world = world;
        defineAvitar();
    }


    public void defineAvitar() {
        BodyDef bdef = new BodyDef();
        bdef.position.set(200/PetGame.PPM, 200/PetGame.PPM);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);
        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(10/PetGame.PPM);
        fdef.shape = shape;
        b2body.createFixture(fdef);
    }
}