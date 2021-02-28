import java.util.Scanner;

public class FinancialApplication
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the Investment amount");
		double investmentAmount = keyboard.nextDouble();
		System.out.println("Enter the annual Interest rate");
		double annualInterestRate = keyboard.nextDouble();
		System.out.println("Investment amount is " + investmentAmount);
		System.out.println("Annual Interest rate is " + annualInterestRate);
		int years;

		System.out.println("Years            Future Value ");
		double monthlyInterestRate = annualInterestRate/1200;

		for(years = 1; years<=30;years++)
		{
			futureInvestmentValue(investmentAmount,monthlyInterestRate,years);

		}

	}
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years)
	{


		double futureInvestmentValue = investmentAmount * Math.pow(1 + monthlyInterestRate,years*12);
		System.out.printf("%4d              %10.2f\n",years,futureInvestmentValue);
		return futureInvestmentValue;
	}
}