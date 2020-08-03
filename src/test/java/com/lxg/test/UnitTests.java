package com.lxg.test;

import org.junit.Test;

import com.lxg.interview.code.Solution;

/**
 * @Description:单元测试类
 * @author created by Lxg
 * @version
 */
public class UnitTests {
	
	@Test
	public void test01() {
		int[] digits = {2,3};
		Solution solution = new Solution();
		solution.solution(digits);
	}

	@Test
	public void test02() {
		int[] digits = {9};
		Solution solution = new Solution();
		solution.solution(digits);
	}
	
	@Test
	public void test03() {
		int[] digits = {2,0,3,1};
		Solution solution = new Solution();
		solution.solution(digits);
	}
	
	@Test
	public void test04() {
		int[] digits = {0,2,3,1};
		Solution solution = new Solution();
		solution.solution(digits);
	}
	
	@Test
	public void test05() {
		int[] digits = {0,1,2,3,4};
		Solution solution = new Solution();
		solution.solution(digits);
	}
	
}
