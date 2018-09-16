package pkgHelper;

import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void getColumn_test1() {
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {2,5,8};
		assertTrue(Arrays.equals(lq.getColumn(1),arr2));
	}
	
	public void getColumn_test2() {
		int[][] arr1 = {{7,4,6},{10,5,7},{5,4,2}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {7,10,5};
		assertTrue(Arrays.equals(lq.getColumn(1),arr2));
	}

	
}
