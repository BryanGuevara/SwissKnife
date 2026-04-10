package bryanDev.util.config;

public class Configuration {

    public static int[] Color2(int[] Color1) {
        int[] Color2 = new int[3];

        float[] hsl = rgbToHsl(Color1);
        float L = hsl[2];
        int diferencia = 50;

        if (L > diferencia) {
            for (int i = 0; i < 3; i++) {
                Color2[i] = Math.max(Color1[i] - diferencia, 0);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                Color2[i] = Math.min(Color1[i] + diferencia, 255);
            }
        }

        return Color2;
    }

    public static int[] Color3(int[] Color1) {
        int[] Color3 = new int[3];

        float[] hsl = rgbToHsl(Color1);
        float L = hsl[2];
        int diferencia = 20;

        if (L > 50) {
            for (int i = 0; i < 3; i++) {
                Color3[i] = Math.max(Color1[i] - diferencia, 0);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                Color3[i] = Math.min(Color1[i] + diferencia, 255);
            }
        }

        return Color3;
    }

    public static int[] Color4(int[] Color1) {
        int[] Color4 = new int[3];

        float[] hsl = rgbToHsl(Color1);
        float L = hsl[2];
        int diferencia = 10;

        if (L > 50) {
            for (int i = 0; i < 3; i++) {
                Color4[i] = Math.max((255 - Color1[i]) - diferencia, 0);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                Color4[i] = Math.min((255 - Color1[i]) + diferencia, 255);
            }
        }

        return Color4;
    }

    public static int[] Color5(int[] Color1) {
        int[] Color5 = new int[3];

        int Promedio = (Color1[0] + (Color1[1] * 2) + Color1[2]) / 4;

        if (Promedio > 75) {
            Color5[0] = 0;
            Color5[1] = 0;
            Color5[2] = 0;
        } else {
            Color5[0] = 255;
            Color5[1] = 255;
            Color5[2] = 255;
        }
        return Color5;
    }

    public static int[] Color6(int[] Color1) {
        int[] Color6 = new int[3];
        int minimo = 5;

        float[] hsl = rgbToHsl(Color1);
        float L = hsl[2];

        if (L <= minimo) {
            return Color1;
        }

        hsl[2] = minimo;

        Color6 = hslToRgb(hsl);

        return Color6;
    }

    public static int[] Color7(int[] Color1) {
        int[] Color7 = new int[3];
        int maximo = 80;

        float[] hsl = rgbToHsl(Color1);
        float L = hsl[2];

        if (L >= maximo) {
            return Color1;
        }

        hsl[2] = maximo;

        Color7 = hslToRgb(hsl);

        return Color7;
    }

    public static float[] rgbToHsl(int[] rgb) {
        float r = rgb[0] / 255f;
        float g = rgb[1] / 255f;
        float b = rgb[2] / 255f;

        float max = Math.max(r, Math.max(g, b));
        float min = Math.min(r, Math.min(g, b));
        float delta = max - min;

        float h = 0;
        float s = 0;
        float l = (max + min) / 2;

        if (delta != 0) {
            if (max == r) {
                h = (g - b) / delta;
            } else if (max == g) {
                h = (b - r) / delta + 2;
            } else {
                h = (r - g) / delta + 4;
            }
            s = (l > 0.5f) ? (delta / (2 - max - min)) : (delta / (max + min));
        }

        h = (h * 60) % 360;
        if (h < 0) {
            h += 360;
        }

        return new float[]{h, s, l * 100};
    }

    public static int[] hslToRgb(float[] hsl) {
        float h = hsl[0];
        float s = hsl[1];
        float l = hsl[2] / 100;

        float c = (1 - Math.abs(2 * l - 1)) * s;
        float x = c * (1 - Math.abs((h / 60) % 2 - 1));
        float m = l - c / 2;

        float r = 0, g = 0, b = 0;
        if (h >= 0 && h < 60) {
            r = c;
            g = x;
            b = 0;
        } else if (h >= 60 && h < 120) {
            r = x;
            g = c;
            b = 0;
        } else if (h >= 120 && h < 180) {
            r = 0;
            g = c;
            b = x;
        } else if (h >= 180 && h < 240) {
            r = 0;
            g = x;
            b = c;
        } else if (h >= 240 && h < 300) {
            r = x;
            g = 0;
            b = c;
        } else {
            r = c;
            g = 0;
            b = x;
        }

        r = (r + m) * 255;
        g = (g + m) * 255;
        b = (b + m) * 255;

        return new int[]{Math.round(r), Math.round(g), Math.round(b)};
    }

    public static int fontHeight(int Width, int Height, int Largo) {
        return Math.max(Math.min((Width + Height) / (10 + Largo), 30), 15);
    }
}
