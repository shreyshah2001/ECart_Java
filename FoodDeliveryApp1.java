package defpack;
import java.util.*;
public class FoodDeliveryApp1 {
	
	public static Customer login_screen() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Registered Number");
		String rnum = sc.next().toLowerCase();
		if(rnum.charAt(0)=='p')
			return new PremiumCust();
		else if(rnum.charAt(0)=='r')
			return new RegularCust();
		else
			return new Guest();
	}
	
	public static Order takeOrder()
	{
		Scanner sc = new Scanner(System.in);
		Menu m1 = new Menu();
		Order o2 = new Order();
		while(true) {
		m1.display();
		System.out.println("Enter 4 for Exit");
		System.out.println("Please enter your choice");
		int choice2= -1;
		try 
		{
		choice2 = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Please enter a number");
		}
		if(choice2==4)
			return o2;
		o2.add(m1.getItem(choice2-1),m1.getPrice(choice2-1));
		}
		
	}
	public static void main(String[] args) {
		Customer c1 = login_screen();
		Restaurant r1 =new Restaurant("Rest1","f23432","shsh2@gmail.com","build1", "Road 6", 232, "Mumbai");
		System.out.println(r1.getName());
		Order o1 = takeOrder(); 
		double total = o1.getTotal();
		o1.display();
		System.out.println("Total before discount " + total);
		c1.paybill(total);
		
		
	}

}
