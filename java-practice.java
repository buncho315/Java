public class Main {
	public static void main(String[] args) {
		int apple_price = (int)(Math.random()* 3 + 1)* 100; //リンゴの単価
		int apple_num = (int)(Math.random() * 10 + 1); //リンゴを買う数
		System.out.println("リンゴの単価:" + apple_price + "円");
		System.out.println("リンゴを買う数" + apple_num + "個");

		int total = apple_price * apple_num;
		System.out.println("合計金額:" + total + "円");
	}
}

public class Main {
	public static void main(String[] args) {
		int time = 15;
		if (time < 12) {
			System.out.println("午前中"); // 条件式が成立したときの処理
		} else if (time == 12) {
		    System.out.println("正午");
		} else if (time > 12) {
		    System.out.println("午後");
		}
	}
}



// if文による条件分岐　else if
public class Main {
	public static void main(String[] args) {
		int number = 1;
		if (number == 1) {
			System.out.println("スキ！");		// 条件式が成立したときの処理
		} else if (number == 2) {
		    System.out.println("どちらでもない");
		} else {
			System.out.println("キライ");		// 条件式が成立しなかったときの処理
		}
	}
}