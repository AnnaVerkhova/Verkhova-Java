package TZ;

import java.util.Scanner;

public class Zadanie2 {

    public static void main(String[] args) {

        System.out.println("Insert your name");
        Scanner insertName = new Scanner(System.in);
        String name = insertName.nextLine();
        switch (name) {
            case "вячеслав":
                System.out.println("Введите имя с большой буквы");
                break;
            case "Вячеслав":
                System.out.println("Привет, Вячеслав");
                break;
            default:
                System.out.println("Нет такого имени");
                break;
        }
    }
}
