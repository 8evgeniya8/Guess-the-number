package Tsukanova.Dz6Number;

import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        // У Японії числа 4 та 9 вважаються нещасливими.
        // Вам потрібно пронумерувати 100 космічних шатлів для перевезення людей на Марс так, щоб у номерах шатлів не траплялося нещасливих чисел.
        // Напишіть функцію, яка виводить усі номери таких шатлів.


        int counter = 0;


        // version 1
//        for (int i = 50000; counter < 100; i++) {
//            if ((String.valueOf(i).contains("4") || String.valueOf(i).contains("9"))) {
//                continue;
//            }
//            System.out.println("shuttle number: " + i);
//            counter++;
//        }


        for (int i = 1; counter < 100; i++) {
            boolean ok = true;
            int number = i;
            while (number > 0) {
                int result = number % 10;
                if (result == 4 || result == 9) {
                    ok = false;
                    break;
                }
                number /= 10;
            }
            if (ok) {
                System.out.println("shuttle number: " + i);
                counter++;
            }
        }
        System.out.println("count shuttle = " + counter);

    }
}

