/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.convertidor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author HP
 */
public class FechaConverter {
 
    
    public static String dateAString(Date fecha) {        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(fecha);
        System.out.println("Fecha convertida a cadena "+fechaComoCadena);
        return fechaComoCadena;
    }
    
    public static Date stringADate(String fecha) throws ParseException {     
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaComoDate = sdf.parse(fecha);
        System.out.println("Fecha convertida a Date "+fechaComoDate + " cadena " + fecha);
        return fechaComoDate;
    }
}
