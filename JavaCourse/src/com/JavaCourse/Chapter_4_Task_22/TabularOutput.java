package com.JavaCourse.Chapter_4_Task_22;

public class TabularOutput {

	public static void main(String[] args) {
		
		int i = 1;
		int n = 1;
		
		while(i <= 5) {
			
			System.out.println(n + "	" + n*10 + "	" + n*100 + "	" + n*1000);
			
			n++;
			i++;
		}

	}

}
