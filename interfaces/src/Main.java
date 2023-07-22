public class Main {
    public static void main(String[] args) {
        //tamamlanmamış operasyonlar
        //abstract lar gibi new lenemezler
        //interface operasyonları implemente etmek istediğimizde kullanılır
        //bağımlılıları önlemek için kullanılır
        //bir class birden fazla interface i implemente edebilir**
        //bir class sadec bir class ı extends edebilir
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}