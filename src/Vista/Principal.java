/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Reportes;
import javax.swing.JOptionPane;


public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
        this.setTitle("Menu");
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MenuSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MenuCliente = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        MenuProveedor = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        MenuProducto = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        MenuBuscarCliente = new javax.swing.JMenuItem();
        jMenu15 = new javax.swing.JMenu();
        MenuRegistrarVenta = new javax.swing.JMenuItem();
        jMenu13 = new javax.swing.JMenu();
        MenuReporteCliente = new javax.swing.JMenuItem();
        MenuReporteProductos = new javax.swing.JMenuItem();
        MenuReporteProveedor = new javax.swing.JMenuItem();
        MenuReporteVenta = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        jMenuItem1.setText("jMenuItem1");

        jMenu10.setText("File");
        jMenuBar4.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar4.add(jMenu11);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu2.setText("Login");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        MenuSalir.setText("Salir");
        MenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirActionPerformed(evt);
            }
        });
        jMenu2.add(MenuSalir);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Registro");

        MenuCliente.setText("Cliente");
        MenuCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuClienteActionPerformed(evt);
            }
        });
        jMenu3.add(MenuCliente);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Proveedor");

        MenuProveedor.setText("Proveedor");
        MenuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProveedorActionPerformed(evt);
            }
        });
        jMenu8.add(MenuProveedor);

        jMenuBar1.add(jMenu8);

        jMenu12.setText("Productos");

        MenuProducto.setText("Producto");
        MenuProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuProductoActionPerformed(evt);
            }
        });
        jMenu12.add(MenuProducto);

        jMenuBar1.add(jMenu12);

        jMenu9.setText("Buscar");

        MenuBuscarCliente.setText("Buscar Cliente");
        MenuBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarClienteActionPerformed(evt);
            }
        });
        jMenu9.add(MenuBuscarCliente);

        jMenuBar1.add(jMenu9);

        jMenu15.setText("Venta");

        MenuRegistrarVenta.setText("Registrar Venta");
        MenuRegistrarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistrarVentaActionPerformed(evt);
            }
        });
        jMenu15.add(MenuRegistrarVenta);

        jMenuBar1.add(jMenu15);

        jMenu13.setText("Reportes");

        MenuReporteCliente.setText("Reporte Cliente");
        MenuReporteCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporteClienteActionPerformed(evt);
            }
        });
        jMenu13.add(MenuReporteCliente);

        MenuReporteProductos.setText("Reporte Productos");
        MenuReporteProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporteProductosActionPerformed(evt);
            }
        });
        jMenu13.add(MenuReporteProductos);

        MenuReporteProveedor.setText("Reporte Proveedor");
        MenuReporteProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporteProveedorActionPerformed(evt);
            }
        });
        jMenu13.add(MenuReporteProveedor);

        MenuReporteVenta.setText("Reporte de Ventas");
        MenuReporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReporteVentaActionPerformed(evt);
            }
        });
        jMenu13.add(MenuReporteVenta);

        jMenuBar1.add(jMenu13);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void MenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuSalirActionPerformed

    private void MenuClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuClienteActionPerformed
        FrmClientes cli = new FrmClientes();
        cli.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuClienteActionPerformed

    private void MenuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProveedorActionPerformed
        FrmProveedor prove = new FrmProveedor();
        prove.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuProveedorActionPerformed

    private void MenuProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuProductoActionPerformed
        FrmProducto prod = new FrmProducto();
        prod.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuProductoActionPerformed

    private void MenuBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarClienteActionPerformed
        frmbuscarcli prod = new frmbuscarcli();
        prod.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuBuscarClienteActionPerformed

    private void MenuRegistrarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistrarVentaActionPerformed
         frmRegistrarVenta prod = new frmRegistrarVenta();
        prod.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuRegistrarVentaActionPerformed

    private void MenuReporteClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporteClienteActionPerformed
        // REPORTE DE CLIENTE
         Reportes reporte = new Reportes();
        reporte.ReportesClientes();
        JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente");
        
    }//GEN-LAST:event_MenuReporteClienteActionPerformed

    private void MenuReporteProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporteProductosActionPerformed
        // REPORTE PRODUCTOS
        
         Reportes reporte = new Reportes();
        reporte.ReportesProductos();
        JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente");
        
    }//GEN-LAST:event_MenuReporteProductosActionPerformed

    private void MenuReporteProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporteProveedorActionPerformed
        // REPORTE PROVEEDOR
         Reportes reporte = new Reportes();
        reporte.ReportesProveedor();
        JOptionPane.showMessageDialog(null, "Reporte Creado Correctamente");
        
        
    }//GEN-LAST:event_MenuReporteProveedorActionPerformed

    private void MenuReporteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReporteVentaActionPerformed
        FrmReporteVenta repo=new FrmReporteVenta();
        repo.setVisible(true);
        dispose();
    }//GEN-LAST:event_MenuReporteVentaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuBuscarCliente;
    private javax.swing.JMenuItem MenuCliente;
    private javax.swing.JMenuItem MenuProducto;
    private javax.swing.JMenuItem MenuProveedor;
    private javax.swing.JMenuItem MenuRegistrarVenta;
    private javax.swing.JMenuItem MenuReporteCliente;
    private javax.swing.JMenuItem MenuReporteProductos;
    private javax.swing.JMenuItem MenuReporteProveedor;
    private javax.swing.JMenuItem MenuReporteVenta;
    private javax.swing.JMenuItem MenuSalir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
