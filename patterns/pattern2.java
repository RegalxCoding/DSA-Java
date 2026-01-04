import java.util.Scanner;

class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many numbers:");
        int n = sc.nextInt();

        // 3.pattern problem
        // for (int i = 1; i <= n; i++) {
        // // for spaces
        // for (int j = n; j >= i; j--) {
        // System.out.print(" ");
        // }
        // // for printing star
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 4.pattern problem
        for (int i = 1; i <= n; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
        /*
        ****
         ***
          **
           *
        */
    }
}
