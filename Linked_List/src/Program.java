import java.util.Scanner;

import org.sunbeam.dac.list.LinkedList;
import org.sunbeam.dac.list.Menu;

public class Program 
{
	static Scanner sc = new Scanner(System.in);
	
	public static Menu menuList()
	{
		System.out.println("0. Exit");
		System.out.println("1. Add at first");
		System.out.println("2. Add at last");
		System.out.println("3. Delete at first");
		System.out.println("4. Delete at last");
		System.out.println("5. Display list");
		Menu []m = Menu.values();
		return m[sc.nextInt()];
	}
	
	public static void main(String[] args) 
	{
		LinkedList l1 = new LinkedList();
		Menu choice;
		while((choice = menuList()) != Menu.EXIT)
		{
			try
			{
				switch (choice) 
				{
				case ADD_AT_FIRST:
					System.out.print("Enter data:: ");
					l1.addNodeAtFirst(sc.nextInt());
					break;

				case ADD_AT_LAST:
					System.out.print("Enter data:: ");
					l1.addAtLast(sc.nextInt());
					break;
					
				case DEL_AT_FIRST:
					
					l1.delAtFirst();
					break;
					
				case DEL_AT_LAST:
					
					l1.delAtLast();
					
					break;
					
				case DISPLAY_LIST:
					
					l1.printList();
				default:
					break;
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
		
		

	}

}
