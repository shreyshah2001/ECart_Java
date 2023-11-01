package defpack;

public class Menu {
	
	int id;
	int price[];
	int quantity[];
	String name[];
	String description;
	Restaurant r1;
	
	public Menu()
	{
		id = 101;
		description = "Breakfast Menu";
		name = new String[]{"Waffles", "Milk", "Coffee"};
		price = new int[]{123,234,212};
		quantity = new int[] {1,3,2};
	}
	public void display()
	{
		System.out.println(description);
		for(int i =0;i<3;i++)
		{
			System.out.println((i+1)+"\t"+ name[i] + "\t"+ price[i]);
		}
	}
	public String getItem(int i)
	{
		return name[i];
	}
	public int getPrice(int i)
	{
		return price[i];
	}
	
}