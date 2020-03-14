import java .util.Scanner;
public class TestLinearEquation
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


		System.out.print("Enter a,b,c,d,e,f: ");
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
		double d = keyboard.nextDouble();
		double e = keyboard.nextDouble();
		double f = keyboard.nextDouble();

		 LinearEquation lE = new LinearEquation(a,b,c,d,e,f);

		System.out.println();
		System.out.print("a,b,c,d,e,f: " + lE.getA() + " " + lE.getB() + " " + lE.getC() + " " + lE.getD() + " " + lE.getE() + " " + lE.getF());
		System.out.println();

		System.out.println("The equations are " + lE.getA() + "X" + " + " + lE.getB() + "Y" + " = " + lE.getE() + " and " + lE.getC() + "X" + " + " + lE.getD() + "Y" + " = " + lE.getF());

		if(lE.isSolvable() == true)
		System.out.println(" The equation has no solution");

		else
		System.out.println("The solutions of the equations are " + "X = " + lE.getX() + " and " + "Y = " + lE.getY());
	}
}