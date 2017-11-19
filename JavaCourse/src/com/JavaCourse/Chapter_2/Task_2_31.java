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
		System.out.println(a + "    " + a*a + "    " + a*a*a + "    ");
		System.out.println(b + "    " + b*b + "    " + b*b*b + "    ");
		System.out.println(c + "    " + c*c + "    " + c*c*c + "    ");
		System.out.println(d + "    " + d*d + "    " + d*d*d + "    ");
		System.out.println(e + "    " + e*e + "   " + e*e*e + "    ");
		System.out.println(f + "    " + f*f + "   " + f*f*f + "    ");
		System.out.println(g + "    " + g*g + "   " + g*g*g + "    ");
		System.out.println(h + "    " + h*h + "   " + h*h*h + "    ");
		System.out.println(i + "    " + i*i + "   " + i*i*i + "    ");
		System.out.println(j + "    " + j*j + "   " + j*j*j + "    ");
		System.out.println(k + "   " + k*k + "  " + k*k*k + "    ");
		
		
	}

}
