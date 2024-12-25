/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author MINEDUCYT
 */
public class Conversor extends javax.swing.JFrame {

    private static final Map<Integer, Double> unidadMedidas = new HashMap<>();
    private static final Map<Integer, Double> unidadPeso = new HashMap<>();
    private static final Map<Integer, Double> unidadTiempo = new HashMap<>();
    private static final Map<Integer, Double> unidadCapacidad = new HashMap<>();

    static {
        unidadMedidas.put(1, 0.000000001);    // Nanómetro
        unidadMedidas.put(2, 0.000001);       // Micrómetro
        unidadMedidas.put(3, 0.001);          // Milímetro
        unidadMedidas.put(4, 0.01);           // Centímetro - Medida Base
        unidadMedidas.put(5, 0.0833);         // Svara (aproximado)
        unidadMedidas.put(6, 0.0254);         // Pulgada
        unidadMedidas.put(7, 0.004233);       // Pica
        unidadMedidas.put(8, 0.3048);         // Pie
        unidadMedidas.put(9, 0.4572);         // Codo
        unidadMedidas.put(10, 0.9144);        // Yarda
        unidadMedidas.put(11, 1.0);           // Metro
        unidadMedidas.put(12, 2.4384);        // Braza
        unidadMedidas.put(13, 10.0);          // Decámetro
        unidadMedidas.put(14, 100.0);         // Hectómetro
        unidadMedidas.put(15, 201.168);       // Furlong
        unidadMedidas.put(16, 1067.0);        // Versta
        unidadMedidas.put(17, 1000.0);        // Kilómetro
        unidadMedidas.put(18, 1609.344);      // Milla terrestre
        unidadMedidas.put(19, 1609.344);      // Milla
        unidadMedidas.put(20, 0.0254);        // Mil (milésima de pulgada)
        unidadMedidas.put(21, 1852.0);        // Milla náutica
        unidadMedidas.put(22, 4828.032);      // Liga
        unidadMedidas.put(23, 5556.0);        // League (marítima)
        unidadMedidas.put(24, 9.461e15);      // Año luz
    }

    static {
        unidadPeso.put(1, 0.00000000003527396);       // Picogramo (pg)
        unidadPeso.put(2, 0.00000003527396);          // Nanogramo (ng)
        unidadPeso.put(3, 0.00003527396);             // Microgramo (µg)
        unidadPeso.put(4, 0.00003527396);             // Miligramo (mg)
        unidadPeso.put(5, 0.0022046226218);           // Gramo (g)
        unidadPeso.put(6, 0.0000000022046226218);     // Microtonelada
        unidadPeso.put(7, 0.0000022046226218);        // Militonelada
        unidadPeso.put(8, 1.0);                       // Libra (lb) - Medida Base
        unidadPeso.put(9, 2.2046226218);              // Kilogramo (kg)
        unidadPeso.put(10, 2.2046226218);             // Libra métrica (kg)
        unidadPeso.put(11, 25.0);                     // Arroba
        unidadPeso.put(12, 77.0);                     // Talento
        unidadPeso.put(13, 100.0);                    // Quintal corto (cwt)
        unidadPeso.put(14, 1102.311);                 // Media tonelada (half ton)
        unidadPeso.put(15, 2000.0);                   // Tonelada corta (short ton)
        unidadPeso.put(16, 2204.6226218);             // Tonelada métrica (t)
        unidadPeso.put(17, 2240.0);                   // Tonelada larga (long ton)
        unidadPeso.put(18, 35273.96195);              // Tonelada
        unidadPeso.put(19, 220462.2622);              // Kilotonelada (kt)
        unidadPeso.put(20, 2204622.6218);             // Megatonelada (Mt)
        unidadPeso.put(21, 22046226.218);             // Gigatonelada (Gt)
        unidadPeso.put(22, 220462262.18);             // Teratonelada (Tt)
        unidadPeso.put(23, 2204622621.8);             // Petatonelada (Pt)
        unidadPeso.put(24, 22046226218.0);            // Exatonelada (Et)
    }

