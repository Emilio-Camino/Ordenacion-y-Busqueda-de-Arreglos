package com.mycompany.ordenacionBusqueda;

import static com.mycompany.ordenacionBusqueda.OrdenacionBusqueda.stringArreglo;

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
            //Se imprime el nombre del algoritmo
        System.out.println("----------------ORDENACION BURBUJA MENOR----------------");

         //Se copia el arreglo para mantener al otro intacto;
         int[] arreglo = arregloDesordenado.clone();
         //Se recorre el arreglo
         for (int i = 0; i < arreglo.length - 1; i++){
             
             //Se realiza el ordenamiento moviendo elementos desde el final hacia el final del arreglo
             //Se compara desde el fin del arreglo hasta su inicio
             for (int j = arreglo.length - 1; j > i; j--){
            
                 //Se imprime cada comparacion por consola
                 System.out.printf("arreglo[%d] > arreglo[%d] : %d > %d  --> ", (j - 1), (j), arreglo[j - 1], arreglo[j]);  
             //Si el elemento anterior es mayor que el elemento actual
             if(arreglo[j-1] > arreglo[j]){
                 System.out.printf("Si hay intercambio %n");
                //Se intercambia de lugar a los valores con un auxiliar
                int aux = arreglo[j-1]; //Se almacena el anterior en el aux
                arreglo[j-1]= arreglo[j]; //Se almacena en el anterior el actual
                arreglo[j] = aux; //el actual toma el aux
             } else {System.out.println("No hubo intercmabio");}
                 
             }
             //Al final se imprime el arreglo despues de cada ordenacion
                 System.out.println("Pasada: " + (arreglo.length - i) + "\n"+ stringArreglo(arreglo) + "\n");
         }
        
        
        return arreglo;
    }
}
