package vistas;

import clases.Conexion;
import clases.Validacion;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlPrincipal = new javax.swing.JPanel();
        jblTitulo = new javax.swing.JLabel();
        jblUsuario = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 330));

        pnlPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jblTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jblTitulo.setText("Interfaz Usuario");
        pnlPrincipal.add(jblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        jblUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblUsuario.setText("Nombre de usuario");
        pnlPrincipal.add(jblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 197, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.setPreferredSize(new java.awt.Dimension(200, 30));
        txtUsuario.setRequestFocusEnabled(false);
        pnlPrincipal.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, -1, -1));

        jblPassword.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jblPassword.setText("Password");
        pnlPrincipal.add(jblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 282, -1, -1));

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(200, 30));
        pnlPrincipal.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        btnIngresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.setPreferredSize(new java.awt.Dimension(150, 30));
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlPrincipal.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        
        Validacion objValidar = new Validacion();
        Boolean respuesta;
        String usuario = txtUsuario.getText();
        String password = txtPassword.getText();
        
        try {
            
            respuesta = objValidar.Validar(usuario, password);
            Formulario2 objInicio = new Formulario2();
            
            if (respuesta == true) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
                objInicio.setVisible(true);
                objInicio.setLocationRelativeTo(null);
                this.dispose();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Los datos ingresados son incorrectos");
            Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnIngresarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel jblPassword;
    private javax.swing.JLabel jblTitulo;
    private javax.swing.JLabel jblUsuario;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
