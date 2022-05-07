package Arrays;

import java.util.Arrays;

public class Hw2 {
    public static void main(String[] args) {
        int[] arr= {10,20,20,10,10,5,20};
        Arrays.sort(arr);
        System.out.println("Tekrar sayıları : ");

        for (int i = 0; i <arr.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println(arr[i] + " "+count+ " tekrar");
            i+=count-1;
        }
    }
}
