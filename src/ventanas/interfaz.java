/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class interfaz extends javax.swing.JFrame {

    /**
     * Creates new form interfaz
     */
    public interfaz() {
        initComponents();
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

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        USUARIO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usuario = new javax.swing.JTextField();
        contraseña = new javax.swing.JPasswordField();
        INGRESAR = new javax.swing.JButton();
        REGISTRO = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, 70, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 140, 170));

        USUARIO.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        USUARIO.setForeground(new java.awt.Color(255, 255, 255));
        USUARIO.setText("USUARIO :");
        getContentPane().add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 110, 20));

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTRASEÑA :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 170, -1));

        usuario.setBackground(new java.awt.Color(255, 255, 255));
        usuario.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        usuario.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 210, -1));

        contraseña.setBackground(new java.awt.Color(255, 255, 255));
        contraseña.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        contraseña.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 362, 190, 30));

        INGRESAR.setBackground(new java.awt.Color(102, 255, 255));
        INGRESAR.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        INGRESAR.setForeground(new java.awt.Color(0, 0, 0));
        INGRESAR.setText("INICIAR SESIÓN");
        INGRESAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INGRESARActionPerformed(evt);
            }
        });
        getContentPane().add(INGRESAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 130, 40));

        REGISTRO.setBackground(new java.awt.Color(102, 255, 255));
        REGISTRO.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        REGISTRO.setForeground(new java.awt.Color(0, 0, 0));
        REGISTRO.setText("REGISTRARSE");
        REGISTRO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REGISTROActionPerformed(evt);
            }
        });
        getContentPane().add(REGISTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 130, 40));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.PNG"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JOptionPane.showMessageDialog(null, "gracias por comprar en KING MONKEY");
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void INGRESARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INGRESARActionPerformed
      String usu=usuario.getText();
      String pas=contraseña.getText();
      
        if (usu.isEmpty()|pas.isEmpty()) {
            JOptionPane.showMessageDialog(null,"Algun campo esta vacio");
        }else{
            if (usu.equals("renato1") && pas.equals("123456")) {
            Icon icono1 = new ImageIcon(getClass().getResource("/imagenes/perro.png"));
             JOptionPane.showMessageDialog(rootPane, "Bienvenido Renato\n"+"bienvenidos a King Monkey","Bienvenido",JOptionPane.PLAIN_MESSAGE,icono1);    
             variedad ing = new variedad();
                ing.setVisible(true);
                this.dispose();
            }else{
            if (usu.equals("elias2") && pas.equals("elias12")) {
           Icon icono1 = new ImageIcon(getClass().getResource("/imagenes/hanster.png"));
             JOptionPane.showMessageDialog(rootPane, "Bienvenido Elias\n"+"bienvenidos a King Monkey","Bienvenido",JOptionPane.PLAIN_MESSAGE,icono1);
             variedad sh = new variedad();
                sh.setVisible(true);
                this.dispose(); 
            }else{
            if (usu.equals("christian3") && pas.equals("christian34")) {
              Icon icono1 = new ImageIcon(getClass().getResource("/imagenes/chris.png"));
             JOptionPane.showMessageDialog(rootPane, "Bienvenido Christian\n"+"bienvenidos a King Monkey","Bienvenido",JOptionPane.PLAIN_MESSAGE,icono1);
             variedad oi = new variedad();
                oi.setVisible(true);
                this.dispose(); 
            }else{
            if (usu.equals("christopher4") && pas.equals("christopher456")) {
            Icon icono1 = new ImageIcon(getClass().getResource("/imagenes/me.png"));
             JOptionPane.showMessageDialog(rootPane, "Bienvenido Christopher\n"+"bienvenidos a King Monkey","Bienvenido",JOptionPane.PLAIN_MESSAGE,icono1);
             variedad q = new variedad();
                q.setVisible(true);
                this.dispose();  
            }else{
                if (usu.equals("reychimpa") && pas.equals("admin")) {
                    Icon icono = new ImageIcon(getClass().getResource("/imagenes/platano.png"));
             JOptionPane.showMessageDialog(rootPane, "Bienvenido ReyChimpa\n"+"bienvenidos a su casa","Bienvenido",JOptionPane.PLAIN_MESSAGE,icono);
             variedad oi = new variedad();
                oi.setVisible(true);
                this.dispose(); 
                 }else{
                    JOptionPane.showMessageDialog(null,"Usuario o contraseña invalido");
            }    
            }}
            } 
        }                
    }//GEN-LAST:event_INGRESARActionPerformed
    }
    private void REGISTROActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REGISTROActionPerformed
        registro vol = new registro();
        vol.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_REGISTROActionPerformed

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
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INGRESAR;
    private javax.swing.JButton REGISTRO;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JPasswordField contraseña;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
