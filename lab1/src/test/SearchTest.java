package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import program.Search;

public class SearchTest {

	private Search s;
	@Before
	public void setUp() throws Exception{
		s=new Search();
	}
	@Test
	public void test1() {//恰好等于总金额
		s.dp();
		assertEquals(true,s.judge(83));
	}
	@Test
	public void test2() {//超出总金额
		s.dp();
		assertEquals(false,s.judge(100));
	}
	@Test
	public void test3() {//0是特殊情况之一
		s.dp();
		assertEquals(true,s.judge(0));
	}
	@Test
	public void test4() {//可以凑出的情况
		s.dp();
		assertEquals(true,s.judge(27));
	}
	@Test
	public void test5() {//不可以凑出的情况
		s.dp();
		assertEquals(false,s.judge(4));
	}
	@Test
	public void test6() {//小数情况 error
		s.dp();
		assertEquals(false,s.judge(4.3));
	}
	@Test
	public void test7() {//负数情况
		s.dp();
		assertEquals(false,s.judge(-4));
	}
}
