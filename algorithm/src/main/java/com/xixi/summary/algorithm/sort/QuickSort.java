package com.xixi.summary.algorithm.sort;

import java.util.Arrays;

/**
 * 快速排序：将N个元素的排序，不断地二分，递归得到最终的排序结果
 * 
 * @author sunxijin1
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] ints = { 3, 5, 7, 1, 3, 2, 4 };
		sort(ints, 0, ints.length - 1);
		System.out.println(Arrays.toString(ints));
	}

	/**
	 * 原理： 取第一个元素作为折半标准A，大于A的在A的右边，小于A的在A的左边。 折半的算法为： 从最右边high寻找第一个小于A的，与A交换位置；
	 * 从最左边low寻找第一个大于A的，与A交换位置； 直至low=high为止
	 * 
	 * @param ints
	 */
	 public static void sort(int[] array,int lo ,int hi){
	        if(lo>=hi){
	            return ;
	        }
	        int index=partition(array,lo,hi);
	        sort(array,lo,index-1);
	        sort(array,index+1,hi); 
	    }

	/**
	 * 查找出中轴（默认是最低位low）的在numbers数组排序后所在位置.
	 * 挖坑法：
	 * 将第一个元素取出，作为基准元素key。从后面挖出一个比key大的，填入前面空缺的位置；
	 * 然后从前面挖出一个，填入后面的位置，直至low与high相等。
	 * 极端情况下---
	 * 如果key最大，从后面挖出一个元素填入后，low指针一直后移，直到与high相等，填入key；
	 * 如果key最小，从后面high指针一直前移，直到low与high相等，填入key。
	 * 交换法：
	 * 从后端寻找一个小于key的，从前端找一个大于key的，两者交换；low、high移动，继续交换；
	 * 当low与high相等时，结束；取当前位置与key交换。
	 * @param numbers 带查找数组
	 * @param low 开始位置
	 * @param high 结束位置
	 * @return 中轴所在位置
	 */
	public static int partition(int []array,int lo,int hi){
        //将第一个元素，从数组中取出。
        int key = array[lo];
//        while(lo<hi){
//            while(array[hi]>=key&&hi>lo){//从后半部分向前扫描
//                hi--;
//            }
//            array[lo]=array[hi];
//            while(array[lo]<=key&&hi>lo){//从前半部分向后扫描
//                lo++;
//            }
//            array[hi]=array[lo];
//        }
//        array[hi]=key;
        int begin = lo;
        lo++;
        while(lo < hi) {
        	//从前面寻找一个比key大的元素
        	while(array[lo] <= key && hi > lo) {
        		lo++;
        	}
        	//从后面寻找一个比key小的元素
        	while(array[hi] > key && hi > lo) {
        		hi--;
        	}
        	int tmp = array[lo];
        	array[lo] = array[hi];
        	array[hi] = tmp;
        }
        if(array[lo] > key) {
        	array[begin]=array[lo-1];
        	array[lo-1] = key;
        	return lo-1;
        } else {
        	array[begin]=array[lo];
        	array[lo] = key;
        	return lo;
        }
    }
}
