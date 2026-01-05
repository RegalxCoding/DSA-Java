package Arrays;

import java.util.Scanner;

class max_min {

    static int secondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second = largest;

        for (int num : arr) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num < largest && num > second) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many elements:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // print array
        System.out.println("\nelements in array are:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // 2. max element
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("\nMaximum element: " + max);

        // 3. min element
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nMinimum element: " + min);

        // 4. sum of array
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("\nSum of Array: " + sum);

        // 5. Check if element exists
        System.out.print("enter element to check if exist or not:");
        int element = sc.nextInt();
        boolean isElem = false;
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                index = i + 1;
                isElem = true;
            }
        }
        if (isElem) {
            System.out.println("Element present at position :" + index);
        } else {
            System.out.println("element not found");
        }

        // 6.second largest element
        int secondLarge = secondLargest(arr);
        System.out.println("\nSecond largest element in array is:" + secondLarge);
        sc.close();
    }
}
