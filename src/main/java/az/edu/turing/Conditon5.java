package az.edu.turing;

import java.util.Scanner;

public class Conditon5 {

    public static void main(String[] args) {
        //input
        System.out.print("Ədəd daxil edin: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //prosess
        String result="";
        if(number>0){
            result="Müsbət ədəd";
        }else if (number<0){
            result="Mənfi ədəd";
        }else
            result="Sıfır";
        //output
        System.out.print(result);
    }
}
