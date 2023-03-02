/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

/**
 *
 * @author jonas
 */
public abstract class Operacion {
    
    public abstract int operar(int op1, int op2);
    
}


class Suma extends Operacion{

    @Override
    public int operar(int op1, int op2) {
        return op1 + op2;
    }
    
}

class Resta extends Operacion{

    @Override
    public int operar(int op1, int op2) {
        return op1 - op2;
    }
    
}
