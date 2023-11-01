package defpack;

public class Guest extends Customer implements billpayment
{
	int paydel;
	public Guest()
	{
		super();
		discount = 0;
		paydel = 100;
		
	}
	public void paybill(double total)
	{
		total = total*(1-discount/100) + paydel;
		System.out.println(total);
		
	}
}
