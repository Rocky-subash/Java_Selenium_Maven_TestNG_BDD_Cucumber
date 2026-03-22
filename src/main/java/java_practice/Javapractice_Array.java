package java_practice;

import java.util.Arrays;

public class Javapractice_Array {

	public static void main(String[] args) {
		int[] number = new int[5];
		number[0] = 1;
		System.out.println(Arrays.toString(number));
		
		
		String [] MyFamily = {"subash","abitha","nandhu","acha","amma"};
		System.out.println(MyFamily[0]);
		System.out.println(Arrays.toString(MyFamily));
		
		String[] fruits = { "Apple","Orange","Grapes","Banana","Pineapple","Watermelon"};
		System.out.println(fruits.length);
		System.out.println(fruits[fruits.length-1]);
		System.out.println(fruits[-1]);
		
		
		
}}