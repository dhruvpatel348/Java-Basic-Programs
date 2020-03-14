
//7.36  (Game: Eight Queens)1-D arrays

public class Program3
{
public static void main(String[]args)
{
	putQueens(8);
}

public static void putQueens(int tSize)
{
	int[] arr = new int[tSize];
	placeQueens(arr,0);
	displayQueensBoard(arr);
}
public static boolean placeQueens(int[] arr, int r)
{
	if(r==arr.length)return true;

	boolean queensFilled = false;

	for(int indx = 0; indx<arr.length; indx++)
	{
		arr[r] = indx;

		if(verifyPosition(arr,r))queensFilled = placeQueens(arr,r+1);
		if(queensFilled)return true;
	}
	return false;
}
public static boolean verifyPosition(int[] arr, int r)
{
	for(int indx = 0; indx<r; indx++)
	{
		if(arr[indx] == arr[r]) return false;
		if(arr[indx]-arr[r] == (indx-r)) return false;
		if(arr[r]-arr[indx] == (indx-r)) return false;
	}
	return true;
}
public static void displayQueensBoard(int[] arr)
{
	for(int indx = 0; indx<arr.length; indx++)
	{
		for(int indx1 = 0; indx1<arr.length; indx1++)
		{
			if(indx1 == 0)
			{
				if(indx1==arr[indx]) System.out.print("|Q|");
				else System.out.print("| |");
			}
			else
			{
				if(arr[indx] == indx1) System.out.print("Q|");
				else System.out.print(" |");
			}
		}
           System.out.println();
	}

}
}