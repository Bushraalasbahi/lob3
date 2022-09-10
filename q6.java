import javax.swing.*;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        System.out.println("progam for helping your weelk pay");
        System.out.println("pleas enter name: ");
        Scanner p=new Scanner(System.in);
        String name= p.next();
        System.out.println("enter your selary:"  );
        double selary= p.nextDouble();
        System.out.println("register how much hour you hav worked: ");
        int hour= p.nextInt();
        if (hour<=40)
            System.out.println("paycneck will be:  "+(selary*hour));
        else if (hour>40){
            System.out.println("paycneck="+((selary*40)+((hour-40)*(selary*(150.0/100.0)))));
        }
    }
}
