//2.31 (Table of Squares and Cubes) Using only the programming techniques you learned in this
//chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
//prints the resulting values in table format, as shown below. 
//
//number square cube
//0		0		0
//1 	1		1
//2		4		8
//3		9		27
//4  	16		64
//5 	25 		125
//6 	36		216
//7 	49		343
//8 	64		512
//9 	81		729
//10 	100		1000


package com.JavaCourse.Chapter_2;

public class Task_2_31 {

	public static void main(String[] args) {
		
		int a = 0,
			b = 1,
			c = 2,
			d = 3,
			e = 4,
			f = 5,
			g = 6,
			h = 7,
			i = 8,
			j = 9,
			k = 10;
		
		// caclulations + output
		System.out.println(a + "\t" + a*a + "\t" + a*a*a + "\t");
		System.out.println(b + "\t" + b*b + "\t" + b*b*b + "\t");
		System.out.println(c + "\t" + c*c + "\t" + c*c*c + "\t");
		System.out.println(d + "\t" + d*d + "\t" + d*d*d + "\t");
		System.out.println(e + "\t" + e*e + "\t" + e*e*e + "\t");
		System.out.println(f + "\t" + f*f + "\t" + f*f*f + "\t");
		System.out.println(g + "\t" + g*g + "\t" + g*g*g + "\t");
		System.out.println(h + "\t" + h*h + "\t" + h*h*h + "\t");
		System.out.println(i + "\t" + i*i + "\t" + i*i*i + "\t");
		System.out.println(j + "\t" + j*j + "\t" + j*j*j + "\t");
		System.out.println(k + "\t" + k*k + "\t" + k*k*k + "\t");
		
System.exit(0);

	}

}
