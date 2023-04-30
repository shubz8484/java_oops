package menu_driven;

import java.util.Scanner;

public class pizaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0, qty = 0, total = 0;

		System.out.println("1:'chees pizza'250rs 2:'thinpizza' 300 3:'chocolava'100 4:'coke'50 5:Exit");
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter choice");

			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter qty of chees");
				qty = sc.nextInt();
				total+=qty*250;
				break;
				
			case 2:
				System.out.println("Enter qty of thin");
				qty = sc.nextInt();
				total+=qty*300;
				break;
				
			case 3:
				System.out.println("Enter choco");
				qty = sc.nextInt();
				total+=qty*100;
				break;
				
			case 4:
				System.out.println("Enter qty of coke");
				qty = sc.nextInt();
				total+=qty*20;
				break;
			case 5:
				System.out.println("total bill: "+total+" Thanku for visit");
				
				break;

			default:
				System.out.println("Enter valid choice");
				break;

			}

		} while (choice != 5);
	}

}
