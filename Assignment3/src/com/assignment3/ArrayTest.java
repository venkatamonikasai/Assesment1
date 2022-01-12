package com.assignment3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayTest {
	
	public static void main (String args[])
	{
		int [] list = {3, 6, 12, 4, 5, 7, 8, 9, 10, 11};
		ArrayTest arr = new ArrayTest();
		arr.isUnique(list);
	}
	@SuppressWarnings("unchecked")
	public static boolean isUnique(int arr[])
	{
		Set s = new HashSet (Arrays.asList(arr));
		if(s.size()==arr.length) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
