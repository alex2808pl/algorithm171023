import java.util.ArrayList;
import java.util.List;

public class NumberOfCoin {

    public static void main(String[] args) {
        // int[] coins = {1, 2, 5, 10, 50};
        // int sum = 101;
        // System.out.print("Перечень монет для оптимального размена суммы " + sum + ": " + getChange(sum, coins));

        // не срабатывает жадный алгоритм
        int[] coinsNo = {1, 4, 5};
        int sum = 8;
        System.out.print("Перечень монет для оптимального размена суммы " + sum + ": " + getChange(sum, coinsNo));



    }

    private static List<Integer> getChange(int sum, int[] coins) {
        List<Integer> result = new ArrayList<>();
        for (int i = coins.length - 1; i >= 0; i--) {
            while (sum >= coins[i]) {
                sum -= coins[i];
                result.add(coins[i]);
            }
        }
        return result;
    }
}
