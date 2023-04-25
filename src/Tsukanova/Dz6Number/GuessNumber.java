package Tsukanova.Dz6Number;

import java.util.Scanner;

class GuessNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Вгадай число від 0 до 10");
        System.out.println("В тебе є 3 спроби");
        int random = (int) (Math.random() * 11);
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
                    int userValue = sca.nextInt();
                    if (userValue >= 0 && userValue <= 10) {
                        System.out.println("Введене число = " + userValue);
                    }
                    if (userValue == random) {
                        System.out.println("WIN!!! (^‿^)");
                        break;
                    } else if (userValue > 10) {
                        System.out.println("Введи число від 0 до 10");
                        continue;
                    } else if (userValue != random) {
                        System.out.println("Не вгадав (◕‿◕)");
                    }
                } else {
                    System.out.println("Помилка.Введи число");
                }
                sca.nextLine();
            }

        }


    }
}


