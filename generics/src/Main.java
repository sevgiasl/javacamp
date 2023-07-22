import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    //ArrayList String ile çalışan generic bir class oldu
    //genericlere tip güvenli çalışmak için ihtiyaç duyarız
    //farklı tiplerle çalışmamızı sağlayan bir class oluyor,generic olduğu zaman
    //biz genericlerle beraber,birbirine benzeyen operasyonları aynı tip güvenli bir şekilde aynı formatta yazmayı başarmış oluyoruz

        /* ArrayList<String> sehirler=new ArrayList<String>();
        sehirler.add("Ankara");
        sehirler.add("İstanbul");
        sehirler.add("İzmir");
        */
        MyList<Customer> sehirler=new MyList<Customer>();
        sehirler.add(new Customer());
        sehirler.add(new Customer());
    }
}