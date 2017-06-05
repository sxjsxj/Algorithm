package com.xixi.summary.algorithm.sort;

import java.util.Arrays;

/**
 * 直接插入排序
 * 
 * @author sunxijin1
 */
public class DirectInsertSort {

	public static void main(String[] args) {
		Integer[] ints = {1,5,7,2,3,2,4};
		sort(ints);
	}
	
	/**
	 * 原理： 从后往前遍历，直到找到元素的合适位置。
	 * 将当前数据插入到已排好序的数组中，取当前元素与已经排好序的元素比较，
	 * 如果当前元素较小，则被比较元素往后移动；
	 * 直到当前元素大于等于被比较元素，将当前元素放到合适的位置。
	 * @param ints
	 */
	public static void sort(Integer[] ints) {
		for(int i = 1; i <= ints.length-1; i++) {
			Integer current = ints[i];
			for(int j = i; j >= 0; j--) {
				if(current <= ints[j-1]) {
					ints[j] = ints[j-1];
				} else {
					ints[j] = current;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(ints));
	}
}
