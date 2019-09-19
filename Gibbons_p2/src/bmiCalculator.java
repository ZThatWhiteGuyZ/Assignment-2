import java.util.Scanner;
import java.lang.String;

public class bmiCalculator {
	
	public static void main(String [] args)
	{
		String units;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Will you be entering metric or imperial?");
		units = scan.nextLine();
		
		if(units.compareTo("metric") == 0)
		{
			float kg, meters;
			
			System.out.println("What is your weight in kilograms to the nearest tenth of a kilo?");
			kg = scan.nextFloat();
			
			System.out.println("What is your height in meters to the nearest tenth of a meter?");
			meters = scan.nextFloat();
			
			System.out.printf("\n\nYour BMI is %.2f.\n", kg/(meters * meters));
		}
		else
		{
			float lbs, inches;
			
			System.out.println("What is your weight in pounds to the nearest tenth of a pound?");
			lbs = scan.nextFloat();
			
			System.out.println("What is your height in inches to the nearest tenth of a inches?");
			inches = scan.nextFloat();
			
			System.out.printf("\n\nYour BMI is %.2f.\n", (703 * lbs)/(inches * inches));
		}
		
		System.out.println("\n\nBMI Categories:\nUnderweight: < 18.5\nHealthy Weight: 18.5 - 24.9\nOverweight: 25 - 29.5\nObese: > 30");
		scan.close();
	}
}
