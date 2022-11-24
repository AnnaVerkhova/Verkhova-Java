package TZ;

import java.util.Scanner;

public class Zadanie1 {

    public static void main(String[] args) {
        System.out.println("Insert your number");
        Scanner insertNumber = new Scanner(System.in);
        int number = insertNumber.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        } else if (number < 7) {
            System.out.println("Попробуйте еще раз");
        } else {
            System.out.println("Вы ввели число 7 ,попробуйте еще раз");
        }
    }

}
