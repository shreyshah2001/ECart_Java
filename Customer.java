package defpack;

public class Customer {

		Name name1;
		int id;
		Address address1;
		int phone_no;
		String email_id;
		double discount;
		
		public Customer()
		{
			name1 = new Name("Shrey","Shah");
			email_id = "shshah.ext@deloitte.com";
			address1 = new Address("Deloitte","Kolshet Road", 4022,"Mumbai");
			id = 1;
			phone_no = 12453282;
		}
		public Customer(String fname, String lname, int id, String email,String bname, String street, int pincode, String city, int phone )
		{
			name1 = new Name(fname,lname);
			this.id = id;
			this.email_id = email;
			this.phone_no = phone;
			address1 = new Address(bname, street, pincode, city);
		}
		
		public void display()
		{
//			System.out.println(name);
			System.out.println(id);
//			System.out.println(address);
			System.out.println(email_id);
			System.out.println(phone_no);
		}
		
		public void paybill(double total)
		{
			System.out.println("Method to be overriden");
		}
		
		
}


