import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner input = new Scanner(System.in);
        System.out.println("enter first number");
        num1 = input.nextDouble();
        System.out.println("enter scand number");
        num2 = input.nextDouble();
        System.out.println("enter therd number");
        num3 = input.nextDouble();
        if ((num1 <= num2 && num2 < num3) || (num1 < num2 && num2 <= num3) || (num1 > num2 && num2 >= num3) || (num1 >= num2 && num2 > num3))
        {
            System.out.println("in order");
        } else
        {
            System.out.println("no in order");
        }
        input.close();
    }}