package Examples;

import java.util.Scanner;

public class HappyBirthday {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите год рождения: ");
        int age = scanner.nextInt();
        System.out.print("Где празднуем? (Дом - 1 или Кафе - 2) ");
        boolean place = scanner.hasNext();

        int money100 = 100;
        int money150 = money100 + 50;
        int money200 = money100 + 100;
        int money250 = money100 + 150;
        int years = 2023-age;
        boolean house = true;
        boolean cafe = true;

        if ((years % 10 == 0 || years == 18) && house) {
            System.out.println("Возраст: " + years + " - Юбилей - дарим " + money200+ " руб.");
        } else if((years % 10 == 0 || years == 18) && cafe) { // считает неправильно
            System.out.println("Возраст: " + years + " - Юбилей - дарим " + money250+ " руб.");
        } else if((years % 10 != 0 || years != 18) && house) {
            System.out.println("Возраст: " + years + " - Дарим " + money100+ " руб.");
        } else if((years % 10 != 0 || years != 18) && cafe) { // считает неправильно
            System.out.println("Возраст: " + years + " - Дарим " + money150 + " руб.");
        } else {
            System.out.println("Вы что-то не то ввели");
        }
    }
}
