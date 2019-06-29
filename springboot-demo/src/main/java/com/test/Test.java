package com.test;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		int[] arry= {2,5,1,4,9,11,7,6};
		/*for(int i=0;i<arry.length-1;i++) {
			for(int j=arry.length-1;j>i;j--) {
				if(arry[j]>arry[j-1]) {
					int temp=arry[j-1];
					arry[j-1]=arry[j];
					arry[j]=temp;
				}
			}
			//System.out.println(Arrays.toString(arry));
		}
		
		
		for(int i=0;i<arry.length-1;i++) {
			for(int j=0;j<arry.length-1-i;j++) {
				if(arry[j+1]<arry[j]) {
					int temp=arry[j];
					arry[j]=arry[j+1];
					arry[j+1]=temp;
				}
			}
		}*/
		//System.out.println(Arrays.toString(arry));
		
		for(int i=0;i<arry.length;i++) {
			for(int j=0;j<arry.length;j++) {
				if(arry[i]>arry[j]) {
					int temp=arry[i];
					arry[i]=arry[j];
					arry[j]=temp;
				}
			}
			System.out.println(Arrays.toString(arry));
		}
		
	}
	
}