    static {
        unidadTiempo.put(1, 1e-15);         // Femtosegundo
        unidadTiempo.put(2, 1e-12);         // Picosegundo
        unidadTiempo.put(3, 1e-9);          // Nanosegundo
        unidadTiempo.put(4, 1e-6);          // Microsegundo
        unidadTiempo.put(5, 1e-3);          // Milisegundo
        unidadTiempo.put(6, 1.0);           // Segundo - Medida Base
        unidadTiempo.put(7, 60.0);          // Minuto
        unidadTiempo.put(8, 1800.0);        // Media hora (30 minutos)
        unidadTiempo.put(9, 3600.0);        // Hora
        unidadTiempo.put(10, 43200.0);      // Medio día (12 horas)
        unidadTiempo.put(11, 86400.0);      // Día
        unidadTiempo.put(12, 604800.0);     // Semana
        unidadTiempo.put(13, 2.592e6);      // Mes (30 días, aproximado)
        unidadTiempo.put(14, 3.1536e7);     // Año (365 días)
        unidadTiempo.put(15, 1.57788e8);    // Lustro (5 años)
        unidadTiempo.put(16, 3.1536e8);     // Década (10 años)
        unidadTiempo.put(17, 3.1536e9);     // Siglo (100 años)
        unidadTiempo.put(18, 3.1536e10);    // Milenio (1000 años)
        unidadTiempo.put(19, 3.1536e13);    // Mega-año (millón de años)
        unidadTiempo.put(20, 3.1536e16);    // Milenio galáctico (1000 millones de años)
    }

    static {
        unidadCapacidad.put(1, 0.000001);          // Bit (b)
        unidadCapacidad.put(2, 0.000125);          // Byte (B)
        unidadCapacidad.put(3, 0.008);             // Kilobit (Kb)
        unidadCapacidad.put(4, 0.125);             // Kilobyte (KB)
        unidadCapacidad.put(5, 1.0);               // Megabit (Mb)
        unidadCapacidad.put(6, 1.0);               // Megabyte (MB) - unidad base
        unidadCapacidad.put(7, 8.0);               // Gigabit (Gb)
        unidadCapacidad.put(8, 1024.0);            // Gigabyte (GB)
        unidadCapacidad.put(9, 8192.0);            // Terabit (Tb)
        unidadCapacidad.put(10, 1048576.0);        // Terabyte (TB)
        unidadCapacidad.put(11, 8388608.0);        // Petabit (Pb)
        unidadCapacidad.put(12, 1073741824.0);     // Petabyte (PB)
        unidadCapacidad.put(13, 8589934592.0);     // Exabit (Eb)
        unidadCapacidad.put(14, 1099511627776.0);  // Exabyte (EB)
        unidadCapacidad.put(15, 8796093022208.0);  // Zettabit (Zb)
        unidadCapacidad.put(16, 1125899906842624.0); // Zettabyte (ZB)
        unidadCapacidad.put(17, 9007199254740992.0); // Yottabit (Yb)
        unidadCapacidad.put(18, 1152921504606846976.0); // Yottabyte (YB)
        unidadCapacidad.put(19, 9223372036854775808.0); // Brontobyte
        unidadCapacidad.put(20, 1180591620717411303424.0); // Geopbyte
    }

