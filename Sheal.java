import java.util.*;
import java.io.*;

public class Sheal {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("sheal.dat"));
        int t = in.nextInt();
        in.nextLine();
        while (t-- > 0) {
            String s = in.next();
            int k = in.nextInt();
            HashSet<String> perms = new HashSet<String>();
            StringBuilder letters = new StringBuilder(s);
            backtrack(letters, 0, letters.length(), perms);
            TreeSet<String> words = new TreeSet<String>();
            for (String str: perms) {
                for (int i = 0; i < str.length(); i++) {
                    words.add(str.substring(i));
                }
            }
            words.toArray(new String[1])
            Object[] wordArray = words.toArray();
            System.out.println(wordArray[k-1]);
        }
        in.close();
    }

    public static void backtrack(StringBuilder s, int index, int length, Set<String> perms) {
        if (index == length) {
            perms.add(s.toString());
        }
        else {
            for (int i = index; i < length; i++) {
                swap(s, index, i);
                backtrack(s, index + 1, length, perms);
                swap(s, index, i);
            }
        }
    }

    public static void swap(StringBuilder s, int i, int j) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }
}
