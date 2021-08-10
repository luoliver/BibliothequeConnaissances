/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.enums;

/**
 *
 * @author HP
 */
public enum EnumRol {
    
    ADMINISTRADOR("ADMINISTRADOR"),
    BIBLIOTECARIO("BIBLIOTECARIO"),
    AFILIADO("AFILIADO");
    
    private final String nombre;
    
    private EnumRol(String nombre) {
        this.nombre = nombre;
    }
    
    public static EnumRol consultarRol(String nombreRol) {
        for(EnumRol enumRol :EnumRol.values()){
            if(enumRol.getNombre() == null ? nombreRol == null : enumRol.getNombre().equals(nombreRol))
                return enumRol;
        }
        return null;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
}
