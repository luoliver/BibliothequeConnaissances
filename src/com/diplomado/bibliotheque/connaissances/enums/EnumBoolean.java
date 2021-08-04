package com.diplomado.bibliotheque.connaissances.enums;

public enum EnumBoolean {
    SI("S","Si"),
    NO("N","No");
    
    String valor;
    String nombre;
    
    private EnumBoolean(String valor, String nombre){
        this.valor = valor;
        this.nombre = nombre;
    }
}
