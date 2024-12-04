/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;

/**
 *
 * @author Christopher
 */
public class ayuda extends javax.swing.JFrame {

    /**
     * Creates new form variedad
     */
    public ayuda() {
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

        jLabel1 = new javax.swing.JLabel();
        salida = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        fondo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Footlight MT Light", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido a la parte de Ayuda");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 680, 60));

        salida.setBackground(new java.awt.Color(0, 102, 102));
        salida.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        salida.setForeground(new java.awt.Color(255, 255, 255));
        salida.setText("REGRESAR");
        salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salidaActionPerformed(evt);
            }
        });
        getContentPane().add(salida, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 480, 170, -1));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 0, 51));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(0, 0, 0));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 520, 230));

        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/logo_variedad-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 420, 370));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("¿Que es lo que necesita?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(0, 102, 102));
        jComboBox1.setFont(new java.awt.Font("Dialog", 2, 18)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(0, 0, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "escoge cualquier consulta", "informacion de la empresa", "Contacto", "metodos de pago" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 410, 40));

        fondo2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        fondo2.setForeground(new java.awt.Color(255, 255, 255));
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/variedad.PNG"))); // NOI18N
        getContentPane().add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 940, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salidaActionPerformed
         variedad uj = new variedad();
         uj.setVisible(true);
         this.dispose();
    }//GEN-LAST:event_salidaActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
     String seleccionado = (String) jComboBox1.getSelectedItem();
                if (seleccionado != null) {
                    // Cambiar el texto en el JTextArea según la selección
                switch (seleccionado) {
                    case "informacion de la empresa":
                        jTextArea1.setText("informacion de la empresa \n Misión:\n" +
                        "Brindar calzado de calidad que combine estilo, confort y durabilidad, satisfaciendo\n"
                      + " las necesidades de nuestros clientes con un enfoque innovador y sostenible.\n"
                                + "Visión:\n" +
                        "Ser líderes en el mercado de zapatillas, reconocidos por nuestra creatividad,\n"
                                + " impacto positivo en el medio ambiente y compromiso con el bienestar de\n" 
                               + "nuestros clientes y colaboradores.\n"
                                + "Valores:\n" +
                                    "-Innovación: Diseñamos zapatillas únicas y modernas.\n" +
                                "-Sostenibilidad: Utilizamos materiales ecoamigables y procesos responsables.\n" +
                                    "-Calidad: Garantizamos productos duraderos y cómodos.\n" +
                                "-Servicio: ofrecemos una experiencia de compra excepcional.");
                        break;
                    case "Contacto":
                        jTextArea1.setText("CONTACTO.\n\n" +
                            "Teléfono: +51 914 746 081\n\n" +
                                    "Correo : contacto@kingmonkey.com​\n\n" +
                                    "Página web : www.kingmonkey.com");
                        break;
                    case "metodos de pago":
                        jTextArea1.setText("Métodos de Pago en King Monkey\n\n" +
                                            "TIENDA FISICA:\n" +
                                    "-Efectivo: En moneda\n" +
                                                    "-Tarjetas:Visa,\n\n" +
                                        "TIENDA ONLINE\n" +
                                            "Tarjetas: bcp o bbva\n" +
                                                "Billetes Digitales: YAPE o plin\n" +
                                    "Transferencia Bancaria\n");
                        break;
                    default:
                        jTextArea1.setText("");
                        break;
                }
                }
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ayuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton salida;
    // End of variables declaration//GEN-END:variables
}
