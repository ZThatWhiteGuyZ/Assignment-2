import java.util.Scanner;

public class Encryption {

	public static void main(String [] args)
	{
		int choice, swap, digitLen = 4;
		int [] toEncrypt = new int [digitLen];
		int [] toDecrypt = new int [digitLen];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a 1 to encrypt a number. Enter a -1 to decrypt a number.");
		
		choice = scan.nextInt();
		
		if(choice >= 1)
			{
				System.out.println("Input four digits separated by spaces.");
		
				for(int i = 0; i < digitLen; i++)
				{
					toEncrypt[i] = scan.nextInt();
				}
		
				for(int i = 0; i < digitLen; i++)
				{
					toEncrypt[i] = (toEncrypt[i] + 7) % 10;
				}
		
				swap = toEncrypt[0];
				toEncrypt[0] = toEncrypt[2];
				toEncrypt[2] = swap;
		
				swap = toEncrypt[1];
				toEncrypt[1] = toEncrypt[3];
				toEncrypt[3] = swap;
				
				for(int i = 0; i < digitLen; i++)
				{
					System.out.print(toEncrypt[i]);
				}	
		}
		
		else
		{
			System.out.println("Input four digits separated by spaces.");
			
			for(int i = 0; i < digitLen; i++)
			{
				toDecrypt[i] = scan.nextInt();
			}
			
			swap = toDecrypt[0];
			toDecrypt[0] = toDecrypt[2];
			toDecrypt[2] = swap;
	
			swap = toDecrypt[1];
			toDecrypt[1] = toDecrypt[3];
			toDecrypt[3] = swap;
			
			for(int i = 0; i < digitLen; i++)
			{
				toDecrypt[i] = (toDecrypt[i] + 3) % 10;
			}
			
			for(int i = 0; i < digitLen; i++)
			{
				System.out.print(toDecrypt[i]);
			}
		}

		scan.close();
	}
	
}
