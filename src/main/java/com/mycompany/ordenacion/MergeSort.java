/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacion;

/**
 *
 * @author Emilio
 */
public class MergeSort {
    
    //Metodos Auxiliares
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
         while(i < tamanio1 && j < tamanio2) {
             if (izquierda[i] <= derecha[j]){
             
                 arreglo[k] = izquierda[i];
                 i++;
             } else {
                 arreglo[k] = derecha[j];
                 j++;
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
