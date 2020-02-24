package taylor_problem1;

import java.security.SecureRandom;
import java.util.Scanner;

public class CAI3 
{	
	public static void main(String[] args) 
		{			
			double correct = 0.00;
			for(int i = 0; i<10; i++)
				{
					int MAX = 10; 
					SecureRandom rand = new SecureRandom();
			        int rand_int1 = rand.nextInt(MAX); 
			        int rand_int2 = rand.nextInt(MAX);
			        
			        if(quiz(rand_int1, rand_int2) == 1)
				        {
			        		correct = correct + 1.00;
			        	}
			        else 
				        {
				        	correct = correct + 0;
				        }
				}
			displayCompletionMessage(correct);
			
			System.out.println("Would you like to continue practicing?\n 'Y' or 'N'");
			Scanner restart = new Scanner(System.in);
			char choice = restart.nextLine().charAt(0);
			if(choice == 'Y')
				{
					main(args);
				}
			else
				{
					System.exit(0);
				}
		}
	

	public static int quiz(int rand_int1, int rand_int2)
		{
			askQuestion(rand_int1,rand_int2);
			int user_Input = readResponse();
			if(isAnswerCorrect(user_Input, rand_int1, rand_int2) == 1)
				{
					return 1;
				}
			
			else
				{
					return 0;
				}
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
	
	public static int isAnswerCorrect(int user_Input, int rand_int1, int rand_int2)
		{
			int answer = rand_int1 * rand_int2;
			
			if(user_Input == answer)
				{
					displayCorrectResponse();
					return 1;
				}
			else
				{
					displayIncorrectResponse();
					return 0;
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
							System.out.println("Very Good!\n");
							break;
						}
					case 2:
						{
							System.out.println("Excellent!\n");
							break;
						}
					case 3:
						{
							System.out.println("Nice Work!\n");
							break;
						}
					case 4:
						{
							System.out.println("Keep up the good Work!\n");
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
							System.out.println("Incorrect\n");
							break;
						}
					case 2:
						{
							System.out.println("Wrong.\n");
							break;
						}
					case 3:
						{
							System.out.println("Don't give up!\n");
							break;
						}
					case 4:
						{
							System.out.println("Answer is wrong.\n");
							break;
						}
				}
		}
	
	public static void displayCompletionMessage(double correct)
		{
			double percentage = (correct/10.00)*100.00;
			
			System.out.printf("You scored a: "+ percentage + "\n");
			
			if(percentage >= 75)
				{
					System.out.println("Congratulations, you are ready to go to the next level!\n");
				}
			else
				{
					System.out.println("Please ask your teacher for extra help.\n");
				}
		}

}
 