    public Conversor() {
        initComponents();

        setResizable(false);
        setTitle("Conversor");
        this.setLocationRelativeTo(null);

        Reinicio();

        Medidas.setOpaque(false);
        Pesos.setOpaque(false);
        Tiempo.setOpaque(false);
        Capacidad.setOpaque(false);

        Medidas.setVisible(true);
        Pesos.setVisible(false);
        Tiempo.setVisible(false);
        Capacidad.setVisible(false);

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

        Medidas = new javax.swing.JPanel();
        CmbDestinoM = new javax.swing.JComboBox<>();
        CmbOrigenM = new javax.swing.JComboBox<>();
        TxtOrigenM = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtDestinoM = new javax.swing.JTextArea();
        Pesos = new javax.swing.JPanel();
        CmbDestinoP = new javax.swing.JComboBox<>();
        CmbOrigenP = new javax.swing.JComboBox<>();
        TxtOrigenP = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtDestinoP = new javax.swing.JTextArea();
        Tiempo = new javax.swing.JPanel();
        CmbDestinoT = new javax.swing.JComboBox<>();
        CmbOrigenT = new javax.swing.JComboBox<>();
        TxtOrigenT = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxtDestinoT = new javax.swing.JTextArea();
        Capacidad = new javax.swing.JPanel();
        CmbDestinoC = new javax.swing.JComboBox<>();
        CmbOrigenC = new javax.swing.JComboBox<>();
        TxtOrigenC = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TxtDestinoC = new javax.swing.JTextArea();
        BtnCapacidad = new javax.swing.JButton();
        BtnTiempo = new javax.swing.JButton();
        BtnPesos = new javax.swing.JButton();
        BtnMedidas = new javax.swing.JButton();
        BtnVolver1 = new javax.swing.JButton();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CmbDestinoM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nanómetro", "Micrómetro", "Milímetro", "Centímetro", "Svara (métrica)", "Pulgada", "Pica", "Pie", "Codo", "Yarda", "Metro", "Braza", "Decámetro", "Hectómetro", "Furlong", "Versta", "Kilómetro", "Milla terrestre", "Milla", "Milha (mil)", "Milla náutica", "Liga", "League (marítima)", "Año luz" }));
        CmbDestinoM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbDestinoMItemStateChanged(evt);
            }
        });

        CmbOrigenM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nanómetro", "Micrómetro", "Milímetro", "Centímetro", "Svara (métrica)", "Pulgada", "Pica", "Pie", "Codo", "Yarda", "Metro", "Braza", "Decámetro", "Hectómetro", "Furlong", "Versta", "Kilómetro", "Milla terrestre", "Milla", "Milha (mil)", "Milla náutica", "Liga", "League (marítima)", "Año luz" }));
        CmbOrigenM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbOrigenMItemStateChanged(evt);
            }
        });

        TxtOrigenM.setBackground(new java.awt.Color(255, 255, 255));
        TxtOrigenM.setForeground(new java.awt.Color(65, 65, 65));
        TxtOrigenM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtOrigenMKeyReleased(evt);
            }
        });

        TxtDestinoM.setEditable(false);
        TxtDestinoM.setBackground(new java.awt.Color(255, 255, 255));
        TxtDestinoM.setColumns(20);
        TxtDestinoM.setForeground(new java.awt.Color(65, 65, 65));
        TxtDestinoM.setLineWrap(true);
        TxtDestinoM.setRows(5);
        jScrollPane1.setViewportView(TxtDestinoM);

        javax.swing.GroupLayout MedidasLayout = new javax.swing.GroupLayout(Medidas);
        Medidas.setLayout(MedidasLayout);
        MedidasLayout.setHorizontalGroup(
            MedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedidasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(TxtOrigenM, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbDestinoM, javax.swing.GroupLayout.Alignment.LEADING, 0, 457, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(MedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MedidasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenM, 0, 457, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        MedidasLayout.setVerticalGroup(
            MedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MedidasLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TxtOrigenM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(CmbDestinoM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
            .addGroup(MedidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(MedidasLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenM, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        getContentPane().add(Medidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 380));

        CmbDestinoP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Picogramo", "Nanogramo", "Microgramo", "Miligramo", "Gramo", "Microtonelada", "Militonelada", "Libra", "Kilogramo", "Libra métrica", "Arroba", "Talento", "Quintal corto", "Media tonelada", "Tonelada corta", "Tonelada métrica", "Tonelada larga", "Tonelada", "Kilotonelada", "Megatonelada", "Gigatonelada", "Teratonelada", "Petatonelada", "Exatonelada" }));
        CmbDestinoP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbDestinoPItemStateChanged(evt);
            }
        });

        CmbOrigenP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Picogramo", "Nanogramo", "Microgramo", "Miligramo", "Gramo", "Microtonelada", "Militonelada", "Libra", "Kilogramo", "Libra métrica", "Arroba", "Talento", "Quintal corto", "Media tonelada", "Tonelada corta", "Tonelada métrica", "Tonelada larga", "Tonelada", "Kilotonelada", "Megatonelada", "Gigatonelada", "Teratonelada", "Petatonelada", "Exatonelada" }));
        CmbOrigenP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbOrigenPItemStateChanged(evt);
            }
        });

        TxtOrigenP.setBackground(new java.awt.Color(255, 255, 255));
        TxtOrigenP.setForeground(new java.awt.Color(65, 65, 65));
        TxtOrigenP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtOrigenPKeyReleased(evt);
            }
        });

        TxtDestinoP.setEditable(false);
        TxtDestinoP.setBackground(new java.awt.Color(255, 255, 255));
        TxtDestinoP.setColumns(20);
        TxtDestinoP.setForeground(new java.awt.Color(65, 65, 65));
        TxtDestinoP.setLineWrap(true);
        TxtDestinoP.setRows(5);
        jScrollPane3.setViewportView(TxtDestinoP);

        javax.swing.GroupLayout PesosLayout = new javax.swing.GroupLayout(Pesos);
        Pesos.setLayout(PesosLayout);
        PesosLayout.setHorizontalGroup(
            PesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3)
                    .addComponent(TxtOrigenP, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbDestinoP, javax.swing.GroupLayout.Alignment.LEADING, 0, 457, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(PesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PesosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenP, 0, 457, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        PesosLayout.setVerticalGroup(
            PesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PesosLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TxtOrigenP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(CmbDestinoP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
            .addGroup(PesosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(PesosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenP, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        getContentPane().add(Pesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 380));

        CmbDestinoT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femtosegundo", "Picosegundo", "Nanosegundo", "Microsegundo", "Milisegundo", "Segundo", "Minuto", "Media hora", "Hora", "Medio día", "Día", "Semana", "Mes", "Año", "Lustro", "Década", "Siglo", "Milenio", "Mega-año", "Milenio galáctico" }));
        CmbDestinoT.setSelectedIndex(5);
        CmbDestinoT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbDestinoTItemStateChanged(evt);
            }
        });

        CmbOrigenT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femtosegundo", "Picosegundo", "Nanosegundo", "Microsegundo", "Milisegundo", "Segundo", "Minuto", "Media hora", "Hora", "Medio día", "Día", "Semana", "Mes", "Año", "Lustro", "Década", "Siglo", "Milenio", "Mega-año", "Milenio galáctico" }));
        CmbOrigenT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbOrigenTItemStateChanged(evt);
            }
        });

        TxtOrigenT.setBackground(new java.awt.Color(255, 255, 255));
        TxtOrigenT.setForeground(new java.awt.Color(65, 65, 65));
        TxtOrigenT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtOrigenTKeyReleased(evt);
            }
        });

        TxtDestinoT.setEditable(false);
        TxtDestinoT.setBackground(new java.awt.Color(255, 255, 255));
        TxtDestinoT.setColumns(20);
        TxtDestinoT.setForeground(new java.awt.Color(65, 65, 65));
        TxtDestinoT.setLineWrap(true);
        TxtDestinoT.setRows(5);
        jScrollPane2.setViewportView(TxtDestinoT);

        javax.swing.GroupLayout TiempoLayout = new javax.swing.GroupLayout(Tiempo);
        Tiempo.setLayout(TiempoLayout);
        TiempoLayout.setHorizontalGroup(
            TiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TiempoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(TxtOrigenT, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbDestinoT, javax.swing.GroupLayout.Alignment.LEADING, 0, 457, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(TiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TiempoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenT, 0, 457, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        TiempoLayout.setVerticalGroup(
            TiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TiempoLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TxtOrigenT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(CmbDestinoT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
            .addGroup(TiempoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(TiempoLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenT, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        getContentPane().add(Tiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 380));

        CmbDestinoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bit (b)", "Byte (B)", "Kilobit (Kb)", "Kilobyte (KB)", "Megabit (Mb)", "Megabyte (MB)", "Gigabit (Gb)", "Gigabyte (GB)", "Terabit (Tb)", "Terabyte (TB)", "Petabit (Pb)", "Petabyte (PB)", "Exabit (Eb)", "Exabyte (EB)", "Zettabit (Zb)", "Zettabyte (ZB)", "Yottabit (Yb)", "Yottabyte (YB)", "Brontobyte (BrB)", "Geopbyte (GpB)" }));
        CmbDestinoC.setSelectedIndex(5);
        CmbDestinoC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbDestinoCItemStateChanged(evt);
            }
        });

        CmbOrigenC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bit (b)", "Byte (B)", "Kilobit (Kb)", "Kilobyte (KB)", "Megabit (Mb)", "Megabyte (MB)", "Gigabit (Gb)", "Gigabyte (GB)", "Terabit (Tb)", "Terabyte (TB)", "Petabit (Pb)", "Petabyte (PB)", "Exabit (Eb)", "Exabyte (EB)", "Zettabit (Zb)", "Zettabyte (ZB)", "Yottabit (Yb)", "Yottabyte (YB)", "Brontobyte (BrB)", "Geopbyte (GpB)" }));
        CmbOrigenC.setSelectedIndex(5);
        CmbOrigenC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbOrigenCItemStateChanged(evt);
            }
        });

        TxtOrigenC.setBackground(new java.awt.Color(255, 255, 255));
        TxtOrigenC.setForeground(new java.awt.Color(65, 65, 65));
        TxtOrigenC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtOrigenCKeyReleased(evt);
            }
        });

        TxtDestinoC.setEditable(false);
        TxtDestinoC.setBackground(new java.awt.Color(255, 255, 255));
        TxtDestinoC.setColumns(20);
        TxtDestinoC.setForeground(new java.awt.Color(65, 65, 65));
        TxtDestinoC.setLineWrap(true);
        TxtDestinoC.setRows(5);
        jScrollPane4.setViewportView(TxtDestinoC);

        javax.swing.GroupLayout CapacidadLayout = new javax.swing.GroupLayout(Capacidad);
        Capacidad.setLayout(CapacidadLayout);
        CapacidadLayout.setHorizontalGroup(
            CapacidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapacidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CapacidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4)
                    .addComponent(TxtOrigenC, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CmbDestinoC, javax.swing.GroupLayout.Alignment.LEADING, 0, 457, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(CapacidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CapacidadLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenC, 0, 457, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        CapacidadLayout.setVerticalGroup(
            CapacidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CapacidadLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(TxtOrigenC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(CmbDestinoC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
            .addGroup(CapacidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CapacidadLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(CmbOrigenC, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(324, Short.MAX_VALUE)))
        );

        getContentPane().add(Capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, 380));

        BtnCapacidad.setText("Capacidad");
        BtnCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCapacidadActionPerformed(evt);
            }
        });
        getContentPane().add(BtnCapacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, 90, -1));

        BtnTiempo.setText("Tiempo");
        BtnTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnTiempoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 90, -1));

        BtnPesos.setText("Pesos");
        BtnPesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 90, -1));

        BtnMedidas.setText("Medidas");
        BtnMedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMedidasActionPerformed(evt);
            }
        });
        getContentPane().add(BtnMedidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 90, -1));

        BtnVolver1.setText("Volver");
        BtnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, -1, -1));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 0, 480, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CmbOrigenMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbOrigenMItemStateChanged
        conversorMedidas();
    }//GEN-LAST:event_CmbOrigenMItemStateChanged

    private void CmbDestinoMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbDestinoMItemStateChanged
        conversorMedidas();
    }//GEN-LAST:event_CmbDestinoMItemStateChanged

    private void TxtOrigenMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOrigenMKeyReleased
        conversorMedidas();
    }//GEN-LAST:event_TxtOrigenMKeyReleased

    private void CmbDestinoPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbDestinoPItemStateChanged
        conversorPesos();
    }//GEN-LAST:event_CmbDestinoPItemStateChanged

    private void CmbOrigenPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbOrigenPItemStateChanged
        conversorPesos();
    }//GEN-LAST:event_CmbOrigenPItemStateChanged

    private void TxtOrigenPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOrigenPKeyReleased
        conversorPesos();
    }//GEN-LAST:event_TxtOrigenPKeyReleased

    private void BtnMedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMedidasActionPerformed
        Medidas.setVisible(true);
        Pesos.setVisible(false);
        Tiempo.setVisible(false);
        Capacidad.setVisible(false);
        Reinicio();
    }//GEN-LAST:event_BtnMedidasActionPerformed

    private void BtnPesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesosActionPerformed
        Medidas.setVisible(false);
        Pesos.setVisible(true);
        Tiempo.setVisible(false);
        Capacidad.setVisible(false);
        Reinicio();
    }//GEN-LAST:event_BtnPesosActionPerformed

    private void BtnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolver1ActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVolver1ActionPerformed

    private void CmbDestinoTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbDestinoTItemStateChanged
        conversorTiempo();
    }//GEN-LAST:event_CmbDestinoTItemStateChanged

    private void CmbOrigenTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbOrigenTItemStateChanged
        conversorTiempo();
    }//GEN-LAST:event_CmbOrigenTItemStateChanged

    private void TxtOrigenTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOrigenTKeyReleased
        conversorTiempo();
    }//GEN-LAST:event_TxtOrigenTKeyReleased

    private void BtnTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnTiempoActionPerformed
        Medidas.setVisible(false);
        Pesos.setVisible(false);
        Tiempo.setVisible(true);
        Capacidad.setVisible(false);
        Reinicio();
    }//GEN-LAST:event_BtnTiempoActionPerformed

    private void CmbDestinoCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbDestinoCItemStateChanged
        conversorCapacidad();
    }//GEN-LAST:event_CmbDestinoCItemStateChanged

    private void CmbOrigenCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbOrigenCItemStateChanged
        conversorCapacidad();
    }//GEN-LAST:event_CmbOrigenCItemStateChanged

    private void TxtOrigenCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtOrigenCKeyReleased
        conversorCapacidad();
    }//GEN-LAST:event_TxtOrigenCKeyReleased

    private void BtnCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCapacidadActionPerformed
        Medidas.setVisible(false);
        Pesos.setVisible(false);
        Tiempo.setVisible(false);
        Capacidad.setVisible(true);
        Reinicio();
    }//GEN-LAST:event_BtnCapacidadActionPerformed

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
        // Medidas
        TxtOrigenM.setText("");
        TxtDestinoM.setText("");
        CmbOrigenM.setSelectedIndex(3);
        CmbDestinoM.setSelectedIndex(3);

        // Pesos
        TxtOrigenP.setText("");
        TxtDestinoP.setText("");
        CmbOrigenP.setSelectedIndex(7);
        CmbDestinoP.setSelectedIndex(7);

        // Tiempo
        TxtOrigenT.setText("");
        TxtDestinoT.setText("");
        CmbOrigenT.setSelectedIndex(5);
        CmbDestinoT.setSelectedIndex(5);

        // Capacidad
        TxtOrigenC.setText("");
        TxtDestinoC.setText("");
        CmbOrigenC.setSelectedIndex(5);
        CmbDestinoC.setSelectedIndex(5);
    }

    public void conversorMedidas() {
        try {
            if (TxtOrigenM.getText().isEmpty()) {
                TxtDestinoM.setText("");
                return;
            }
            String inputText = TxtOrigenM.getText();

            if (!inputText.matches("\\d+")) {
                TxtDestinoM.setText("Solo se pueden convertir números.");
                return;
            }

            int unidadOrigen = CmbOrigenM.getSelectedIndex() + 1;
            int unidadDestino = CmbDestinoM.getSelectedIndex() + 1;

            BigDecimal factorOrigen = new BigDecimal(unidadMedidas.get(unidadOrigen));
            BigDecimal factorDestino = new BigDecimal(unidadMedidas.get(unidadDestino));

            BigDecimal input = new BigDecimal(inputText);

            BigDecimal resultado = input.multiply(factorOrigen).divide(factorDestino, 50, BigDecimal.ROUND_HALF_UP);

            String resultadoStr = resultado.stripTrailingZeros().toPlainString();

            TxtDestinoM.setText(resultadoStr);

        } catch (NumberFormatException e) {
            TxtDestinoM.setText("Solo se pueden convertir números.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por infinito.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public void conversorPesos() {
        try {
            if (TxtOrigenP.getText().isEmpty()) {
                TxtDestinoP.setText("");
                return;
            }
            String inputText = TxtOrigenP.getText();

            if (!inputText.matches("\\d+")) {
                TxtDestinoP.setText("Solo se pueden convertir números.");
                return;
            }

            int unidadOrigen = CmbOrigenP.getSelectedIndex() + 1;
            int unidadDestino = CmbDestinoP.getSelectedIndex() + 1;

            BigDecimal factorOrigen = new BigDecimal(unidadPeso.get(unidadOrigen));
            BigDecimal factorDestino = new BigDecimal(unidadPeso.get(unidadDestino));

            BigDecimal input = new BigDecimal(inputText);

            BigDecimal resultado = input.multiply(factorOrigen).divide(factorDestino, 50, BigDecimal.ROUND_HALF_UP);

            String resultadoStr = resultado.stripTrailingZeros().toPlainString();

            TxtDestinoP.setText(resultadoStr);

        } catch (NumberFormatException e) {
            TxtDestinoP.setText("Solo se pueden convertir números.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por infinito.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public void conversorTiempo() {
        try {
            if (TxtOrigenT.getText().isEmpty()) {
                TxtDestinoT.setText("");
                return;
            }
            String inputText = TxtOrigenT.getText();

            if (!inputText.matches("\\d+")) {
                TxtDestinoT.setText("Solo se pueden convertir números.");
                return;
            }

            int unidadOrigen = CmbOrigenT.getSelectedIndex() + 1;
            int unidadDestino = CmbDestinoT.getSelectedIndex() + 1;

            BigDecimal factorOrigen = new BigDecimal(unidadTiempo.get(unidadOrigen));
            BigDecimal factorDestino = new BigDecimal(unidadTiempo.get(unidadDestino));

            BigDecimal input = new BigDecimal(inputText);

            BigDecimal resultado = input.multiply(factorOrigen).divide(factorDestino, 50, BigDecimal.ROUND_HALF_UP);

            String resultadoStr = resultado.stripTrailingZeros().toPlainString();

            if (resultadoStr.contains("E")) {
                resultadoStr = new BigDecimal(resultadoStr).toPlainString();
            }

            TxtDestinoT.setText(resultadoStr);

        } catch (NumberFormatException e) {
            TxtDestinoT.setText("Solo se pueden convertir números.");
        } catch (ArithmeticException e) {
            System.out.println("Error: División por infinito.");
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }

    public void conversorCapacidad() {
        try {
            if (TxtOrigenC.getText().isEmpty()) {
                TxtDestinoC.setText("");
                return;
            }
            String inputText = TxtOrigenC.getText();

            if (!inputText.matches("\\d+")) {
                TxtDestinoC.setText("Solo se pueden convertir números.");
                return;
            }

            int unidadOrigen = CmbOrigenC.getSelectedIndex() + 1;
            int unidadDestino = CmbDestinoC.getSelectedIndex() + 1;

            BigDecimal factorOrigen = new BigDecimal(unidadCapacidad.get(unidadOrigen));
            BigDecimal factorDestino = new BigDecimal(unidadCapacidad.get(unidadDestino));

            BigDecimal input = new BigDecimal(inputText);

            BigDecimal resultado = input.multiply(factorOrigen).divide(factorDestino, 50, BigDecimal.ROUND_HALF_UP);

            String resultadoStr = resultado.stripTrailingZeros().toPlainString();

            TxtDestinoC.setText(resultadoStr);

        } catch (NumberFormatException e) {
            TxtDestinoC.setText("Solo se pueden convertir números.");
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
    private javax.swing.JButton BtnVolver1;
    private javax.swing.JPanel Capacidad;
    private javax.swing.JComboBox<String> CmbDestinoC;
    private javax.swing.JComboBox<String> CmbDestinoM;
    private javax.swing.JComboBox<String> CmbDestinoP;
    private javax.swing.JComboBox<String> CmbDestinoT;
    private javax.swing.JComboBox<String> CmbOrigenC;
    private javax.swing.JComboBox<String> CmbOrigenM;
    private javax.swing.JComboBox<String> CmbOrigenP;
    private javax.swing.JComboBox<String> CmbOrigenT;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JPanel Medidas;
    private javax.swing.JPanel Pesos;
    private javax.swing.JPanel Tiempo;
    private javax.swing.JTextArea TxtDestinoC;
    private javax.swing.JTextArea TxtDestinoM;
    private javax.swing.JTextArea TxtDestinoP;
    private javax.swing.JTextArea TxtDestinoT;
    private javax.swing.JTextField TxtOrigenC;
    private javax.swing.JTextField TxtOrigenM;
    private javax.swing.JTextField TxtOrigenP;
    private javax.swing.JTextField TxtOrigenT;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables

}
