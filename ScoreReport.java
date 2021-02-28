
/*Write program to fill an array with 100 scores using a random method.
The scores must be between 0 and 100.
You will generate a report of the score in one column and the number of point above or below the average score it is in the second column.
Make sure you have proper headings.
The bottom of the report will specify how many scores are below the average and how many are above the average.*/

//Dhrukumar Patel
//CSC 161
//Score Report

import java.util.Scanner;

public class ScoreReport
{
	public static void main(String[]args)
	{
		int[] score = new int[100];
		int[] point = new int[100];
		randomNumber(score);

		int avg = avgScore(score);
		noOfPoint(score,avg,point);
		pointAbove(point);
		pointBelow(point);
	    displayScore(score,point,avg);
	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static void randomNumber(int[]score)
	{
		for(int indx = 0;indx<100;indx++)score[indx] = (int)(Math.random()*101);
	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static int avgScore(int[]score)
	{
		int retValue = 0;
		int sum = 0;
		for(int indx = 0;indx<100;indx++)sum+=score[indx];
		retValue = sum/100;
		return retValue;
	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static void noOfPoint(int[]score,int avg,int[]point)
	{
		for(int indx = 0; indx<100;indx++)point[indx] = score[indx] - avg;
	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static int pointAbove(int[]point)
	{
		int retValue = 0;
		for(int indx = 0; indx<100;indx++)
			if(point[indx]>0)retValue++;

		return retValue;

	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static int pointBelow(int[]point)
		{
			int retValue = 0;
			for(int indx = 0; indx<100;indx++)
				if(point[indx]<0)retValue++;

			return retValue;

	}
	//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
	public static void displayScore(int[]score,int[]point,int avg)
	{
		System.out.println("No.          Score             Point Compared to Average  ");
		System.out.println("                               (-) No. Below Average  ");
		System.out.println("                               (+) No. Above Average  ");
		for(int indx = 0; indx<100;indx++)
		{
			System.out.println((indx+1)+ "             "   +score[indx]+ "                   " +point[indx]);
		}

		    System.out.println("\n");
		    System.out.println("Average Score is " + avg);
		    System.out.println("Number of points below average are " + pointBelow(point));
			System.out.println("Number of points Above average are " + pointAbove(point));
    }
}