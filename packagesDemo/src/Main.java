//built-in, java daki tanımlı
import matematik.*; //matematik bölümündeki herşeyi import et
//import matematik.DortIslem;
//import matematik.Logaritma;

import java.util.Scanner;//bu ben main in içerinde bunu kulllanacağım demek
//package
//bir paketi başka projede/pakette kullanmak istiyorsan onu import etmen gerekir
public class Main {
    public static void main(String[] args) {//src -> package,kendi paketimizi oluşturmak için
        Scanner scanner = new Scanner(System.in);//içteki parametre
        System.out.println("Adınız: ");
        String isim = scanner.nextLine();
        System.out.println("Merhaba " + isim);
        DortIslem dortIslem=new DortIslem();
        dortIslem.topla(2,3);
        Logaritma logaritma=new Logaritma();
    }
}