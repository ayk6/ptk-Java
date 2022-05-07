package Arrays;

public class Min_Max {
    public static void main(String[] args) {
        int[] array = {2,4,5,-8,99,6,8,78,10,0,-6,44};
        int min = array[0];
        int max = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
        }
        System.out.println(min);
        System.out.println(max);
    }
}
