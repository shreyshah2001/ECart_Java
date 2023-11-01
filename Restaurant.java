package defpack;

public class Restaurant {
	String name;
	Address add1;
	String gst;
	String email;
	public Restaurant(String name, String gst, String email, String bname, String street, int pincode, String city)
	{
		this.name = name;
		this.gst = gst;
		this.email = email;
		this.add1 = new Address(bname, street, pincode, city);
	}
	public String getName()
	{
		return this.name;
	}
}
