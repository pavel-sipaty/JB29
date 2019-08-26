package by.jb29.mod1.les02;

//Написать программу, которая выводит на экран первые четыре степени числа пи.

import static java.lang.Math.PI;


public class Task15 {

	public static void main(String[] args) {
		
		double chetyreStepen = (double)Math.round(PI * 10000) / 10000;
		
		System.out.println(chetyreStepen);

	}

}
