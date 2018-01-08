//공백을 콤마로 출력하시오 
package com.java.project1;

public class Problem3 {

	public static void main(String[] args) {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','l','e'};
		
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i]);}
		System.out.println();
		for(int i=0; i<c.length; i++) {
			if(c[i]==' ') {
				c[i]=',';
			}System.out.print(c[i]);
				
				
		}
			
	}
	

}
