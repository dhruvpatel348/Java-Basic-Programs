
//6.27 (Emirp) Methods

public class Program2
{
	public static void main(String[]args)
	{
		int tNum = 0;

		int indx = 10;

		while(tNum<100)
		{
			if(prime(indx) && prime(reverse(indx)) && !palindrome(indx))
			{
			tNum++;
			System.out.printf(" " + indx + " ");

			if(tNum % 10 == 0) System.out.println();
		    }
			indx++;

		}
	}
	public static boolean prime(int num)
	{
		for(int indx = 2; indx<=num/2; indx++) if(num % indx == 0) return false;
		return true;
	}
	public static int reverse(int num)
	{
		int reverse = 0;

		do
		{
		reverse = reverse * 10;
		reverse = reverse + num % 10;
		num = num/10;
		}while(num !=0);

		return reverse;
	}

	public static boolean palindrome(int num)
	{
		return (num == reverse(num));
	}

}