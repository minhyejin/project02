package com.java.project1;

import java.util.Scanner;

//키보드로 정수를 입력받아 5000원 10000원 500원 100원 각 몇개로 변환되는지 쓰시오 
public class Problem4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		
		System.out.println("숫자를 입력하세요.");
		i=scan.nextInt();
		
		System.out.println("50000원은:"+i/50000+"개");
		i=i%50000;
		System.out.println("10000원은:"+i/10000+"개");
		i=i%10000;
		System.out.println("5000원은:"+i/5000+"개");
		i=i%5000;
		System.out.println("1000원은:"+i/1000+"개");
		i=i%1000;
		System.out.println("100원은:"+i/100+"개");
		i=i%100;
		System.out.println("10원은:"+i/10+"개");
		i=i%10;
	}

}
