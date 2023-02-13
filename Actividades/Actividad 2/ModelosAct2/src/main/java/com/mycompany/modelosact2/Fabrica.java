/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

/**
 *
 * @author jonas
 */

abstract interface FabricaAbstracta{
    int crearSuma(int op1, int op2);
}

class crearOperacion implements FabricaAbstracta{

    @Override
    public int crearSuma(int op1, int op2) {
        
        int resultado = op1 + op2;
        return resultado;
        
        
    }
    
    int crearMulti(int x, int y){
        
        int resultado = 0;
        
        for(int i=0; i<=y; i++){
            resultado = crearSuma(x, resultado);
        }
        
        return resultado;
    }
    
}
