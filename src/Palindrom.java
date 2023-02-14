
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Palindrom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String symbol = scan.nextLine();
        String s = symbol.replaceAll("[^a-zA-Zа-яА-я0-9]", "");
        char[] array = s.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        if (result.equalsIgnoreCase(s)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
