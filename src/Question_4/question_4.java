package Question_4;

import java.util.Scanner;

public class question_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = scanner.nextInt();
        int[][]a = new int[size][size];
        int n = size;
        for(int i=0; i<size;i++) {
            for(int j=(size-1);j>=0;j--) {
                a[i][j] = j + 1;
            }
        }
        System.out.println("Matrix: ");
        for(int i=0; i<size;i++) {
            for (int j = n; j >= (n - size + 1); j--) {
                System.out.print(a[i][Math.abs(size - j)] + "\t");
            }
            System.out.println();
            n++;

        }
    }
}
