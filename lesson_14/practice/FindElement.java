package lesson_14.practice;

public class FindElement {
    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        int n = arr.length;
        int k = 2;
        System.out.print(firstElementNative(arr, n, k));

    }
    public static int firstElementNative(int[] arr, int n, int k) {
        // This loop is used for selection of elements
        for (int i = 0; i < n; i++) {
            int count = 0; // Count how many times selected element occurs
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == k) { // Check, if it occurs k times or not
                return arr[i];
            }
        }
        return -1;
    }

   
}
