package com.alberto.gruildlord.recursos;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Inventario Class
 *
 * @author Alberto Zapardiel Fernández
 */
@Getter
public class Inventario {

    /**
     * Contenidos del inventario
     */
    Map<Integer,Integer> contenidos;

    /**
     * Constructor del inventario
     */
    public Inventario(){
        this.contenidos = new HashMap<>();
    }

    /**
     * Agrega un recurso al inventario
     * @param id Recurso
     * @param cantidad Cantidad
     */
    public void agregarRecurso(int id, int cantidad){
        if (this.contenidos.containsKey(id)){
            this.contenidos.put(id, this.contenidos.get(id) + cantidad);
        } else {
            this.contenidos.put(id, cantidad);
        }
    }

    /**
     * Quita un recurso del inventario
     * @param id Recurso
     * @param cantidad Cantidad
     * @return true si
     */
    public boolean quitarRecurso(int id, int cantidad) {
        int cantidadActual = this.obtenerCantidad(id);

        // 1. Verificar si tenemos stock suficiente
        if (cantidadActual < cantidad) {
            return false;
        }

        int nuevaCantidad = cantidadActual - cantidad;

        // 2. Si la nueva cantidad es 0 o menos, eliminar la entrada del Map (limpieza de memoria)
        if (nuevaCantidad <= 0) {
            this.contenidos.remove(id);
        } else {
            // 3. Sí queda stock, actualizar el valor
            this.contenidos.put(id, nuevaCantidad);
        }

        return true;
    }

    /**
     * Obtiene la cantidad de un recurso
     * @param id Recurso
     * @return Cantidad
     */
    public int obtenerCantidad(int id){
        return this.contenidos.getOrDefault(id, 0);
    }

}
