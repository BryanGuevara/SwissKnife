/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import bryanDev.util.config.GlobalStyle;
import java.awt.Image;
import java.math.BigDecimal;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author MINEDUCYT
 */
public class Conversor extends javax.swing.JFrame {

    private static final Map<String, BigDecimal> unidadMedidas = new LinkedHashMap<>();
    private static final Map<String, BigDecimal> unidadPeso = new LinkedHashMap<>();
    private static final Map<String, BigDecimal> unidadTiempo = new LinkedHashMap<>();
    private static final Map<String, BigDecimal> unidadCapacidad = new LinkedHashMap<>();
    private static final Map<String, BigDecimal> unidadUnidad = new LinkedHashMap<>();

    public int type = 0;

    static {
        unidadMedidas.put("Nanómetro", new BigDecimal("0.000000001"));
        unidadMedidas.put("Micrómetro", new BigDecimal("0.000001"));
        unidadMedidas.put("Milímetro", new BigDecimal("0.001"));
        unidadMedidas.put("Centímetro", new BigDecimal("0.01"));
        unidadMedidas.put("Mil (milésima de pulgada)", new BigDecimal("0.0000254"));
        unidadMedidas.put("Svara", new BigDecimal("0.0833"));
        unidadMedidas.put("Pulgada", new BigDecimal("0.0254"));
        unidadMedidas.put("Pica", new BigDecimal("0.0042333"));
        unidadMedidas.put("Pie", new BigDecimal("0.3048"));
        unidadMedidas.put("Codo", new BigDecimal("0.4572"));
        unidadMedidas.put("Yarda", new BigDecimal("0.9144"));
        unidadMedidas.put("Metro", new BigDecimal("1.0"));
        unidadMedidas.put("Braza", new BigDecimal("2.4384"));
        unidadMedidas.put("Decámetro", new BigDecimal("10.0"));
        unidadMedidas.put("Hectómetro", new BigDecimal("100.0"));
        unidadMedidas.put("Furlong", new BigDecimal("201.168"));
        unidadMedidas.put("Versta", new BigDecimal("1067.0"));
        unidadMedidas.put("Kilómetro", new BigDecimal("1000.0"));
        unidadMedidas.put("Milla terrestre", new BigDecimal("1609.344"));
        unidadMedidas.put("Milla", new BigDecimal("1609.344"));
        unidadMedidas.put("Milla náutica", new BigDecimal("1852.0"));
        unidadMedidas.put("Liga", new BigDecimal("4828.032"));
        unidadMedidas.put("League (marítima)", new BigDecimal("5556.0"));
        unidadMedidas.put("Año luz", new BigDecimal("9461000000000000"));
    }

    static {
        unidadPeso.put("Picogramo", new BigDecimal("0.0000000000000022046226218"));
        unidadPeso.put("Nanogramo", new BigDecimal("0.0000000000022046226218"));
        unidadPeso.put("Microgramo", new BigDecimal("0.0000000022046226218"));
        unidadPeso.put("Miligramo", new BigDecimal("0.0000022046226218"));
        unidadPeso.put("Gramo", new BigDecimal("0.0022046226218"));
        unidadPeso.put("Kilogramo", new BigDecimal("2.2046226218"));
        unidadPeso.put("Libra", new BigDecimal("1.0"));
        unidadPeso.put("Arroba", new BigDecimal("25.0"));
        unidadPeso.put("Talento", new BigDecimal("77.0"));
        unidadPeso.put("Quintal corto", new BigDecimal("100.0"));
        unidadPeso.put("Media tonelada", new BigDecimal("1102.311"));
        unidadPeso.put("Tonelada corta", new BigDecimal("2000.0"));
        unidadPeso.put("Tonelada métrica", new BigDecimal("2204.6226218"));
        unidadPeso.put("Tonelada larga", new BigDecimal("2240.0"));
        unidadPeso.put("Kilotonelada", new BigDecimal("2204622.6218"));
        unidadPeso.put("Megatonelada", new BigDecimal("2204622621.8"));
        unidadPeso.put("Gigatonelada", new BigDecimal("2204622621800"));
        unidadPeso.put("Teratonelada", new BigDecimal("2204622621800000"));
        unidadPeso.put("Petatonelada", new BigDecimal("2204622621800000000"));
        unidadPeso.put("Exatonelada", new BigDecimal("2204622621800000000000"));
    }

