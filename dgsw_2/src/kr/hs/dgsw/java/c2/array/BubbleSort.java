package kr.hs.dgsw.java.c2.array;

public class BubbleSort extends Sort {
	
	@Override
	public void sort() {
		int temp;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Sort sort = new BubbleSort();
		
		sort.fillValues();
		
		System.out.println("정렬 전");
		sort.printArray();
		
		long before = System.currentTimeMillis();
		sort.sort();
		long after = System.currentTimeMillis();

		System.out.println("정렬 후");
		sort.printArray();
		
		System.out.println("경과 시간 : " + (after - before));
	}
}