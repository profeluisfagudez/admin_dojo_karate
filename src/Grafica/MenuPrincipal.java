/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Grafica;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Eduardo Fagúndez Pedrozo
 */

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmAgregarAlumno = new javax.swing.JMenu();
        jmBuscarAlumnos = new javax.swing.JMenu();
        jmModificarAlumno = new javax.swing.JMenu();
        jmListarAlumno = new javax.swing.JMenu();
        jmBorrarAlumno = new javax.swing.JMenu();
        jmCreditos = new javax.swing.JMenu();
        jmSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Menú principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafica/Imagenes/karatedo.gif"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Grafica/Imagenes/220px-Funakoshi.jpg"))); // NOI18N

        jMenu1.setText("Archivo");

        jmAgregarAlumno.setText("Agregar alumno");
        jmAgregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAgregarAlumnoMouseClicked(evt);
            }
        });
        jmAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAgregarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmAgregarAlumno);

        jmBuscarAlumnos.setText("Buscar alumno");
        jmBuscarAlumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmBuscarAlumnosMouseClicked(evt);
            }
        });
        jMenu1.add(jmBuscarAlumnos);

        jmModificarAlumno.setText("Modificar alumno");
        jmModificarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmModificarAlumnoMouseClicked(evt);
            }
        });
        jMenu1.add(jmModificarAlumno);

        jmListarAlumno.setText("Listar alumnos");
        jmListarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmListarAlumnoMouseClicked(evt);
            }
        });
        jMenu1.add(jmListarAlumno);

        jmBorrarAlumno.setText("Borrar alumno");
        jmBorrarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmBorrarAlumnoMouseClicked(evt);
            }
        });
        jMenu1.add(jmBorrarAlumno);

        jMenuBar1.add(jMenu1);

        jmCreditos.setText("Creditos");
        jmCreditos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCreditosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmCreditos);

        jmSalir.setText("Salir");
        jmSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmSalirMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(76, 76, 76)
                .addComponent(jLabel2)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jmAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAgregarAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmAgregarAlumnoActionPerformed

    
    private void jmAgregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAgregarAlumnoMouseClicked
        AgregarAlumno agregaralumno = new AgregarAlumno();
        agregaralumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmAgregarAlumnoMouseClicked

    private void jmSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmSalirMouseClicked
        int respuesta = JOptionPane.showConfirmDialog(this,"¿Está seguro que desea salir?","Sistema",JOptionPane.YES_NO_OPTION);
        if(respuesta==JOptionPane.YES_OPTION){
        System.exit(0);
        }
        else {
        
        }
        
    }//GEN-LAST:event_jmSalirMouseClicked

    private void jmListarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmListarAlumnoMouseClicked
        ListarAlumnos listaralumnos = new ListarAlumnos();
        listaralumnos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmListarAlumnoMouseClicked

    private void jmBuscarAlumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmBuscarAlumnosMouseClicked
        BuscarAlumno buscaralumno = new BuscarAlumno();
        buscaralumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmBuscarAlumnosMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int respuesta = JOptionPane.showConfirmDialog(this,"¿Está seguro que desea salir?","Sistema",JOptionPane.YES_NO_OPTION);
        if(respuesta==JOptionPane.YES_OPTION){
            System.exit(0);
        }
        else if (respuesta==JOptionPane.NO_OPTION){
            
        }
    }//GEN-LAST:event_formWindowClosing

    private void jmCreditosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCreditosMouseClicked
        Creditos creditos = new Creditos();
        creditos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmCreditosMouseClicked

    private void jmBorrarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmBorrarAlumnoMouseClicked
        BorrarAlumno borraralumno = new BorrarAlumno();
        borraralumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmBorrarAlumnoMouseClicked

    private void jmModificarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmModificarAlumnoMouseClicked
        ModificarAlumno modificaralumno = new ModificarAlumno();
        modificaralumno.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmModificarAlumnoMouseClicked

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jmAgregarAlumno;
    private javax.swing.JMenu jmBorrarAlumno;
    private javax.swing.JMenu jmBuscarAlumnos;
    private javax.swing.JMenu jmCreditos;
    private javax.swing.JMenu jmListarAlumno;
    private javax.swing.JMenu jmModificarAlumno;
    private javax.swing.JMenu jmSalir;
    // End of variables declaration//GEN-END:variables
}
