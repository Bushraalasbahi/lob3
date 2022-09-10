import java.util.Arrays;
import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int number_of_Daysinmonth =0;
        String Monthofname="unknown";
        System.out.println("input a MANTH NUMBER : ");
        int month=input.nextInt();
        System.out.println("input a year : ");
        int year=input.nextInt();
        switch (month){
            case 1:
                Monthofname ="january";
                number_of_Daysinmonth=31;
                break;
            case 2:
                Monthofname="february";
                if ((year%400==0)||((year%4==0)&&(year%100!=0))){
                    number_of_Daysinmonth =29;
            }else {
                    number_of_Daysinmonth=28;
                }
            case 3:
                Monthofname="march";
                number_of_Daysinmonth=31;
                break;
            case 4:
                Monthofname="April";
                number_of_Daysinmonth=30;
                break;
            case 5:
                Monthofname="MAY";
                number_of_Daysinmonth=31;
                break;
            case 6:
                Monthofname="JUNE";
                number_of_Daysinmonth=30;
                break;
            case 7:
                Monthofname="JULY";
                number_of_Daysinmonth=31;
                break;
            case 8:
                Monthofname="AUGUST";
                number_of_Daysinmonth=31;
                break;
            case 9:
                Monthofname="SEPTEMBER";
                number_of_Daysinmonth=30;
                break;
            case 10:
                Monthofname="OCTOBET";
                number_of_Daysinmonth=31;
                break;
            case 11:
                Monthofname="NOVAMBER";
                number_of_Daysinmonth=30;
                break;
            case 12:
                Monthofname="DESAMBER";
                number_of_Daysinmonth=31;
                break;

        }
        System.out.println(Monthofname+" "+year+" has "+number_of_Daysinmonth+"days\n");

    }
}
