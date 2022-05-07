package Arrays;

public class Repeat {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 7, 1, 5, 6, 9, 2, 0, 0, 7, 4, 5, 6, 7, 3, 2, 1, 8};
        repeatNums(arr);
    }

    static void repeatNums(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] == arr[i]) {
                    if (!isDuplicated(arr, arr[j]))
                        System.out.print(arr[j] + " ");
                }
            }
        }
    }

    static Boolean isDuplicated(int[] arr, int n) {
        int count = 0;
        for (int i = 1; i < arr.length; i++)
            if (n == arr[i] && n % 2 == 0) {
                count++;
            }
        if (count < 1)
            return true;
        else return false;
    }
}

