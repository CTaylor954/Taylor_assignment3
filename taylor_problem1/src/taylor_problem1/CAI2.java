package taylor_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2 
{

	public static void main(String[] args) 
		{
		
			int MAX = 10; 
			SecureRandom rand = new SecureRandom();
	        int rand_int1 = rand.nextInt(MAX); 
	        int rand_int2 = rand.nextInt(MAX);
	        
	        quiz(rand_int1, rand_int2);
		}
	
	public static void quiz(int rand_int1, int rand_int2)
		{
			askQuestion(rand_int1,rand_int2);
			int user_Input = readResponse();
			isAnswerCorrect(user_Input, rand_int1, rand_int2);
		}
	
	public static void askQuestion(int rand_int1, int rand_int2)
		{
			System.out.printf("How much is %d times %d?\n",rand_int1, rand_int2);
		}
	
	public static int readResponse()
		{
			Scanner userInput = new Scanner(System.in);
			int user_Input = userInput.nextInt();
			
			return user_Input;
		}
	
	public static void isAnswerCorrect(int user_Input, int rand_int1, int rand_int2)
		{
			int answer = rand_int1 * rand_int2;
			
			if(user_Input == answer)
				{
					displayCorrectResponse();
					System.exit(0);
				}
			else if(user_Input != answer)
				{
					displayIncorrectResponse();
					quiz(rand_int1, rand_int2);
				}
			
		}
	
	public static void displayCorrectResponse()
		{
		
			SecureRandom rand = new SecureRandom();
			int randNum = rand.nextInt(4);
			
			switch(randNum + 1)
				{
					case 1:
						{
							System.out.println("Very Good!");
							break;
						}
					case 2:
						{
							System.out.println("Excellent!");
							break;
						}
					case 3:
						{
							System.out.println("Nice Work!");
							break;
						}
					case 4:
						{
							System.out.println("Keep up the good Work!");
							break;
						}
				}
		}
	
	public static void displayIncorrectResponse()
		{
			SecureRandom rand = new SecureRandom();
			int randNum = rand.nextInt(4);
			
			switch(randNum + 1)
				{
					case 1:
						{
							System.out.println("No. Please try again.");
							break;
						}
					case 2:
						{
							System.out.println("Wrong. Try once more.");
							break;
						}
					case 3:
						{
							System.out.println("Don't give up!");
							break;
						}
					case 4:
						{
							System.out.println("No. Keep trying.");
							break;
						}
				}
		}

}
 