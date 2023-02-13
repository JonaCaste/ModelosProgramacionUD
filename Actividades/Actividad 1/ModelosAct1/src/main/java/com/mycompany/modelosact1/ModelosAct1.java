/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modelosact1;
import com.mycompany.modelosact1.Marcador;
import java.util.Scanner;

/**
 *
 * @author jonas
 */
public class ModelosAct1 {

    public static void main(String[] args) {
        
        //System.out.println("Hello World!");
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Ingrese el color del marcador: ");
        String color = sc.next();
        
        System.out.println("¿Es recargable? ");
        boolean recargable = Boolean.valueOf(sc.next());
        
        Marcador marcador = new Marcador(color, recargable);
        
        //System.out.println(marcador);
        
    }
}
