import java.util.Scanner;

public class Hotel {

	public static void main(String[] args) 
	{
		int qty;
		int choice;
		int bill=0;
		Scanner sc = new Scanner(System.in);
		
		
		do
		{
			System.out.println("Welcome to My Eaterie");
			System.out.println("....................");
			System.out.println("Enter your Choice:");
			System.out.println("0.EXIT");
			System.out.println("1.Samosa -rs 10");
			System.out.println("2.Idli - rs 20");
			System.out.println("3.Dosa - rs 30");
			System.out.println("4.Maggie - rs 50");
			System.out.println("5.Vadapav - rs 15");
			System.out.println("6.Omlet- rs 60");
			System.out.println("7.Club sandwich - rs 70");
			System.out.println("8.Chai - rs 15");
			System.out.println("9.Coffee - rs 25");
			System.out.println("10.Water bottle- rs 10");
			System.out.println("11.Total Bill is rs");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 0:
				System.out.println("Thank you for Visting...");
			break;
			
			case 1:
				System.out.println("Price of samosa is 10");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*10;
			break;
			case 2:
				System.out.println("Price of idli is 20");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*20;
			break;
			case 3:
				System.out.println("Price of dosa is 30");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*30;
			break;
			case 4:
				System.out.println("Price of maggie is 50");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*50;
			break;
			case 5:
				System.out.println("Price of vadapav is 15");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*15;
			break;
			case 6:
				System.out.println("Price of omlet is 60");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*60;
			break;
			case 7:
				System.out.println("Price of club sandwich is 70");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*70;
			break;
			case 8:
				System.out.println("Price of chai is 15");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*15;
			break;
			case 9:
				System.out.println("Price of coffee is 25");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*25;
			break;
			case 10:
				System.out.println("Price of water bottle is 10");
				System.out.println("Order quantity is ");
				qty=sc.nextInt();
				bill=bill+qty*10;
			break;
			case 11:
				System.out.println("total bill is ::"+bill);
			break;	
			default:
				System.out.println("enter valid choice");
			break;	
			}
			
			
		}while(choice!=5);
		
	}

}
