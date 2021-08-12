package com.diplomado.bibliotheque.connaissances.enums;

public enum EnumBoolean {
    SI("S","Si"),
    NO("N","No");
    
    private final String valor;
    private final String nombre;
    
    private EnumBoolean(String valor, String nombre){
        this.valor = valor;
        this.nombre = nombre;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }
    
}
