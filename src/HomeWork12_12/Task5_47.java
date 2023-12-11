package HomeWork12_12;
import java.util.Scanner;
/*
Даны числа a1, a2, a3, a4, a5, a6.
Определить их произведение.
*/
public class Task5_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите a1: ");
        int a1 = scanner.nextInt();
        System.out.print("Введите a2: ");
        int a2 = scanner.nextInt();
        System.out.print("Введите a3: ");
        int a3 = scanner.nextInt();
        System.out.print("Введите a4: ");
        int a4 = scanner.nextInt();
        System.out.print("Введите a5: ");
        int a5 = scanner.nextInt();
        System.out.print("Введите a6: ");
        int a6 = scanner.nextInt();
        int multi = a1*a2*a3*a4*a5*a6;
        System.out.println("Произведение всех чисел равно: " + multi);
    }
}
