package az.edu.turing;

import java.util.Scanner;

public class Condition7 {

    public static void main (String[]args){
        //input
        System.out.print("Enter your work day: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String result="";
        //Prosess
        switch(number){
            case 1:
                result="Monday";
                break;
            case 2:
                result="Tursday";
                break;
            case 3:
                result="Wensday";
                break;
            case 4:
                result="Thursday";
                break;
            case 5:
                result="Firday";
                break;
            case 6:
                result="Saturday";
                break;
            case 7:
                result="Sunday";
                break;
        }
        //output
        System.out.print(result);
    }


}
