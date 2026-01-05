package Arrays;

class print_arr {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };

        System.out.println("elements of arr:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nreverse traversal of arr:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
