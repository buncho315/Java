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
// 西暦年から平成年を求める
import java.util.Calendar;
public class Main {
	public static void main(String[] args) {
        Calendar calendar = Calendar.getInctance();
        int seireki = calendar.get(Calendar.YEAR);
        System.out.println("西暦" + seireki + "年は");

        int heisei = seireki - 1088;
        System.out.println("平成" + heisei + "年です");
	}
}

// 複数の条件を組み合わせる - AND

public class Main {
    public static void main(String[] args) {
        int number1 = 2;
        int number2 = 2;
        if (number1 == 1 && number2 == 1) {
            System.out.println("すき");
        } else {
            System.out.println("嫌い");
        }

        double rand = Math.random() * 100 + 1;
        int number3 = (int)rand;
        System.out.println(number3);
        if (number3 >= 30 && number3 <= 60) {
            System.out.println("あたり");
        } else {
            System.out.println("ハズレ");
        }
    }
}
// 複数の条件を組み合わせる - OR
public class Main {
    public static void main(String[] args) {
        int number1= 0;
        int number2= 0;
        if(number1 == 1 || number2 == 1) {
            System.out.println("いいね");
        } else {
            System.out.println("悪い");
        }
    }
}
