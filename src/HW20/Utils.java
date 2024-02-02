package HW20;

public class Utils {
    public static  int xPower(int x, int power){
        if(x == 0) {
            return -1;
        }
        int xpower = 1;
        for (int i = 1; i <= power ; i++) {
        xpower = xpower * x;



        }
        return xpower;


    }
    public static  int factorial(int number){

        if(number == 0){
            return -1;
        }
        int factrl = 1;
           for (int i = 1; i <= number; i++) {
               factrl = factrl * i;

           }

        return factrl;
        }

    public static int digitsCount(int number){
        int sum  = 0;
        while (number > 0){
            number = number/10;
            sum++;
        }
           return sum;
    }
    public static int evenDigitsCount(int number){

        if (number == 0){
            return number = 0;
        }
        if(number <0){
            number =  -number;
        }
        int sum = 0;
        while (number!=0){
            sum = sum + number%10;
            number =number/10;
        }


        return sum;
    }
}

