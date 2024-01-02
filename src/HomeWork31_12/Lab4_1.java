package HomeWork31_12;

public class Lab4_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 2, 0, 5};

        boolean flag = true; //Предположим, что последовательность возрастающая
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i] >= arr[i + 1]) {
                flag = false;
                break;
            }
        System.out.println("1. " + flag);
    }
}
