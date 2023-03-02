/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modelosact2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author jonas
 */
public class ModelosAct2 {
    
    private final String nombreExcel = "Base de datos";
    
     //Abrimos nuestra carpeta
    private File direccion = new File(".");
    private String dirAbsoluta = direccion.getAbsolutePath(),
                   dirSalida = dirAbsoluta.substring(0, dirAbsoluta.length() -1) + nombreExcel + ".xlsx";
    
    public void crearExcel(){
        
        Workbook excel = new XSSFWorkbook();
        
        Sheet hoja = excel.createSheet("datos");
        
        Row primeraFila = hoja.createRow(0);
        
        Cell dato = primeraFila.createCell(0);
        
        dato.setCellValue("Valor por defecto");
        
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

    public static void main(String[] args) {
        
        /*ModelosAct2 mod = new ModelosAct2();
        
        mod.crearExcel();*/
        
        //referencia abstracta             objeto concreto  
        FabricaAbstractaEntradaSalida fabricaES = new FabricaConcretaEntradaSalida();//Sustitución de liscop
        
        Entrada entrada = fabricaES.generarEntrada();
        String contEntrada1 = entrada.setContenido();
        String contEntrada2 = entrada.setContenido();
        
        int op1 = Integer.parseInt(contEntrada1);
        int op2 = Integer.parseInt(contEntrada2);
        
        //FabricaAbstractaOperacionesBasicas fabricaOP = new FabricaConcretaOperacionesBasicas();
        
//        Suma suma = fabricaOP.generarSuma();
//        int resultado = suma.operar(op1, op2);
        


        MetodoFabricacion fabricaOPSuma = new MetodoFabricacionSuma();
        Operacion opSuma = fabricaOPSuma.generarOP();

        int resultado = opSuma.operar(op1, op2);
        
        Salida salida = fabricaES.generarSalida();
        
        salida.imprimirContenido(Integer.toString(resultado));
        
        
//        // Excel
//        fabricaES = new FabricaConcretaEntradaSalidaExcel();
//        
//        fabricaES.generarSalida().imprimirContenido(Integer.toString(resultado));
//        
//        String contEntrada3 = fabricaES.generarEntrada().setContenido();
//        
//        
//        //Pantalla
//        fabricaES = new FabricaConcretaEntradaSalida();
//        
//        fabricaES.generarSalida().imprimirContenido(contEntrada3);
        
    }
}
