/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modelosact2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Estudiantes
 */
public abstract class Salida {
    
    public abstract void imprimirContenido(String contenido);
    
}

class SalidaPantalla extends Salida{

    @Override
    public void imprimirContenido(String contenido) {
        System.out.println(contenido);
    }
    
}

class SalidaExcel extends Salida{
    
    private final String nombreExcel = "Base de datos";
    
     //Abrimos nuestra carpeta
    private File direccion = new File(".");
    private String dirAbsoluta = direccion.getAbsolutePath(),
                   dirSalida = dirAbsoluta.substring(0, dirAbsoluta.length() -1) + nombreExcel + ".xlsx";

    @Override
    public void imprimirContenido(String contenido) {
        
        try {
            File file = new File(dirSalida);
            InputStream myFile = new FileInputStream(file);
            
            XSSFWorkbook wb = new XSSFWorkbook(myFile);
            Sheet sheet = wb.getSheetAt(0);
            
            int ultimaFila = sheet.getLastRowNum() + 1;
            
            //System.out.println(ultimaFila);

            Row fila = sheet.createRow(ultimaFila);
            Cell contenidoExcel = fila.createCell(0);
            
            contenidoExcel.setCellValue(contenido);
            
            FileOutputStream fos = null;
            fos = new FileOutputStream(file);

            wb.write(fos);
            wb.close();
            fos.close();

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
    }
    
}
