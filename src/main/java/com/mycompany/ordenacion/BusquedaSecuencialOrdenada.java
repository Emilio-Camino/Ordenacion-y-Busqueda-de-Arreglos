/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Emilio
 */
public class BusquedaSecuencialOrdenada {
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
