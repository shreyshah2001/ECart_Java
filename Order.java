package defpack;
import java.util.*;
public class Order {
		
		int order_no;
		int item_id;
		Date dt;
		String item_name[];
		int price[];
		int quantity;
		double total;
		
		public Order()
		{
			order_no = 123;
			item_id = 0;
			dt = new Date();
			item_name = new String[100];
			price = new int[100];
			quantity = 2;
			this.total = 0;
		}
		
		public void display()
		{
			System.out.println("Order no: "+order_no);
			System.out.println(dt);
			for(int i =0;i<item_id;i++)
			{
			System.out.print(item_name[i] + "\t");
			System.out.print(price[i]);
			System.out.println();
			}
			System.out.println("Total = "+total);
		}
		public void add(String name, int price)
		{
			this.item_name[this.item_id] = name;
			this.price[this.item_id] = price;
			this.total = this.total + price;
			this.item_id++;
			System.out.println("Total upto now: " + this.total);
			
		}
		public double getTotal()
		{
			return this.total;
		}
		public void displayItems()
		{
			for(int i =0;i<item_id;i++)
			{
				System.out.println(this.item_name[i]);
			}
		}

}