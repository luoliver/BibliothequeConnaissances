package com.diplomado.bibliotheque.connaissances.modelo;

public class Autor extends Persona{
    
    private int Id;
    private String tipoGeneroEscritura;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getTipoGeneroEscritura() {
        return tipoGeneroEscritura;
    }

    public void setTipoGeneroEscritura(String tipoGeneroEscritura) {
        this.tipoGeneroEscritura = tipoGeneroEscritura;
    }
    
}
