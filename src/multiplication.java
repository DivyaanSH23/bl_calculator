import java.util.Scanner;

public class multiplication {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER THREE NUMBERS FOR MULTIPLICATION");
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();

        int z=i*j*k;
        System.out.println("THE RESILT IS : "+z);

    }

}
