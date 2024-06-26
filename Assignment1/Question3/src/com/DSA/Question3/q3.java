package com.DSA.assignment1;

public class q3 {
     
	public static int linearSearch(int arr[],int key)
	{   
	     int comp=0;	
		for (int i = 0; i < arr.length; i++) {
			comp++;
			if(arr[i]==key) {
				return comp;
			}
		}
		return comp;
	}
	
	public static int binarySearch(int arr[],int key) 
	{
		int left =0;
		int right=arr.length-1;
		int mid = (left+right)/2;
		int comp=0;
		
		while(left<=right) {
			comp++;
			if(arr[mid]== key) {
	          	return comp;
			}else if(arr[mid]<key) 
			{
				right=mid-1;
			}else 
			{
				left = mid+1;
			}
			mid = (left+right)/2;
		}
		return comp;
	}
	
	public static void main(String[] args) {
        
		int arr[] = {11,22,33,44,55,66,77,88};
		System.out.println("number of comparision in Lenearsearch:" + linearSearch(arr, 66));
		System.out.println("number of comparision in Binarysearch:" + binarySearch(arr, 66));

	}

}
