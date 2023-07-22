public class CustomerManager {
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
        //customermanager ın constructor ında bir tane ICustomerDal istiyorum

    }
    public void add(){
        //iş kodları burada yazılır
    customerDal.add();
    }
}
