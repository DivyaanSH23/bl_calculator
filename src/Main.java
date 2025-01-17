import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("WELCOME TO CALCULATOR");
        System.out.println("FIND THE NUMBER ARE DIVIDED BY 5 OR NOT");
        Scanner sc=new Scanner (System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        if(i%5==0 && j%5==0)
        System.out.println(i+" and "+j+" both are divided by 5");
        else if(i%5==0)
            System.out.println("Only "+i+" is divided by 5");
        else if(j%5==0)
            System.out.println("Only "+j+" is divided by 5");
        else
            System.out.println("BOTH ARE NOT DIVIDED BY 5");

    }
    }
