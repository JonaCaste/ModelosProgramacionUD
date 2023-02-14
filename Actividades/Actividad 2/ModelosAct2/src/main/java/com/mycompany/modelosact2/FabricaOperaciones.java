/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

/**
 *
 * @author jonas
 */

abstract interface FabricaAbstractaOperacionesBasicas{
    int sumar(int op1, int op2);
    int restar(int op1, int op2);
}

class FabricaConcretaOperacionesBasicas implements FabricaAbstractaOperacionesBasicas{
    
    private int resultado = 0;

    @Override
    public int sumar(int op1, int op2) {
        
        return resultado = op1 + op2;
        //return resultado;
        
    }
    
    @Override
    public int restar(int op1, int op2) {
        
        return resultado = op1 - op2;
        
    }

}

class Operaciones{

    FabricaConcretaOperacionesBasicas op = new FabricaConcretaOperacionesBasicas();
        
    public int multiplicar(int x, int y){
        
        int resultado = 0;

        for(int i=0; i<y; i++){
            resultado = op.sumar(x, resultado);
        }

        return resultado;

    }
    
    public int dividir(int x, int y){
        
        int cont = 0;
        
        while (x > 0){
            x = op.restar(x, y);
            cont++;
        }
        
        return cont;
    }
    
}
