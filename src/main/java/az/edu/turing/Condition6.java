package az.edu.turing;

import java.util.Scanner;

public class Condition6 {

    public static void main (String[]args){
    //input
        System.out.print("Yaşınızı daxil edin: ");
        Scanner scanner =new Scanner(System.in);
        int number= scanner.nextInt();
        //prosess
        String result="";
        if(number<18){
            result="You are not adult";
        }else if(number>18 && number<30){
            result="You are young an adult";
        }else if(number>31 && number<50){
            result="Your are amn adult";
        }else
            result="You are old person";
        //output
        System.out.print(result);
    }
}
