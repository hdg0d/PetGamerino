package com.cs246.game.Sprites;

import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.CircleShape;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.World;

public class Petsprite extends Sprite {
    public World world;
    public Body b2body;

    public Petsprite(World world){
        this.world = world;
        definePetsprite();

    }
    public void definePetsprite(){
        BodyDef bdef = new BodyDef();
        bdef.position.set(200, 200);
        bdef.type = BodyDef.BodyType.DynamicBody;
        b2body = world.createBody(bdef);
        FixtureDef fdef = new FixtureDef();
        CircleShape shape = new CircleShape();
        shape.setRadius(20);
        fdef.shape = shape;
        b2body.createFixture(fdef);
    }
}
