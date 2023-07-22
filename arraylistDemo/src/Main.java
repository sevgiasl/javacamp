import java.util.ArrayList;//alt+enter

public class Main {
    public static void main(String[] args) {
        //koleksiyonlar dizilerin geliştirilmiş halidir
        //dizilerde 2 defa new yaptığımızda 2. yi kabul eder
        //koleksiyonlarda ise 1 ve 2 yi birleştirir
        //günümüz programlamada koleksiyonları kullanarak geliştirme yapılıyor
        ArrayList sayilar = new ArrayList();
        //System.out.println(sayilar.size());//kaç eleman var
        sayilar.add(1);
        sayilar.add(10);
        sayilar.add("Ankara");

       /*
        sayilar.set(0,100);  //0.index i 100 yap
        System.out.println(sayilar.get(0));  //x.index i ver
        */
        /*
        sayilar.remove(0); //0.index teki elemanı sil - 10, 0.indexteki eleman olur
        sayilar.clear(); //tüm elemanları sil
        System.out.println(sayilar.get(0));
        */
        for (Object i : sayilar) {
            System.out.println(i);
        }
    }
}