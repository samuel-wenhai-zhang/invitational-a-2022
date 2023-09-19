import java.util.*;
import java.io.*;

public class Dhruv {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("dhruv.dat"));
        Map<Integer, String> radios = new HashMap<Integer, String>();
        for (int i = 0; i < 8; i++) {
            String s = in.next();
            int n = in.nextInt();
            in.nextLine();
            radios.put(n, s);
        }

        int n = in.nextInt();
        while (n-- > 0) {
            int frequency = in.nextInt();
            in.nextLine();
            if (frequency < 535 || frequency > 1605) {
                System.out.println("BAD INPUT");
            }
            else {
                int min = -1;
                for (int i : radios.keySet()) {
                    if (Math.abs(frequency - i) > min) {
                        min = Math.abs(frequency - i);
                    }
                    else if (Math.abs(frequency - i) == min) {
                        
                    }
                }
            }
        }
        
        in.close();
    }
}
