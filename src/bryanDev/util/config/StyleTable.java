package bryanDev.util.config;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class StyleTable {

    int[] backgroundColorcell1 = GlobalStyle.Color1.clone();
    int[] backgroundColorcell2 = GlobalStyle.Color2.clone();
    int[] Encabezado = GlobalStyle.Color3.clone();
    int[] Selected = GlobalStyle.Color4.clone();
    int[] foregroundColor = GlobalStyle.Color5.clone();

    public void style(JTable table, JScrollPane scrollPane, DefaultTableModel model, String[] columns) {
        if (columns == null || columns.length == 0) {
            throw new IllegalArgumentException("El array de columnas no puede estar vacío.");
        }

        // Agregar las columnas
        for (String column : columns) {
            model.addColumn(column);
        }
        table.setModel(model);
        table.setDefaultEditor(Object.class, null);

        // Configuración de los estilos generales de la tabla
        table.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 14));
        table.setForeground(new java.awt.Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]));
        table.setGridColor(new java.awt.Color(Selected[0], Selected[1], Selected[2]));
        table.setSelectionBackground(new java.awt.Color(Selected[0], Selected[1], Selected[2]));
        table.setSelectionForeground(new java.awt.Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]));
        table.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        // Renderizador del encabezado (centrado y color)
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                setFont(new java.awt.Font("Arial Black", java.awt.Font.BOLD, 16));
                setBackground(new Color(Encabezado[0], Encabezado[1], Encabezado[2]));
                setForeground(new Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]));
                setHorizontalAlignment(SwingConstants.CENTER);
                return this;
            }
        };
        table.getTableHeader().setDefaultRenderer(headerRenderer);

        // Configuración del ScrollPane
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);

        // Pintar rows al pasar el mouse
        final int[] hoveredRow = {-1};

        table.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int row = table.rowAtPoint(e.getPoint());
                if (row != hoveredRow[0]) {
                    hoveredRow[0] = row;
                    table.repaint();
                }
            }
        });

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                hoveredRow[0] = -1;
                table.repaint();
            }
        });

        class WrapTableCellRenderer extends DefaultTableCellRenderer {

            private final JTextArea textArea = new JTextArea();

            public WrapTableCellRenderer() {
                textArea.setLineWrap(true);
                textArea.setWrapStyleWord(true);
                textArea.setOpaque(true);
                textArea.setEditable(false);
                textArea.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 13));
            }

            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
                    boolean hasFocus, int row, int column) {
                textArea.setText(value == null ? "" : value.toString());

                textArea.setSize(table.getColumnModel().getColumn(column).getWidth(), Integer.MAX_VALUE);
                int preferredHeight = textArea.getPreferredSize().height;

                if (table.getRowHeight(row) < preferredHeight) {
                    table.setRowHeight(row, preferredHeight);
                }

                if (isSelected) {
                    textArea.setBackground(table.getSelectionBackground());
                    textArea.setForeground(table.getSelectionForeground());
                } else {
                    if (row % 2 == 0) {
                        textArea.setBackground(new Color(backgroundColorcell1[0], backgroundColorcell1[1], backgroundColorcell1[2]));
                    } else {
                        textArea.setBackground(new Color(backgroundColorcell2[0], backgroundColorcell2[1], backgroundColorcell2[2]));
                    }
                    textArea.setForeground(new Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]));
                }

                if (isSelected) {
                    textArea.setBackground(new Color(Selected[0], Selected[1], Selected[2]));
                    textArea.setForeground(new Color(255 - foregroundColor[0], 255 - foregroundColor[1], 255 - foregroundColor[2]));
                }

                if (row == hoveredRow[0]) {
                    textArea.setBackground(new Color(255 - backgroundColorcell1[0], 255 - backgroundColorcell1[1], 255 - backgroundColorcell1[2]));
                    textArea.setForeground(new Color(255 - foregroundColor[0], 255 - foregroundColor[1], 255 - foregroundColor[2]));
                }

                textArea.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
                return textArea;
            }
        }
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(new WrapTableCellRenderer());
        }
    }

    // Añadir filas a la tabla
    public void addRowTable(DefaultTableModel model, String[][] rows) {
        if (rows == null || rows.length == 0) {
            return;
        }

        for (String[] row : rows) {
            for (int i = 0; i < row.length; i++) {
                if (row[i] == null) {
                    row[i] = "N/A";
                }
            }
            model.addRow(row);
        }

    }

    public void ColorSet(int R, int G, int B) {
        if (R < 0 || R > 255 || G < 0 || G > 255 || B < 0 || B > 255) {
            System.err.println("Error: Los RGB solo pueden estar entre 0 y 255");
            return;
        }
        backgroundColorcell1[0] = R;
        backgroundColorcell1[1] = G;
        backgroundColorcell1[2] = B;

        backgroundColorcell2 = Configuration.Color2(backgroundColorcell1);
        Encabezado = Configuration.Color3(backgroundColorcell1);
        Selected = Configuration.Color4(backgroundColorcell1);
        foregroundColor = Configuration.Color5(backgroundColorcell1);
    }
}
