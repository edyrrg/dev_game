/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.ui;


public class uiTablero extends javax.swing.JFrame {

    /**
     * Creates new form uiTablero
     */
    
    public uiTablero() {
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

        CrearJuego = new javax.swing.JFrame();
        MenuBar = new javax.swing.JMenuBar();
        Menu_1 = new javax.swing.JMenu();
        SubMenu1 = new javax.swing.JMenuItem();
        SubMenu2 = new javax.swing.JMenuItem();
        Menu_2 = new javax.swing.JMenu();
        SubMenu_1 = new javax.swing.JMenuItem();
        SubMenu_2 = new javax.swing.JMenuItem();
        SubMenu_3 = new javax.swing.JMenuItem();
        Menu_3 = new javax.swing.JMenu();
        Menu_4 = new javax.swing.JMenu();

        CrearJuego.setTitle("Crear Juego");

        javax.swing.GroupLayout CrearJuegoLayout = new javax.swing.GroupLayout(CrearJuego.getContentPane());
        CrearJuego.getContentPane().setLayout(CrearJuegoLayout);
        CrearJuegoLayout.setHorizontalGroup(
            CrearJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        CrearJuegoLayout.setVerticalGroup(
            CrearJuegoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Menu_1.setText("Opciones de Juego");
        Menu_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Menu_1MouseClicked(evt);
            }
        });

        SubMenu1.setText("Crear Juego");
        SubMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenu1ActionPerformed(evt);
            }
        });
        Menu_1.add(SubMenu1);

        SubMenu2.setText("Editar Juego");
        Menu_1.add(SubMenu2);

        MenuBar.add(Menu_1);

        Menu_2.setText("Jugar");

        SubMenu_1.setText("Nuevo");
        Menu_2.add(SubMenu_1);

        SubMenu_2.setText("Guardar");
        Menu_2.add(SubMenu_2);

        SubMenu_3.setText("Cargar");
        Menu_2.add(SubMenu_3);

        MenuBar.add(Menu_2);

        Menu_3.setText("Ranking");
        MenuBar.add(Menu_3);

        Menu_4.setText("Acerca de...");
        MenuBar.add(Menu_4);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Menu_1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Menu_1MouseClicked
        // TODO add your handling code here:
     
    }//GEN-LAST:event_Menu_1MouseClicked

    private void SubMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenu1ActionPerformed
        // TODO add your handling code here:
        CrearJuego.setVisible(true);
    }//GEN-LAST:event_SubMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(uiTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uiTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uiTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uiTablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uiTablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame CrearJuego;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu Menu_1;
    private javax.swing.JMenu Menu_2;
    private javax.swing.JMenu Menu_3;
    private javax.swing.JMenu Menu_4;
    private javax.swing.JMenuItem SubMenu1;
    private javax.swing.JMenuItem SubMenu2;
    private javax.swing.JMenuItem SubMenu_1;
    private javax.swing.JMenuItem SubMenu_2;
    private javax.swing.JMenuItem SubMenu_3;
    // End of variables declaration//GEN-END:variables
}
