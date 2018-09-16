package pkgHelper;

import java.util.Arrays;
import static org.junit.Assert.*;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void getColumn_test1() {
		int[][] arr1 = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {1,2,3};
		assertTrue(Arrays.equals(lq.getColumn(0),arr2));
	}
	
	@Test
	public void getColumn_test2() {
		int[][] arr1 = {{7,4,6},{10,5,7},{5,4,2}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {4,5,4};
		assertTrue(Arrays.equals(lq.getColumn(1),arr2));
	}

	@Test
	public void getColumn_test3() {
		int[][] arr1 = {{7,4,6,2},{10,5,7},{5,4}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {4,5,4};
		assertTrue(Arrays.equals(lq.getColumn(1),arr2));
	}
	
	@Test
	public void getColumn_test4() {
		int[][] arr1 = {{1,2,3},{2,3,1},{3,1,2}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {3,1,2};
		assertTrue(Arrays.equals(lq.getColumn(2),arr2));
	}
	
	@Test
	public void getRow_test1() {
		int[][] arr1 = {{1,2,3},{2,3,1},{3,2,1}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {1,2,3};
		assertTrue(Arrays.equals(lq.getRow(0),arr2));
	}
	
	@Test
	public void getRow_test2() {
		int[][] arr1 = {{1},{6,3,8},{5,4},{4,7,8,4,2,5}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {5,4};
		assertTrue(Arrays.equals(lq.getRow(2),arr2));
	}
	
	@Test
	public void getRow_test3() {
		int[][] arr1 = {{1,2,3},{2,3,1},{3,2,1}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {3,2,1};
		assertTrue(Arrays.equals(lq.getRow(2),arr2));
	}
	
	@Test
	public void getRow_test4() {
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		LatinSquare lq = new LatinSquare();
		lq.setLatinSquare(arr1);
		int [] arr2 = {4,5,6};
		assertTrue(Arrays.equals(lq.getRow(1),arr2));
	}
	
}
