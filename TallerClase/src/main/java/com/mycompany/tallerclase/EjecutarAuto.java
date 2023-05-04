/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tallerclase;

/**
 *
 * @author Usuario PC
 */
public class EjecutarAuto {

    public static void main(String[] args) {
        System.out.println("Ejemplo de agregacion");

        //1.Asignar un valor del modelo de la radio
        String modelo = "Sony 2023";

        //2. Creo un objeto y en el constructor pasar el modelo
        Radio ra = new Radio(modelo);

        //3. Asignar un valor a la marca de un auto
        String marca = "Toyota";

        //4. Crear el objeto auto y asignar la marca y el objeto radio
        Auto aut = new Auto(marca, ra);

        //5. Imprimir los resultados
        System.out.println("La marca del auto es: " + aut.getMarca());
        System.out.println("El modelo del radio es: " + aut.getRa().getModelo());
    }
}
