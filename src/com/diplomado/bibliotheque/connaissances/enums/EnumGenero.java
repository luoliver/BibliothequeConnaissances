package com.diplomado.bibliotheque.connaissances.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum EnumGenero {
    MASCULINO("MASCULINO"),
    FEMENINO("FEMENINO"),
    OTRO("OTRO");
    
    private String genero;
    
    private EnumGenero(String genero){
        this.genero = genero;
    }
        
    public static List<EnumGenero> listarGeneros(){
        List<EnumGenero> listaGeneros = new ArrayList<>();
        listaGeneros.addAll(Arrays.asList(EnumGenero.values()));
        return listaGeneros;
    }
    
    public static EnumGenero consultarGenero(String nombreGenero) {
        for(EnumGenero enumGenero :EnumGenero.values()){
            if(enumGenero.getGenero() == null ? nombreGenero == null : enumGenero.getGenero().equals(nombreGenero))
                return enumGenero;
        }
        return null;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }
}
