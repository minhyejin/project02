//5개의 숫자를 입력받아 평균을 구하시오 
package com.java.project1;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double i = 0.0;
		double j = 0.0;
		double sum =0;
		for(int k=0; k<5; k++) {
			System.out.println("숫자 5개 입력하시오");
			i= scan.nextDouble();
			sum = sum+i;
			
		}System.out.println("평균은:"+sum/5);

	}

}
