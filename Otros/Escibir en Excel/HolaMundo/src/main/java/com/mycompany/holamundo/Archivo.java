/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.holamundo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Estudiantes
 */
public class Archivo {
    
    private final String nombreExcel = "Base de datos";
    
     //Abrimos nuestra carpeta
    private File direccion = new File(".");
    private String dirAbsoluta = direccion.getAbsolutePath(),
                   dirSalida = dirAbsoluta.substring(0, dirAbsoluta.length() -1) + nombreExcel + ".xlsx";
    
    public void crearExcel(){
        
        Workbook excel = new XSSFWorkbook();
        
        Sheet hoja = excel.createSheet("datos hola mundo");
        
        Row primeraFila = hoja.createRow(0);
        
        Cell dato = primeraFila.createCell(0);
        Cell valor = primeraFila.createCell(1);
        
        dato.setCellValue("Valor por defecto");
        valor.setCellValue("Hola mundo");
        
        //Abrimos nuestra carpeta
        
        
        //Creamos el file de salida
        FileOutputStream outputStream;
        try {
            outputStream = new FileOutputStream(dirSalida);
            excel.write(outputStream);
            excel.close();
            System.out.println("Libro guardado correctamente");
        } catch (FileNotFoundException ex) {
            System.out.println("Error de filenotfound");
        } catch (IOException ex) {
            System.out.println("Error de IOException");
        }
    }
    
    public ArrayList leerExcel(){
        
        //String valor = "";
        ArrayList<Dato> datos = new ArrayList<Dato>();
    
        try {
            File file = new File(dirSalida);
            InputStream myFile = new FileInputStream(file);
            
            XSSFWorkbook wb = new XSSFWorkbook(myFile);
            Sheet sheet = wb.getSheetAt(0);

            /*Row fila = sheet.getRow(0);
            Cell datoExcel = fila.getCell(0),
                 valorExcel = fila.getCell(1);
            
            String dato = datoExcel.toString(),
                   valor = valorExcel.toString();
                   
            Dato dt = new Dato(dato, valor);*/
            
            int ultimaFila = sheet.getLastRowNum() + 1;
            
            for(int i=0; i<ultimaFila; i++){
                Row fila = sheet.getRow(i);
                Cell datoExcel = fila.getCell(0),
                     valorExcel = fila.getCell(1);
            
                String dato = datoExcel.toString(),
                       valor = valorExcel.toString();

                Dato dt = new Dato(dato, valor);
                
                datos.add(dt);
                
            }

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        
        return datos;
    }
    
    public void escribirExcel(Dato datos){
    
        try {
            File file = new File(dirSalida);
            InputStream myFile = new FileInputStream(file);
            
            XSSFWorkbook wb = new XSSFWorkbook(myFile);
            Sheet sheet = wb.getSheetAt(0);
            
            int ultimaFila = sheet.getLastRowNum() + 1;
            
            //System.out.println(ultimaFila);

            Row fila = sheet.createRow(ultimaFila);
            Cell datoExcel = fila.createCell(0),
                 valorExcel = fila.createCell(1);
            
            datoExcel.setCellValue(datos.getDato());
            valorExcel.setCellValue(datos.getValor());
            
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
