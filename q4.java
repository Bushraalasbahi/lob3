import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter integer num less tn billion : ");
        if (in.hasNextLong()) {
            long p = in.nextLong();
            if (p < 0) {
                p *= -1;

            }

            if (p >= 10000000000l) {

                System.out.println("number is graeter or equals 10000000000!");
            } else {
                int digits = 1;
                if (p >= 10 && p < 100) {
                    digits = 2;
                } else if (p >= 100 && p < 1000) {
                    digits = 3;
                } else if (p >= 1000 && p < 10000) {
                    digits = 4;
                } else if (p >= 10000 && p < 100000) {
                    digits = 5;
                } else if (p >= 100000 && p < 1000000) {
                    digits = 6;
                } else if (p >= 1000000 && p < 10000000) {
                    digits = 7;
                } else if (p >= 100000000 && p < 100000000) {
                    digits = 8;
                } else if (p >= 100000000 && p < 1000000000) {
                    digits = 9;
                } else if (p >= 1000000000 && p < 10000000000l) {
                    digits = 10;
                }
                System.out.println("number of digits inthe num:" + digits);


            }
        } else {
            System.out.println("the num is not an integer");

        }
    }}