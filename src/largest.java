import java.util.*;
public class largest {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THREE NUMBERS FOR FINDING THE LARGEST ONE ");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();

        int l=Math.max(i,j);
        int m=Math.max(l,k);

        System.out.println("THE LARGEST NUMBER IS "+m);

    }

}
