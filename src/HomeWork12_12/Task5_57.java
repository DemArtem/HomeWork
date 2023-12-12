package HomeWork12_12;
import java.util.Scanner;
/*
Известны оценки двух учеников по четырем предметам. Определить сумму
оценок каждого ученика.
 */
public class Task5_57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку Васи по математике: ");
        int a1 = scanner.nextInt();
        System.out.print("Введите оценку Васи по русскому: ");
        int a2 = scanner.nextInt();
        System.out.print("Введите оценку Васи по химии: ");
        int a3 = scanner.nextInt();
        System.out.print("Введите оценку Васи по биологии: ");
        int a4 = scanner.nextInt();
        int sum = a1+a2+a3+a4;
        System.out.println("Сумма оценок Васи: " + sum);

        System.out.print("Введите оценку Коли по математике: ");
        int b1 = scanner.nextInt();
        System.out.print("Введите оценку Коли по русскому: ");
        int b2 = scanner.nextInt();
        System.out.print("Введите оценку Коли по химии: ");
        int b3 = scanner.nextInt();
        System.out.print("Введите оценку Коли по биологии: ");
        int b4 = scanner.nextInt();
        int sum2 = b1+b2+b3+b4;
        System.out.println("Сумма оценок Коли: " + sum2);
    }
}
