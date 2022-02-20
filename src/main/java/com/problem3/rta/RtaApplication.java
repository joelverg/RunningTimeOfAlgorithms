package com.problem3.rta;


import java.io.IOException;

import java.util.Scanner;

import com.problem3.rta.entity.Given;
import com.problem3.rta.impl.InsertionSort;



public class RtaApplication {

	public static void main(String[] args) throws IOException {
		
		InsertionSort insertionSort = new InsertionSort();
		
		Given given = new Given();
		
		Scanner in = new Scanner(System.in);
		
        int n = in.nextInt();
        given.setNumberOfElements(n);
        
        int[] arr = new int[given.getNumberOfElements()];
        
        for(int i = 0; i < given.getNumberOfElements(); i++){
        	
           arr[i] = in.nextInt(); 
        }
        
        given.setArr(arr);
       
        insertionSort.sort(given.getArr());
		
	}
}
