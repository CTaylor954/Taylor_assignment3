package taylor_problem2;

public class SavingsAccountTest 
{

	   public static void main(String[] args) 
		   {
		       SavingsAccount saver1 = new SavingsAccount(2000);
		       SavingsAccount saver2 = new SavingsAccount(3000);
		       
		       saver1.modifyInterestRate(4);
		       saver2.modifyInterestRate(4);
		       
		       System.out.println("Month     Saver1 Balance     Saver2 Balance");
		       System.out.println("-------------------------------------------");
		       System.out.printf("%-15d%-15.2f%10.2f\n",1,saver1.getSavingsBalance(),saver2.getSavingsBalance());
		       
		       for(int i=2;i<=12;i++) 
			       {
			           saver1.calculateMonthlyInterest();
			           saver2.calculateMonthlyInterest();
			           System.out.printf("%-15d%-15.2f%10.2f\n",i,saver1.getSavingsBalance(),saver2.getSavingsBalance());
			       }
		       
		       saver1.modifyInterestRate(5);
		       saver2.modifyInterestRate(5);
		       
		       saver1.calculateMonthlyInterest();
		       saver2.calculateMonthlyInterest();
		       
		       System.out.printf("\nSaver1 Balance = %.2f || Saver2 Balance = %.2f\n",saver1.getSavingsBalance(),saver2.getSavingsBalance());
		   }
	}