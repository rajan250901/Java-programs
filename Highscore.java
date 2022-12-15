import java.util.*;
import java.util.Arrays;

public class Highscore {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            sum = sum + arr[i] * arr[i + 1];
        }
        System.out.println("Highest score room value is : " + sum);
    }

}
