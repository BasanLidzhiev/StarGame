package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class StarGame extends ApplicationAdapter {
    SpriteBatch batch;
    Texture img;
    TextureRegion region;

    @Override
    public void create() {
        batch = new SpriteBatch();
        img = new Texture("picture.png");
        region = new TextureRegion(img, 100, 100, 150, 150);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.85f, 0.23f, 0.76f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        batch.begin();
		batch.draw(img, 0, 0);
        batch.setColor(1.35f, 2.3f, 0.55f, 0.5f);
        batch.draw(img, 300, 300, 200, 200);
        batch.draw(region, 500, 300, 50, 50);
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        img.dispose();
    }
}
