import java.util.*;
import java.util.stream.IntStream;
import java.io.*;

public class Ishika {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("ishika.dat"));
        int n = in.nextInt();
        in.nextLine();
        while (n-- > 0) {
            int t = in.nextInt();
            ArrayList<Integer> lengths = new ArrayList<Integer>();
            for (int i = 0; i < t; i++) {
                lengths.add(in.nextInt());
            }
            // int[] lengths = Arrays.stream(in.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            // int[] sorted = IntStream.of(lengths).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();

            int min = -1;
            for (int i = 0; i < lengths.size(); i++) {
                for (int j = i + 1; j < lengths.size(); j++) {
                    int sum = lengths.get(i) + lengths.get(j);
                    if (sum >= 20 && min == -1) {
                        min = sum;
                    }
                    if (sum >= 20 && sum < min) {
                        min = sum;
                    }
                }
            }
            
            if (min < 20) {
                System.out.println("NOT POSSIBLE");
            }
            else {
                System.out.println(min);
            }
        }
        in.close();
    }
}
