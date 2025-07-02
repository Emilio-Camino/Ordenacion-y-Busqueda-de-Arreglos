/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacion;

/**
 *
 * @author Emilio
 */
public class Seleccion {
    
    /*
lAgoritmo Seleccion(A, N)
    i, j, menor, indiceMenor <- enteros
    A = Arreglo[1 ... N] de Enteros

    Repetir con i desde 1 hasta N - 1
        menor <- A[i]
        indiceMenor <- i
        Repetir con j desde i + 1 hasta N
            Si (A[j] < menor) entonces
                menor <- A[j]
                indiceMenor <- j
            Fin Si
        Fin Repetir
        Si indiceMenor ≠ i entonces
            A[indiceMenor] <- A[i]
            A[i] <- menor
        Fin Si
    Fin Repetir
Fin Algoritmo
    */
    
    
    public static int[]ordenarSeleccion(int[] arregloDesordenado){
         //Se copia el arreglo para mantener al otro intacto;
        int[] arreglo = arregloDesordenado.clone(); 
        int i, j, menor, indiceMenor;

        for (i = 0; i < arreglo.length - 1; i++) {
            menor = arreglo[i];
            indiceMenor = i;

            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j] < menor) {
                    menor = arreglo[j];
                    indiceMenor = j;
                }
            }
                arreglo[indiceMenor] = arreglo[i];
                arreglo[i] = menor;
        }

        return arreglo;
    }
    
}
