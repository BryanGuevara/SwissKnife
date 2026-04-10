package bryanDev.util.config;

public class StylePanel {

    public String CSS() {
        String baseHex = rgbToHex(GlobalStyle.Color6.clone());
        String color4Hex = rgbToHex(GlobalStyle.Color7.clone());
        String color5Hex = rgbToHex(new int[]{200, 200, 200});
        String hoverColorHex = rgbToHex(GlobalStyle.Color3.clone());

        return "<style>"
                + "body {"
                + "   background-color: " + baseHex + ";" // Fondo principal
                + "   color: " + color5Hex + ";" // Color de texto general (más suave)
                + "   font-family: Arial, sans-serif;"
                + "   padding: 20px;"
                + "}"
                + "h1, h2, h3, h4, h5, h6 {"
                + "   color: " + color4Hex + ";" // Títulos y encabezados
                + "   text-align: center;"
                + "   font-size: 2em;"
                + "}"
                + "h1 {"
                + "   border-bottom: 4px solid " + color4Hex + ";" // Línea debajo del título
                + "   margin: 30px 0 10px;"
                + "   font-size: 3em;"
                + "}"
                + "h2 {"
                + "   color: " + color4Hex + ";" // Títulos secundarios
                + "   text-decoration: underline;"
                + "   text-decoration-color: " + color4Hex + ";" // Color de subrayado
                + "   margin: 25px 0 10px;"
                + "}"
                + "h3 {"
                + "   color: " + color4Hex + ";" // Títulos terciarios
                + "   text-decoration: underline;"
                + "   text-decoration-color: " + color5Hex + ";" // Subrayado con un color diferente
                + "   margin: 20px 0 10px;"
                + "}"
                + "h4, h5, h6 {"
                + "   color: " + color5Hex + ";" // Títulos más pequeños (menos importantes)
                + "   margin: 10px 0 0;"
                + "   font-size: 1.5em;"
                + "}"
                + "strong {"
                + "   color: " + color4Hex + ";" // Resaltar texto importante
                + "   font-weight: bold;"
                + "}"
                + "a {"
                + "   color: " + color4Hex + ";" // Enlaces
                + "   text-decoration: none;"
                + "}"
                + "a:hover {"
                + "   background-color: " + hoverColorHex + ";" // Hover en enlaces
                + "   color: " + color5Hex + ";" // Texto en hover
                + "   text-decoration: underline;"
                + "}"
                + "button {"
                + "   background-color: " + color4Hex + ";" // Fondo de botones
                + "   color: " + baseHex + ";" // Texto de botones
                + "   border: none;"
                + "   padding: 10px 20px;"
                + "   font-size: 1.2em;"
                + "   cursor: pointer;"
                + "}"
                + "button:hover {"
                + "   background-color: " + hoverColorHex + ";" // Hover en botones
                + "   color: " + color5Hex + ";" // Texto en hover
                + "}"
                + "ul {"
                + "   list-style-type: disc;"
                + "   padding-left: 20px;"
                + "}"
                + "li {"
                + "   margin: 5px 0;"
                + "}"
                + "</style>";
    }

    private String rgbToHex(int[] color) {
        return String.format("#%02X%02X%02X", color[0], color[1], color[2]);
    }
}
