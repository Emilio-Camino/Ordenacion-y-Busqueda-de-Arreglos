/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacion;

/**
 *
 * @author Emilio
 */
public class BusquedaBinaria {
    
   public static int busquedaBinaria(int arreglo[], int valor, int inferior, int superior) {
    if (superior >= inferior) {
        int mitad = inferior + (superior - inferior) / 2;

        if (arreglo[mitad] == valor) {
            return mitad;
        }
        if (arreglo[mitad] > valor) {
            return busquedaBinaria(arreglo, valor, inferior, mitad - 1);
        }
        return busquedaBinaria(arreglo, valor, mitad + 1, superior);
    } else {
        return -1; 
    }
}
    
    
}