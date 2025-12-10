package com.alberto.gruildlord.entidades;

import com.alberto.gruildlord.recursos.Inventario;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Guardian Class entity
 *
 * @author Alberto Zapardiel Fernández
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guardian {
    private Inventario inventario;
    private float x;
    private float y;
    private float velocidad;

    public void actualizar(float delta){
        if (Gdx.input.isKeyPressed(Input.Keys.W)){
            y += velocidad * delta;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.S)){
            y -= velocidad * delta;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.A)){
            x -= velocidad * delta;

        }
        if (Gdx.input.isKeyPressed(Input.Keys.D)){
            x += velocidad * delta;

        }
    }

}
