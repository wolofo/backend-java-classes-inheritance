public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Wolf", "Tettelaar", new VisaCard(100));
        customer.printName();
        Customer customer2 = new Customer("Erik", "Verkade", new MasterCard(200));
        customer2.printName();
        customer.getCreditcard().pay(10);
        System.out.println(customer.getCreditcard().getDebt());
    }
}
