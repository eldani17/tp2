/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.untdf.ventanas;

/**
 *
 * @author DAndrade
 */
public class Principal extends javax.swing.JFrame {
    private VentanaAdministracionCliente vClienteAdmi;
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setExtendedState(this.MAXIMIZED_BOTH);//estado maximizado
        this.setTitle("System Flights by Daniel Andrade");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jdpContenedor = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmiSalir = new javax.swing.JMenuItem();
        jMenuCliente = new javax.swing.JMenu();
        jmiAdministracionCliente = new javax.swing.JMenuItem();
        jmiBuscarCliente = new javax.swing.JMenuItem();
        jmiListarCliente = new javax.swing.JMenuItem();
        jMenuVuelo = new javax.swing.JMenu();
        jmiAdministracionVuelo = new javax.swing.JMenuItem();
        jmiBuscarVuelos = new javax.swing.JMenuItem();
        jmiListarVuelos = new javax.swing.JMenuItem();
        jMenuAeropuerto = new javax.swing.JMenu();
        jmiAdministracionAero = new javax.swing.JMenuItem();
        jmiBuscarAero = new javax.swing.JMenuItem();
        jmiListarAero = new javax.swing.JMenuItem();
        jMenuTicket = new javax.swing.JMenu();
        jmiAdministracionTicket = new javax.swing.JMenuItem();
        jmiBuscarTicket = new javax.swing.JMenuItem();
        jmiListarTicket = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.add(jSeparator1);

        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jmiSalir);

        jMenuBar1.add(jMenuArchivo);

        jMenuCliente.setText("Clientes");

        jmiAdministracionCliente.setText("Administracion");
        jmiAdministracionCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAdministracionClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jmiAdministracionCliente);

        jmiBuscarCliente.setText("Buscar");
        jmiBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarClienteActionPerformed(evt);
            }
        });
        jMenuCliente.add(jmiBuscarCliente);

        jmiListarCliente.setText("Listar");
        jMenuCliente.add(jmiListarCliente);

        jMenuBar1.add(jMenuCliente);

        jMenuVuelo.setText("Vuelos");

        jmiAdministracionVuelo.setText("Administracion");
        jMenuVuelo.add(jmiAdministracionVuelo);

        jmiBuscarVuelos.setText("Buscar");
        jMenuVuelo.add(jmiBuscarVuelos);

        jmiListarVuelos.setText("Listar");
        jMenuVuelo.add(jmiListarVuelos);

        jMenuBar1.add(jMenuVuelo);

        jMenuAeropuerto.setText("Aeropuertos");

        jmiAdministracionAero.setText("Administracion");
        jMenuAeropuerto.add(jmiAdministracionAero);

        jmiBuscarAero.setText("Buscar");
        jMenuAeropuerto.add(jmiBuscarAero);

        jmiListarAero.setText("Listar");
        jMenuAeropuerto.add(jmiListarAero);

        jMenuBar1.add(jMenuAeropuerto);

        jMenuTicket.setText("Tickets");

        jmiAdministracionTicket.setText("Administracion");
        jMenuTicket.add(jmiAdministracionTicket);

        jmiBuscarTicket.setText("Buscar");
        jMenuTicket.add(jmiBuscarTicket);

        jmiListarTicket.setText("Listar");
        jMenuTicket.add(jmiListarTicket);

        jMenuBar1.add(jMenuTicket);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpContenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmiBuscarClienteActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jmiAdministracionClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAdministracionClienteActionPerformed
        if(vClienteAdmi == null || !VentanaAdministracionCliente.abierta)
        {
            vClienteAdmi = new VentanaAdministracionCliente();
            vClienteAdmi.setVisible(true);
            jdpContenedor.add(vClienteAdmi);
        }
    }//GEN-LAST:event_jmiAdministracionClienteActionPerformed

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
    private javax.swing.JMenu jMenuAeropuerto;
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCliente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenu jMenuTicket;
    private javax.swing.JMenu jMenuVuelo;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JDesktopPane jdpContenedor;
    private javax.swing.JMenuItem jmiAdministracionAero;
    private javax.swing.JMenuItem jmiAdministracionCliente;
    private javax.swing.JMenuItem jmiAdministracionTicket;
    private javax.swing.JMenuItem jmiAdministracionVuelo;
    private javax.swing.JMenuItem jmiBuscarAero;
    private javax.swing.JMenuItem jmiBuscarCliente;
    private javax.swing.JMenuItem jmiBuscarTicket;
    private javax.swing.JMenuItem jmiBuscarVuelos;
    private javax.swing.JMenuItem jmiListarAero;
    private javax.swing.JMenuItem jmiListarCliente;
    private javax.swing.JMenuItem jmiListarTicket;
    private javax.swing.JMenuItem jmiListarVuelos;
    private javax.swing.JMenuItem jmiSalir;
    // End of variables declaration//GEN-END:variables
}
