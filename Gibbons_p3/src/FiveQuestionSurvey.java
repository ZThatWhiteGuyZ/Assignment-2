import java.lang.String;
import java.util.Scanner;

public class FiveQuestionSurvey {
	
	public static void printLine()
	{
		System.out.println(" -------------------------------------------------------------------------------------------------- ");
	}
	
	public static void printHeader(int maxImportance)
	{
		System.out.print("|                             ");
		
		for(int i = 1; i <= maxImportance; i++)
		{
			if(i == 10)
			{
				System.out.printf("|  %d ", i);
			}
			else
			{
			System.out.printf("|  %d  ", i);
			}
		}
		
		System.out.println("|  avrg  |");
	}
	
	public static void printRows(String poll)
	{
		System.out.print("| " + poll + " ");
	}
	
	public static void printColumns(int [][] choices, int maxImportance, int pollOps, int submissions)
	{	
		float average = 0;
		
		for(int i = 0; i < maxImportance; i++)
		{
			System.out.printf("|  %d  ", choices[pollOps][i]);
		}
		
		for(int i = 0; i < maxImportance; i++)
		{
			average += ((choices[pollOps][i] * (i + 1)));
		}
		
		if((average / submissions) == maxImportance)
		{
			System.out.printf("|  %.2f |\n", (average / submissions));
		}
		else
		{
			System.out.printf("|  %.2f  |\n", (average / submissions));
		}
	}
	
	public static void score(int choices[][], int maxImportance, int pollOps)
	{
		int topicOneScore = 0, topicTwoScore = 0, topicThreeScore = 0, topicFourScore = 0, topicFiveScore = 0;
		String mostPopular, leastPopular;
		
		for(int j = 0; j < pollOps; j++)
		{
			int topicScore = 0;
			
			for(int i = 0; i < maxImportance; i++)
			{
				topicScore += (choices[j][i] * (i + 1));
			}
			
			if(j == 0)
				topicOneScore = topicScore;
			else if(j == 1)
				topicTwoScore = topicScore;
			else if(j == 2)
				topicThreeScore = topicScore;
			else if(j == 3)
				topicFourScore = topicScore;
			else if(j == 4)
				topicFiveScore = topicScore;
		}
		printMostImportant(topicOneScore, topicTwoScore, topicThreeScore, topicFourScore, topicFiveScore);
		printLeastImportant(topicOneScore, topicTwoScore, topicThreeScore, topicFourScore, topicFiveScore);
	}
	
	public static void printMostImportant(int topicOneScore, int topicTwoScore, int topicThreeScore, int topicFourScore, int topicFiveScore)
	{
		if(topicOneScore > topicTwoScore && topicOneScore > topicThreeScore && topicOneScore > topicFourScore && topicOneScore > topicFiveScore)
		{
			System.out.println("\nEsports was the most important topic with a total score of " + topicOneScore + " points.");
		}
		else if(topicTwoScore > topicOneScore && topicTwoScore > topicThreeScore && topicTwoScore > topicFourScore && topicTwoScore > topicFiveScore)
		{
			System.out.println("\nCollege Football Playoffs was the most important topic with a total score of " + topicTwoScore + " points.");
		}
		else if(topicThreeScore > topicOneScore && topicThreeScore > topicTwoScore && topicThreeScore > topicFourScore && topicThreeScore > topicFiveScore)
		{
			System.out.println("\nNational Popular Vote was the most important topic with a total score of " + topicThreeScore + " points.");
		}
		else if(topicFourScore > topicOneScore && topicFourScore > topicTwoScore && topicFourScore > topicThreeScore && topicFourScore > topicFiveScore)
		{
			System.out.println("\nGreat Pacific Garbage Patch was the most important topic with a total score of " + topicFourScore + " points.");
		}
		else if(topicFiveScore > topicOneScore && topicFiveScore > topicTwoScore && topicFiveScore > topicThreeScore && topicFiveScore > topicFourScore)
		{
			System.out.println("\nMusic Programs was the most important topic with a total score of " + topicFiveScore + " points.");
		}
	}
	
	public static void printLeastImportant(int topicOneScore, int topicTwoScore, int topicThreeScore, int topicFourScore, int topicFiveScore)
	{
		if(topicOneScore < topicTwoScore && topicOneScore < topicThreeScore && topicOneScore < topicFourScore && topicOneScore < topicFiveScore)
		{
			System.out.println("\nEsports was the least important topic with a total score of " + topicOneScore + " points.");
		}
		else if(topicTwoScore < topicOneScore && topicTwoScore < topicThreeScore && topicTwoScore < topicFourScore && topicTwoScore < topicFiveScore)
		{
			System.out.println("\nCollege Football Playoffs was the least important topic with a total score of " + topicTwoScore + " points.");
		}
		else if(topicThreeScore < topicOneScore && topicThreeScore < topicTwoScore && topicThreeScore < topicFourScore && topicThreeScore < topicFiveScore)
		{
			System.out.println("\nNational Popular Vote was the least important topic with a total score of " + topicThreeScore + " points.");
		}
		else if(topicFourScore < topicOneScore && topicFourScore < topicTwoScore && topicFourScore < topicThreeScore && topicFourScore < topicFiveScore)
		{
			System.out.println("\nGreat Pacific Garbage Patch was the least important topic with a total score of " + topicFourScore + " points.");
		}
		else if(topicFiveScore < topicOneScore && topicFiveScore < topicTwoScore && topicFiveScore < topicThreeScore && topicFiveScore < topicFourScore)
		{
			System.out.println("\nMusic Programs was the least important topic with a total score of " + topicFiveScore + " points.");
		}
	}
	
	public static void main(String[] args)
	{
// Initializations
		int i = 1, importanceValue = 0, pollOps = 5, maxImportance = 10, submissions = 0;
		int[][] choices = new int [pollOps][maxImportance];
		String [] topics = new String [pollOps];	
		Scanner scan = new Scanner(System.in); 
		topics [0] = "         Esports           ";
		topics [1] = " College Football Playoffs ";
		topics [2] = "   National Popular Vote   ";
		topics [3] = "Great Pacific Garbage Patch";
		topics [4] = "      Music Programs       ";
		
		while(i != -1)
		{
			System.out.println("Please rate the following topics by importance from 1 - 10, 1 being least important and 10 being most.\n\n");
			
			for(int j = 0; j < pollOps; j++)
			{
				System.out.println(topics[j]);
				importanceValue = scan.nextInt();
				choices[j][--importanceValue]++;
				
				if(j == 4)
				{
					submissions++;
					System.out.println("Do you have more entries to make? Enter 1 for yes and -1 for no.");
					i = scan.nextInt();
				}
			}	
		}
		printLine();
		printHeader(maxImportance);
		
		for(i = 0; i < pollOps; i++)
		{
			printLine();
			printRows(topics[i]);
			printColumns(choices, maxImportance, i, submissions);
		}
		
		printLine();
		score(choices, maxImportance, pollOps);
	}
	
}
