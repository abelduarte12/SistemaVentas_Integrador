
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/sistemaventaintegrador?serverTimezone=UTC";
        Connection con = DriverManager.getConnection(myBD, "root", "");
         
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "NO se conecto a la BD");

        }
        return null;
    }
}





/*
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    static Connection conectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     Connection con;

    public Connection getConnection() {
        try {
            String myBD = "jdbc:mysql://localhost:3306/sistemaventaintegrador?serverTimezone=UTC";
            con = DriverManager.getConnection(myBD, "root", "manuel");
            return con;
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return null;
    }

    public void desconectar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}*/
