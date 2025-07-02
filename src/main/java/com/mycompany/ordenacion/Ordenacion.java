/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenacion;

import static com.mycompany.ordenacion.BurbujaMayor.ordenarBurbujaMayor;
import static com.mycompany.ordenacion.BurbujaMenor.ordenarBurbujaMenor;
import static com.mycompany.ordenacion.Insercion.ordenarInsercion;
import static com.mycompany.ordenacion.Seleccion.ordenarSeleccion;
import javax.swing.JOptionPane;
/**
 *
 * @author Emilio
 */
public class Ordenacion {
    
    public static void main(String[] args) {
        
        menuPrincipal();
    }

    //Metodo para crear un arreglo;
    
    public static int[] obtenerArreglo(){
        String numeros = JOptionPane.showInputDialog("Ingrese los valores que desea ingresar al arreglo, separados por un espacio");
        String entrada = numeros.trim();
        String[] tokens = numeros.split("\\s+");
        int[] arreglo = arregloNumerico(tokens);
    
        return arreglo;
    }
    
    
    public static int[] arregloNumerico(String[] entrada){
     int[] numerico = new int[entrada.length];
     
     for(int i = 0; i < numerico.length; i++ ){
         try {
         numerico[i] = Integer.parseInt(entrada[i]);
         } catch (NumberFormatException e){}
         
     }
     return numerico;
    }
    
    
    //Metodo para imprimir el Arreglo
     public static String stringArreglo(int[] a) {
        if (a == null)
            return "El arreglo es nulo";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "El arreglo está vacío";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
    }
     
     
     //Menu de ordenacion
     public static void menuOrdenacion(int[] arreglo){
     int opcion;
        do {
            String menu = "MENÚ ORDENACIÓN\n"
                    + "1. Burbuja Ascendente (Burbuja Menor)\n"
                    + "2. Burbuja Descendente (Burbuja Mayor)\n"
                    + "3. Método de Inserción\n"
                    + "4. Método de Selección\n"
                    + "5. Extra 1 \n"
                    + "6. Extra 2 \n"
                    + "7. Redefinir al arreglo \n"
                    + "0. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    JOptionPane.showMessageDialog(null, "ORDENACION BURBUJA ASCENDENTE \n"
                            + "Arreglo Desordenado: " + stringArreglo(arreglo) + "\n" 
                            + "Arreglo Ordenado: " + stringArreglo(ordenarBurbujaMenor(arreglo)) + "\n");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "ORDENACION BURBUJA DESCENDENTE \n"
                            + "Arreglo Desordenado: " + stringArreglo(arreglo) + "\n" 
                            + "Arreglo Ordenado: " + stringArreglo(ordenarBurbujaMayor(arreglo)) + "\n");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "ORDENACION  INSERCION \n"
                            + "Arreglo Desordenado: " + stringArreglo(arreglo) + "\n" 
                            + "Arreglo Ordenado: " + stringArreglo(ordenarInsercion(arreglo)) + "\n");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "ORDENACION SELECCION \n"
                            + "Arreglo Desordenado: " + stringArreglo(arreglo) + "\n" 
                            + "Arreglo Ordenado: " + stringArreglo(ordenarSeleccion(arreglo)) + "\n");
                    break;
                case 5: 
                    break;
                case 6:
                    break;
                case 7:
                    arreglo = obtenerArreglo();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 0);
     } 

     
    public static void menuBusqueda(int[] arreglo){
         int opcion;
        do {
            String menu = "MENÚ BÚSQUEDA\n"
                    + "1. Busqueda Secuencial Desordenada\n"
                    + "2. Busqueda Secuencial Ordenada\n"
                    + "3. Busqueda Binaria\n"
                    + "4. Redefinir al arreglo\n"
                    + "0. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    
                    break;
                case 2:
                    
                        
                
                    break;
                case 3:
                    
                    
                        
                    break;
                case 4:
                    arreglo = obtenerArreglo();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida.");
                    break;
            }
        } while (opcion != 0);
    }

    public static void menuPrincipal(){
        JOptionPane.showMessageDialog(null, "¡Bienvenid@! " + "Antes de empezar, ingrese un arreglo para trabajar");
        int[] arreglo = obtenerArreglo(); 
        
        int opcion ;
         
        do{
         String menu = "MENÚ PRINCIPAL\n"
                    + "1. Ordenación\n"
                    + "2. Búsqueda\n"
                    + "0. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion) {
                case 1:
                    menuOrdenacion(arreglo);    
                    break;
                case 2:
                    menuBusqueda(arreglo);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida, intente nuevamente");
            }
        } while (opcion != 0);
    }
}
