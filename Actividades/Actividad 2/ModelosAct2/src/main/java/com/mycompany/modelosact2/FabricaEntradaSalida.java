/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

/**
 *
 * @author Estudiantes
 */

abstract class FabricaAbstractaEntradaSalida{
    public abstract Entrada generarEntrada();
    public abstract Salida generarSalida();
}

class FabricaConcretaEntradaSalida extends FabricaAbstractaEntradaSalida{

    @Override
    public Entrada generarEntrada() {
        
        Entrada entrada = new EntradaTeclado();
        
        return entrada;
    }

    @Override
    public Salida generarSalida() {
        
        Salida salida = new SalidaPantalla();
        
        return salida;
    }
    
}

class FabricaConcretaEntradaSalidaExcel extends FabricaAbstractaEntradaSalida{

    @Override
    public Entrada generarEntrada() {
        
        Entrada entrada = new EntradaExcel();
        
        return entrada;
    }
    
    @Override
    public Salida generarSalida() {
        
        Salida salida = new SalidaExcel();
        
        return salida;
    }

}