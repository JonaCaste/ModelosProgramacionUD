/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modelosact2;

/**
 *
 * @author jonas
 */
public class ModelosAct2 {

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        
        Operaciones op = new Operaciones();
        //referencia abstracta             objeto concreto                    
        FabricaAbstractaEntradaSalida es = new FabricaConcretaEntradaSalida();//Sustitución de liscop
        
        es.generarSalida("Su resultado es: " + op.multiplicar(es.generarEntrada("Ingrese el operando"), es.generarEntrada("Ingrese el operando")));
        
        //int div = op.crearDivision(200, 5);
    }
}
