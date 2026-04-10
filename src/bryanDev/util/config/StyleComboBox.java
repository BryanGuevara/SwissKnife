package bryanDev.util.config;

import javax.swing.*;
import java.awt.*;

public class StyleComboBox {

    int[] backgroundColor = GlobalStyle.Color6.clone();
    int[] listColor = GlobalStyle.Color2.clone();
    int[] selectedColor = GlobalStyle.Color4.clone();
    int[] foregroundColor = GlobalStyle.Color5.clone();

    public void style(JComboBox<String> comboBox) {

        int itemCount = comboBox.getItemCount();
        int maxLength = 0;

        for (int i = 0; i < itemCount; i++) {
            String item = comboBox.getItemAt(i);
            if (item != null && item.length() > maxLength) {
                maxLength = item.length();
            }
        }

        final int fontSize = Configuration.fontHeight(comboBox.getWidth(), comboBox.getHeight(), maxLength);

        Color bgColor = new Color(backgroundColor[0], backgroundColor[1], backgroundColor[2]);
        Color listBgColor = new Color(listColor[0], listColor[1], listColor[2]);
        Color selectedBgColor = new Color(selectedColor[0], selectedColor[1], selectedColor[2]);
        Color textColor = new Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]);
        Color selectedFgColor = new Color((255 - foregroundColor[0]), (255 - foregroundColor[1]), (255 - foregroundColor[2]));

        comboBox.setBackground(bgColor);
        comboBox.setForeground(textColor);
        comboBox.setFont(new Font("Arial Black", Font.PLAIN, fontSize));
        comboBox.setMaximumRowCount(12);

        comboBox.setRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component component = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                comboBox.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

                if (isSelected) {
                    component.setBackground(selectedBgColor);
                    component.setForeground(selectedFgColor);
                } else {
                    component.setBackground(listBgColor);
                    component.setForeground(textColor);
                }

                return component;
            }
        });
    }
}
