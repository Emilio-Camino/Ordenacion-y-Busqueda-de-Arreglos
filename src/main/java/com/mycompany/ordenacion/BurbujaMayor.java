package com.mycompany.ordenacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emilio
 */
public class BurbujaMayor {
    
    /*
    Algortimo BubbleMayor(A, N)
    i, j; aux <- enteros
    A = Arreglo[1 ... N] de Enteros

    Repetir con i desde N hasta 1
        Repetir con j desde 0 hasta i
    
        Si ( A[j] > A[j+1] ) entonces
            aux ← A[j]
            A[j] ← A[j + 1]
            A[j + 1] ← aux
        Fin Si
        Fin Repetir
    Fin Repetir
    Fin Algoritmo

    */
    //Metodo para ordenar arreglos usando BurbujaMayor
    public static int[] ordenarBurbujaMayor(int[] arregloDesordenado){
        //Se copia el arreglo para mantener al otro intacto;
        int[] arreglo = arregloDesordenado.clone(); 
        //Se recorre el arreglo
         for (int i = arreglo.length - 1; i > 0; i--){
          //Se realiza el ordenamiento moviendo elementos desde el inicio hacia el final del arreglo
          //Se compara desde el inicio del arreglo hasta su fin
             for (int j = 0; j < i; j++){
             //Si el elemento actual es mayor que el elemento siguiente
             if(arreglo[j] > arreglo[j + 1]){
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
