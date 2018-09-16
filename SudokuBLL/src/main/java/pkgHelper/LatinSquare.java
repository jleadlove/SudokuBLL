package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare()
	{

	}
	
	public boolean ContainsZero(int[] arr1, int[] arr2)
	{
		boolean ContainsZero = false;
		for(int i = 0; i < arr1.length; i++)
		{
			if (arr1[i] == 0 || arr2[i] == 0) {
				ContainsZero = true;
				return ContainsZero;
			}
		}
		return ContainsZero;
			
	}
	
	public boolean doesElementExist(int[] arr, int iValue)
	{
		for(int i : arr)
		{
			if (i == iValue)
				return true;
		}
		return false;
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		LatinSquare = latinSquare;
	}
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int[] arr)
	{
		boolean hasDuplicates = false;
		
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] == arr[i+1])
			{
				hasDuplicates = true;
				break;
			}
		}
		
		return hasDuplicates;
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2) {
		
		boolean hasAllValues = false;
		
		if (arr1 == null || arr2 == null)
			return false;
		
		if (arr1.length != arr2.length)
			return false;
		
		for (int i = 0; i < arr1.length - 1; i++) {
			if (arr1[i] == arr2[i]) {
				hasAllValues = true;
				break;
			}
		}
		
		return hasAllValues;
	}
	
	public int[] getColumn(int iCol) {
		int[] col = new int[LatinSquare.length];
		for (int i = 0; i < LatinSquare.length; i++) {
			col[i] = LatinSquare[i][iCol];
		}
		return col;
	}
	
	public int[] getRow(int iRow) {
		return LatinSquare[iRow];
	}
}
