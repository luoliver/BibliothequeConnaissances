package com.diplomado.bibliotheque.connaissances.enums;

public enum EnumGenero {
    MASCULINO("MASCULINO"),
    FEMENINO("FEMENINO"),
    OTRO("OTRO");
    
    String genero;
    
    private EnumGenero(String genero){
        this.genero = genero;
    }
}
