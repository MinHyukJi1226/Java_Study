package kr.hs.dgsw.java.c2.tr1;

import java.util.Scanner;

public class Factorization {

public static void main(String[] args) {
		
		int num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수를 입력 : ");
		
		num = scanner.nextInt();
		
		for(int i = 2; i <= num; i++) {
			while(num % i == 0) {
				System.out.println(i);
				num /= i;
			}
		}
	}
}