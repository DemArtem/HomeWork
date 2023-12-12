package HomeWork12_12;

import java.util.Scanner;

/*
В области 12 районов. Известны количество жителей каждого района (в тысячах человек)
и плотность населения в нем (тыс. чел./км2). Определить общую площадь территории области.
 */
public class Task5_65 {
    public static void main(String[] args) {
        //n-количество жителей; p-плотность населения; s-площадь;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество жителей 1го района (тыс.чел): ");
        double n1 = scanner.nextDouble();
        System.out.print("Введите плотность населения 1го района (тыс.чел/км2): ");
        double p1 = scanner.nextDouble();
        System.out.print("Введите количество жителей 2го района (тыс.чел): ");
        double n2 = scanner.nextDouble();
        System.out.print("Введите плотность населения 2го района (тыс.чел/км2): ");
        double p2 = scanner.nextDouble();
        System.out.print("Введите количество жителей 3го района (тыс.чел): ");
        double n3 = scanner.nextDouble();
        System.out.print("Введите плотность населения 3го района (тыс.чел/км2): ");
        double p3 = scanner.nextDouble();
        System.out.print("Введите количество жителей 4го района (тыс.чел): ");
        double n4 = scanner.nextDouble();
        System.out.print("Введите плотность населения 4го района (тыс.чел/км2): ");
        double p4 = scanner.nextDouble();
        System.out.print("Введите количество жителей 5го района (тыс.чел): ");
        double n5 = scanner.nextDouble();
        System.out.print("Введите плотность населения 5го района (тыс.чел/км2): ");
        double p5 = scanner.nextDouble();
        System.out.print("Введите количество жителей 6го района (тыс.чел): ");
        double n6 = scanner.nextDouble();
        System.out.print("Введите плотность населения 6го района (тыс.чел/км2): ");
        double p6 = scanner.nextDouble();
        System.out.print("Введите количество жителей 7го района (тыс.чел): ");
        double n7 = scanner.nextDouble();
        System.out.print("Введите плотность населения 7го района (тыс.чел/км2): ");
        double p7 = scanner.nextDouble();
        System.out.print("Введите количество жителей 8го района (тыс.чел): ");
        double n8 = scanner.nextDouble();
        System.out.print("Введите плотность населения 8го района (тыс.чел/км2): ");
        double p8 = scanner.nextDouble();
        System.out.print("Введите количество жителей 9го района (тыс.чел): ");
        double n9 = scanner.nextDouble();
        System.out.print("Введите плотность населения 9го района (тыс.чел/км2): ");
        double p9 = scanner.nextDouble();
        System.out.print("Введите количество жителей 10го района (тыс.чел): ");
        double n10 = scanner.nextDouble();
        System.out.print("Введите плотность населения 10го района (тыс.чел/км2): ");
        double p10 = scanner.nextDouble();
        System.out.print("Введите количество жителей 11го района (тыс.чел): ");
        double n11 = scanner.nextDouble();
        System.out.print("Введите плотность населения 11го района (тыс.чел/км2): ");
        double p11 = scanner.nextDouble();
        System.out.print("Введите количество жителей 12го района (тыс.чел): ");
        double n12 = scanner.nextDouble();
        System.out.print("Введите плотность населения 12го района (тыс.чел/км2): ");
        double p12 = scanner.nextDouble();
        double s1 = n1/p1;
        double s2 = n2/p2;
        double s3 = n3/p3;
        double s4 = n4/p4;
        double s5 = n5/p5;
        double s6 = n6/p6;
        double s7 = n7/p7;
        double s8 = n8/p8;
        double s9 = n9/p9;
        double s10 = n10/p10;
        double s11 = n11/p11;
        double s12 = n12/p12;
        double sum = s1+s2+s3+s4+s5+s6+s7+s8+s9+s10+s11+s12;
        System.out.println("Общая площадь всех районов (км2): " + sum);
    }
}
