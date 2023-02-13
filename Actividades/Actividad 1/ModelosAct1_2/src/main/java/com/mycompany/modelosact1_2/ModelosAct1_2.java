/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modelosact1_2;

/**
 *
 * @author jonas
 */
public class ModelosAct1_2 {

    public static void main(String[] args) {
        
        Marcador marcador;
        String color;
        
        RechargeableFactory rf = new RechargeableFactory();
        marcador = rf.createMarcador();
        color = marcador.getColor();
        System.out.println(color);
        
        PermanentFactory pf = new PermanentFactory();
        marcador = pf.createMarcador();
        color = marcador.getColor();
        System.out.println(color);
    }
}
