import java.util.*;
public class smallest {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THREE NUMBERS FOR FINDING THE SMALLEST ONE ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();

        int l=Math.min(i,j);
        int m=Math.min(l,k);

        System.out.println("THE SMALLEST NUMBER IS "+m);

    }

}
