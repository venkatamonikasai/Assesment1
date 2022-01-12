package com.assign;

public class MonsterTruck extends Truck{
	
	public static void main (String ars[])
	{
		MonsterTruck mt = new MonsterTruck();
		 mt.m1();		
		mt.m2();
	}
	
	public void m1()
	{
		System.out.println("Monster1");
	}
	public void m2()
	{
		super.m1();
	}
	public String toString()
	{
		return "monster" + super.toString();
	}
	
	
}
