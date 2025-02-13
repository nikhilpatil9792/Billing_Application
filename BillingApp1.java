class Product {
   private int id;
   private String name;
   private int quantity;
   private double rate;

   void setid(int i) {
       id = i;
   }
   
   public int getid() {
       return id;
   }
   
   void setname(String n) {
       name = n;
   }
   
   public String getname() {
       return name;
   }
   
   void setquantity(int qty) {
       quantity = qty;
   }
   
   public int getquantity() {
       return quantity;
   }
   
   void setrate(double r) {  // Changed int to double
       rate = r;
   }
   
   public double getrate() {
       return rate;
   }
}

class Customers {
    private int id;
    private String name;
    private String address;
    private int contact;

    void setCusid(int i) {
        id = i;
    }

    public int getCusid() {
        return id;
    }

    void setCusname(String n) {
        name = n;
    }

    public String getCusname() {
        return name;
    }

    void setCusaddress(String add) {
        address = add;
    }

    public String getCusaddress() {
        return address;
    }

    void setCuscontact(int c) {
        contact = c;
    }

    public int getCuscontact() {
        return contact;
    } 
}

class Bill {
    private Product[] products; // Declare Product array to store products

    void setOrder(Customers c, Product... p) {
        products = p;  // Initialize the products array with passed products
        
        System.out.println("Customer Details:");
        System.out.println("ID: " + c.getCusid() + ", Name: " + c.getCusname());
        System.out.println("\nOrder Details:");
        
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i].getid() + "\t" + 
                               products[i].getname() + "\t" + 
                               products[i].getquantity() + "\t" + 
                               products[i].getrate());
        }
    }
}

public class BillingApp1 {
    public static void main(String[] x) {
        Customers c = new Customers();
        c.setCusid(101);  // Example setting customer id
        c.setCusname("John Doe");
        c.setCusaddress("123 Main St.");
        c.setCuscontact(987654321);

        Bill b = new Bill();
        
        // Creating products
        Product p1 = new Product();
        p1.setid(1);
        p1.setname("Sugar");
        p1.setquantity(2);
        p1.setrate(600.0);  // Changed rate to double
        
        Product p2 = new Product();
        p2.setid(2);
        p2.setname("Soap");
        p2.setquantity(1);
        p2.setrate(300.0);
        
        Product p3 = new Product();
        p3.setid(3);  // Changed to unique id
        p3.setname("Shampoo");
        p3.setquantity(3);
        p3.setrate(150.0);

        // Pass customer and products to the bill
        b.setOrder(c, p1, p2, p3);
    }
}
