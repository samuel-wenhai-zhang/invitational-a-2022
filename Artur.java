public class Artur {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            String str = "";
            for (int j = 0; j < 20 - i; j++) {
                str += " ";
            }
            str += "/";
            for (int j = 0; j < i - 1; j++) {
                if (i % 4 == 0) {
                    str += "--";
                }
                else {
                    str += "  ";
                }
            }
            str += "\\";
            if ((i - 2) % 4 == 0) {
                str += "--->";
                double n = .01 * Math.pow(10, (i-2)/4);
                int var = 2 - (i - 2) / 4;
                if (var > 0) {
                    str += String.format("%." + var + "f%%", n);
                }
                else {
                    str += String.format("%d%%", (int)n);
                }
            }
            System.out.println(str);
        }
    }
}