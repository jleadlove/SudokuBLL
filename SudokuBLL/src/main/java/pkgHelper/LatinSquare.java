package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {

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

	public boolean hasDuplicates(int[] arr) {
		boolean hasDuplicates = false;

		if (arr == null)
			return false;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				hasDuplicates = true;
				break;
			}
		}

		return hasDuplicates;
	}

	public boolean doesElementExist(int[] arr, int iValue) {
		for (int i : arr) {
			if (i == iValue)
				return true;
		}
		return false;
	}

	public boolean hasAllValues(int[] arr1, int[] arr2) {

		boolean hasAllValues = false;

		if (arr1 == null || arr2 == null)
			return false;

		if (arr1.length != arr2.length)
			return false;

		Arrays.sort(arr1);
		Arrays.sort(arr2);

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

	public boolean isLatinSquare() {

		boolean isLatinSquare = true;
		if (ContainsZero() == true)
			return false;
		else {
			for (int i = 0; i < LatinSquare.length; i++) {
				for (int j = 0; j < LatinSquare.length; j++)
					if (hasDuplicates(getColumn(i)) == true || hasDuplicates(getRow(j)) == true) {
						isLatinSquare = false;
						break;
					}
			}
			for (int i = 0; i < LatinSquare.length - 1; i++) {
				for (int j = 0; j < LatinSquare.length - 1; j++) {
					if ((hasAllValues(getColumn(i), getRow(j)) == true)
							&& (hasAllValues(getColumn(i), getColumn(i + 1)) == true)
							&& (hasAllValues(getRow(j), getRow(j + 1)) == true)) {
						isLatinSquare = true;
						break;
					}
				}
			}

		}
		return isLatinSquare;

	}

	public boolean ContainsZero() {
		for (int iCol = 0; iCol < LatinSquare.length; iCol++) {
			for (int iRow = 0; iRow < LatinSquare.length; iRow++) {
				if (LatinSquare[iCol][iRow] == 0) {
					return true;
				}
			}
		}
		return false;
	}
}
