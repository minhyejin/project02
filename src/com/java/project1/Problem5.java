package com.java.project1;

import java.util.Scanner;

//임의의 6숫자를 출력하시오 중복 안됨 
public class Problem5 {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int i[] = new int[6];
	   int sum = 45; int a=1;
	  for(a=1; a<6; a++) {
		  a=(int)(Math.random())*sum+1;
		  i[a]=a;
		  sum=sum-1;
	  for(int b =0; b<sum; b++) {
		  if(i[a]==i[b])
			  b=(int)(Math.random())*sum+1;
		 break;
		  
		}break;	  
	  }
	 
	  for(a=0; a<6; a++)
		  System.out.println("로또번호"+i[a]);
	   
	   
	   

	}

}
