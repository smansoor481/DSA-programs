package com.dsa;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23,45,67,76,78,89};
		int target = 45;
		int result = BinarySearch(arr,target);
		if(result !=-1)
		{
			
			System.out.println("Element found at index: "+result);
		}
		else
		{
			System.out.println("Element was not found in the array");
		}
	}

	public static int BinarySearch(int[] arr, int target) {
		// TODO Auto-generated method stub
		
		int start=0;
		int end = arr.length-1;
		while(start<=end)
		{
			//find the middle element
			int mid =(end+start)/2;
			
			if(target<arr[mid])
			{
				end = mid-1;
			}
			else if(target>arr[mid])
			{
				start = mid+1;
			}
			else
			{
				//ans found
				return mid;
			}
		}
		return -1;
	}

}
