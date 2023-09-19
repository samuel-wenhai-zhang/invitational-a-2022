import java.util.*;
import java.io.*;

public class Carolina {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("carolina.dat"));
        while (in.hasNextLine()) {
            double cost = in.nextDouble();
            String name = in.nextLine();
            name = name.substring(1);
            System.out.println(cost);
            System.out.println(name);
        }
    }
}
