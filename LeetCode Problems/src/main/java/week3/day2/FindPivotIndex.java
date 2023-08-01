/**
 * 
 */
package week3.day2;

import org.junit.Test;

/**
 * @author abiramisa
 * Homework
 * https://leetcode.com/problems/find-pivot-index/description/
 * 
 * Given an array of integers nums, calculate the pivot index of this array.
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index 
 * is equal to the sum of all the numbers strictly to the index's right.
 * If the index is on the left edge of the array, then the left sum is 0 because there are no 
 * elements to the left. This also applies to the right edge of the array.
 * Return the leftmost pivot index. If no such index exists, return -1
 * 
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * 
 * 
 *
 */
public class FindPivotIndex {
	@Test
	public void test() {
		System.out.println(findPivotIndex(new int[] {1,7,3,6,5,6}));
	}
	
	@Test
	public void test1() {
		System.out.println(findPivotIndex(new int[] {1,2,3}));
	}
	
	public int findPivotIndex(int[] nums) {
		int pivotIndex=0;
		int leftsum=0;
		int rightsum=0;
		while(pivotIndex!=nums.length) {
			rightsum=0;
			leftsum=0;
			for(int i=pivotIndex+1;i<nums.length;i++) {
				rightsum=rightsum+nums[i];
			}
			for(int j=0;j<pivotIndex;j++) {
				leftsum=leftsum+nums[j];
			}
			if(rightsum==leftsum) {
				return pivotIndex;
			}
			else if(pivotIndex>nums.length) { 
				  pivotIndex=-1;
				  }
			pivotIndex++;
		}
		 
		return -1;
	}

}
