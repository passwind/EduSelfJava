package com.qcsoft.java.basic;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class BasicTest2 {
	private List<BasicTest1> data;
		
	public List<BasicTest1> getData() {
		return data;
	}

	public void setData(List<BasicTest1> data) {
		this.data = data;
	}

	public static void main(String[] args)
	{
		List<BasicTest1> data1=new LinkedList<>();
		List<BasicTest1> data2=new ArrayList<>();
		
		Date beginTime=new Date();
		for(int i=0;i<1000000;i++)
		{
			BasicTest1 item=new BasicTest1(i,100);
			data1.add(item);
		}
		Date endTime=new Date();
		long expiredTime=endTime.getTime()-beginTime.getTime();
		
		Date beginTime1=new Date();
		for(int i=0;i<1000000;i++)
		{
			BasicTest1 item=new BasicTest1(i,100);
			data2.add(item);
		}
		Date endTime1=new Date();
		long expiredTime1=endTime1.getTime()-beginTime1.getTime();
		
		System.out.println(expiredTime);
		System.out.println(expiredTime1);
	}
}
