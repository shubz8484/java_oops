package menu_driven;

import java.util.Scanner;

public class stationary_shop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice=0, total=0;
			
System.out.println("Article available:"
		+ "1:pencil rs=10,"
		+ " 2:Eraser rs=5,"
		+ " 3:ruler rs=10,"
		+ " 4:books rs=70,"
		+ " 5:Total bill rs=");

Scanner sc=new Scanner(System.in);

do {
	System.out.println("Enter choice");
	
	 choice=sc.nextInt();
	 switch (choice) {
	 
	 case 1:
		 System.out.println("Enter qty of pencil");
		 int qty=sc.nextInt();
		 total=qty*10;
		 break;
		 
	 case 2:
		 System.out.println("Enter qty of eraser");
		  qty=sc.nextInt();
		 total+=qty*5;
		 break;
		 
	 case 3:
		 System.out.println("Enter qty of ruler");
		  qty=sc.nextInt();
		 total+=qty*10;
		 break;
		 
	 case 4:
		 System.out.println("Enter qty of book");
		  qty=sc.nextInt();
		 total+=qty*70;
		 break;
		 
	 case 5:
		 System.out.println("Total bill "+total+" thanku to visit");
		 break;
		 
		 default:
			 System.out.println("Enter a valid choice");
		  break;
	 }

}
while(choice != 5);
	}
}
