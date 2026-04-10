package bryanDev.util.config;

import javax.swing.*;
import java.awt.*;

public class StyleSlider {

    int[] backgroundColor = GlobalStyle.Color1.clone();

    public void style(JSlider slider) {
        slider.setUI(new javax.swing.plaf.basic.BasicSliderUI(slider) {
            @Override
            public void paintTrack(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(2));
                g2d.setColor(new Color(backgroundColor[0], backgroundColor[1], backgroundColor[2]));
                super.paintTrack(g2d);
            }
        });
    }

    public void ColorSet(int R, int G, int B) {
        if (R < 0 || R > 255 || G < 0 || G > 255 || B < 0 || B > 255) {
            System.err.println("Error: Los RGB solo pueden estar entre 0 y 255");
            return;
        }
        // Actualiza el color de la pista
        backgroundColor[0] = R;
        backgroundColor[1] = G;
        backgroundColor[2] = B;
    }
}
