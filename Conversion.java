import java.util.Scanner;

public class Conversion
{
	public static void main(String[]args)
	{
		double celsius;
		double fahrenheit;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the Max value of celsius");
		double maxC = keyboard.nextDouble();
		System.out.println("Enter the Min value of celsius");
		double minC = keyboard.nextDouble();
		System.out.println("Enter the Max value of Fahrenheit");
		double maxF = keyboard.nextDouble();

		System.out.println("Celsius    Fahrenheit    |    Fehrenheit         Celsius");
		System.out.println("---------------------------------------------------------------");


		for(celsius = maxC,fahrenheit = maxF;celsius>=minC;--celsius,fahrenheit = fahrenheit-10)
		{
			celsiusToFahrenheit(celsius);
			fahrenheitToCelsius(fahrenheit);
		}

	}
	public static double celsiusToFahrenheit(double celsius)
	{
		double fahrenheit = (9.0 / 5) * celsius + 32;
		System.out.printf("%4.1f         %5.1f",celsius,fahrenheit);
		return fahrenheit;
	}
	public static double fahrenheitToCelsius(double fahrenheit)
	{
		double celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.printf("       |      %4.2f             %5.2f\n\n",fahrenheit,celsius);
		return celsius;
	}

}