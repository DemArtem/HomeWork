package Examples;

public class CiclFor {
    public static void main(String[] args) {
        int i = 1;
        for (; i<9;){
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
            i++;
        }
    }
}