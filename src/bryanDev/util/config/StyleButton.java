package bryanDev.util.config;

import java.awt.Color;
import javax.swing.JButton;

public class StyleButton {
    
    int[] backgroundColor = GlobalStyle.Color1.clone();
    int[] foregroundColor = GlobalStyle.Color5.clone();
    
    public void style(JButton button) {
        
        final int fontSize = Configuration.fontHeight(button.getWidth(), button.getHeight(), button.getText().length());
        
        button.setBackground(new Color(backgroundColor[0], backgroundColor[1], backgroundColor[2]));
        button.setForeground(new Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]));
        button.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        button.setFont(new java.awt.Font("Arial Black", 1, fontSize));
        
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(255 - backgroundColor[0], 255 - backgroundColor[1], 255 - backgroundColor[2]));
                button.setForeground(new Color(255 - foregroundColor[0], 255 - foregroundColor[1], 255 - foregroundColor[2]));
                int adjustedFontSize = Math.max(fontSize - 1, 10);
                button.setFont(new java.awt.Font("Arial", 1, adjustedFontSize));
            }
            
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                button.setBackground(new Color(backgroundColor[0], backgroundColor[1], backgroundColor[2]));
                button.setForeground(new Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]));
                button.setFont(new java.awt.Font("Arial Black", 1, fontSize));
            }
        });
    }
    
    public void styleArray(JButton[] buttons) {
        for (int i = 0; i < buttons.length; i++) {
            style(buttons[i]);
        }
    }
    
    public void ColorSet(int R, int G, int B) {
        if (R < 0 || R > 255 || G < 0 || G > 255 || B < 0 || B > 255) {
            System.err.println("Error: Los RGB solo pueden estar entre 0 y 255");
            return;
        }
        backgroundColor[0] = R;
        backgroundColor[1] = G;
        backgroundColor[2] = B;
        
        foregroundColor = Configuration.Color5(backgroundColor);
    }
}
