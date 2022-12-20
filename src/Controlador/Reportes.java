/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Conexion;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Reportes {

    Conexion cn = new Conexion();
    Connection con;

    //reporte de clientes
    public void ReportesClientes(){
        Document documento = new Document();
        
        try {
                String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_Clientes.pdf"));
           
            //formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \n Edwin Abel Vilca Quispe\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Clientes \n\n");
            
            documento.open();
            //agregamos los datos
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Codigo");
            tabla.addCell("Nombres");
            tabla.addCell("Tipo Documento");
            tabla.addCell("Nro Documento");
            tabla.addCell("Direccion");
            
            
            
            
            try {
               con=cn.getConnection();
             PreparedStatement pst = con.prepareStatement(
                     "SELECT id,nombre,TipoDocumento,numero,direccion FROM cliente ");
             ResultSet rs=pst.executeQuery();
             if(rs.next()){
                 do{
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                     
                 }while(rs.next());
                 documento.add(tabla);
                 
             }   
                
            } catch (Exception e) {
            }
            
            documento.close();
            
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }
        
    }
    
     //reporte de productos
    public void ReportesProductos(){
        Document documento = new Document();
        
        try {
                String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_Productos.pdf"));
           
            //formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \n Edwin Abel Vilca Quispe\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Productos \n\n");
            
            documento.open();
            //agregamos los datos
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Codigo");
            tabla.addCell("Nombres");
            tabla.addCell("Proveedor");
            tabla.addCell("Stock");
            tabla.addCell("Precio");
            
            
            
            
            try {
               con=cn.getConnection();
             PreparedStatement pst = con.prepareStatement(
                     "SELECT codigo,nombre,proveedor,stock,precio FROM productos ");
             ResultSet rs=pst.executeQuery();
             if(rs.next()){
                 do{
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                     
                 }while(rs.next());
                 documento.add(tabla);
                 
             }   
                
            } catch (Exception e) {
            }
            
            documento.close();
            
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }
        
    }
    
     //reporte de proveedor
    public void ReportesProveedor(){
        Document documento = new Document();
        
        try {
                String ruta=System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta+"/Desktop/Reporte_Proveedor.pdf"));
           
            //formato de texto
            Paragraph parrafo = new Paragraph();
            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
            parrafo.add("Reporte creado por \n Edwin Abel Vilca Quispe\n\n");
            parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
            parrafo.add("Reporte de Proveedor \n\n");
            
            documento.open();
            //agregamos los datos
            documento.add(parrafo);
            
            PdfPTable tabla = new PdfPTable(5);
            tabla.addCell("Codigo");
            tabla.addCell("Nombres");
            tabla.addCell("Proveedor");
            tabla.addCell("Stock");
            tabla.addCell("Precio");
            
            
            
            
            try {
               con=cn.getConnection();
             PreparedStatement pst = con.prepareStatement(
                     "SELECT codigo,nombre,proveedor,stock,precio FROM productos ");
             ResultSet rs=pst.executeQuery();
             if(rs.next()){
                 do{
                    tabla.addCell(rs.getString(1));
                    tabla.addCell(rs.getString(2));
                    tabla.addCell(rs.getString(3));
                    tabla.addCell(rs.getString(4));
                    tabla.addCell(rs.getString(5));
                     
                 }while(rs.next());
                 documento.add(tabla);
                 
             }   
                
            } catch (Exception e) {
            }
            
            documento.close();
            
        } catch (Exception e) {
            System.out.println("Error en: "+e);
        }
        
    }
    
}










