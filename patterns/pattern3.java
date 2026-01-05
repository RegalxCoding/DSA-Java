import java.util.Scanner;

class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many num:");
        int n = sc.nextInt();

        // 5. pattern problem (tree)
        /*
             * 
            * *
           * * *
          * * * *
        */
        for (int i = 1; i <= n; i++) {
            for (int k = 4; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        

        // 6. pattern problem (tree with 1 3 5 7 star)
        // for (int i = 1; i <= n; i++) {
        // for (int j = n; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i; k++) {
        // System.out.print("*");
        // }
        // for (int l = 2; l <= i; l++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        sc.close();

        /*
         *
        ***
       *****
      *******
        */

    }
}
