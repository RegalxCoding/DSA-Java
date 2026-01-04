import java.util.Scanner;

class pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int n = sc.nextInt();

        // 1. right triangle
        // for (int i = 1; i <= n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // 2. reverse right triangle
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}