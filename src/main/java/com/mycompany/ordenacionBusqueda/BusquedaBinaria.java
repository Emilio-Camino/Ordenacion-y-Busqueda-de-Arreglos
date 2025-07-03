/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacionBusqueda;

/**
 *
 * @author Emilio
 */
public class BusquedaBinaria {
    /*
    Algoritmo BusquedaBinaria(A, valor, inferior, superior)
    A = Arreglo[1 ... N] de Enteros

    Si (superior ≥ inferior) entonces
        mitad ← inferior + (superior - inferior) / 2

        Si (A[mitad] = valor) entonces
            retornar mitad
        Fin Si

        Si (A[mitad] > valor) entonces
            retornar BusquedaBinaria(A, valor, inferior, mitad - 1)
        Fin Si

        retornar BusquedaBinaria(A, valor, mitad + 1, superior)
    Fin Si

    retornar -1  // Valor no encontrado
Fin Algoritmo
    */
   public static int busquedaBinaria(int arreglo[], int valor, int inferior, int superior) {
       //Si el limite superior es mayor el limite inferior
       if (superior >= inferior) {
           //Se define la mitad
           int mitad = inferior + (superior - inferior) / 2;
           //Si se hallo el valor
        if (arreglo[mitad] == valor) {
            return mitad; //Se devuelve el indice del valor hallado
        }
        //Si el valor  es mayor
        if (arreglo[mitad] > valor) {
            //Se hace la busqueda desde la mitad infeior
            return busquedaBinaria(arreglo, valor, inferior, mitad - 1);
        }   
            //Se hace la busqueda  desde la mmitad superior
        return busquedaBinaria(arreglo, valor, mitad + 1, superior);
    } else {
        return -1; 
    }
}
    
    
}