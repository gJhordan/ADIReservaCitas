/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pantalla;

/**
 *
 * @author
 */
public class PantallaCRUDCliente extends javax.swing.JFrame {

    /**
     * Creates new form PantallaCRUDCliente
     */
    public PantallaCRUDCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabelClientes = new javax.swing.JLabel();
        jLabelDNI = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldClientes = new javax.swing.JTextField();
        jTextFieldDNI = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jButtonAgregar = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelClientes.setText("Clientes:");
        getContentPane().add(jLabelClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabelDNI.setText("DNI:");
        getContentPane().add(jLabelDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabelTelefono.setText("Telefono:");
        getContentPane().add(jLabelTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(jTextFieldClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 150, -1));
        getContentPane().add(jTextFieldDNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 150, -1));
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 150, -1));

        jButtonAgregar.setText("Agregar");
        getContentPane().add(jButtonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jButtonActualizar.setText("Actualizar");
        getContentPane().add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jButtonEliminar.setText("Eliminar");
        getContentPane().add(jButtonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"PEDRO LOPEZ", "65478632", "987654321"},
                {"MARILUZ MAYQUI", "48213695", "961234587"},
                {"LUIS TEVEZ", "63258974", "932154782"},
                {"BRYAN NILO", "47123568", "952135687"}
            },
            new String [] {
                "Clientes", "DNI", "Telefono"
            }
        ));
        jScrollPane1.setViewportView(jTableClientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, 200));

        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(PantallaCRUDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCRUDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCRUDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCRUDCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCRUDCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelDNI;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTextField jTextFieldClientes;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration
}
