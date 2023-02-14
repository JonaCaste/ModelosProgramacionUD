/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */

abstract interface FabricaAbstractaEntradaSalida{
    int generarEntrada(String texto);
    void generarSalida(String salida);
}

class FabricaConcretaEntradaSalida implements FabricaAbstractaEntradaSalida{

    @Override
    public int generarEntrada(String texto) {
        Scanner sc = new Scanner(System.in);
        generarSalida(texto);
        int entrada = Integer.parseInt(sc.nextLine());
        
        return entrada;
    }

    @Override
    public void generarSalida(String salida) {
        System.out.println(salida);
    }
    
}
