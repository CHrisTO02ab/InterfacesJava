
package ventanas;
import java.util.HashMap;
import java.util.Map;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class boleta_pago extends javax.swing.JFrame {

   private DefaultTableModel modeloTabla;
   private int contador =0;
   private Map<String,Integer> carrito;
   
    public boleta_pago() {
        initComponents();
        modeloTabla = new DefaultTableModel(new Object[]{"Producto", "Talla", "Cantidad", "Precio Total"}, 0);
              DefaultTableModel modeloTabla =new DefaultTableModel();

         setTitle("BOLETA DE PAGOS");
        setLocationRelativeTo(null);
        carrito = new HashMap<>();
      
        
    }
    public void agregarProducto(String producto, String talla, double precioUnitario) {
        String claveProducto = producto + " - " + talla;
// Si el producto ya existe en el carrito, actualizamos la cantidad y el precio
        if (carrito.containsKey(claveProducto)) {
            int fila = obtenerFilaPorProductoYtalla(producto, talla);
            int cantidadActual = carrito.get(claveProducto);
            cantidadActual += 1;
            carrito.put(claveProducto, cantidadActual);

            // Actualizamos cantidad y precio total en el JTable
            modeloTabla.setValueAt(cantidadActual, fila, 2);
            modeloTabla.setValueAt(cantidadActual * precioUnitario, fila, 3);

        
        } else {
            // Si es un nuevo producto, lo añadimos al carrito y al JTable
            carrito.put(claveProducto, 1);
            modeloTabla.addRow(new Object[]{producto, talla, 1, precioUnitario});

        }

    }
    private int obtenerFilaPorProductoYtalla(String producto, String talla) {
        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            String productoTabla = (String) modeloTabla.getValueAt(i, 0);
            String tallaTabla = (String) modeloTabla.getValueAt(i, 1);
            if (producto.equals(productoTabla) && talla.equals(tallaTabla)) {
                return i;
            }
        }
        return -1;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla.setBackground(new java.awt.Color(204, 204, 204));
        tabla.setForeground(new java.awt.Color(0, 0, 0));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 540, 100));

        jButton2.setBackground(new java.awt.Color(153, 255, 255));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("SEGUIR \nCOMPRANDO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 590, 230, 40));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOLETA DE PAGO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jButton3.setBackground(new java.awt.Color(153, 255, 255));
        jButton3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("PAGAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 582, 180, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/boleta.PNG"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 645, 645));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        compras hy=new compras();
        this.dispose();
        hy.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PAGO ga = new PAGO();
        this.dispose();
        ga.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

     
   
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables

}
