package com.java.project1;

import java.util.Scanner;

//임의의 6숫자를 출력하시오 중복 안됨 
public class Problem5 {

	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
	   int i[] = new int[6];
	   int count=0;
	  getrandom : while(count<6) {
		  int num=(int)(Math.random()*45+1);
		  int b;	 
		  for(b =0; b<count; b++) {
			  if(num==i[b]) {
				  System.out.println("중복된 숫자 : " + num);
				  continue getrandom;
			  }
		  }
		  i[count]=num;
		  System.out.println(i[count]);
		  count++;
	  }
	}

}
