/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diplomado.bibliotheque.connaissances.utils;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/**
 *
 * @author HP
 */
public class UtilidadSeguridad {

    private final static String  ENCRYPT_KEY="clave-compartida";
    
    public static String encript(String text) throws Exception {
        Key aesKey = new SecretKeySpec(ENCRYPT_KEY.getBytes(), "AES");

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, aesKey);

        byte[] encrypted = cipher.doFinal(text.getBytes());

        return new String(Base64.getEncoder().encode(encrypted));
    }

}
