import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class test2 {
	@Test
	public void test2(){
		int m = 10;
        int n = 3;
        int w[] = {3, 4, 5};
        int p[] = {4, 5, 6};
        int c[][] = BackPack.BackPack_Solution(m, n, w, p);
        int ans[][]= new int[][]{{0,0,0,0,0,0,0,0,0,0,0},{0,0,0,4,4,4,4,4,4,4,4},{0,0,0,4,5,5,5,9,9,9,9},{0,0,0,4,5,6,6,9,10,11,11}};
        assertArrayEquals(ans,c);
        
    }
}
