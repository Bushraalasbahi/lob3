import java.util.Arrays;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in=new Scanner (System.in);
        System.out.print("enter the number : ");
        int n= in.nextInt();
        if (n>0)
        {
            System.out.println("number is postive");
        }
        else if (n<0)
        {
            System.out.println("number is negative");
        }
       else
       {
           System.out.println("number is zero");
        }

    }
}
