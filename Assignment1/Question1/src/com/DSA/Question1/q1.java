package com.DSA.assignment1;

public class q1 {
    
	public static boolean isPallindrome(String s) 
	{
		//space complexiety = O(1)
		//time complexiety = O(n)
	    int left = 0;
	    int right= s.length()-1;
	    while(left<=right) {
	    	if(s.charAt(left) != s.charAt(right))
	    		return false;
	    	
	    	left++;
	    	right--;
	    }
	    return true;
	}
	
	public static boolean ispallindromeRecursion(String s, int left, int right) {
         //space complexiety O(n)   
		//Time complexiety O(n)   
		if(left > right) {
        	   return true;
           }
           if (s.charAt(right) != s.charAt(left)) {
        	   return false;
           }
           return ispallindromeRecursion(s, left+1, right-1);
	}
	
	public static boolean isPallindromeReverseString(String s) 
	{
		
		
		//time complexiety O(n)
		//space complexiety O(n)
		StringBuilder rev = new StringBuilder(s).reverse();
		//System.out.println(rev.toString());
	//	System.out.println(s);
		if(s.equals(rev.toString()) ) 
		{ 
			//System.out.println("inside if");
			return true;
			
		}
		
		 return false;
	}
	
	public static void main(String[] args) {
		//check if given string is pallindrome or not
		//System.out.println(isPallindrome("dod"));
		//System.out.println(ispallindromeRecursion("dod",0,2));
		//System.out.println(isPallindrome("dob"));
		//System.out.println(ispallindromeRecursion("dob",0,2));
		
		System.out.println(isPallindromeReverseString("dod"));
	//	System.out.println(isPallindromeReverseString("dob"));
          
	}

}
