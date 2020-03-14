public class TestTax
{
	public static void main(String[] args)
	{
		int filingStatus = 0;
		int [][] brackets2009 = {
			           			{8350,33950,82250,171550,372950},
			           			{16700,67900,137050,208850,372950},
			           			{8350,33950,68525,104425,186475},
			           			{11950,45500,117450,190200,372950}
		           				};
		double[] rates2009 = {0.10,0.15,0.25,0.28,0.33,0.35};

		int [][] brackets2001 = {
                                {27050,65550,136750,297350},
                                {45200,109250,166500,297350},
                                {22600,54625,83250,148675},
                                {36250,93650,151650,297350}
							};

		double[] rates2001 = {0.15,0.275,0.305,0.355,0.391};


	     String fmtStr = "%-10s     %5s     %25s     %15s     %13s\n";
	     String fmtStr1 = "%-7.0f     %10.2f     %15.2f     %22.2f     %15.2f\n";
	     String fmtStr2 = "%-10s     %5s     %25s     %15s     %15s\n";
	     System.out.println();
	     System.out.printf("%48s\n","2001 Tax Table");
	     System.out.printf("%48s\n","--------------");
         System.out.println("-------------------------------------------------------------------------------------------");
	     System.out.printf(fmtStr,"Taxable","Single","Married Filing Jointly","Married Filing","Head of");
	     System.out.printf(fmtStr2,"Income","     ","or Qualifying Widower","Seperately","Household");
	     System.out.println("-------------------------------------------------------------------------------------------");

	     for(double income = 50000;income<=60000; income += 1000)
	     {
		Tax taxYear2001 = new Tax(filingStatus,brackets2001,rates2001,income);
	    System.out.printf(fmtStr1,income,taxYear2001.getTax(Tax.SINGLE_FILER),taxYear2001.getTax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER),taxYear2001.getTax(Tax.MARRIED_SEPARATELY),taxYear2001.getTax(Tax.HEAD_OF_HOUSEHOLD));
         }

          System.out.println("-------------------------------------------------------------------------------------------");

         System.out.println();
	     System.out.printf("%48s\n","2009 Tax Table");
	     System.out.printf("%48s\n","--------------");
         System.out.println("-------------------------------------------------------------------------------------------");
		 System.out.printf(fmtStr,"Taxable","Single","Married Filing Jointly","Married Filing","Head of");
		 System.out.printf(fmtStr2,"Income","     ","or Qualifying Widower","Seperately","Household");
	     System.out.println("-------------------------------------------------------------------------------------------");

        for(double income = 50000;income<=60000; income += 1000)
	     {
        Tax taxYear2009 = new Tax(filingStatus,brackets2009,rates2009,income);

   	    System.out.printf(fmtStr1,income,taxYear2009.getTax(Tax.SINGLE_FILER),taxYear2009.getTax(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER),taxYear2009.getTax(Tax.MARRIED_SEPARATELY),taxYear2009.getTax(Tax.HEAD_OF_HOUSEHOLD));
     	 }
		System.out.println("-------------------------------------------------------------------------------------------");
	}
}