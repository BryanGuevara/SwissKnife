/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINEDUCYT
 */
public class MathMixer extends javax.swing.JFrame {

    DefaultTableModel modeloTabla = new DefaultTableModel();
    int funcion = 1;
    int table = 0;
    private SwingWorker<Void, String> worker;

    public MathMixer() {
        initComponents();

        this.setLocationRelativeTo(null);
        setTitle("MathMixer");

        configurarTabla();

        TableResultados.setModel(modeloTabla);
        
        
        ImageIcon wallpaper = new ImageIcon("src/img/Mathmixer.jpg");
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

        CmbOperacion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableResultados = new javax.swing.JTable();
        TxtEntrada1 = new javax.swing.JTextField();
        TxtEntrada2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaResultado = new javax.swing.JTextArea();
        TxtInstruccion2 = new javax.swing.JTextField();
        TxtInstruccion1 = new javax.swing.JTextField();
        BtnEjecutar = new javax.swing.JButton();
        BtnInterrumpir = new javax.swing.JButton();
        BtnVolver1 = new javax.swing.JButton();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CmbOperacion.setBackground(new java.awt.Color(56, 56, 56));
        CmbOperacion.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        CmbOperacion.setForeground(new java.awt.Color(255, 255, 255));
        CmbOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tablas", "Multiplo", "Factorial", "3N+1" }));
        CmbOperacion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CmbOperacion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbOperacionItemStateChanged(evt);
            }
        });
        getContentPane().add(CmbOperacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 500, 50));

        TableResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(TableResultados);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 260, -1));

        TxtEntrada1.setBackground(new java.awt.Color(56, 56, 56));
        TxtEntrada1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtEntrada1.setForeground(new java.awt.Color(255, 255, 255));
        TxtEntrada1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtEntrada1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 50));

        TxtEntrada2.setBackground(new java.awt.Color(56, 56, 56));
        TxtEntrada2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TxtEntrada2.setForeground(new java.awt.Color(255, 255, 255));
        TxtEntrada2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtEntrada2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtEntrada2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 250, 50));

        AreaResultado.setEditable(false);
        AreaResultado.setBackground(new java.awt.Color(56, 56, 56));
        AreaResultado.setColumns(20);
        AreaResultado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        AreaResultado.setForeground(new java.awt.Color(255, 255, 255));
        AreaResultado.setLineWrap(true);
        AreaResultado.setRows(5);
        AreaResultado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jScrollPane2.setViewportView(AreaResultado);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 500, 220));

        TxtInstruccion2.setEditable(false);
        TxtInstruccion2.setBackground(new java.awt.Color(56, 56, 56));
        TxtInstruccion2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtInstruccion2.setForeground(new java.awt.Color(255, 255, 255));
        TxtInstruccion2.setText("Hasta donde debe llegar");
        TxtInstruccion2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtInstruccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 250, -1));

        TxtInstruccion1.setEditable(false);
        TxtInstruccion1.setBackground(new java.awt.Color(56, 56, 56));
        TxtInstruccion1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtInstruccion1.setForeground(new java.awt.Color(255, 255, 255));
        TxtInstruccion1.setText("Ingrese cual tabla quiere");
        TxtInstruccion1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtInstruccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, -1));

        BtnEjecutar.setBackground(new java.awt.Color(56, 56, 56));
        BtnEjecutar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnEjecutar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEjecutar.setText("Realizar operación");
        BtnEjecutar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnEjecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEjecutarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 250, 40));

        BtnInterrumpir.setBackground(new java.awt.Color(56, 56, 56));
        BtnInterrumpir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BtnInterrumpir.setForeground(new java.awt.Color(255, 255, 255));
        BtnInterrumpir.setText("Interrumpir operación");
        BtnInterrumpir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnInterrumpir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInterrumpirActionPerformed(evt);
            }
        });
        getContentPane().add(BtnInterrumpir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 250, 40));

        BtnVolver1.setText("Volver");
        BtnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 20));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbOperacionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbOperacionItemStateChanged
        String selectedFunction = (String) CmbOperacion.getSelectedItem();
        switch (selectedFunction) {
            case "Tablas":
                funcion = 1;
                table = 0;
                limpiar();
                TxtInstruccion1.setText("Ingrese cual tabla quiere");
                TxtInstruccion2.setText("Hasta donde debe llegar");
                break;
            case "Multiplo":
                funcion = 0;
                table = 0;
                limpiar();
                TxtInstruccion1.setText("Ingrese el numero a sacar los multiplos");
                break;
            case "Factorial":
                funcion = 0;
                table = 0;
                limpiar();
                TxtInstruccion1.setText("Ingrese el numero a sacar el factorial");
                break;
            case "3N+1":
                funcion = 0;
                table = 1;
                limpiar();
                TxtInstruccion1.setText("Ingrese el numero al que aplicar la conjetura");
                break;
            default:
                AreaResultado.setText("Función no implementada.");
        }
    }//GEN-LAST:event_CmbOperacionItemStateChanged

    private void BtnEjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEjecutarActionPerformed
        String selectedFunction = (String) CmbOperacion.getSelectedItem();
        switch (selectedFunction) {
            case "Tablas":
                ejecutarTablas();
                break;
            case "Multiplo":
                ejecutarMultiplo();
                break;
            case "Factorial":
                ejecutarFactorial();
                break;
            case "3N+1":
                ejecutarConjetura3N1();
                break;
            default:
                AreaResultado.setText("Función no implementada.");
        }
    }//GEN-LAST:event_BtnEjecutarActionPerformed

    private void BtnInterrumpirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInterrumpirActionPerformed
        if (worker != null && !worker.isDone()) {
            worker.cancel(true);
            AreaResultado.setText("Proceso interrumpido.");
        }
    }//GEN-LAST:event_BtnInterrumpirActionPerformed

    private void BtnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolver1ActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVolver1ActionPerformed

    private void limpiar() {

        TxtEntrada1.setText("");
        TxtEntrada2.setText("");
        AreaResultado.setText("");

        modeloTabla.setRowCount(0);
        modeloTabla.setColumnCount(0);

        if (table == 0) {
            modeloTabla.addColumn("Proceso");
        } else {
            modeloTabla.addColumn("Pasos");
            modeloTabla.addColumn("Proceso");
        }

        if (funcion == 0) {
            TxtEntrada1.setSize(500, 50);
            TxtInstruccion1.setSize(500, 30);
            TxtEntrada2.setVisible(false);
            TxtInstruccion2.setVisible(false);
        } else {
            TxtEntrada1.setSize(250, 50);
            TxtInstruccion1.setSize(250, 30);
            TxtEntrada2.setVisible(true);
            TxtInstruccion2.setVisible(true);
        }
    }

    public void ejecutarTablas() {
        try {
            int num = Integer.parseInt(TxtEntrada1.getText());
            int mul = Integer.parseInt(TxtEntrada2.getText());

            modeloTabla.setRowCount(0);
            AreaResultado.setText("Calculando...");

            if (num > 0 && mul > 0) {
                worker = new SwingWorker<>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        for (int i = 1; i <= mul; i++) {
                            if (isCancelled()) {
                                break;
                            }
                            int res = num * i;
                            publish(num + " X " + i + " = " + res);
                            Thread.sleep(100);
                        }
                        return null;
                    }

                    @Override
                    protected void process(java.util.List<String> chunks) {
                        for (String result : chunks) {
                            addToTable1Entrada(result);
                        }
                    }

                    @Override
                    protected void done() {
                        if (isCancelled()) {
                            AreaResultado.setText("Proceso interrumpido.");
                        } else {
                            AreaResultado.setText("Cálculo completado.");
                        }
                    }
                };

                worker.execute();
            } else {
                AreaResultado.setText("Los números deben ser mayores a cero.");
            }
        } catch (NumberFormatException e) {
            AreaResultado.setText("Por favor ingrese números válidos.");
        }
    }

    public void ejecutarMultiplo() {
        try {
            int num = Integer.parseInt(TxtEntrada1.getText());

            modeloTabla.setRowCount(0);
            AreaResultado.setText("Calculando...");

            if (num > 0) {
                worker = new SwingWorker<>() {
                    @Override
                    protected Void doInBackground() throws Exception {
                        for (int i = 1; i < num; i++) {
                            if (isCancelled()) {
                                break;
                            }
                            if (num % i == 0) {
                                publish(num + " / " + i + " = " + (num / i));
                                Thread.sleep(100);
                            }
                        }
                        publish(num + " / " + num + " = 1");
                        return null;
                    }

                    @Override
                    protected void process(java.util.List<String> chunks) {
                        for (String result : chunks) {
                            addToTable1Entrada(result);
                        }
                    }

                    @Override
                    protected void done() {
                        if (isCancelled()) {
                            AreaResultado.setText("Proceso interrumpido.");
                        } else {
                            AreaResultado.setText("Cálculo completado.");
                        }
                    }
                };

                worker.execute();
            } else {
                AreaResultado.setText("Por favor ingrese un número mayor a cero.");
            }
        } catch (NumberFormatException e) {
            AreaResultado.setText("Por favor ingrese un número válido.");
        }
    }

    public void ejecutarFactorial() {
        try {
            int num = Integer.parseInt(TxtEntrada1.getText());

            if (num < 10000) {
                AreaResultado.setText("Calculando...");
                modeloTabla.setRowCount(0);

                SwingWorker<BigInteger, String> worker = new SwingWorker<BigInteger, String>() {

                    @Override
                    protected BigInteger doInBackground() throws Exception {
                        BigInteger factorial = BigInteger.ONE;

                        if (num == 0 || num == 1) {
                            publish(num == 0 ? "0! = 1" : "1! = 1");
                            return BigInteger.ONE;
                        }

                        for (int i = num; i > 1; i--) {
                            if (isCancelled()) {
                                publish("Cálculo interrumpido.");
                                return BigInteger.ZERO;
                            }
                            factorial = factorial.multiply(BigInteger.valueOf(i));
                            publish(i + " X ");
                            Thread.sleep(0);
                        }

                        if (!isCancelled()) {
                            publish("1");
                        }
                        return factorial;
                    }

                    @Override
                    protected void process(List<String> chunks) {
                        for (String chunk : chunks) {
                            addToTable1Entrada(chunk);
                        }
                    }

                    @Override
                    protected void done() {
                        try {
                            if (isCancelled()) {
                                AreaResultado.setText("Proceso interrumpido.");
                            } else {
                                BigInteger result = get();
                                AreaResultado.setText(result.toString());
                            }
                        } catch (CancellationException e) {
                            AreaResultado.setText("Proceso cancelado.");
                        } catch (InterruptedException | ExecutionException e) {
                            AreaResultado.setText("Error durante el cálculo: " + e.getMessage());
                        }
                    }
                };

                worker.execute();

            } else {
                AreaResultado.setText("El numero es demaciado grande.");
            }
        } catch (NumberFormatException e) {
            AreaResultado.setText("Por favor ingrese un número válido.");
        }
    }

    public void ejecutarConjetura3N1() {
        try {
            int initialNum = Integer.parseInt(TxtEntrada1.getText());

            if (initialNum < 1 || initialNum >= 10000) {
                AreaResultado.setText("Por favor ingrese un número mayor a 0 y menor que 10000.");
                return;
            }

            modeloTabla.setRowCount(0);
            AreaResultado.setText("Calculando...");

            SwingWorker<Void, String[]> worker = new SwingWorker<Void, String[]>() {
                int pasos = 1;
                int num = initialNum;

                @Override
                protected Void doInBackground() throws Exception {
                    while (num != 1) {
                        if (isCancelled()) {
                            break;
                        }

                        String entrada1;
                        String entrada2;
                        if (num % 2 == 0) {
                            entrada1 = pasos + "- Par";
                            entrada2 = num + " / 2 = ";
                            num = num / 2;
                        } else {
                            entrada1 = pasos + "- Impar";
                            entrada2 = num + " X 3 + 1 = ";
                            num = (num * 3) + 1;
                        }

                        publish(new String[]{entrada1, entrada2 + num});
                        pasos++;
                        Thread.sleep(100);
                    }
                    return null;
                }

                @Override
                protected void process(java.util.List<String[]> chunks) {
                    for (String[] resultado : chunks) {
                        if (resultado.length == 2) {
                            addToTable2Entrada(resultado[0], resultado[1]);
                        }
                    }
                }

                @Override
                protected void done() {
                    if (isCancelled()) {
                        AreaResultado.setText("Proceso interrumpido.");
                    } else {
                        AreaResultado.setText("Número de pasos para llegar al 1: " + (pasos-1));
                    }
                }
            };

            worker.execute();
        } catch (NumberFormatException e) {
            AreaResultado.setText("Por favor ingrese un número válido.");
        }
    }

    public void addToTable1Entrada(String entrada) {
        modeloTabla.addRow(new Object[]{entrada});
    }

    public void addToTable2Entrada(String entrada1, String entrada2) {
        modeloTabla.addRow(new Object[]{entrada1, entrada2});
    }

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
            java.util.logging.Logger.getLogger(MathMixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MathMixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MathMixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MathMixer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MathMixer().setVisible(true);
            }
        });
    }

    private void configurarTabla() {

        modeloTabla = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        TableResultados.setBackground(new java.awt.Color(56, 56, 56));
        TableResultados.setFont(new java.awt.Font("Arial", 1, 14));
        TableResultados.setForeground(new java.awt.Color(255, 255, 255));
        TableResultados.setGridColor(new java.awt.Color(100, 100, 100));
        TableResultados.setRowHeight(30);
        TableResultados.setSelectionBackground(new java.awt.Color(70, 70, 70));
        TableResultados.setSelectionForeground(new java.awt.Color(255, 255, 255));
        TableResultados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        modeloTabla.addColumn("Proceso");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaResultado;
    private javax.swing.JButton BtnEjecutar;
    private javax.swing.JButton BtnInterrumpir;
    private javax.swing.JButton BtnVolver1;
    private javax.swing.JComboBox<String> CmbOperacion;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JTable TableResultados;
    private javax.swing.JTextField TxtEntrada1;
    private javax.swing.JTextField TxtEntrada2;
    private javax.swing.JTextField TxtInstruccion1;
    private javax.swing.JTextField TxtInstruccion2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
