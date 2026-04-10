package bryanDev.util.config;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class StyleFrame {

    public void configureFrame(JFrame frame, String title, String iconPath) {
        if (frame == null || title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("El JFrame o el título no pueden ser nulos o vacíos.");
        }
        frame.setLocationRelativeTo(null);
        frame.setTitle(title);
        frame.setResizable(false);

        if (iconPath != null && !iconPath.trim().isEmpty()) {
            URL resourceUrl = ClassLoader.getSystemResource(iconPath);
            if (resourceUrl != null) {
                Image iconImage = Toolkit.getDefaultToolkit().getImage(resourceUrl);
                frame.setIconImage(iconImage);
            } else {
                System.err.println("No se pudo encontrar el icono en la ruta: " + iconPath);
            }
        }
    }
}
