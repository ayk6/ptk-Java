package Conditions;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String userName,password;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kullanıcı adı : ");
        userName = scan.next();
        System.out.print("Şifre : ");
        password = scan.next();

        if (userName.equals("ayk")&&password.equals("123456")){
            System.out.println("Giriş başarılı");
        }else System.out.println("Hatalı giriş");

    }
}
