package kr.hs.dgsw.java.c2.array;

import java.util.Random;

public class ArrayStudy {
	public static void main(String[] args) {
//		int array[] = new int[5];
		int[] array = new int[5];
		array[0] = 3;
		array[3] = 5;
		
		System.out.println(array[1]);
		
		System.out.println("배열의 크기 : " + array.length);
		
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(1000);
		}
		
		for (int value : array) {
			System.out.println(value);
		}
	}
}