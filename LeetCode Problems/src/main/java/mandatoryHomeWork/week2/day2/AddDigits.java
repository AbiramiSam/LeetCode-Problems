/**
 * 
 */
package mandatoryHomeWork.week2.day2;

import org.junit.Test;

import junit.framework.Assert;

/**
 * @author abiramisa
 *https://leetcode.com/problems/add-digits/description/
 *
 *Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.
 *Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
 *
 *Pseudocode:
 *Iterate through the array
 *total
 *
 *
 */
public class AddDigits {
	@Test
	public void test() {
		int val=findAddDigits(384);
		int res=0;
			  if(val>9) { 
			  res=findAddDigits(val); 
			  }
			 System.out.println("Final result"+res);
	}
	
	@Test
	public void test1() {
		int val=findAddDigits(38);
		int res=0;
			  if(val>9) { 
			  res=findAddDigits(val); 
			  }
			 System.out.println("Final result"+res);
	}
	
	@Test
	public void test2() {
		int val=findAddDigits(0);
		int res=0;
			  if(val>9) { 
			  res=findAddDigits(val); 
			  }
			 System.out.println("Final result"+res);
	}
	
	public int findAddDigits(int num) {
		//int num=384;
		String value=String.valueOf(num);
		int length=value.length();
		//System.out.println(length);
		int total=0;
		int mod=0;
		
		for(int i=0;i<=length;i++) {			
			mod=num%10;
			total=total+mod;
			num=num/10;
	}
		System.out.println(total);
		return total;
	}
	
}
