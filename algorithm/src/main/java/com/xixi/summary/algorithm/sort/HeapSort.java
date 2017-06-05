package com.xixi.summary.algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序：直接选择排序的有效改进。
 * 
 * @author sunxijin1
 */
public class HeapSort {

	public static void main(String[] args) {
		Integer[] ints = {1,5,7,2,3,2,4};
		sort(ints);
	}
	
	/**
	 * 原理： 选择最小的，多次选择
	 * @param ints
	 */
	public static void sort(Integer[] ints) {
		for(int i = 0; i <= ints.length-1; i++) {
			Integer min = ints[i];
			Integer tmp = i;
			for(int j = i+1; j <= ints.length-1; j++) {
				if(ints[j] <= min) {
					min = ints[j];
					tmp = j;
				} 
			}
			ints[tmp] = ints[i];
			ints[i] = min;
		}
		System.out.println(Arrays.toString(ints));
	}
}
