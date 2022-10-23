public class Main {
    public static void main(String[] args) {

        //Домашнее задание 1.5. Массивы. Часть 1
        System.out.println("Домашнее задание 1.5. Массивы. Часть 1.");
        //Задача 1

        //1.
        int [] boxes = new int [3];
        boxes [0] = 1;
        boxes [1] = 2;
        boxes [2] = 3;

        int numberOne = boxes [0];
        int numberTwo = boxes [1];
        int numberThree = boxes [2];

        //2.
        double [] arrayNumberTwo = {1.57, 7.654, 9.986};
        double one = arrayNumberTwo [0];
        double two = arrayNumberTwo [1];
        double three = arrayNumberTwo [2];

        //3.
        char [] arrayNumberThree = {1124, 1122, 1121, 1117, 1110};
        char arrayIndexZero = arrayNumberThree [0];
        char arrayIndexOne = arrayNumberThree [1];
        char arrayIndexTwo = arrayNumberThree [2];
        char arrayIndexThree = arrayNumberThree [3];
        char arrayIndexFour = arrayNumberThree [4];

        //Задача 2
        System.out.println("Задача 2");
        System.out.print("1: ");
        for (int i = 0; i < boxes.length; i++) {
            if (i == boxes.length - 1) {
                System.out.print(boxes[i] + ";");
            } else {
                System.out.print(boxes[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("2: ");
        for (int i = 0; i < arrayNumberTwo.length; i++) {
            if (i == arrayNumberTwo.length - 1) {
                System.out.print(arrayNumberTwo[i] + ";");
            } else {
                System.out.print(arrayNumberTwo[i] + ", ");
            }
        }
        System.out.println();
        System.out.print("3: ");
        for (int i = 0; i < arrayNumberThree.length; i++) {
            if (i == arrayNumberThree.length - 1) {
                System.out.print(arrayNumberThree[i] + ";");
            } else {
                System.out.print(arrayNumberThree[i] + ", ");
            }
        }
        System.out.println();

        // Задача 3
        System.out.println("Задача 3");
        System.out.print("1: ");
        for (int i = boxes.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(boxes[i] + ";");
            } else {
                System.out.print(boxes[i] + ", ");
            }
        }

        System.out.println();
        System.out.print("2: ");
        for (int i = arrayNumberTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayNumberTwo[i] + ";");
            } else {
                System.out.print(arrayNumberTwo[i] + ", ");
            }
        }

        System.out.println();
        System.out.print("3: ");
        for (int i = arrayNumberThree.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(arrayNumberThree[i] + ";");
            } else {
                System.out.print(arrayNumberThree[i] + ", ");
            }
        }
        System.out.println();

        // Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] % 2 == 0) {
                System.out.println(boxes[i]);
            } else {
                System.out.println(boxes[i] + 1);
            }
        }
    }
}