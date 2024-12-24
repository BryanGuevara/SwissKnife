/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author MINEDUCYT
 */
public class Moneda extends javax.swing.JFrame {

    int cara = 0;
    int cruz = 0;

    public Moneda() {
        initComponents();

        setTitle("Cara o Corona");
        this.setLocationRelativeTo(null);

        ImageIcon wallpaper = new ImageIcon("src/img/Coin.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(LabelWallpaper.getWidth(),
                LabelWallpaper.getHeight(), Image.SCALE_DEFAULT));

        LabelWallpaper.setIcon(icon);

        TxtCruz.setText(cruz + " :Cruz");
        TxtCara.setText("Cara: " + cara);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnMoneda = new javax.swing.JButton();
        TxtLanzamiento = new javax.swing.JTextField();
        TxtCruz = new javax.swing.JTextField();
        TxtCara = new javax.swing.JTextField();
        BtnVolver = new javax.swing.JButton();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnMoneda.setBackground(new java.awt.Color(56, 56, 56));
        BtnMoneda.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        BtnMoneda.setForeground(new java.awt.Color(255, 255, 255));
        BtnMoneda.setText("Clic");
        BtnMoneda.setToolTipText("");
        BtnMoneda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMonedaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMoneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 217, 217));

        TxtLanzamiento.setEditable(false);
        TxtLanzamiento.setBackground(new java.awt.Color(56, 56, 56));
        TxtLanzamiento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtLanzamiento.setForeground(new java.awt.Color(255, 255, 255));
        TxtLanzamiento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtLanzamiento.setText("Aun no se lanza la moneda");
        getContentPane().add(TxtLanzamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 280, 40));

        TxtCruz.setEditable(false);
        TxtCruz.setBackground(new java.awt.Color(56, 56, 56));
        TxtCruz.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtCruz.setForeground(new java.awt.Color(255, 255, 255));
        TxtCruz.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        TxtCruz.setText(":Cruz");
        getContentPane().add(TxtCruz, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 129, 40));

        TxtCara.setEditable(false);
        TxtCara.setBackground(new java.awt.Color(56, 56, 56));
        TxtCara.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtCara.setForeground(new java.awt.Color(255, 255, 255));
        TxtCara.setText("Cara:");
        getContentPane().add(TxtCara, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 129, 40));

        BtnVolver.setText("Volver");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 6, 75, -1));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnMonedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMonedaActionPerformed

        Random random = new Random();
        int numero = random.nextInt(2);
        String Resultado = "";
        BtnMoneda.setText("");

        BtnMoneda.setOpaque(false);
        BtnMoneda.setContentAreaFilled(false);
        BtnMoneda.setBorderPainted(false);
        BtnMoneda.setFocusPainted(false);
        if (numero == 1) {
            cara++;
            TxtCara.setText("Cara: " + cara);
            TxtLanzamiento.setText("Lanzamiento "+(cara+cruz)+": Cara");
            Resultado = "Cara";
        } else if (numero == 0) {
            cruz++;
            TxtCruz.setText(cruz + " :Cruz");
            TxtLanzamiento.setText("Lanzamiento "+(cara+cruz)+": Cruz");
            Resultado = "Cruz";
        }

        ImageIcon moneda = new ImageIcon("src/img/" + Resultado + ".png");
        Icon caraCorona = new ImageIcon(moneda.getImage().getScaledInstance(BtnMoneda.getWidth(),
                BtnMoneda.getHeight(), Image.SCALE_DEFAULT));

        BtnMoneda.setIcon(caraCorona);

    }//GEN-LAST:event_BtnMonedaActionPerformed

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVolverActionPerformed

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
            java.util.logging.Logger.getLogger(Moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Moneda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Moneda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnMoneda;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JTextField TxtCara;
    private javax.swing.JTextField TxtCruz;
    private javax.swing.JTextField TxtLanzamiento;
    // End of variables declaration//GEN-END:variables
}
