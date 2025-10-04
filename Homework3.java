import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        size = scanner.nextInt();
        int[] num = new int[size];

        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < size; i++) {
            num[i] = scanner.nextInt();
        }

        int max = num[0];
        int min = num[0];

        for (int j = 1; j < size; j++) {
            if (num[j] > max) {max = num[j];}
            if (num[j] < min) {min = num[j];}
        }

        System.out.printf("최대값: %d\n", max);
        System.out.printf("최소값: %d\n", min);
    }
}
