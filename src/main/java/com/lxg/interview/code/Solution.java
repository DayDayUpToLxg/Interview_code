package com.lxg.interview.code;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import com.google.common.collect.Lists;

/**
 * @Description:方案类
 * @author created by Lxg
 * @version
 */
public class Solution {
	
	// 数字与英文字母的映射关系
	private String[] mappings = new String[] {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"}; 
	// 输出结果集
	private List<String> output = Lists.newArrayList(); 
	
	public void solution(int[] digits) {
		if (digits == null || digits.length == 0) System.out.println("输入值不能为空！");
		System.out.println("-----------------------------------------------------");
		System.out.println("输入值：" + Arrays.toString(digits));
		String digits_str = Arrays.stream(digits).mapToObj(String::valueOf).reduce((a, b) -> a.concat(b)).get();
		doCombination("", digits_str);
		System.out.println("输出值：" + output);
		System.out.println("-----------------------------------------------------");
	}
	
	/**
	 * 把数字对应的英文字母进行组合
	 * @param combination 每次组合后的结果
	 * @param next_digit 数字
	 * @return
	 */
	public void doCombination(String combination, String next_digit) {
		if (next_digit.length() == 0) {
			output.add(combination);
			return;
		}
		int digit = Integer.valueOf(next_digit.substring(0,1));
		if (digit == 0 || digit == 1) {
			// 0或1直接跳过，进入下一轮
			doCombination(combination, next_digit.substring(1));
		} else {
			String letters = mappings[digit];
			for (int i=0; i<letters.length(); i++) {
				String letter = letters.substring(i,i+1);
				doCombination(combination + letter, next_digit.substring(1));
			}
		}
	}

}
