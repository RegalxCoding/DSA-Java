import java.util.Scanner;

class pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many num:");
        int n = sc.nextInt();

        // 9. number pattern
        /*
         * 1
         * 12
         * 123
         * 1234
         */
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j);
        // }
        // System.out.println();
        // }

        //10. number increasing pattern
        /*
        1
        2 3
        4 5 6
        7 8 9 10
         */
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count += 2;
            }
            System.out.println();
        }

        sc.close();
    }
}
