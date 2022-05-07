package Arrays;

public class Average {
    public static void main(String[] args) {

        int[] list = {2, 55, 3, 0, 12, 48, 16, 7, 27};
        double average;
        double sum = 0;

        for (int i = 0; i < list.length; i++){
            sum+=list[i];
        }
        average = sum/list.length;
        System.out.println(average);
    }
}
