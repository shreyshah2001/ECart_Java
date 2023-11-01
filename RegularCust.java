package defpack;

class RegularCust extends Customer implements billpayment
{
	public RegularCust()
	{
		super();
		discount = 15;
	}
	public void paybill(double total)
	{
		total = total*(1-discount/100);
		System.out.println("Total after "+ total);
	}
}
