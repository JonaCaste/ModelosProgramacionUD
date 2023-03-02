/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

/**
 *
 * @author jonas
 */
public abstract class MetodoFabricacion {
    
    public abstract Operacion generarOP();
    
}

class MetodoFabricacionSuma extends MetodoFabricacion {

    @Override
    public Operacion generarOP() {
        return new Suma();
    }
    
}

class MetodoFabricacionResta extends MetodoFabricacion {

    @Override
    public Operacion generarOP() {
        return new Resta();
    }
    
}
