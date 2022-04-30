package Loops;

public class PrimeNums {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar : ");

        int count = 0;
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j <i; j++) {
                if (i%j == 0) {
                    count++;
                }
            }
            if (count<1){
                System.out.print(i+" , ");
            }
            count=0;
        }
    }
}
