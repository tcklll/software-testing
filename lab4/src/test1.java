import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class test1 {
	@Test
	public void test1(){
        int arr[] = new int[]{1,6,2,2,5};
        BubbleSort.BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        int a[]=new int[] {1,2,2,5,6}; 
       //assertEquals(Arrays.toString(a),Arrays.toString(arr));
        assertArrayEquals(a,arr);
    }
}
