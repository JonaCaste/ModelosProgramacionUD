/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Scanner;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Estudiantes
 */
public abstract class Entrada {
    
    //private String contenido;
    
    //public abstract String getContenido();
    public abstract String setContenido();
    
}

class EntradaTeclado extends Entrada{

    @Override
    public String setContenido() {
        Scanner sc = new Scanner(System.in);
        String entrada = sc.nextLine();
        
        return entrada;
    }
    
}

class EntradaExcel extends Entrada{
    
    private final String nombreExcel = "Base de datos";
    
     //Abrimos nuestra carpeta
    private File direccion = new File(".");
    private String dirAbsoluta = direccion.getAbsolutePath(),
                   dirSalida = dirAbsoluta.substring(0, dirAbsoluta.length() -1) + nombreExcel + ".xlsx";

    @Override
    public String setContenido() {
        
        String entrada = "--No se obtuvo ningun valor--";
    
        try {
            File file = new File(dirSalida);
            InputStream myFile = new FileInputStream(file);
            
            XSSFWorkbook wb = new XSSFWorkbook(myFile);
            Sheet sheet = wb.getSheetAt(0);
            
            int ultimaFila = sheet.getLastRowNum();
            Row fila = sheet.getRow(ultimaFila);
            Cell datoExcel = fila.getCell(0);

            entrada = datoExcel.toString();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        return entrada;
    }
    
}
