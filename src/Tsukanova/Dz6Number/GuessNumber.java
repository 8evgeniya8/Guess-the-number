package Tsukanova.Dz6Number;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        System.out.println("Гра \"Вгадай число\" (^‿^). В тебе є три спроби");
        int a = 0;
        int c = 2;
        int random = (int) (Math.random() * 11);
        while (true) {
            if (sca.hasNextInt()) {
                int userValue = sca.nextInt();
                a++;
                if (a <= c) {
                    if (userValue == random) {
                        System.out.println("WIN!!! ٩(｡•́‿•̀｡)۶");
                        break;
                    } else if (userValue > random) {
                        System.out.println("Введи число від 0 до 10 (◕‿◕)");
                        continue;
                    } else if (userValue != random) {
                        System.out.println("Ні (◕‿◕)");
                    }
                } else {
                    System.out.println("Я загадав :" + random);
                    System.out.println("Програв.Спробуй ще (◕‿◕)");
                    break;
                }
            } else {
                System.out.println("Введи лише цілі числа (◕‿◕)");
                sca.nextLine();
            }
            sca.nextLine();
        }
    }
}




