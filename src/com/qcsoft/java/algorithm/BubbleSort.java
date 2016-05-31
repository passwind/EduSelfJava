package com.qcsoft.java.algorithm;

import java.util.Arrays;


public class BubbleSort {
	public static int[] sort(int[] data)
	{
		for(int i=0;i<data.length-1;i++)
		{
			for(int j=0;j<data.length-1-i;j++)
			{
				if(data[j]>data[j+1])
				{
					int tmp=data[j+1];
					data[j+1]=data[j];
					data[j]=tmp;
				}
			}
		}
		
		return data;
	}
	
	public static void main(String[] args)
	{
		int[] orig={123,23,44,567,12363,1,3,88,77,22,13,100};
		
		System.out.println("before: "+Arrays.toString(orig));
		
		int[] sorted=BubbleSort.sort(orig);
		
		System.out.println("after: "+Arrays.toString(sorted));
	}
}
