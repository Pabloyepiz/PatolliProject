/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import controller.controlador;

/**
 *
 * @author yepiz
 */
public class vista extends javax.swing.JFrame {

    public vista() {
        initComponents();
        ButtonGroup grupo = new ButtonGroup();
        ButtonGroup grupo2 = new ButtonGroup();
        grupo.add(jChico);
        grupo.add(jGrande);
        grupo2.add(j2);
        grupo2.add(j3);
        grupo2.add(j4);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        j2 = new javax.swing.JRadioButton();
        j3 = new javax.swing.JRadioButton();
        j4 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jChico = new javax.swing.JRadioButton();
        jGrande = new javax.swing.JRadioButton();
        btnEmpezar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configuración Patolli");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/azteca.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/juego-de-mesa.png"))); // NOI18N
        jLabel2.setText("Selecciona el tablero:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("CONFIGURACIÓN");

        j2.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        j2.setText("2 Jugadores");
        j2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j2ActionPerformed(evt);
            }
        });

        j3.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        j3.setText("3 Jugadores");

        j4.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        j4.setText("4 Jugadores");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugador-contra-jugador.png"))); // NOI18N
        jLabel4.setText("Selecciona Jugaodres:");

        jChico.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jChico.setText("Tablero Chico");
        jChico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jChicoActionPerformed(evt);
            }
        });

        jGrande.setFont(new java.awt.Font("Segoe UI", 3, 15)); // NOI18N
        jGrande.setText("Tablero Grande");

        btnEmpezar.setBackground(new java.awt.Color(255, 204, 204));
        btnEmpezar.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        btnEmpezar.setText("Empezar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(j2)
                            .addComponent(j3)
                            .addComponent(j4))
                        .addGap(89, 89, 89)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jChico)
                    .addComponent(jGrande))
                .addContainerGap(65, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnEmpezar))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(j2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jChico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jGrande)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEmpezar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void j2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j2ActionPerformed

    private void jChicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jChicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jChicoActionPerformed

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed

        if (jChico.isSelected() && (j2.isSelected() || j3.isSelected() || j4.isSelected())) {
            // Si el RadioButton "jChico" está seleccionado y hay al menos un jugador seleccionado, abre el frmTableroChico
            tableroChico tableroChico = new tableroChico();
            tableroChico.setVisible(true); // Mostrar el tablero chico
            actualizarEtiquetasJugadores(tableroChico);
        } else if (jGrande.isSelected() && (j2.isSelected() || j3.isSelected() || j4.isSelected())) {
            // Si el RadioButton "jGrande" está seleccionado y hay al menos un jugador seleccionado, abre el frmTableroGrande
            tableroGrande tableroGrande = new tableroGrande();
            tableroGrande.setVisible(true); // Mostrar el tablero grande
            actualizarEtiquetasJugadores(tableroGrande);
        } else {
            // Si no se ha seleccionado ni el tamaño del tablero ni los jugadores
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un tamaño de tablero y la cantidad de jugadores.");
        }

    }//GEN-LAST:event_btnEmpezarActionPerformed

    public void actualizarEtiquetasJugadores(Object tablero) {
        if (tablero instanceof tableroChico) {
            tableroChico t = (tableroChico) tablero;

            if (j2.isSelected()) {
                t.lblJ1.setText("Jugador 1");
                t.lblJ2.setText("Jugador 2");
                t.lblJ3.setText("");  // Vaciar los otros campos
                t.lblJ4.setText("");
            } else if (j3.isSelected()) {
                t.lblJ1.setText("Jugador 1");
                t.lblJ2.setText("Jugador 2");
                t.lblJ3.setText("Jugador 3");
                t.lblJ4.setText("");  // Vaciar el campo del jugador 4
            } else if (j4.isSelected()) {
                t.lblJ1.setText("Jugador 1");
                t.lblJ2.setText("Jugador 2");
                t.lblJ3.setText("Jugador 3");
                t.lblJ4.setText("Jugador 4");
            }
        } else if (tablero instanceof tableroGrande) {
            tableroGrande t = (tableroGrande) tablero;

            if (j2.isSelected()) {
                t.lblJ1.setText("Jugador 1");
                t.lblJ2.setText("Jugador 2");
                t.lblJ3.setText("");  // Vaciar los otros campos
                t.lblJ4.setText("");
            } else if (j3.isSelected()) {
                t.lblJ1.setText("Jugador 1");
                t.lblJ2.setText("Jugador 2");
                t.lblJ3.setText("Jugador 3");
                t.lblJ4.setText("");  // Vaciar el campo del jugador 4
            } else if (j4.isSelected()) {
                t.lblJ1.setText("Jugador 1");
                t.lblJ2.setText("Jugador 2");
                t.lblJ3.setText("Jugador 3");
                t.lblJ4.setText("Jugador 4");
            }
        }
    }

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
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    public javax.swing.JRadioButton j2;
    public javax.swing.JRadioButton j3;
    public javax.swing.JRadioButton j4;
    private javax.swing.JRadioButton jChico;
    private javax.swing.JRadioButton jGrande;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}