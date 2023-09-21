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
        System.out.println(radios);

        int n = in.nextInt();
        while (n-- > 0) {
            int frequency = in.nextInt();
            in.nextLine();
            if (frequency < 535 || frequency > 1605) {
                System.out.println("BAD INPUT");
            }
            else {
                int minDist = -1;
                int closest = -1;
                for (int radio : radios.keySet()) {
                    int dist = Math.abs(frequency - radio);
                    if (minDist == -1 || dist < minDist) {
                        minDist = dist;
                        closest = radio;
                    }
                    else if (dist == minDist) {
                        if (closest == -1 || radio > closest) {
                            closest = radio;
                        }
                    }
                }
                System.out.println(radios.get(closest));
            }
        }
        
        in.close();
    }
}


