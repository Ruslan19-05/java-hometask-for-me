package az.edu.turing;

import java.util.Scanner;

public class Condition9 {

    public static void main (String[]args){
        //input
        System.out.println("Enter mounths number : ");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        String result="";
        switch(number){
            case 1:
                result="Yanvar-31 day";
                break;
            case 2:
                result="Fevral-28 day";
                break;
            case 3:
                result="Mart-31 day";
                break;
            case 4:
                result="April-30 day";
                break;
            case 5:
                result="May-31 day";
                break;
            case 6:
                result="Iyul-30 day";
                break;
            case 7:
                result="Iyul-31 day";
                break;
            case 8:
                result="Avgust-31 day";
                break;
            case 9:
                result="Sentyabr-30 day";
                break;
            case 10:
                result="Oktyabr-31 day";
                break;
            case 11:
                result="Noyabr-30 day";
                break;
            case 12:
                result="Dekabr-31 day";
                break;
            default:
                result="12 dene ay avr";
        }
        //output
        System.out.print(result);

    }
}
