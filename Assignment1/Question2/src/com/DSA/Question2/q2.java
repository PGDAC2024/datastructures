package com.DSA.assignment1;



public class q2 {
	
	public static int linearSearch(int arr[],int key)
	{   
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==key) {
				index = i;
			}
		}
		return index;
	}
	
   public static void main(String[] args) {
	 int arr[]= {77,33,44,99,23,77,66};
	 System.out.println(linearSearch(arr, 77));
	 
  }
   
}
