// import org.junit.Test;
// import static org.junit.Assert.*;
// import java.util.Arrays;

// public class ArraySortTest {
// 	private ArraySort arraySort =  new ArraySort();

//   @Test
//   public void testOddArraySort() {
//     System.out.println("Input Array: [1, 4, 5, 3, 6, 7, 9, 2, 8]");
//     int[] unsorted = {1,4,5,3,6,7,9,2,8};
//     int[] sorted = arraySort.sort(unsorted);
//     System.out.println("Output Array: " + Arrays.toString(sorted));
//     System.out.println("=====================");
//     assertArrayEquals(new int[]{1,2,3,4,5,6,7,8,9}, sorted);
//   }
	
//   @Test
//   public void testNonConsecutiveArraySort() {
//     System.out.println("Input Array: [1, 4, 5, 3, 6, 7, 9, 4, 8, 15]");
//     int[] unsorted = {1,4,5,3,6,7,9,4,8,15};
//     int[] sorted = arraySort.sort(unsorted);
//     System.out.println("Output Array: " + Arrays.toString(sorted));
//     System.out.println("=====================");
//     assertArrayEquals(new int[]{1,3,4,4,5,6,7,8,9,15}, sorted);
//   }

//   @Test
//   public void testSortWithEmptyArray() {
//     System.out.println("Input Array: []");
//     int[] unsorted = {};
//     int[] sorted = arraySort.sort(unsorted);
//     System.out.println("Output Array: " + Arrays.toString(sorted));
//     System.out.println("=====================");
//     assertArrayEquals(new int[]{}, sorted);
//   }

// 	@Test
// 	public void testSortWithNullArray() {
// 		System.out.println("Input Array: null");
//     int[] unsorted = null;
//     int[] sorted = arraySort.sort(unsorted);
//     System.out.println("Output Array: " + Arrays.toString(sorted));
//     System.out.println("=====================");
//     assertArrayEquals(null, sorted);
// 	}

// 	@Test
// 	public void testSortWithJustOneElementArray() {
// 		System.out.println("Input Array: [1]");
//     int[] unsorted = {1};
//     int[] sorted = arraySort.sort(unsorted);
//     System.out.println("Output Array: " + Arrays.toString(sorted));
//     System.out.println("=====================");
//     assertArrayEquals(new int[]{1}, sorted);
// 	}
// }
