package com.mycompany.ordenacion;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Emilio
 */
public class BurbujaMenor {
    
    /*
    Algoritmo BubbleMenor(A, N)
    i, j; aux <- enteros
    A = Arreglo[1 ... N] de Enteros

    Repetir con i desde 1 hasta N
        Repetir con j desde N - 1 hasta i

        Si ( A[j - 1] > A[j] ) entonces
            aux ← A[j - 1]
            A[j - 1] ← A[j]
            A[j] ← aux
        Fin Si
        Fin Repetir
    Fin Repetir
    Fin Algoritmo
    
    */
    //Metodo para ordenar arreglos usando BurbujaMayor
        public static int[] ordenarBurbujaMenor(int[] arregloDesordenado){
         //Se copia el arreglo para mantener al otro intacto;
         int[] arreglo = arregloDesordenado.clone();
         //Se recorre el arreglo
         for (int i = 0; i < arreglo.length - 1; i++){
             //Se realiza el ordenamiento moviendo elementos desde el final hacia el final del arreglo
             //Se compara desde el fin del arreglo hasta su inicio
             for (int j = arreglo.length - 1; j > i; j--){
            
             //Si el elemento anterior es mayor que el elemento actual
             if(arreglo[j-1] > arreglo[j]){
                 
                //Se intercambia de lugar a los valores con un auxiliar
                int aux = arreglo[j-1];
                arreglo[j-1]= arreglo[j];
                arreglo[j] = aux;
             }
                 
             }
             
         }
        
        
        return arreglo;
    }
}
