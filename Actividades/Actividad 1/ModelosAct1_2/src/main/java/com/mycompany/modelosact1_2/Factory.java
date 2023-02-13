/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact1_2;

/**
 *
 * @author jonas
 */

abstract interface MarcadorFactory{
    Marcador createMarcador();
}
    

class RechargeableFactory implements MarcadorFactory{

    @Override
    public Marcador createMarcador() {
        Marcador marcador = new Marcador("verde", true);
        
        return marcador;
    }
    
}

class PermanentFactory implements MarcadorFactory {

    @Override
    public Marcador createMarcador() {
        Marcador marcador = new Marcador("rojo", false);
        
        return marcador;
    }
    
}
