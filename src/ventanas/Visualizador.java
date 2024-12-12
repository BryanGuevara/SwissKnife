/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import java.util.List;
import javax.swing.JOptionPane;
import org.commonmark.parser.Parser;
import org.commonmark.node.Node;
import org.commonmark.renderer.html.HtmlRenderer;
import org.jsoup.Jsoup;

/**
 *
 * @author MINEDUCYT
 */
public class Visualizador extends javax.swing.JFrame {

    /**
     * Creates new form Visualizador
     */
    String texto = "";

    public Visualizador() {
        initComponents();

        setTitle("Visualizador de HTML");
        this.setLocationRelativeTo(null);

        TxtTexto.setText("<h1>Hola Mundo</h1>");
        PanelHTML.setText(TxtTexto.getText());
        PanelHTML.setCaretPosition(0);

        ImageIcon wallpaper = new ImageIcon("src/img/Visualizador.jpg");
        Icon icon = new ImageIcon(wallpaper.getImage().getScaledInstance(LabelWallpaper.getWidth(),
                LabelWallpaper.getHeight(), Image.SCALE_DEFAULT));

        LabelWallpaper.setIcon(icon);

        if (!contieneEtiquetasHtml5(texto)) {
            texto = convertMarkdownToHtml(texto);
            setTitle("Visualizador de HTML");
            BtnToPdf.setEnabled(true);
        } else {
            setTitle("Visualizador de HTML - Markdown y PDF no soporta HTML5");
            BtnToPdf.setEnabled(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Text = new javax.swing.JScrollPane();
        TxtTexto = new javax.swing.JTextArea();
        Html = new javax.swing.JScrollPane();
        PanelHTML = new javax.swing.JTextPane();
        BtnReinicioHTML5 = new javax.swing.JButton();
        BtnReinicioHTML = new javax.swing.JButton();
        BtnToHtml = new javax.swing.JButton();
        BtnToPdf = new javax.swing.JButton();
        BtnVolver1 = new javax.swing.JButton();
        BtnReinicioMarkdown = new javax.swing.JButton();
        TxtInfo1 = new javax.swing.JTextField();
        TxtInfo = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtInfo2 = new javax.swing.JTextField();
        LabelWallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TxtTexto.setBackground(new java.awt.Color(56, 56, 56));
        TxtTexto.setColumns(20);
        TxtTexto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TxtTexto.setForeground(new java.awt.Color(255, 255, 255));
        TxtTexto.setLineWrap(true);
        TxtTexto.setRows(5);
        TxtTexto.setWrapStyleWord(true);
        TxtTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TxtTextoKeyReleased(evt);
            }
        });
        Text.setViewportView(TxtTexto);

        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 461, 464));

        PanelHTML.setEditable(false);
        PanelHTML.setBackground(new java.awt.Color(255, 255, 255));
        PanelHTML.setContentType("text/html"); // NOI18N
        PanelHTML.setForeground(new java.awt.Color(0, 0, 0));
        PanelHTML.setText("");
        Html.setViewportView(PanelHTML);

        getContentPane().add(Html, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 461, 464));

        BtnReinicioHTML5.setBackground(new java.awt.Color(56, 56, 56));
        BtnReinicioHTML5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnReinicioHTML5.setForeground(new java.awt.Color(255, 255, 255));
        BtnReinicioHTML5.setText("HTML5");
        BtnReinicioHTML5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnReinicioHTML5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReinicioHTML5ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnReinicioHTML5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 150, 40));

        BtnReinicioHTML.setBackground(new java.awt.Color(56, 56, 56));
        BtnReinicioHTML.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnReinicioHTML.setForeground(new java.awt.Color(255, 255, 255));
        BtnReinicioHTML.setText("HTML");
        BtnReinicioHTML.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnReinicioHTML.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReinicioHTMLActionPerformed(evt);
            }
        });
        getContentPane().add(BtnReinicioHTML, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 160, 40));

        BtnToHtml.setBackground(new java.awt.Color(56, 56, 56));
        BtnToHtml.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnToHtml.setForeground(new java.awt.Color(255, 255, 255));
        BtnToHtml.setText("HTML");
        BtnToHtml.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnToHtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToHtmlActionPerformed(evt);
            }
        });
        getContentPane().add(BtnToHtml, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, 70, 40));

        BtnToPdf.setBackground(new java.awt.Color(56, 56, 56));
        BtnToPdf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnToPdf.setForeground(new java.awt.Color(255, 255, 255));
        BtnToPdf.setText("PDF");
        BtnToPdf.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnToPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnToPdfActionPerformed(evt);
            }
        });
        getContentPane().add(BtnToPdf, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 30, 80, 40));

        BtnVolver1.setText("Volver");
        BtnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolver1ActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 75, 60));

        BtnReinicioMarkdown.setBackground(new java.awt.Color(56, 56, 56));
        BtnReinicioMarkdown.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BtnReinicioMarkdown.setForeground(new java.awt.Color(255, 255, 255));
        BtnReinicioMarkdown.setText("Markdown");
        BtnReinicioMarkdown.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnReinicioMarkdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReinicioMarkdownActionPerformed(evt);
            }
        });
        getContentPane().add(BtnReinicioMarkdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 150, 40));

        TxtInfo1.setEditable(false);
        TxtInfo1.setBackground(new java.awt.Color(56, 56, 56));
        TxtInfo1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtInfo1.setForeground(new java.awt.Color(255, 255, 255));
        TxtInfo1.setText("Reinicio:");
        TxtInfo1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtInfo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 460, 20));

        TxtInfo.setEditable(false);
        TxtInfo.setBackground(new java.awt.Color(56, 56, 56));
        TxtInfo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtInfo.setForeground(new java.awt.Color(255, 255, 255));
        TxtInfo.setText("Escriba el nombre del Arhivo:");
        TxtInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 230, 20));

        TxtNombre.setBackground(new java.awt.Color(56, 56, 56));
        TxtNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxtNombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 30, 230, 40));

        TxtInfo2.setEditable(false);
        TxtInfo2.setBackground(new java.awt.Color(56, 56, 56));
        TxtInfo2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        TxtInfo2.setForeground(new java.awt.Color(255, 255, 255));
        TxtInfo2.setText("Exportar en:");
        TxtInfo2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(TxtInfo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 150, 20));
        getContentPane().add(LabelWallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTextoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtTextoKeyReleased

        texto = TxtTexto.getText();

        if (!contieneEtiquetasHtml5(texto)) {
            texto = convertMarkdownToHtml(texto);
            setTitle("Visualizador de HTML");
            BtnToPdf.setEnabled(true);
        } else {
            texto = limpieza(texto);
            setTitle("Visualizador de HTML - Markdown y PDF no soporta HTML5");
            BtnToPdf.setEnabled(false);
        }

        PanelHTML.setContentType("text/plain");
        PanelHTML.setContentType("text/html");
        PanelHTML.setText(limpieza(texto));
        PanelHTML.setCaretPosition(0);

    }//GEN-LAST:event_TxtTextoKeyReleased

    private void BtnReinicioHTML5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReinicioHTML5ActionPerformed

        TxtTexto.setText("<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                + "<title>Título de la Página</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Hola Mundo</h1>\n"
                + "</body>\n"
                + "</html>");

        texto = TxtTexto.getText();

        if (!contieneEtiquetasHtml5(texto)) {
            texto = convertMarkdownToHtml(texto);
            setTitle("Visualizador de HTML");
            BtnToPdf.setEnabled(true);
        } else {
            texto = limpieza(texto);
            setTitle("Visualizador de HTML - Markdown y PDF no soporta HTML5");
            BtnToPdf.setEnabled(false);

        }

        PanelHTML.setContentType("text/plain");
        PanelHTML.setContentType("text/html");
        PanelHTML.setText(TxtTexto.getText());

    }//GEN-LAST:event_BtnReinicioHTML5ActionPerformed

    private void BtnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolver1ActionPerformed
        new Inicio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnVolver1ActionPerformed

    private void BtnToPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToPdfActionPerformed

        if (TxtNombre.getText().matches(".*[\\\\/:*?\"<>|].*")) {
            JOptionPane.showMessageDialog(this, "El nombre del archivo contiene caracteres no permitidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String textoHtml = texto;

        if (!contieneEtiquetasHtml5(texto)) {
            String userHome = System.getProperty("user.home");
            String archivo = "/Desktop/archivo.pdf";

            if (!TxtNombre.getText().isEmpty()) {
                archivo = "/Desktop/" + TxtNombre.getText() + ".pdf";
            }

            String rutaArchivoPdf = userHome + archivo;

            Document documento = null;
            PdfWriter writer = null;

            try {
                documento = new Document();
                writer = PdfWriter.getInstance(documento, new java.io.FileOutputStream(rutaArchivoPdf));
                documento.open();
                com.itextpdf.tool.xml.XMLWorkerHelper.getInstance().parseXHtml(writer, documento,
                        new java.io.StringReader(textoHtml));
                JOptionPane.showMessageDialog(this, "PDF guardado en: " + rutaArchivoPdf);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al guardar el archivo PDF: " + e.getMessage());
            } finally {
                if (documento != null) {
                    documento.close();
                }
                if (writer != null) {
                    writer.close();
                }
            }
        } else {
            StringBuilder tagsNoCompatibles = new StringBuilder("¡ERROR!\nPDF no es compatible con HTML5");
            JOptionPane.showMessageDialog(null, tagsNoCompatibles.toString(), "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BtnToPdfActionPerformed

    private void BtnToHtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnToHtmlActionPerformed

        if (TxtNombre.getText().matches(".*[\\\\/:*?\"<>|].*")) {
            JOptionPane.showMessageDialog(this, "El nombre del archivo contiene caracteres no permitidos.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String contenidoHtml = texto;

        String userHome = System.getProperty("user.home");
        String archivo = "/Desktop/archivo.html";

        if (!TxtNombre.getText().isEmpty()) {
            archivo = "/Desktop/" + TxtNombre.getText() + ".html";
        }

        String rutaArchivo = userHome + archivo;

        try {
            java.nio.file.Files.write(java.nio.file.Paths.get(rutaArchivo), contenidoHtml.getBytes());
            javax.swing.JOptionPane.showMessageDialog(this, "Archivo guardado en: " + rutaArchivo);
        } catch (java.io.IOException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar el archivo: " + e.getMessage());
        }
    }//GEN-LAST:event_BtnToHtmlActionPerformed

    private void BtnReinicioHTMLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReinicioHTMLActionPerformed

        TxtTexto.setText("<!DOCTYPE html>\n"
                + "<html lang=\"es\">\n"
                + "<head>\n"
                + "<title>Título de la Página</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>Hola Mundo</h1>\n"
                + "</body>\n"
                + "</html>");

        texto = TxtTexto.getText();

        if (!contieneEtiquetasHtml5(texto)) {
            texto = convertMarkdownToHtml(texto);
            setTitle("Visualizador de HTML");
            BtnToPdf.setEnabled(true);
        } else {
            texto = limpieza(texto);
            setTitle("Visualizador de HTML - Markdown y PDF no soporta HTML5");
            BtnToPdf.setEnabled(false);
        }

        PanelHTML.setContentType("text/plain");
        PanelHTML.setContentType("text/html");
        PanelHTML.setText(TxtTexto.getText());

    }//GEN-LAST:event_BtnReinicioHTMLActionPerformed

    private void BtnReinicioMarkdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReinicioMarkdownActionPerformed

        TxtTexto.setText("# Hola Mundo");

        texto = TxtTexto.getText();

        if (!contieneEtiquetasHtml5(texto)) {
            texto = convertMarkdownToHtml(texto);
            setTitle("Visualizador de HTML");
            BtnToPdf.setEnabled(true);
        } else {
            texto = limpieza(texto);
            setTitle("Visualizador de HTML - Markdown y PDF no soporta HTML5");
            BtnToPdf.setEnabled(false);
        }

        PanelHTML.setContentType("text/plain");
        PanelHTML.setContentType("text/html");
        PanelHTML.setText(convertMarkdownToHtml(TxtTexto.getText()));

    }//GEN-LAST:event_BtnReinicioMarkdownActionPerformed

    public String convertMarkdownToHtml(String markdown) {
        Parser parser = Parser.builder().build();
        Node document = parser.parse(markdown);
        HtmlRenderer renderer = HtmlRenderer.builder().build();
        return renderer.render(document);
    }

    public static String limpieza(String texto) {
        org.jsoup.nodes.Document doc = Jsoup.parse(texto);
        doc.select("*:empty").remove();

        texto = texto.replaceAll("(?m)^[\\s&&[^\\n]]+$", "").replaceAll("\\n{2,}", "\n");

        return doc.html();
    }

    public boolean contieneEtiquetasHtml5(String texto) {
        List<String> etiquetasHtml5 = List.of(
                "<meta", "<script", "<nav", "<header", "<footer", "<section", "<article",
                "<aside", "<figure", "<figcaption", "<mark", "<progress", "<output",
                "<summary", "<time", "<main", "<template", "<dialog", "<link",
                "<audio", "<video", "<source", "<track", "<canvas", "<svg", "<math",
                "<wbr", "<details"
        );

        List<String> tiposInputHtml5 = List.of(
                "email", "date", "tel", "url", "search", "range", "color", "number",
                "datetime-local", "month", "week", "time", "datetime"
        );

        for (String etiqueta : etiquetasHtml5) {
            if (texto.contains(etiqueta)) {
                return true;
            }
        }

        for (String tipo : tiposInputHtml5) {
            if (texto.contains("<input type=\"" + tipo + "\"")) {
                return true;
            }
        }

        return false;
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
            java.util.logging.Logger.getLogger(Visualizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnReinicioHTML;
    private javax.swing.JButton BtnReinicioHTML5;
    private javax.swing.JButton BtnReinicioMarkdown;
    private javax.swing.JButton BtnToHtml;
    private javax.swing.JButton BtnToPdf;
    private javax.swing.JButton BtnVolver1;
    private javax.swing.JScrollPane Html;
    private javax.swing.JLabel LabelWallpaper;
    private javax.swing.JTextPane PanelHTML;
    private javax.swing.JScrollPane Text;
    private javax.swing.JTextField TxtInfo;
    private javax.swing.JTextField TxtInfo1;
    private javax.swing.JTextField TxtInfo2;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextArea TxtTexto;
    // End of variables declaration//GEN-END:variables

}
