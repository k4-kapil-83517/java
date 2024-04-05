import java.util.Scanner;

public class DrivingCostCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter total miles driven per day: ");
		double totalMiles = sc.nextDouble();

		System.out.print("Enter cost per gallon of gasoline: Rs");
		double costPerGallon = sc.nextDouble();

		System.out.print("Enter average miles per gallon: ");
		double avgMilesPerGallon = sc.nextDouble();

		System.out.print("Enter parking fees per day: Rs");
		double parkingFees = sc.nextDouble();

		System.out.print("Enter tolls per day: Rs");
		double tolls = sc.nextDouble();
		
		double dailyCost = calculateDailyDrivingCost(totalMiles, costPerGallon, avgMilesPerGallon, parkingFees, tolls);

		System.out.printf("Your daily driving cost is: Rs %.2f%n", + dailyCost);

	}

	public static double calculateDailyDrivingCost(double totalMiles, double costPerGallon, double avgMilesPerGallon,
			double parkingFees, double tolls) 
	{
		
		double totalGasCost = (totalMiles / avgMilesPerGallon) * costPerGallon;
		double totalCost = totalGasCost + parkingFees + tolls;
		return totalCost;
	}
}
