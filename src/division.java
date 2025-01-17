import java.util.*;

public class division {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS FOR DIVISION");
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = i / j;
        int l = i % j;
        System.out.println("THE QUOTIENT IS =" + k + ",AND REMAINDER IS =" + l);
    }
}
