package com.alberto.gruildlord;

import com.alberto.gruildlord.entidades.Guardian;
import com.alberto.gruildlord.recursos.Inventario;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/** First screen of the application. Displayed after the application is created. */
public class FirstScreen implements Screen {

    private SpriteBatch spriteBatch;

    private Texture guardianTexture;

    private Guardian guardian;

    @Override
    public void show() {
        // Prepare your screen here.
        spriteBatch = new SpriteBatch();
        guardianTexture = new Texture("guardian.png");
        guardian = new Guardian(new Inventario(), 50.0f, 50.0f, 100.0f);
    }

    @Override
    public void render(float delta) {
        // 1. Establecer el color que se usará para borrar la pantalla (gris oscuro)
        Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1.0f);

        // 2. Dar la orden de borrado (limpiar el buffer de color)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        guardian.actualizar(delta);

        spriteBatch.begin();

        spriteBatch.draw(guardianTexture, guardian.getX(), guardian.getY(), 50, 50);

        spriteBatch.end();
    }

    @Override
    public void resize(int width, int height) {
        // If the window is minimized on a desktop (LWJGL3) platform, width and height are 0, which causes problems.
        // In that case, we don't resize anything, and wait for the window to be a normal size before updating.
        if(width <= 0 || height <= 0) return;

        // Resize your screen here. The parameters represent the new window size.
    }

    @Override
    public void pause() {
        // Invoked when your application is paused.das
    }

    @Override
    public void resume() {
        // Invoked when your application is resumed after pause.
    }

    @Override
    public void hide() {
        // This method is called when another screen replaces this one.
    }

    @Override
    public void dispose() {
        // Destroy screen's assets here.
    }
}
