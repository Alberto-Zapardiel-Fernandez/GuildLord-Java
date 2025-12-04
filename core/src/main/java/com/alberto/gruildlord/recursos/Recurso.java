package com.alberto.gruildlord.recursos;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Recurso Class
 *
 * @author Alberto Zapardiel Fernández
 */
@AllArgsConstructor
@Getter
public class Recurso {
    private final int id;
    private final String nombre;
    private final boolean esProcesado;
}
