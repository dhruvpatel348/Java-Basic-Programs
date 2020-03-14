public class Tax
{
	public static final int SINGLE_FILER = 0;
	public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
	public static final int MARRIED_SEPARATELY = 2;
	public static final int HEAD_OF_HOUSEHOLD = 3;

    private int filingStatus;
	private int[][] brackets;
	private double[] rates;
	private double taxableIncome;


    public Tax()
    {
		filingStatus = 0;
		brackets = new int[5][5];
		rates = new double[6];
		taxableIncome = 0.0;
	}
	public Tax(int f, int[][] b,double[] r,double tI)
	{
		filingStatus = f;
		brackets = b;
		rates = r;
		taxableIncome = tI;
	}

	public int getFillingStatus()
	{
		return filingStatus;
	}
	public int[][] getBrackets()
	{
		return brackets;
	}
	public double[] getRates()
	{
		return rates;
	}
	public double getTaxableIncome()
	{
		return taxableIncome;
	}
	public void setFillingStatus(int f)
	{
		filingStatus = f;
	}
	public void setBrackets(int[][] b)
	{
		brackets = b;
	}
	public void setRates(double[] r)
	{
		rates = r;
	}
	public void setTaxableIncome(double tI)
	{
		taxableIncome = tI;
	}

    public double getTax(int filingStatus)
    {
        double tax;

        if (taxableIncome <= brackets[filingStatus][0]) return (taxableIncome * rates[0])* 1.00;

        tax = brackets[filingStatus][0] * rates[0];

        for (int indx = 1; indx < rates.length-1; indx++)
        {
            if (taxableIncome > brackets[filingStatus][indx]) tax += (brackets[filingStatus][indx] - brackets[filingStatus][indx - 1]) * rates[indx];
            else  return(tax + (taxableIncome - brackets[filingStatus][indx - 1]) * rates[indx])* 1.00;
        }
        return (tax + (taxableIncome - brackets[filingStatus][4]) * rates[5]) * 1.00;
     }




}