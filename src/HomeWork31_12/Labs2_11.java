package HomeWork31_12;

public class Labs2_11 {
    public static void main(String[] args) {
        double x = 0.5;
        double sum = 1;
        double a = 1;
        double eps = 1e-5;
        int i=1;
        while(Math.abs(a)>eps){
            a*=-x*(2*i+3)/(2*i);
            sum+=a;
            i++;
            System.out.println(a);
        }
        System.out.println(sum);
        System.out.println(1/Math.sqrt(Math.pow(1+x,5)));
    }
}
