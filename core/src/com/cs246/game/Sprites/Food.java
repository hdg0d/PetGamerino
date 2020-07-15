package com.cs246.game.Sprites;

import com.badlogic.gdx.maps.objects.RectangleMapObject;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.FixtureDef;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.badlogic.gdx.physics.box2d.World;
import com.cs246.game.PetGame;

public class Food extends InteractiveTileObject{
    public Food(World world, TiledMap map, Rectangle bounds){
        super(world, map, bounds);
        BodyDef bdef = new BodyDef();
        FixtureDef fdef = new FixtureDef();
        PolygonShape shape = new PolygonShape();

        bdef.type = BodyDef.BodyType.StaticBody;
        bdef.position.set((bounds.getWidth() /2)+ 6 * 100/ PetGame.PPM, (bounds.getY() + bounds.getHeight() / 2)/PetGame.PPM);
        body = world.createBody(bdef);
        shape.setAsBox(bounds.getWidth() / 2 /PetGame.PPM, bounds.getHeight() / 2 /PetGame.PPM);
        fdef.shape = shape;
        body.createFixture(fdef);
    }
}
