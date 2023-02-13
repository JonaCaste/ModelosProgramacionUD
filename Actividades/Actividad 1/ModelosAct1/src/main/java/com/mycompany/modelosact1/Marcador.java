/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact1;

/**
 *
 * @author jonas
 */
public class Marcador {
    
    private String color;
    private boolean recargable;

    public Marcador(String color, boolean recargable) {
        this.color = color;
        this.recargable = recargable;
    }

    public String getColor() {
        return color;
    }

    public boolean isRecargable() {
        return recargable;
    }
    
}
