import java.util.*;
import java.io.*;

public class Eva {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("eva.dat"));
        int n = in.nextInt();
        in.nextLine();
        for (int i = 1; i <= n; i++) {
            int height = in.nextInt();
            System.out.println("Start of Triangle #" + i);
            int stars = 1;
            int spaces = height - 1;
            for (int j = 1; j <= height; j++) {
                String line = "";
                for (int k = 0; k < spaces; k++) {
                    line += " ";
                }
                spaces--;
                for (int k = 0; k < stars; k++) {
                    line += "*";
                }
                stars += 2;
                System.out.println(line);
            }
            System.out.println("End of Triangle #" + i);
        }
        in.close();
    }
}
