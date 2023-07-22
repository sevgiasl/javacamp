public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        String yeniMesaj = sehirVer();//bir değer döndürüyor
        System.out.println(yeniMesaj);
        int sayi = topla(5, 7);
        System.out.println(sayi);
        int toplam = topla2(2, 3, 4, 5, 6, 10);
        System.out.println(toplam);
    }

    public static void ekle() {
        System.out.println("eklendi");
    }

    public static void sil() {
        System.out.println("silindi");

    }

    public static void guncelle() {
        System.out.println("güncellendi");

    }

    public static int topla(int sayi1, int sayi2) {//int türünde değer döndür
        return sayi1 + sayi2;//bitir 5 döndür
    }

    public static int topla2(int... sayilar) {
        int toplam = 0;
        for (int sayi:sayilar) {//sayilardaki her bir sayi için
            toplam += sayi;
        }
        return toplam;
    }

    public static String sehirVer() {
        return "Ankara";
    }

}