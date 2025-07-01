/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacion;

/**
 *
 * @author Emilio
 */
public class Insercion {
    
    //Algoritmo Insercion
    /*
    Algoritmo OrdenarInsercion(A, N)
    i, j; aux <- enteros
    A = Arreglo[1 ... N] de Enteros

    Repetir con i desde 0 hasta N - 1
        Repetir con j desde i hasta 0 con restando 1
            Si ( A[j + 1] < A[j] ) entonces
                aux ← A[j]
                A[j] ← A[j + 1]
                A[j + 1] ← aux
            Fin Si
        Fin Repetir
    Fin Repetir
Fin Algoritmo
    */
    //Metodo para ordenar arreglos usando Insercion
    public static int[] ordenarInsercion(int[] arregloDesordenado){
        //Se copia el arreglo para mantener al otro intacto;
        int[] arreglo = arregloDesordenado.clone();
        //Se recorre el arreglo
        for (int i = 0; i < arreglo.length -1; i++){
            for(int j = i; j > 0; j--){
               //Si el elemento siguente es menor que el elemento actual
               if(arreglo[j+1] < arreglo[j]){
            //Se intercambia de lugar a los valores con un auxiliar
                int aux = arreglo[j];
                arreglo[j]= arreglo[j+1];
                arreglo[j+1] = aux;
               }
            }
        }
        return arreglo;
    }
}
