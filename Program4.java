
//8.9 (Game: play a tic-tac-toe game)2-D arrays


import java.util.Scanner;
public class Program4
{
	public static void main(String[]args)
	{
		String[][] arr = new String[3][3];
		String currentPlayer = " ";
		emptyBoard(arr);
		Scanner keyboard  = new Scanner(System.in);

		display(arr);
		playGame(keyboard,arr,currentPlayer);
	}

	public static void playGame(Scanner kbd,String[][] arr, String currentPlayer)
	{
		for(int indx = 0; indx<11;indx++)
		{
			int r = 0;
			int c = 0;
			if(indx%2 == 0)
			{
			System.out.print("Enter a row for player X: ");
			r = kbd.nextInt();
			System.out.print("Enter a column for player X: ");
			c = kbd.nextInt();
		    }
		    else
		    {
			System.out.print("Enter a row for player Y: ");
			r = kbd.nextInt();
			System.out.print("Enter a column for player Y: ");
			c = kbd.nextInt();
			}
			if(indx%2 == 0)
			markOnBoard(r,c,arr,"x");
			else
			markOnBoard(r,c,arr,"o");

			display(arr);

			if(filledFull(arr))
			{
			    if(checkWin(arr,"x"))
				{
				System.out.println("X"+ " player won");
				System.exit(0);
				}
				else if(checkWin(arr,"o"))
				{
				System.out.println("Y"+ " player won");
		     	System.exit(0);
				}
				else
				{
				System.out.println("The game is draw");
				System.exit(0);
		    	}
		    }
		    else if(checkWin(arr,"x"))
		    {
				System.out.println("X"+ " player won");
				System.exit(0);
			}
			else if(checkWin(arr,"o"))
		    {

			    System.out.println("Y"+ " player won");
		     	System.exit(0);
			}





		}
	}

	public static void emptyBoard(String[][] arr)
	{
		for(int indx = 0;indx<3;indx++)
		{
			for(int indx1 = 0; indx1<3;indx1++)
			{
				arr[indx][indx1] = " ";
			}

		}
	}
	public static void display(String[][] arr)
	{
		System.out.println("-------------");

		for(int indx = 0; indx<3; indx++)
		{
			System.out.print("| ");

			for(int indx1 = 0; indx1<3;indx1++)
			{
				System.out.print(arr[indx][indx1] + " | ");
			}
			System.out.println();

			System.out.println("-------------");
		}
	}

	public static boolean filledFull(String [][] arr)
	{
		boolean full = true;

		for(int indx = 0; indx<3; indx++)
		{
			for(int indx1 = 0; indx1<3;indx1++)
			{
				if(arr[indx][indx1] == " ") full = false;
			}
		}
		return full;
	}

	public static boolean checkWin(String [][] arr, String currentPlayer)
	{
		return (checkRowsWin(arr) || checkColumnWin(arr) || checkDiagonalWin(arr));
	}

	public static boolean checkRowsWin(String[][] arr)
	{
		for(int indx = 0; indx<3;indx++)
		{
			if(rowCol(arr[indx][0], arr[indx][1], arr[indx][2])== true) return true;

		}
		return false;
	}
	public static boolean checkColumnWin(String[][] arr)
	{
		for(int indx = 0; indx<3; indx++)
		{
			if(rowCol(arr[0][indx], arr[1][indx], arr[2][indx]) == true) return true;
		}
		return false;
	}
	public static boolean checkDiagonalWin(String[][] arr)
	{
		return ((rowCol(arr[0][0], arr[1][1], arr[2][2]) == true) || (rowCol(arr[0][2], arr[1][1], arr[2][0]) == true));
	}

	public static boolean rowCol(String a, String b, String c)
	{
		return((a != " ") && (a==b) && (b==c));
	}

	public static boolean markOnBoard(int r,int c, String[][]arr,String currentPlayer)
	{
		if((r>=0) && (r<3))
		{
			if((c>=0) && (c<3))
			{
				if(arr[r][c] == " ")
				{
					arr[r][c] = currentPlayer;
					return true;
				}
			}
		}
		return false;
	}

}