public class Customer {
    private String name;
    private String lastName;
    private int customerNumber;
    private CreditCard creditcard;

    public Customer (String name, String lastName, CreditCard creditcard){
        this.name = name;
        this.lastName = lastName;
        this.creditcard = creditcard;
    }
    public Customer (String name, String lastName, int customerNumber, CreditCard creditcard){
        this.name= name;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.creditcard = creditcard;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName (String lastName){
        this.lastName = lastName;
    }
    public int getCustomerNumber(){
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }
    public CreditCard getCreditcard(){
        return creditcard;
    }

    public void setCreditcard(CreditCard creditcard) {
        this.creditcard = creditcard;
    }

    public void printName(){
        System.out.println("Customer " + name);
    }
}
