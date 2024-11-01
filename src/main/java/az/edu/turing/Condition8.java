package az.edu.turing;

import java.util.Scanner;

public class Condition8 {

    public static void main (String[]args){
        //input
        System.out.println("Enter first number : ");
        Scanner scanner = new Scanner(System.in);
        int number1=scanner.nextInt();
        System.out.println("Enter second number : ");
        int number2=scanner.nextInt();
        //prosess
        String result="";
        if(number1==number2){
            result="This two numbers equal to each other";
        }else
            result="This two number not equal to each other";
        //output
        System.out.print(result);

    }
}
