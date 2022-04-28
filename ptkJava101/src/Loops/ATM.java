package Loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;


        Scanner scan = new Scanner(System.in);
        int num = 0;
        int balance =1000;

        while (right > 0) {
            System.out.print("Kullanıcı adı : ");
            userName = scan.nextLine();
            System.out.print("Şifre : ");
            password = scan.nextLine();

            if (userName.equals("bulentavi") &&
                    password.equals("123456")) {
                System.out.println("Hoşgeldiniz");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    num = scan.nextInt();
                    if (num == 1) {
                        System.out.print("Para miktarı : ");
                        int price = scan.nextInt();
                        balance += price;
                    } else if (num == 2) {
                        System.out.print("Para miktarı : ");
                        int price = scan.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (num == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (num != 4);
                System.out.println("Çıkış yapıldı");
                break;
            } else {
                right--;

                if (right == 0) {
                    System.out.println("Hesap blokelendi");
                } else System.out.println("Kullanıcı adı veya şifre hatalı\n" +
                        "Hatalı giriş hakkı : " + right);
            }


        }
    }
}
