package com.qcsoft.java.basic;

import java.util.ArrayList;
import java.util.List;

public class BasicTest3 {
	public static void changeValue(BasicTest2 o)
	{
		List<BasicTest1> list=new ArrayList<>();
		list.add(new BasicTest1(1,10));
		list.add(new BasicTest1(2,11));
		o.setData(list);
	}
	
	public static void changeValue1(BasicTest2 o1,BasicTest2 o2)
	{
		o1.getData().remove(0);
		
		o2=new BasicTest2();
	}
	
	public static void main(String[] args)
	{
		BasicTest2 data1=new BasicTest2();
		BasicTest2 data2=data1;
		
		System.out.println(data2==data1);
		System.out.println(data2.equals(data1));
		
		changeValue(data2);
		
		System.out.println(data2==data1);
		System.out.println(data2.equals(data1));
		
		changeValue1(data1,data2);
		
		System.out.println(data2.getData().size());
		System.out.println(data1.getData().size());
	}
}
