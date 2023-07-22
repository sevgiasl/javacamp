public class Main {
    public static void main(String[] args) {
        //static bellekten atılmıyor,uygulama sıfırlanana kadaar
        //static yaptığımız zaman:ilk çağıran kullanıcı nesneyi çağırıyor diğer bütün kullanıcılar bunu kullanabiliyor
        //bir metotu static yaptığımız zaman direkt class ismiyle çağırabiliyoruz
        //yardımcı metot static yapılabilir
        //sttaic ler class ismiyle çağırılır ve çağırıldığı anda da bellekte oluşur
        //yapıcı bloklar new leyince çalışır
        //ana class static olamaz,istisna bir class ın içerisine başka class yazdığımızda,sonradan yazdığımıza static verebiliyoruz
        //inner class:class içerisine yazılan bölümlendiriici class
        //class içinde class çok tavsiye edilmiyor,ayrı ayrı yapmak daha fazla tavsiye ediliyor
        ProductManager manager=new ProductManager();
        Product product=new Product();
        product.price =10;
        product.name="Mouse";
            manager.add(product);
//          DatabaseHelper.Crud.Delete();
//            DatabaseHelper.Connection.createConnection();
    }
}