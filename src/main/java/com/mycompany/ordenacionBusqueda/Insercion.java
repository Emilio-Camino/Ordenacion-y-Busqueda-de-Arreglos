/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacionBusqueda;

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

    Repetir con i desde 1 hasta N
        Repetir con j desde i hasta 0 con restando 1
            Si ( A[j] < A[j-1] ) entonces
                aux ← A[j]
                A[j] ← A[j - 1]
                A[j - 1] ← aux
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
        for (int i = 1; i < arreglo.length ; i++){
            for(int j = i; j > 0; j--){
               //Si el elemento anterior es menor que el elemento actual
               if(arreglo[j] < arreglo[j-1]){
            //Se intercambia de lugar a los valores con un auxiliar
                int aux = arreglo[j]; //aux toma el actual
                arreglo[j]= arreglo[j-1]; //actual toma anterior
                arreglo[j-1] = aux; //el anterior toma aux
               }
            }
        }
        return arreglo;
    }
}
