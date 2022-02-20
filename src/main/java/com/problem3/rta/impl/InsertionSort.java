package com.problem3.rta.impl;

public class InsertionSort {
	public static void sort(int[] ar) {
		
        int count = 0;              
      
        for(int i = 1; i < ar.length; i++){	                  
      	  int n = ar[i];
      	  int j = i - 1;
      	  
      	  while( j >= 0 && ar[j] > n){	
      		  ar[j + 1] = ar[j];		
      		  j--;
      		  count++;
	     }
      	  
      	  	ar[j + 1] = n;
	    }	
        System.out.println(count);
     }
}