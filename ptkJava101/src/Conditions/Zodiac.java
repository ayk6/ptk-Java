package Conditions;

import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ay bilgisini sayı olarak yazın(1-12) : ");
        int month = scan.nextInt();
        System.out.print("Gün bilgisini sayı olarak yazın(1-31) : ");
        int day = scan.nextInt();
        switch (month){
            case 1:
                if (day>0&&day<22){System.out.println("Oğlak burcu");
                }else if (day<=31){ System.out.println("Kova burcu");
                } else {System.out.println("Hatalı giriş");}
                break;
            case 2:
                if (day>0&&day<20){System.out.println("Kova burcu");
                }else if (day<=29){ System.out.println("Balık burcu");
                } else {System.out.println("Hatalı giriş");}  break;
            case 3:
                if (day>0&&day<21){System.out.println("Balık burcu");
                }else if (day<=31){ System.out.println("Koç burcu");
                } else {System.out.println("Hatalı giriş");}  break;
            case 4:
                if (day>0&&day<21){System.out.println("Koç burcu");
                }else if (day<=30){ System.out.println("Boğa burcu");
                } else System.out.println("Hatalı giriş"); break;
            case 5:
                if (day>0&&day<22){System.out.println("Boğa burcu");
                }else if (day<=31){ System.out.println("İkizler burcu");
                } else System.out.println("Hatalı giriş"); break;
            case 6:
                if (day>0&&day<23){System.out.println("İkizler burcu");
                }else if (day<=30){ System.out.println("Yengeç burcu");
                } else {System.out.println("Hatalı giriş");}
                break;
            case 7:
                if (day>0&&day<22){System.out.println("Yengeç burcu");
                }else if (day<=31){ System.out.println("Aslan burcu");
                } else {System.out.println("Hatalı giriş");} break;
            case 8:
                if (day>0&&day<23){System.out.println("Aslan burcu");
                }else if (day<=31){ System.out.println("Başak burcu");
                } else {System.out.println("Hatalı giriş");} break;
            case 9:
                if (day>0&&day<23){System.out.println("Başak burcu");
                }else if (day<=30){ System.out.println("Terazi burcu");
                }else {System.out.println("Hatalı giriş");}  break;
            case 10:
                if (day>0&&day<23){System.out.println("Terazi burcu");
                }else if (day<=31){ System.out.println("Akrep burcu");
                }else {System.out.println("Hatalı giriş");}  break;
            case 11:
                if (day>0&&day<22){System.out.println("Akrep burcu");
                }else if (day<=30){ System.out.println("Yay burcu");
                } else {System.out.println("Hatalı giriş");} break;
            case 12:
                if (day>0&&day<22){System.out.println("Yay burcu");
                }else if (day<=31){ System.out.println("Oğlak burcu");
                }else {System.out.println("Hatalı giriş");}  break;
            default :
                System.out.println("Hatalı giriş");
        }
    }
}
