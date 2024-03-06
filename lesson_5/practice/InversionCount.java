package lesson_5.practice;

public class InversionCount {
    public static void main(String[] args) {
        int[] arr = /*{8, 4, 2, 1};*/ {3, 1, 2};
        System.out.println("Инверсия = "+getInvCount(arr));
    }

    private static int getInvCount(int[] arr) {
        int length = arr.length;
        int count = 0;
        for (int i = 0; i < length-1; i++) {
            for (int j = i+1; j < length; j++) {
                if(arr[i] > arr[j]) {
                    System.out.println(arr[i] +","+ arr[j]);
                    count++;
                }
            }
        }
        return count;
    }
}
