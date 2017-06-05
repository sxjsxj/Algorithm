package com.xixi.summary.algorithm.sort;

import java.util.Arrays;

/**
 * 冒泡排序：最小的元素浮上去
 * 
 * @author sunxijin1
 */
public class BubbleSort {

	public static void main(String[] args) {
		Integer[] ints = {1,5,7,2,3,2,4};
		sort(ints);
	}
	
	/**
	 * 原理：
	 * A：相邻两个元素比较，交换，最小的元素浮上去（倒序遍历）
	 * B：相邻两个元素比较，交换，最大的元素沉下去（正序遍历）
	 * @param ints
	 */
	public static void sort(Integer[] ints) {
		for(int i = ints.length-1; i >= 0; i--) {
			for(int j = ints.length-1; j >= ints.length-i; j--) {
				if(ints[j-1] >= ints[j]) {
					int tmp = ints[j];
					ints[j] = ints[j-1];
					ints[j-1] = tmp;
				} 
			}
		}
		System.out.println(Arrays.toString(ints));
	}
}
