package org.array;
//remove duplicate arrays
import java.util.Arrays;
import java.util.Iterator;

public class Sum {
	public static void main(String[] args) {
		int a[]= {10,10,20,50,60,80,60,50};
		Arrays.sort(a);
       int result[]=new int[a.length];
       int k=0;
       for (int i = 0; i < a.length-1; i++) {
		if(a[i]!=a[i+1]) 
			result[k++]=a[i];
       }
            result[k++]=a[a.length-1];
       
            for (int i = 0; i < k; i++) {
				System.out.print(" "+result[i]);
			}

}}
