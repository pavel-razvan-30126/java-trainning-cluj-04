package FizzBuzz;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList fizzBuzz = new ArrayList();
        for(int i = 1; i <= 100; i++){
            fizzBuzz.add(i-1,i);
            if(i % 3 == 0){
                fizzBuzz.set(i-1,"Fizz");
            }
            if(i % 5 == 0){
                fizzBuzz.set(i-1,"Buzz");
            }
            if(i % 5 == 0 && i % 3 == 0){
                fizzBuzz.set(i-1,"FizzBuzz");
            }
            if(i % 7 == 0){
                fizzBuzz.set(i-1,"Rizz");
            }
            if(i % 11 == 0){
                fizzBuzz.set(i-1,"Jazz");
            }
        }


        for(Object number : fizzBuzz){
            System.out.println(number);
        }

    }

}
