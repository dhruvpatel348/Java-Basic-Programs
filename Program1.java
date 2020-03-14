
//5.19 (Display numbers in a pyramid pattern) Loops



import java.util.Scanner;

public class Program1
{

public static void main(String[]args)
{
	Scanner keyboard  = new Scanner(System.in);
	final int power = 8;

   int maxSpace = 8;

	for(int indx = 1; indx<=power; indx++)
	{
		for(int indx1 = 0; indx1<maxSpace-1;indx1++)
		{
			System.out.print("    ");

		}
		for(int indx2 = 0; indx2<indx-1; indx2++)
		{
			System.out.printf("%4d",(int)(Math.pow(2,indx2)));
		}
		for(int indx3 = indx-1; indx3>=0; indx3--)
		{
			System.out.printf("%4d",(int)(Math.pow(2,indx3)));
		}
		maxSpace--;
		System.out.println();
	}
}
}



