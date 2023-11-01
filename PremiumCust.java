package defpack;

public class PremiumCust extends Customer implements billpayment
{
	double points;
	public PremiumCust()
	{
		super();
		int mem_num = 23421;
		discount = 25;
	}
	public void paybill(double total)
	{
		total = total*(1-discount/100);
		points = points + total*0.5;
//		System.out.println(discount);
		System.out.println("Total after discount " + total);
	}
}

