package com.diplomado.bibliotheque.connaissances.convertidor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
