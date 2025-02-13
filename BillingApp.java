//Q2. WAP to develop the billing application using the following classes.
//Product class with field id,name,qty,rate and mark as product as POJO class
//Customer class with field id,name,address,contact and mark customer as POJO class
//Bill class with following methods 
//Void setOrder(Customer c,Product …p) : this method can accept customer details and customer product list and calculate its bill and show output using following fa

class Product
{
   private int id;
   private String name;
   private int quantity;
   private double rate;

   void setid(int i)
   {
       id=i;
   }
   public int  getid()
   {
         return id;
   }
    void setname(String n)
   {
       name=n;
   }
   public String getname()
   {
         return name;
   }
    void setquantity(int qty)
   {
       quantity=qty;
   }
   public int  getquantity()
   {
         return quantity;
   }
    void setrate(double r)
   {
       rate=r;
   }
   public double  getrate()
   {
         return rate;
   }
    
}
class Customers
{
    private int id;
    private  String name;
    private  String address;
    private  int contact;
  
   void setCusid(int i)
   {
       id=i;
   }
   public int getCusid()
   {
         return id;
   }
   void setCusname(String n)
   {
       name=n;
   }
   public String getCusname()
   {
         return name;
   }
   void setCusaddress(String add)
   {
       address=add;
   }
   public String getCusaddress()
   {
         return address;
   }
   void setCuscontact(int c)
   {
       contact=c;
   }
   public int getCuscontact()
   {
         return contact;
   } 
}
class Bill
{
     Product product[];
     void setOrder(Customers c,Product...p)
     {
          product=p;
         double total=0;
         double TotalAmount=0;
          
        System.out.println("Bill Details for customers....: ");
         System.out.println("ID -"+c.getCusid()+"\t Name- "+c.getCusname()+"\t Address- "+c.getCusaddress()+"\t Conatact-"+c.getCuscontact());
         System.out.println("=============================================================");
          System.out.println("Id\tname\tQty\tRate\tTotal");

        
        for(int i=0; i< product.length; i++)
        {
           
           total=product[i].getquantity()*product[i].getrate();
          System.out.println(product[i].getid()+"\t"+product[i].getname()+"\t"+product[i]. getquantity()+"\t"+product[i].getrate()+"\t"+total);
           
           TotalAmount=TotalAmount+total;
        }
        System.out.println("=============================================================");
        System.out.println("TotalAmount= "+TotalAmount);
     }
}
public class BillingApp
{
    public static void main(String x[])
    {
            Customers c= new Customers();
            c.setCusid(101);  
            c.setCusname("Wanted");
            c.setCusaddress("Sutkar");
            c.setCuscontact(987654321);
             
              Bill b= new Bill();
              
             
             Product p1=new Product();
             p1.setid(1);
             p1.setname("sugar");
             p1. setquantity(2);
             p1.setrate(600.0);
             
             Product p2=new Product();
             p2.setid(2);
             p2.setname("Soap");
             p2. setquantity(1);
             p2.setrate(300.78);

             Product p3=new Product();
             p3.setid(3);
             p3.setname("Sugar");
             p3.setquantity(1);
             p3.setrate(300.65);

            b.setOrder(c,p1,p2,p3);
            
    }
} 
