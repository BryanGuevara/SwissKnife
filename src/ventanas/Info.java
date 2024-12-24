/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author MINEDUCYT
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form ArmadorEscalas
     */
    public Info() {
        initComponents();

        this.setLocationRelativeTo(null);

        AreaInfo.setCaretPosition(0);
        
        
        ImageIcon wallpaper = new ImageIcon("src/img/Info.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(LabelWallpaper.getWidth(),
                LabelWallpaper.getHeight(), Image.SCALE_DEFAULT));
        LabelWallpaper.setIcon(icon);

        ImageIcon Facebook = new ImageIcon("src/img/facebook.png");
        Icon iconf = new ImageIcon(Facebook.getImage().getScaledInstance(BtnFacebook.getWidth(),
                BtnFacebook.getHeight(), Image.SCALE_DEFAULT));
        BtnFacebook.setIcon(iconf);

        ImageIcon Instagram = new ImageIcon("src/img/instagram.png");
        Icon iconi = new ImageIcon(Instagram.getImage().getScaledInstance(BtnInstagram.getWidth(),
                BtnInstagram.getHeight(), Image.SCALE_DEFAULT));
        BtnInstagram.setIcon(iconi);
        BtnInstagram.setIcon(iconi);

        ImageIcon Github = new ImageIcon("src/img/github.png");
        Icon icong = new ImageIcon(Github.getImage().getScaledInstance(BtnGithub.getWidth(),
                BtnGithub.getHeight(), Image.SCALE_DEFAULT));
        BtnGithub.setIcon(icong);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnFacebook = new javax.swing.JButton();
        BtnGithub = new javax.swing.JButton();
        BtnInstagram = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaInfo = new javax.swing.JTextPane();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnFacebook.setBackground(new java.awt.Color(51, 51, 51));
        BtnFacebook.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnFacebook.setForeground(new java.awt.Color(255, 255, 255));
        BtnFacebook.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnFacebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFacebookActionPerformed(evt);
            }
        });
        getContentPane().add(BtnFacebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 60, 60));

        BtnGithub.setBackground(new java.awt.Color(51, 51, 51));
        BtnGithub.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnGithub.setForeground(new java.awt.Color(255, 255, 255));
        BtnGithub.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnGithub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGithubActionPerformed(evt);
            }
        });
        getContentPane().add(BtnGithub, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 130, 60, 60));

        BtnInstagram.setBackground(new java.awt.Color(51, 51, 51));
        BtnInstagram.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        BtnInstagram.setForeground(new java.awt.Color(255, 255, 255));
        BtnInstagram.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnInstagram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInstagramActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInstagram, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 60, 60));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(51, 51, 51));
        jTextField5.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(255, 255, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Redes Sociales");
        jTextField5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 220, 30));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(51, 51, 51));
        jTextField1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Swiff Knife Beta 0.1");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 520, 70));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(51, 51, 51));
        jTextField2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Notas de la version");
        jTextField2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 170, 30));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(51, 51, 51));
        jTextField4.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(255, 255, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Hecho con Java 17");
        jTextField4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 230, 30));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(51, 51, 51));
        jTextField3.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(255, 255, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Creado Por Bryan Guevara");
        jTextField3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 230, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 0, 0));
        jButton3.setText("X");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 40, 40));

        AreaInfo.setEditable(false);
        AreaInfo.setBackground(new java.awt.Color(56, 56, 56));
        AreaInfo.setContentType("text/html"); // NOI18N
        AreaInfo.setForeground(new java.awt.Color(0, 0, 0));
        AreaInfo.setText("<!DOCTYPE html>\n<html lang=\"es\">\n<head>\n    <meta charset=\"UTF-8\">\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n    <style>\n        body {\n            background-color: rgb(56, 56, 56);\n            color: rgb(255, 255, 255);\n            font-family: Arial, sans-serif;\n            line-height: 1.6;\n            margin: 0px 20px;\n            font-size: 10px; \n        }\n        h1 {\n            font-size: 16px; \n            border-bottom: 2px solid;\n            padding-bottom: 5px;\n            margin-top: 30px;\n            text-align: center;\n        }\n        ul {\n            margin: 10px 0;\n            padding-left: 20px;\n        }\n        li {\n            color: rgb(220, 220, 220);\n            font-size: 10px; /* Tamaño reducido a un cuarto */\n            margin-bottom: 5px;\n            position: relative;\n        }\n        li::before {\n            content: \"•\";\n            color: rgb(255, 204, 0);\n            position: absolute;\n            left: -20px;\n        }\n        .version-section {\n            padding: 10px;\n            border-radius: 5px;\n            background-color: rgba(255, 255, 255, 0.1); /* Fondo sutil */\n            margin-bottom: 20px;\n        }\n    </style>\n</head>\n<body>\n    <section id=\"beta-0.1\" class=\"version-section\">\n        <h1>Swiss Knife Beta v0.1</h1>\n        <ul>\n            <li>Adición de ícono a las funciones en \"Inicio\"</li>\n            <li>Adición de wallpapers dinámicos en la pestaña \"Inicio\"</li>\n            <li>Modificación de la lógica de \"Calculadora\"</li>\n            <li>Actualización del historial de intentos en \"Encontrar\"</li>\n            <li>Adición de \"Tiempo\" a las medidas de Conversión en \"Conversor\"</li>\n            <li>Cambio de nombre de \"Moneda\" a \"Cara y cruz\", mas de acuerdo a su función</li>\n            <li>Modificación de la lógica en \"Cara y cruz\"</li>\n            <li>Adición de la pestaña \"Repetidor de palabras\" para repetir una frase hasta 800 veces</li>\n            <li>Adición de soporte de Markdown en \"Visualizador\"</li>\n            <li>Adición de boton de reinicio en \"HTML\" y \"Markdown\" en \"Visualizador\"</li>\n            <li>Adición de los botones \"HTML\" y \"PDF\" para poder exportar los codigos de \"Visualizador\"</li>\n            <li>Cambio de la logica de calculo de \"Conversor\"</li>\n            <li>Adición de \"Talento\" a las medidas de peso en \"Conversor\"</li>\n            <li>Adición de la pestaña \"Paletas\"</li>\n            <li>Adición de la paleta \"Complemetario\" a las paletas de color de \"Paletas\"</li>\n            <li>Adición de la paleta \"Ternario\" a las paletas de color de \"Paletas\"</li>\n            <li>Adición de la paleta \"Analogos\" a las paletas de color de \"Paletas\"</li>\n            <li>Adición de la paleta \"Sombras\" a las paletas de color de \"Paletas\"</li>\n            <li>Adición de la paleta \"Square\" a las paletas de color de \"Paletas\"</li>\n            <li>Adición de la paleta \"Cuadernarios\" a las paletas de color de \"Paletas\"</li>\n            <li>Adición de la paleta \"Tintes\" las paletas de color de \"Paletas\"</li>\n            <li>Adición de la paleta \"Monocromatica\" las paletas de color de \"Paletas\"</li>\n            <li>Adición de la pestaña \"MathMixer\"</li>\n            <li>Adición de la operación \"Tablas\" a las operaciones de la pestaña \"Mathmixer\"</li>\n            <li>Adición de la operación \"Multiplo\" a las operaciones de la pestaña \"Mathmixer\"</li>\n            <li>Adición de la operación \"Factorial\" a las operaciones de la pestaña \"Mathmixer\"</li>\n            <li>Adición de la operación \"Conjetura 3N+1\" a las operaciones de la pestaña \"Mathmixer\"</li>\n        </ul>\n    </section>\n    <hr>\n\n    <section id=\"alfa-0.0.1\" class=\"version-section\">\n        <h1>Swiss Knife Alfa v0.0.1</h1>\n        <ul>\n            <li>Creación de la pestaña \"Inicio\"</li>\n            <li>Adición de \"Calculadora\"</li>\n            <li>Adición de \"Conversor\"</li>\n            <li>Adición de \"Medidas\" a las medidas de Conversión en \"Conversor\"</li>\n            <li>Adición de \"Pesos\" a las medidas de Conversión en \"Conversor\"</li>\n            <li>Adición de la pestaña \"Moneda\" para jugar al cara y cruz</li>\n            <li>Adición de \"Información de la aplicación\"</li>\n            <li>Adición de \"Encontrar\", juego de adivinar el numero</li>\n        </ul>\n    </section>\n</body>\n</html>");
        jScrollPane1.setViewportView(AreaInfo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 520, 230));

        LabelWallpaper.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BtnFacebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFacebookActionPerformed
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI instagram = new java.net.URI("https://www.facebook.com/profile.php?id=61556965297606");
                    desktop.browse(instagram);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_BtnFacebookActionPerformed

    private void BtnGithubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGithubActionPerformed
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI instagram = new java.net.URI("https://github.com/BryanGuevara");
                    desktop.browse(instagram);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_BtnGithubActionPerformed

    private void BtnInstagramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInstagramActionPerformed
        if (java.awt.Desktop.isDesktopSupported()) {
            java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
            if (desktop.isSupported(java.awt.Desktop.Action.BROWSE)) {
                try {
                    java.net.URI instagram = new java.net.URI("https://www.instagram.com/bryanguevaradev/");
                    desktop.browse(instagram);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }//GEN-LAST:event_BtnInstagramActionPerformed

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
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane AreaInfo;
    private javax.swing.JButton BtnFacebook;
    private javax.swing.JButton BtnGithub;
    private javax.swing.JButton BtnInstagram;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
