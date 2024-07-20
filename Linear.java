package com.dsa;

public class Linear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23,45,67,89,90};
		int target=23;
		int result = linearsearch(arr,target);
		if(result != -1) 
		{
			System.out.println("Element found at index: "+result);
		}
		else
		{
			System.out.println("Element not found in the array");
		}
	}

	public static int linearsearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int index=0;index<arr.length;index++)
		{
			int element=arr[index];
			if(element==target)
			{
				return element;
			}
			
		}
		return -1;
	}

 
}
