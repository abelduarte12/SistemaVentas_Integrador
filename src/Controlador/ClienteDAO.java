/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel modelotabla;
    
    public boolean RegistrarCliente(Cliente cl){
        String sql = "INSERT INTO cliente (nombre, apellidoPaterno, apellidoMaterno, TipoDocumento, numero, direccion) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNombre());
            ps.setString(2, cl.getApellido_paterno());
            ps.setString(3, cl.getApellido_materno());
            ps.setString(4, cl.getTipo());
            ps.setString(5, cl.getNumero());
            ps.setString(6, cl.getDireccion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
    
    public List ListarCliente(){
       List<Cliente> ListaCl = new ArrayList();
       String sql = "SELECT * FROM cliente";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Cliente cl = new Cliente();
               cl.setId(rs.getInt("id"));
               cl.setNombre(rs.getString("nombre"));
               cl.setApellido_paterno(rs.getString("apellidoPaterno"));
               cl.setApellido_materno(rs.getString("apellidoMaterno"));
               cl.setTipo(rs.getString("TipoDocumento"));
               cl.setNumero(rs.getString("numero"));
               cl.setDireccion(rs.getString("direccion"));
               ListaCl.add(cl);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCl;
   }
   
    public boolean EliminarCliente(int id){
       String sql = "DELETE FROM cliente WHERE id = ?";
       try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException ex) {
               System.out.println(ex.toString());
           }
       }
   }
   
    public boolean ModificarCliente(Cliente cl){
       String sql = "UPDATE cliente SET nombre=?, apellidoPaterno=?, apellidoMaterno=?, TipoDocumento=?, numero=?, direccion=?  WHERE id=?";
       try {
           ps = con.prepareStatement(sql);   
           ps.setString(1, cl.getNombre());
           ps.setString(2, cl.getApellido_paterno());
           ps.setString(3, cl.getApellido_materno());
           ps.setString(4, cl.getTipo());
           ps.setString(5, cl.getNumero());
           ps.setString(6, cl.getDireccion());
           ps.setInt(7, cl.getId());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
    
   
    
      public void Buscar(String valor, String filtro, JTable tabla){
          String [] columnas={"id","nombre","apellidoPaterno","apellidoMaterno","TipoDocumento","numero","direccion","fecha"};
          String [] registros=new String[8];
          modelotabla=new DefaultTableModel (null, columnas);
          String SSQL;
          Connection conect = null;
          
          if(filtro.equals("nombre")){
              SSQL = "SELECT * FROM cliente WHERE nombre LIKE '%"+valor+"%'";
          }else if(filtro.equals("apellido")){
              SSQL = "SELECT * FROM cliente WHERE apellidoPaterno LIKE '%"+valor+"%'";
          }else{
              SSQL = "SELECT * FROM cliente WHERE numero LIKE '%"+valor+"%'";  
          }
          
          try {
              conect = cn.getConnection();
              PreparedStatement st= conect.prepareStatement(SSQL);
              ResultSet rst=  st.executeQuery();
              
              while(rst.next()){
                  registros[0]=rst.getString("id");
                  registros[1]=rst.getString("nombre");
                  registros[2]=rst.getString("apellidoPaterno");
                  registros[3]=rst.getString("apellidoMaterno");
                  registros[4]=rst.getString("TipoDocumento");
                  registros[5]=rst.getString("numero");
                  registros[6]=rst.getString("direccion");
                  registros[7]=rst.getString("fecha");
                  modelotabla.addRow(registros);
                  
              }
              tabla.setModel(modelotabla);
              
          } catch (SQLException e) {
              
              JOptionPane.showMessageDialog(null, e, "Error durante el procedimiento", JOptionPane.ERROR_MESSAGE);
              
          } finally {
              if(conect!=null){
                  try {
                      conect.close(); 
                  } catch (SQLException ex) {
                      JOptionPane.showMessageDialog(null, ex, "Error de desconexion", JOptionPane.ERROR_MESSAGE); 
                  }
              }  
              
              
          }
          
          
      }
      public Cliente Buscarcliente(int numero){
       Cliente cl = new Cliente();
       String sql = "SELECT * FROM cliente WHERE numero = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, numero);
           rs = ps.executeQuery();
           if (rs.next()) {
               cl.setNombre(rs.getString("nombre"));
               cl.setApellido_paterno(rs.getString("apellidoPaterno"));
               cl.setApellido_materno(rs.getString("apellidoMaterno"));
            
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return cl;
   }
      
                
}
       
