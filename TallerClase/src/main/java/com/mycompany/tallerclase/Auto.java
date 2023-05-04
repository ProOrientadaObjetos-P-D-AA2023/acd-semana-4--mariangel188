/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerclase;

/**
 *
 * @author Usuario PC
 */
public class Auto {
    private String marca;
    private Radio ra;

    public Auto(String marca, Radio ra) {
        this.marca = marca;
        this.ra = ra;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Radio getRa() {
        return ra;
    }

    public void setRa(Radio ra) {
        this.ra = ra;
    }
    
}
