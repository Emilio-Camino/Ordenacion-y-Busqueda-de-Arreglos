/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacionBusqueda;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class BusquedaSecuencialOrdenada {
    /*
    Algoritmo BusquedaSecuencialOrdenada(A, dato)
    A = Arreglo[1 ... N] de Enteros
    i ← 0
    ultimoDatoLeido ← 0
    valorHallado ← -1

    Mientras (i < N y dato > A[i]) hacer
        ultimoDatoLeido ← A[i]
        i ← i + 1
    Fin Mientras

    Si (i ≥ N o dato < ultimoDatoLeido) entonces
        Mostrar "No se halló el elemento"
    Sino
        Mostrar "Se halló el elemento", dato, "en la posición", i + 1
        valorHallado ← dato
    Fin Si

    Retornar valorHallado
Fin Algoritmo
    */
    public static int buscarSecuencialOrdenada(int[] arregloOrdenado, int dato){
        int valorHallado = -1;
        int i = 0;
        int ultimoDatoLeido = 0;
        while(i < arregloOrdenado.length && dato > arregloOrdenado[i]){
            ultimoDatoLeido = arregloOrdenado[i];
            i++;
        }
        if (i >= arregloOrdenado.length || dato < ultimoDatoLeido){
           JOptionPane.showMessageDialog(null, "No se halló el elemento"); 
        } else {
            JOptionPane.showMessageDialog(null, "Se halló el elemento " + dato + " en la posicion " + (i+1) );
            valorHallado = dato;
        
        }
    return valorHallado;
    }
  
}
