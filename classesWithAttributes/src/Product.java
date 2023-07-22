public class Product {
    //crtl shift alt l - düzenleme
    //attribute||field
    public Product(int id,String name, String description,double price,int stockAmount,String renk){//Constructor-yapıcı metot
        System.out.println("Yapıcı blok çalıştı");
        this.id =id;
        this.price =price;
        this.name =name;
        this.stockAmount=stockAmount;
        this.renk =renk;
        this.description=description;
    }
    public Product(){

    }
    private int id;//ürünü tanımlayan eşsiz değer
    private String name;//name de sağa tıkla refactor-encapsulate fields
    private String description;
    private double price;
    private int stockAmount;
    private String kod;
    private String renk;

    //encapsulation,getter and setter yazmak
    //getter
    public int getId() {//okuyabilir
        return id;
    }

    //setter
    public void setId(int id) {//değerini kur
        this.id = id;//bu classtaki id/this

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getKod() {
        return this.getName().substring(0,1)+id;
        //kodu kullanıcının yazmasını engelledim
    }
    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
