package bryanDev.util.config;

import java.awt.Color;
import javax.swing.JPasswordField;

public class StylePasswordField {
    
    int[] backgroundColor = GlobalStyle.Color1.clone();
    int[] foregroundColor = GlobalStyle.Color5.clone();

    public void style(JPasswordField passwordField) {

        final int fontSize = Configuration.fontHeight(passwordField.getWidth(), passwordField.getHeight(), passwordField.getText().length());

        passwordField.setBackground(new Color(backgroundColor[0], backgroundColor[1], backgroundColor[2]));
        passwordField.setForeground(new Color(foregroundColor[0], foregroundColor[1], foregroundColor[2]));
        passwordField.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        passwordField.setFont(new java.awt.Font("Arial Black", 1, fontSize));
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
