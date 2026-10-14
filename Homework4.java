import java.util.Scanner;

public class Homework4 {

    // Calculate the GCD recursively using the modulo operation.
    static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        int smaller = Math.min(m, n);
        int larger = Math.max(m, n);

        return gcd(smaller, larger % smaller);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int result = gcd(m, n);

        System.out.printf("두 수의 최대공약수는 %d입니다.%n", result);

        sc.close();
    }
}