    static {
        unidadTiempo.put("Femtosegundo", new BigDecimal("0.000000000000001"));
        unidadTiempo.put("Picosegundo", new BigDecimal("0.000000000001"));
        unidadTiempo.put("Nanosegundo", new BigDecimal("0.000000001"));
        unidadTiempo.put("Microsegundo", new BigDecimal("0.000001"));
        unidadTiempo.put("Milisegundo", new BigDecimal("0.001"));
        unidadTiempo.put("Segundo", new BigDecimal("1"));
        unidadTiempo.put("Minuto", new BigDecimal("60"));
        unidadTiempo.put("Media hora", new BigDecimal("1800"));
        unidadTiempo.put("Hora", new BigDecimal("3600"));
        unidadTiempo.put("Medio día", new BigDecimal("43200"));
        unidadTiempo.put("Día", new BigDecimal("86400"));
        unidadTiempo.put("Semana", new BigDecimal("604800"));
        unidadTiempo.put("Mes", new BigDecimal("2592000"));
        unidadTiempo.put("Año", new BigDecimal("31536000"));
        unidadTiempo.put("Lustro", new BigDecimal("157788000"));
        unidadTiempo.put("Década", new BigDecimal("315360000"));
        unidadTiempo.put("Siglo", new BigDecimal("3153600000"));
        unidadTiempo.put("Milenio", new BigDecimal("31536000000"));
        unidadTiempo.put("Mega-año", new BigDecimal("31536000000000"));
        unidadTiempo.put("Milenio galáctico", new BigDecimal("31536000000000000"));
    }

    static {
        unidadCapacidad.put("Bit", new BigDecimal("0.000001"));
        unidadCapacidad.put("Byte", new BigDecimal("0.000008"));
        unidadCapacidad.put("Kilobit", new BigDecimal("0.001"));
        unidadCapacidad.put("Kilobyte", new BigDecimal("0.008"));
        unidadCapacidad.put("Megabit", new BigDecimal("1"));
        unidadCapacidad.put("Megabyte", new BigDecimal("8"));
        unidadCapacidad.put("Gigabit", new BigDecimal("1000"));
        unidadCapacidad.put("Gigabyte", new BigDecimal("8000"));
        unidadCapacidad.put("Terabit", new BigDecimal("1000000"));
        unidadCapacidad.put("Terabyte", new BigDecimal("8000000"));
        unidadCapacidad.put("Petabit", new BigDecimal("1000000000"));
        unidadCapacidad.put("Petabyte", new BigDecimal("8000000000"));
        unidadCapacidad.put("Exabit", new BigDecimal("1000000000000"));
        unidadCapacidad.put("Exabyte", new BigDecimal("8000000000000"));
        unidadCapacidad.put("Zettabit", new BigDecimal("1000000000000000"));
        unidadCapacidad.put("Zettabyte", new BigDecimal("8000000000000000"));
        unidadCapacidad.put("Yottabit", new BigDecimal("1000000000000000000"));
        unidadCapacidad.put("Yottabyte", new BigDecimal("8000000000000000000"));
    }

    static {
        unidadUnidad.put("Unidad", new BigDecimal("1"));
        unidadUnidad.put("Decena", new BigDecimal("10"));
        unidadUnidad.put("Centena", new BigDecimal("100"));
        unidadUnidad.put("Millar", new BigDecimal("1000"));
        unidadUnidad.put("Millón", new BigDecimal("1000000"));
        unidadUnidad.put("Mil millones", new BigDecimal("1000000000"));
        unidadUnidad.put("Billón", new BigDecimal("1000000000000"));
        unidadUnidad.put("Mil billones", new BigDecimal("1000000000000000"));
        unidadUnidad.put("Trillón", new BigDecimal("1000000000000000000"));
        unidadUnidad.put("Mil trillones", new BigDecimal("1000000000000000000000"));
        unidadUnidad.put("Cuatrillón", new BigDecimal("1000000000000000000000000"));
        unidadUnidad.put("Mil cuatrillones", new BigDecimal("1000000000000000000000000000"));
        unidadUnidad.put("Quintillón", new BigDecimal("1000000000000000000000000000000"));
        unidadUnidad.put("Mil quintillones", new BigDecimal("1000000000000000000000000000000000"));
        unidadUnidad.put("Sextillón", new BigDecimal("1000000000000000000000000000000000000"));
        unidadUnidad.put("Mil sextillones", new BigDecimal("1000000000000000000000000000000000000000"));
        unidadUnidad.put("Septillón", new BigDecimal("1000000000000000000000000000000000000000000"));
        unidadUnidad.put("Mil septillones", new BigDecimal("1000000000000000000000000000000000000000000000"));
        unidadUnidad.put("Octillón", new BigDecimal("1000000000000000000000000000000000000000000000000"));
    }

