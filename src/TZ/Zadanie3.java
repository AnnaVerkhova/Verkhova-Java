package TZ;

public class Zadanie3 {

    public static void main(String[] args) {

        int[] array = new int[100];
        System.out.println("Вывести длину массива");
        System.out.println(array.length);
        System.out.println("Вывести элементы массива кратные числу 3");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i != 0 && i % 3 == 0)
                System.out.print(i + " ,");
        }
    }
}

