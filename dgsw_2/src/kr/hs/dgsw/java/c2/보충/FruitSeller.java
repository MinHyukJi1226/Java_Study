package kr.hs.dgsw.java.c2.보충;

public class FruitSeller {
	int myMoney = 0;
	int numOfApple = 20;
	
	final int APPLE_PRICE = 1000;
	
	public int saleApple(int money) {
		int num = money/APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("�Ǹ� ���� : " + myMoney);
		System.out.println("���� ����� ���� : " + numOfApple);
	}
	
}

class FruitBuyer {
	int myMoney = 1000;
	int numOfApple = 0;
	
	public void buyApple (FruitSeller seller, int money) {
		numOfApple = seller.saleApple(money);
		myMoney -= money;
	}
	public void showBuyResult() {
		System.out.println("���� ���� �� : " + myMoney);
		System.out.println("���� ������ �ִ� ��� : " + numOfApple);
	}
}
