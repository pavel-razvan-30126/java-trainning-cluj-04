package FizzBuzz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to compute: ");
        int x = scanner.nextInt();
        String result = compute(x);
        System.out.println(result);
        while (x != -1) {
            System.out.println("Enter number to compute: ");
            x = scanner.nextInt();
            result = compute(x);
            System.out.println(result);
        }

    }

    public static String compute(int number) {
        String stringNumber = "";
        if(number == 0){
            stringNumber = "0";
            return stringNumber;
        }
        if (number % 3 == 0) {
            stringNumber += "Foo";
        }
        if (number % 5 == 0) {
            stringNumber += "Bar";
        }
        if (number % 7 == 0) {
            stringNumber += "Qix";
        }
        int invert = 0;
        while (number != 0) {
            invert *= 10;
            invert += number % 10;
            number /= 10;
        }
        int digit;
        while (invert != 0) {
            digit = invert % 10;
            switch (digit) {
                case 3: {
                    stringNumber += "Foo";
                    break;
                }
                case 5: {
                    stringNumber += "Bar";
                    break;
                }
                case 7: {
                    stringNumber += "Qix";
                    break;
                }
                case 0:{
                }
            }
            invert /= 10;
        }
        if (stringNumber.equals("")) {
            stringNumber = number + "";
        }
        return stringNumber;
    }

   /* public static String compute2(int number){    //Nu merge.
        String stringNumber="";
        int invert = 0;
        while (number != 0) {
            invert *= 10;
            invert += number % 10;
            number /= 10;
        }
        while(invert != 0){
            if(invert%10 == 0) System.out.println("*");
            else{
                stringNumber += compute(invert%10);
            }
            invert /= 10;
        }
        if (stringNumber.equals("")) {
            stringNumber = number + "";
        }
        return stringNumber;
    }*/

}
