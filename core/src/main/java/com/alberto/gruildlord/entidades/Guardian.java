package com.alberto.gruildlord.entidades;

import com.alberto.gruildlord.recursos.Inventario;
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
    private int x;
    private int y;

}
