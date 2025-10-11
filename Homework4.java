import java.util.Scanner;

public class Homework4 {
    int gcd(int m, int n) {
        if (n == 0) {return m;}
        else if (m < n) {return gcd(m, n % m);}
        else {return gcd(n, m % n);}
    }
    int gcdLoop(int m, int n) {
        if (n == 0) {return m;}
        else if (m < n) {
            while (m != 0) {
                int r = n % m;
                n = m;
                m = r;
            }
            return n;
        }
        else {
            while (n != 0) {
                int r = m % n;
                m = n;
                n = r;
            }
            return m;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2;

        System.out.print("두 수를 입력하세요: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        Homework4 gcd = new Homework4();
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", gcd.gcd(num1, num2));
        System.out.println();
        System.out.println("---반복문 사용---");
        System.out.printf("두 수의 최대공약수는 %d입니다.", gcd.gcdLoop(num1, num2));
    }
}