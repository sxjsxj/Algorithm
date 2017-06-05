package com.xixi.summary.algorithm.sort;

import java.util.Arrays;

/**
 * 希尔排序：加强版的直接插入排序
 * 
 * @author sunxijin1
 */
public class ShellSort {

	public static void main(String[] args) {
		Integer[] ints = {1,5,7,2,3,2,4};
		sort(ints);
	}
	
	/**
	 * 原理： 从后往前遍历，直到找到元素的合适位置。
	 * 首先按照指定增量increment进行插入排序；
	 * increment递减直到为1，进行最后一次插入排序.
	 * 
	 * 为什么说希尔排序是直接插入排序的加强版？
	 * 最外层循环增加increment，目的是保证间隔元素的基本有序。
	 * 时间复杂度大约是 increment*(1+2+..+n) 
	 * @param ints
	 */
	public static void sort(Integer[] ints) {
		for(int increment = ints.length/2; increment >=1; increment/=2) {
			for(int i = increment; i <= ints.length-1; i++) {
				Integer current = ints[i];
				for(int j = i; j >= increment; j-=increment) {
					if(current <= ints[j-increment]) {
						ints[j] = ints[j-increment];
						ints[j-increment] = current;
					} else {
						break;
					}
				}
			}
			System.out.println(Arrays.toString(ints));
		}
	}
}
