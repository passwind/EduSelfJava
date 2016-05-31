package com.qcsoft.java.basic;

public class BasicTest1 {
	private Integer id;
	private Integer count;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
	
	public BasicTest1(Integer id, Integer count) {
		super();
		this.id = id;
		this.count = count;
	}

	public void changeValue(BasicTest1 o)
	{
		o.setCount(10);
	}
	
	public static void main(String[] args){
		BasicTest1 var1=new BasicTest1(1,10);
		BasicTest1 var2=new BasicTest1(1,10);
		
		System.out.println(var1==var2);
		System.out.println(var1.equals(var2));
	
		var1.changeValue(var2);
		
		System.out.println(var1.getCount()==var2.getCount());
		System.out.println(var1.getCount().equals(var2.getCount()));
	}
}
