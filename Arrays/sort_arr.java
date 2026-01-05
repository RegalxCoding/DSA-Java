package Arrays;

import java.util.Scanner;

class sort_arr {
    static int[] bubble_sort(int[] arr) {

        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Before sorting array elements:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nafter sorting:");
        int[] sorted = bubble_sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }

        sc.close();
    }
}
