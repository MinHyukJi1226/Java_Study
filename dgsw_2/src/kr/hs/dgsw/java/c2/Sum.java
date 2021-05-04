package kr.hs.dgsw.java.c2;

public class Sum {
	public static void main(String[] args) {
		// int value1 = Integer.parseInt(args[0]);
		// int value2 = Integer.parseInt(args[1]);
		// int sum = value1 + value2;

		int sum = 0;

		for (int i = 0; i < args.length; i++) {
			int value = Integer.parseInt(args[i]);
			sum += value;
		}
//		System.out.println(va4lue1 + " + " + value2 + " = " + sum);
		System.out.println("Total : " + sum);
	}
}