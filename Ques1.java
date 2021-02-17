abstract class Books {
    String Book_name;
    int Book_Price;
}
class Customer extends Books{
    String Book_name;
    int Book_Price;
    private String Cust_name;

    public String getName() {
        return Book_name;
    }

    public int getPrice() {
        return Book_Price;
    }
    public String getCust() {
        return Cust_name;
    }
    public void setCust(String name) {
        Cust_name = name;
    }
}
public class Ques1{

    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.Book_name = "Rich Dad Poor Dad";
        c1.Book_Price = 150;
        c1.setCust("Vaishali");
        System.out.println("Customer Name: "+c1.getCust());
        System.out.println("Book Name: "+c1.getName());
        System.out.println("Book Price: "+c1.Book_Price);
    }
}
