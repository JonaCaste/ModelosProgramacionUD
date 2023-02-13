/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Procesamiento {
    
    private Archivo archivo = new Archivo();
    
    public void leerValor(){
        ArrayList<Dato> datos = archivo.leerExcel();
        
        int sizeArray = datos.size();
        
        for(int i=0; i<sizeArray; i++){
            Dato dato = datos.get(i);
            
            System.out.println(dato.getValor());
        }
        
    }
    
    public void escribirValor(){
        
        Scanner in = new Scanner (System.in);
        System.out.println("Ingrese el dato que desea guardar: ");
        String dato = in.nextLine();
        System.out.println("Ingrese el valor que desea guardar: ");
        String valor = in.nextLine();
        
        Dato datos = new Dato(dato, valor);
        archivo.escribirExcel(datos);
        
        /*
        System.out.println(valor);
        archivo.escribirExcel(valor);
        */
    }
    
}
