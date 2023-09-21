import java.util.*;
import java.io.*;

public class Harold {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("harold.dat"));
        int n = in.nextInt();
        in.nextLine();
        while (n-- > 0) {
            int num = in.nextInt();
            String temp = Integer.toString(num);
            int places = temp.length() - 1;
            int index = 0;
            while (index < temp.length()) {
                if (temp.charAt(index) == '0') {
                    break;
                }
                index++;
            }
            
            String coefficient = temp.substring(0, 1);
            if (index != 1) {
                coefficient += "." + temp.substring(1, index);
            }
            System.out.println(num + "=" + coefficient + "*10^" + places);
        }
        in.close();
    }
}
