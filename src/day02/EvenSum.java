package day02;

public class EvenSum {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);

        int sum2 = 0;
        for (int i = 2; i <= 100; i += 2) {
            sum2 += i;
        }
        System.out.println(sum2);

        int i;
        int j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= 9; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}