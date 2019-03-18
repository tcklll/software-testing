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
	public void test1() {//ǡ�õ����ܽ��
		s.dp();
		assertEquals(true,s.judge(83));
	}
	@Test
	public void test2() {//�����ܽ��
		s.dp();
		assertEquals(false,s.judge(100));
	}
	@Test
	public void test3() {//0���������֮һ
		s.dp();
		assertEquals(true,s.judge(0));
	}
	@Test
	public void test4() {//���Դճ������
		s.dp();
		assertEquals(true,s.judge(27));
	}
	@Test
	public void test5() {//�����Դճ������
		s.dp();
		assertEquals(false,s.judge(4));
	}
	@Test
	public void test6() {//С����� error
		s.dp();
		assertEquals(false,s.judge(4.3));
	}
	@Test
	public void test7() {//�������
		s.dp();
		assertEquals(false,s.judge(-4));
	}
}
