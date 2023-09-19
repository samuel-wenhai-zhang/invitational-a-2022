import java.util.*;
import java.io.*;

public class Carolina {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("carolina.dat"));
        ArrayList<Double> costs = new ArrayList<Double>();
        ArrayList<Double> purchases = new ArrayList<Double>();

        while (in.hasNextLine()) {
            double cost = in.nextDouble();
            String name = in.nextLine();
            name = name.substring(1);
            double tax = Math.round(cost * .0825 * 100) / 100.0;
            double total = cost + tax;
            costs.add(cost);
            purchases.add(total);
            System.out.printf("$%.2f + $%.2f = $%.2f %s%n", cost, tax, total, name);
        }


        double total = 0;
        for (double cost : costs) {
            total += cost;
        }
        System.out.printf("$%.2f + $%.2f = $%.2f Combined Single Purchase%n", total, total * .0825, total * 1.0825);

        double total2 = 0;
        for (double purchase : purchases) {
            total2 += purchase;
        }
        System.out.printf("$%.2f Sum of Individual Purchases", total2);
    }
}
