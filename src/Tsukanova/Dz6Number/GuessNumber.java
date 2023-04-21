package Tsukanova.Dz6Number;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Вгадай число від 0 до 10");
        System.out.println("В тебе є 3 спроби");
        int a = 0;
        int b = 4;

        while (true) {
            a++;
            if (a >= b) {
                System.out.println("Гра закінчилась,спробуй ще");
                break;
            }
            if (a < b) {
                if (sca.hasNextInt()) {
                    int random = (int) (Math.random() * 11);
                    int userValue = sca.nextInt();
                    if (userValue >= 0 && userValue <= 10) {
                        System.out.println("Введене число = " + userValue);
                        System.out.println("Moє задуманне число: " + random);
                    }
                    if (userValue == random) {
                        System.out.println("WIN!!! (^‿^)");
                    } else if (userValue > random) {
                        System.out.println("Введи число від 0 до 10");
                    } else if (userValue != random) {
                        System.out.println("Програв (◕‿◕)");
                    }
                } else {
                    System.out.println("Помилка.Спробуй знову");
                }
            }
            sca.nextLine();
        }


    }
}




