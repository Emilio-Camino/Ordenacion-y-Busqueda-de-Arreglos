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
        //Se imprime el nombre del algoritmo
        System.out.println("----------------ORDENACION BURBUJA MAYOR----------------");
        
        //Se copia el arreglo para mantener al otro intacto;
        int[] arreglo = arregloDesordenado.clone(); 
        //Se recorre el arreglo
         for (int i = arreglo.length - 1; i > 0; i--){
          //Se realiza el ordenamiento moviendo elementos desde el inicio hacia el final del arreglo
          //Se compara desde el inicio del arreglo hasta su fin
             for (int j = 0; j < i; j++){
             
             //Se imprime cada comparacion por consola
                 System.out.printf("arreglo[%d] > arreglo[%d] : %d > %d  --> ", j, (j + 1), arreglo[j], arreglo[j+1]);  
             //Si el elemento actual es mayor que el elemento siguiente   
             if(arreglo[j] > arreglo[j + 1]){
             //Se imprime en la consola que si hubo intercambio    
                 System.out.printf("Si hay intercambio %n");
            //Se intercambia de lugar a los valores con un auxiliar     
                int aux = arreglo[j]; //Se almacena en un auxiliar el menor
                arreglo[j]= arreglo[j+1]; //Se cambia de lugar el acutal con el siguiente
                arreglo[j+1] = aux; //Se asigna al actual el auxiliar
             } else{
                 System.out.println("No hubo intercmabio");
             }
             }
              //Al final se imprime el arreglo despues de cada ordenacion
                 System.out.println("Pasada: " + (arreglo.length - i) + "\n"+ stringArreglo(arreglo) + "\n");
         }
        return arreglo;
    }
}
