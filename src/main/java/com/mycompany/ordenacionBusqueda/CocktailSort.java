/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacionBusqueda;

/**
 *
 * @author Emilio
 */
public class CocktailSort {
    
    /*
    Algoritmo CocktailSort(A, N)
    A = Arreglo[1 ... N] de Enteros
    i <- entero
    intercambiado ← verdadero

    Mientras (intercambiado) hacer
        intercambiado ← falso

        // Burbuja Mayor (de izquierda a derecha)
        Repetir con i desde 0 hasta N - 2
            Si (A[i] > A[i + 1]) entonces
                aux ← A[i]
                A[i] ← A[i + 1]
                A[i + 1] ← aux
                intercambiado ← verdadero
            Fin Si
        Fin Repetir

        // Si no hubo intercambios, el arreglo ya está ordenado
        Si (intercambiado = falso) entonces
            salir
        Fin Si

        intercambiado ← falso

        // Burbuja Menor (de derecha a izquierda)
        Repetir con i desde N - 2 hasta 1
            Si (A[i - 1] > A[i]) entonces
                aux ← A[i - 1]
                A[i - 1] ← A[i]
                A[i] ← aux
                intercambiado ← verdadero
            Fin Si
        Fin Repetir
    Fin Mientras
Fin Algoritmo
    */
    
    public static int[] ordenarCocktailSort(int[] arregloDesordenado){
    int[] arreglo = arregloDesordenado.clone();
    
    boolean intercambiado = true;
    int indiceRecorrido = 0;
    while (intercambiado){
    intercambiado = false;
        //Burbuja Mayor
        for(indiceRecorrido = 0; indiceRecorrido < arreglo.length -1; indiceRecorrido++){
        
            if(arreglo[indiceRecorrido] > arreglo[indiceRecorrido + 1]){
                int aux = arreglo[indiceRecorrido]; //El auxiliar toma el actual
                arreglo[indiceRecorrido]= arreglo[indiceRecorrido + 1]; //El actual toma el siguiente
                arreglo[indiceRecorrido + 1] = aux; //El siguiente toma auxiliar
                intercambiado = true;
            }
        }
            //Si al final no se hizo ningun intercambio, entonces se sale del bucle para evitar iteraciones innecesarias
            if(!intercambiado){
                break;
            }
        intercambiado = false;    
        //Burbuja Menor
        for( indiceRecorrido = arreglo.length -2; indiceRecorrido > 0; indiceRecorrido--){
        //Si el elemento anterior es mayor que el elemento actual
             if(arreglo[indiceRecorrido - 1] > arreglo[indiceRecorrido]){
                 
                //Se intercambia de lugar a los valores con un auxiliar
                int aux = arreglo[indiceRecorrido -1]; //El aux toma el anterior
                arreglo[indiceRecorrido -1]= arreglo[indiceRecorrido];  //El anterior toma el actual
                arreglo[indiceRecorrido] = aux; //El actual toma el aux
                indiceRecorrido--;
                intercambiado = true; 
             }
        }    
    }
    return arreglo;
    }
}
