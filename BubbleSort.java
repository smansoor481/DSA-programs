package com.dsa;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {23,45,67,12,34};
		System.out.println("Before sorting");
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j] > arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
		System.out.println();
		System.out.println("After sorting");
		for(int num : arr)
		{
			System.out.print(num+" ");
		}
	}
	
	

}
