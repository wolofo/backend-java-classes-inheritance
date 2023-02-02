public class Customer {

		public Customer(String name, String lastName) {
				this(name, (int)(Math.random() * 100), lastName);
		}

		public Customer(String name, int customerNumber, String lastName) {
				this.name = name;
				this.customerNumber = customerNumber;
				this.lastName = lastName;
		}

		private String name;

		private int customerNumber;
		private String lastName;

		public String getName(){
				return name;
		}

		public void setName(String name){
				this.name = name;
		}

		public int getCustomerNumber() {
				return customerNumber;
		}

		public void setCustomerNumber(int customerNumber) {
				this.customerNumber = customerNumber;
		}

		public String getLastName() {
				return lastName;
		}

		public void setLastName(String lastName) {
				this.lastName = lastName;
		}

		public void printName(){
				System.out.println("Customer " + name);
		}
}