    GlobalStyle global = new GlobalStyle();

    public Conversor() {
        initComponents();

        setResizable(false);
        setTitle("Conversor");
        this.setLocationRelativeTo(null);

        global.TextField().style(TxtOrigen);
        global.TextArea().style(TxtDestino, 20);
        global.ComboBox().style(CmbOrigen);
        global.ComboBox().style(CmbDestino);

        global.Button().style(BtnMedidas);
        global.Button().style(BtnPesos);
        global.Button().style(BtnTiempo);
        global.Button().style(BtnCapacidad);
        global.Button().style(BtnUnidad);

        Reinicio();
        type = 0;
        for (String unidad : unidadMedidas.keySet()) {
            CmbOrigen.addItem(unidad);
            CmbDestino.addItem(unidad);
        }

        CmbOrigen.setSelectedItem("Metro");
        CmbDestino.setSelectedItem("Metro");

        ImageIcon wallpaper = new ImageIcon("src/img/Medidas.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(LabelWallpaper.getWidth(),
                LabelWallpaper.getHeight(), Image.SCALE_DEFAULT));

        LabelWallpaper.setIcon(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnVolver = new javax.swing.JButton();
        BtnUnidad = new javax.swing.JButton();
        BtnCapacidad = new javax.swing.JButton();
        BtnTiempo = new javax.swing.JButton();
        BtnPesos = new javax.swing.JButton();
        BtnMedidas = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDestino = new javax.swing.JTextArea();
        CmbDestino = new javax.swing.JComboBox<>();
        CmbOrigen = new javax.swing.JComboBox<>();
        TxtOrigen = new javax.swing.JTextField();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnVolver.setBackground(new java.awt.Color(51, 51, 51));
        BtnVolver.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BtnVolver.setForeground(new java.awt.Color(255, 0, 0));
        BtnVolver.setText("X");
        BtnVolver.setBorder(null);
        BtnVolver.setBorderPainted(false);
        BtnVolver.setContentAreaFilled(false);
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, 40));

        BtnUnidad.setText("Unidades");
        BtnUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUnidadActionPerformed(evt);
            }
        });
        getContentPane().add(BtnUnidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 110, -1));

        BtnCapacidad.setText("Capacidad");
        BtnCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCapacidadActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 110, -1));

        BtnTiempo.setText("Tiempo");
        BtnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 110, -1));

        BtnPesos.setText("Pesos");
        BtnPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 110, -1));

        BtnMedidas.setText("Medidas");
        BtnMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMedidasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        TxtDestino.setEditable(false);
        TxtDestino.setBackground(new java.awt.Color(255, 255, 255));
        TxtDestino.setColumns(20);
        TxtDestino.setForeground(new java.awt.Color(65, 65, 65));
        TxtDestino.setLineWrap(true);
        TxtDestino.setRows(5);
        jScrollPane1.setViewportView(TxtDestino);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 490, 180));

        CmbDestino.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de unidad a convertir unidad de destino" }));
        CmbDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbDestinoItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 490, 50));

        CmbOrigen.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de unidad a convertir unidad de origen" }));
        CmbOrigen.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbOrigenItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 490, 50));

        TxtOrigen.setBackground(new java.awt.Color(255, 255, 255));
        TxtOrigen.setForeground(new java.awt.Color(65, 65, 65));
        TxtOrigen.setText("Acá se mete el numero de Origen para convertirlo a otro tipo");
        TxtOrigen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtOrigenKeyReleased(evt);
            }
        });
        getContentPane().add(TxtOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 490, 60));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 520, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbOrigenItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbOrigenItemStateChanged
        conversor();
    }//GEN-LAST:event_CmbOrigenItemStateChanged

    private void CmbDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbDestinoItemStateChanged
        conversor();
    }//GEN-LAST:event_CmbDestinoItemStateChanged

    private void TxtOrigenKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOrigenKeyReleased
        conversor();
    }//GEN-LAST:event_TxtOrigenKeyReleased

    private void BtnMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMedidasActionPerformed

        Reinicio();
        type = 0;
        for (String unidad : unidadMedidas.keySet()) {
            CmbOrigen.addItem(unidad);
            CmbDestino.addItem(unidad);
        }

        CmbOrigen.setSelectedItem("Metro");
        CmbDestino.setSelectedItem("Metro");
    }//GEN-LAST:event_BtnMedidasActionPerformed

    private void BtnPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesosActionPerformed

        Reinicio();
        type = 1;
        for (String unidad : unidadPeso.keySet()) {
            CmbOrigen.addItem(unidad);
            CmbDestino.addItem(unidad);
        }

        CmbOrigen.setSelectedItem("Libra");
        CmbDestino.setSelectedItem("Libra");
    }//GEN-LAST:event_BtnPesosActionPerformed

    private void BtnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTiempoActionPerformed

        Reinicio();
        type = 2;
        for (String unidad : unidadTiempo.keySet()) {
            CmbOrigen.addItem(unidad);
            CmbDestino.addItem(unidad);
        }

        CmbOrigen.setSelectedItem("Segundo");
        CmbDestino.setSelectedItem("Segundo");
    }//GEN-LAST:event_BtnTiempoActionPerformed

    private void BtnCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCapacidadActionPerformed

        Reinicio();
        type = 3;
        for (String unidad : unidadCapacidad.keySet()) {
            CmbOrigen.addItem(unidad);
            CmbDestino.addItem(unidad);
        }

        CmbOrigen.setSelectedItem("Megabyte");
        CmbDestino.setSelectedItem("Megabyte");
    }//GEN-LAST:event_BtnCapacidadActionPerformed

    private void BtnUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUnidadActionPerformed

        Reinicio();
        type = 4;
        for (String unidad : unidadUnidad.keySet()) {
            CmbOrigen.addItem(unidad);
            CmbDestino.addItem(unidad);
        }

        CmbOrigen.setSelectedItem("Unidad");
        CmbDestino.setSelectedItem("Unidad");
    }//GEN-LAST:event_BtnUnidadActionPerformed

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
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversor().setVisible(true);
            }
        });
    }

    public void Reinicio() {
        TxtOrigen.setText("");
        TxtDestino.setText("");

        CmbOrigen.removeAllItems();
        CmbDestino.removeAllItems();
    }

    public void conversor() {
        try {
            if (TxtOrigen.getText().isEmpty()) {
                TxtDestino.setText("");
                return;
            }
            String inputText = TxtOrigen.getText();

            if (!inputText.matches("\\d+(\\.\\d+)?")) {
                TxtDestino.setText("Solo se pueden convertir números.");
                return;
            }

            String unidadOrigen = CmbOrigen.getSelectedItem().toString();
            String unidadDestino = CmbDestino.getSelectedItem().toString();
            BigDecimal factorOrigen;
            BigDecimal factorDestino;

            switch (type) {
                case 0:
                    factorOrigen = unidadMedidas.get(unidadOrigen);
                    factorDestino = unidadMedidas.get(unidadDestino);
                    break;
                case 1:
                    factorOrigen = unidadPeso.get(unidadOrigen);
                    factorDestino = unidadPeso.get(unidadDestino);
                    break;
                case 2:
                    factorOrigen = unidadTiempo.get(unidadOrigen);
                    factorDestino = unidadTiempo.get(unidadDestino);
                    break;
                case 3:
                    factorOrigen = unidadCapacidad.get(unidadOrigen);
                    factorDestino = unidadCapacidad.get(unidadDestino);
                    break;
                case 4:
                    factorOrigen = unidadUnidad.get(unidadOrigen);
                    factorDestino = unidadUnidad.get(unidadDestino);
                    break;
                default:
                    return;
            }

            BigDecimal input = new BigDecimal(inputText);

            BigDecimal resultado = input.multiply(factorOrigen).divide(factorDestino, 50, BigDecimal.ROUND_HALF_UP);

            String resultadoStr = resultado.stripTrailingZeros().toPlainString();

            TxtDestino.setText(resultadoStr);

        } catch (NumberFormatException e) {
            TxtDestino.setText("Solo se pueden convertir números.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por infinito.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCapacidad;
    private javax.swing.JButton BtnMedidas;
    private javax.swing.JButton BtnPesos;
    private javax.swing.JButton BtnTiempo;
    private javax.swing.JButton BtnUnidad;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JComboBox<String> CmbDestino;
    private javax.swing.JComboBox<String> CmbOrigen;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JTextArea TxtDestino;
    private javax.swing.JTextField TxtOrigen;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}
