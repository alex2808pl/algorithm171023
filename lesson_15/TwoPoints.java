package lesson_15;

public class TwoPoints {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 4;
        findPairSumTwoPoint(arr, sum);
        
    }

    public static void findPairSumTwoPoint(int[] arr, int sum) {
        int length = arr.length;
        int i = 0; // first pointer
        int j = length - 1; // second pointer
    
        while (i < j) {
            if (arr[i] + arr[j] == sum) { // If we find a pair
                System.out.println("Yes - "+arr[i]+" <=> "+arr[j]);
                return;
            } else if (arr[i] + arr[j] < sum) {
                i++;
            } else {
                j--;
            }
        }
        System.out.println("No");
    }

}
