/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacion;

/**
 *
 * @author Emilio
 */
public class CocktailSort {
    
    public static int[] ordenarCocktailSort(int[] arregloDesordenado){
    int[] arreglo = arregloDesordenado.clone();
    
    boolean intercambiado = true;
    int indiceRecorrido = 0;
    while (intercambiado){
    intercambiado = false;
        //Burbuja Mayor
        for(indiceRecorrido = 0; indiceRecorrido < arreglo.length -1; indiceRecorrido++){
        
            if(arreglo[indiceRecorrido] > arreglo[indiceRecorrido + 1]){
                int aux = arreglo[indiceRecorrido];
                arreglo[indiceRecorrido]= arreglo[indiceRecorrido + 1];
                arreglo[indiceRecorrido + 1] = aux;
                intercambiado = true;
            }
        }
            //Si al no se hizo ningun intercambio, entonces se sale del bucle para evitar iteraciones innecesarias
            if(!intercambiado){
                break;
            }
        intercambiado = false;    
        //Burbuja Menor
        for( indiceRecorrido = arreglo.length -2; indiceRecorrido > 0; indiceRecorrido--){
        //Si el elemento anterior es mayor que el elemento actual
             if(arreglo[indiceRecorrido - 1] > arreglo[indiceRecorrido]){
                 
                //Se intercambia de lugar a los valores con un auxiliar
                int aux = arreglo[indiceRecorrido -1];
                arreglo[indiceRecorrido -1]= arreglo[indiceRecorrido];
                arreglo[indiceRecorrido] = aux;
                indiceRecorrido--;
                intercambiado = true; 
             }
        }    
    }
    return arreglo;
    }
}
