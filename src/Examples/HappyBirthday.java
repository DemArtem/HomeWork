package Examples;

import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        int money = 100;
        int age = scanner.nextInt();
        int years = 2023-age;
        if (years % 10 == 0 || years == 18) {
            System.out.println("Возраст: " + years + " - юбилей - дарим " + money + 50 + " руб.");
        }
        else {
            System.out.println("Возраст: " + years + " - не юбилей - дарим " + money + " руб.");
        }

        System.out.println("Где плазднуем? (Дом или Кафе)");
        String zero = "";
        String one = "Дом";
        String two = "Кафе";
        if (zero == two);
        System.out.println("");
    }
}
