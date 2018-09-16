package pkgHelper;

import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void getColumn_test1() {
		int[][] arr1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 1, 2, 3 };
		assertTrue(Arrays.equals(lq.getColumn(0), arr2));
	}

	@Test
	public void getColumn_test2() {
		int[][] arr1 = { { 7, 4, 6 }, { 10, 5, 7 }, { 5, 4, 2 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 4, 5, 4 };
		assertTrue(Arrays.equals(lq.getColumn(1), arr2));
	}

	@Test
	public void getColumn_test3() {
		int[][] arr1 = { { 1, 2, 3, 4 }, { 2, 3, 4, 1 }, { 3, 4, 1, 2 }, { 4, 1, 2, 3 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 2, 3, 4, 1 };
		assertTrue(Arrays.equals(lq.getColumn(1), arr2));
	}

	@Test
	public void getColumn_test4() {
		int[][] arr1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 3, 1, 2 };
		assertTrue(Arrays.equals(lq.getColumn(2), arr2));
	}

	@Test
	public void getRow_test1() {
		int[][] arr1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 2, 1 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 1, 2, 3 };
		assertTrue(Arrays.equals(lq.getRow(0), arr2));
	}

	@Test
	public void getRow_test2() {
		int[][] arr1 = { { 1, 2, 3, 4, 5 }, { 2, 3, 4, 5, 1 }, { 3, 4, 5, 1, 2 }, { 4, 5, 1, 2, 3 },
				{ 5, 1, 2, 3, 4 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 4, 5, 1, 2, 3 };
		assertTrue(Arrays.equals(lq.getRow(3), arr2));
	}

	@Test
	public void getRow_test3() {
		int[][] arr1 = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 2, 1 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 3, 2, 1 };
		assertTrue(Arrays.equals(lq.getRow(2), arr2));
	}

	@Test
	public void getRow_test4() {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int[] arr2 = { 4, 5, 6 };
		assertTrue(Arrays.equals(lq.getRow(1), arr2));
	}

	@Test
	public void containsZeroTest1() {
		int[][] myArray = { { 1, 2, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(myArray);
		assertFalse(ls.ContainsZero());
	}

	@Test
	public void containsZeroTest2() {
		int[][] myArray = { { 1, 0, 3 }, { 2, 3, 1 }, { 3, 1, 2 } };
		LatinSquare ls = new LatinSquare(myArray);
		assertTrue(ls.ContainsZero());
	}

	@Test
	public void doesElementExistTest() {
		int[] arr1 = { 1, 2, 3 };
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.doesElementExist(arr1, 3));
		assertFalse(ls.doesElementExist(arr1, 4));
	}

	@Test
	public void hasDuplicatesTest1() {
		int[] arr = { 1, 2, 3, 4, 5 };
		LatinSquare ls = new LatinSquare();
		assertFalse(ls.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicatesTest2() {
		int[] arr = { 1, 2, 3, 0, 5, 0 };
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.hasDuplicates(arr));
	}

	@Test
	public void hasDuplicatesTest3() {
		int[] arr = { 1, 1, 2, 2, 3, 3, 3 };
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.hasDuplicates(arr));
	}

	@Test
	public void hasAllValuesTest() {
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 3, 1, 2 };
		int[] arr3 = { 2, 3, 4 };
		LatinSquare ls = new LatinSquare();
		assertTrue(ls.hasAllValues(arr1, arr2));
		assertFalse(ls.hasAllValues(arr1, arr3));
	}
}
