using System.Threading.Channels;

namespace YouTubeEgitim
{
    public class Program
    {
        static void Main(string[] args)
        {
            //Ioc Container
            CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
            customerManager.GiveCredit();

            Console.ReadLine();
        }
    }
    class CreditManager
    {//sonar qube
     //operasyonlar
        public void Calculate()
        {
            Console.WriteLine("Hesaplandı");
        }
        public void Save()
        {
            Console.WriteLine("Kredi verildi");
        }
    } 

        interface ICreditManager
        {
            void Calculate();
            void Save();
        }
    abstract class BaseCreditManager : ICreditManager
    {
        public abstract void Calculate();
        

        public virtual void Save()
        {
            Console.WriteLine("Kaydedildi");
        }
    }
    class TeacherCredictManagaer : BaseCreditManager , ICreditManager
        {
            public override/*üstüne yaz*/ void Calculate()
            {
                Console.WriteLine("Öğretmen kredisi hesaplandı");
            }
        public override void Save()
        {
           // base.Save();
        }


        class MilitaryCreditManager : BaseCreditManager, ICreditManager
        {
            public override void Calculate()
            {
                Console.WriteLine("Asker kredisi hesaplandı");

            }

            
        }
    }
    //SOLID yazılım gelişirme prensipleri
    class Customer
    {//nesneyi tanımlayan
        public Customer()
        {
            Console.WriteLine("Müşteri nesnesi eklendi");
        }
        public int Id { get; set; }
       
        public string City { get; set; }

    }
    class Person : Customer
    {
        public string FirstName { get; set; }
        public string LastName{ get; set; }
        public string NationalIdentity { get; set; }
    }
    class Company :Customer//extends,inheritance
    {
        public string CompanyName { get; set; }
        public string TaxNumber { get; set; }
    }
    //katmanlı mimariler

    class CustomerManager {
        private Customer _customer;
        private ICreditManager _creditManager;
        public CustomerManager(Customer customer, ICreditManager creditManager) { 
            _customer = customer;
            _creditManager= creditManager;
        }

        public void Save()
        {

        }
        public void Delete()
        {

        }
        public void GiveCredit()
        {
            _creditManager.Calculate();
            Console.WriteLine("Kredi verildi");
        }
    }
}