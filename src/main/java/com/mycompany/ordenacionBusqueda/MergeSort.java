/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacionBusqueda;

/**
 *
 * @author Emilio
 */
public class MergeSort {
    
    //Metodos Auxiliar de combinar
    /*
    Algoritmo Combinar(A, limInf, mitad, limSup)
    tamanio1 ← mitad - limInf + 1
    tamanio2 ← limSup - mitad

    Crear arreglo izquierda[1 ... tamanio1]
    Crear arreglo derecha[1 ... tamanio2]

    // Copiar elementos en subarreglos temporales
    Repetir con i desde 0 hasta tamanio1 - 1
        izquierda[i] ← A[limInf + i]
    Fin Repetir

    Repetir con j desde 0 hasta tamanio2 - 1
        derecha[j] ← A[mitad + 1 + j]
    Fin Repetir

    i, j, k ← 0, 0, limInf

    // Combinar subarreglos en A
    Mientras (i < tamanio1 y j < tamanio2) hacer
        Si izquierda[i] ≤ derecha[j] entonces
            A[k] ← izquierda[i]
            i ← i + 1
        Sino
            A[k] ← derecha[j]
            j ← j + 1
        Fin Si
        k ← k + 1
    Fin Mientras

    // Copiar elementos restantes de izquierda
    Mientras (i < tamanio1) hacer
        A[k] ← izquierda[i]
        i ← i + 1
        k ← k + 1
    Fin Mientras

    // Copiar elementos restantes de derecha
    Mientras (j < tamanio2) hacer
        A[k] ← derecha[j]
        j ← j + 1
        k ← k + 1
    Fin Mientras
    Fin Algoritmo
    */
    public static void combinar(int[] arreglo ,int limInf, int mitad, int limSup){
        
        //tamanios de los dos subarreglos
        int tamanio1 = mitad - limInf + 1;
        int tamanio2 = limSup - mitad;
        
        //Creacion de arreglos temporales
        int[] izquierda = new int[tamanio1];
        int[] derecha = new int[tamanio2];
        
        //Copiando los datos en los dos subarreglos
        for(int i = 0; i < tamanio1; i++){
            izquierda[i] = arreglo[limInf + i];
        }
        
        for(int j = 0; j < tamanio2; j++ ){
            derecha[j] = arreglo [(mitad + 1) + j];
        }
        
        //Combinacion de Arreglos
        
        int i = 0 , j = 0;
        int k = limInf;
        //Mientras no llegue al final de los dos arreglos
         while(i < tamanio1 && j < tamanio2) {
             //Si el valor del arreglo izquierdo es mayor al del arreglo derecho
             if (izquierda[i] <= derecha[j]){
                 //El arreglo unido toma el valor del izquierdo
                 arreglo[k] = izquierda[i];
                 i++; //actualizo i
             } else { //Si no
                 //El arreglo unido toma el valor del derecho
                 arreglo[k] = derecha[j];
                 j++; //actualizo j
             }
             k++;
         }
        
        // Si quedan elementos restantes en el arreglo izquierdo, se los copia al arreglo de retorno
        while (i < tamanio1) {
            arreglo[k] = izquierda[i];
            i++;
            k++;
        }

       // Si quedan elementos restantes en el arreglo izquierdo, se los copia al arreglo de retorno
        while (j < tamanio2) {
            arreglo[k] = derecha[j];
            j++;
            k++;
        }
        
    }
    
    /*
    Algoritmo MergeSort(A, limInf, limSup)
    Si (limInf < limSup) entonces
        mitad ← limInf + (limSup - limInf) / 2

        // Ordenar mitad izquierda
        MergeSort(A, limInf, mitad)

        // Ordenar mitad derecha
        MergeSort(A, mitad + 1, limSup)

        // Combinar mitades ordenadas
        Combinar(A, limInf, mitad, limSup)
    Fin Si
    Fin Algoritmo
    */
    
    public static int[] ordenarMergeSort(int[] arreglo, int limInf, int limSup){
        if (limInf < limSup){
            //Se obtiene la mitad
            int mitad = limInf + (limSup - limInf)/2;
            
            //Se ordenan la primera y la segunda mitad
            //El primer arreglo va desde el inicio a la mitad
            ordenarMergeSort(arreglo, limInf, mitad);
            //La segunda mitad trabaja con limite inferior igual a la mitad
            ordenarMergeSort(arreglo, mitad + 1, limSup);
            
            //Se combinan las mitades
            combinar(arreglo, limInf, mitad, limSup);
        
        }
    
    return arreglo;
    }
    
}
