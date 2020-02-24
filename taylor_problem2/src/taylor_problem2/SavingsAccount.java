package taylor_problem2;

public class SavingsAccount 
{
	   private static double annualInterestRate = 0;
	   private double savingsBalance;

	   public SavingsAccount(double amount) 
		   {
		       if(amount < 0) 
				  	{
				        this.savingsBalance = 0;
				    }
			   else 
			   		{
				    	this.savingsBalance = amount;
				    }
		   }
	   
	   public void calculateMonthlyInterest() 
		   {
		       savingsBalance += savingsBalance * (annualInterestRate / (12*100));
		   }
	   
	   public void modifyInterestRate(double interestRate) 
		   {
		       if(interestRate < 0) 
			       {
			           SavingsAccount.annualInterestRate = 0;
			       }
		       else 
			       {
			           SavingsAccount.annualInterestRate = interestRate;
			       }
		   }
	   
	   public double getSavingsBalance()
		   {
		       return savingsBalance;
		   }
	}