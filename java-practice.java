// 税込み金額を計算する

public class Main {
    public static void main(String[] args) {
        int price = 3500;
        System.out.println("定価"+"円");
        int discountPrice =(int)(price * 0.85);
        System.out.println("割引価格は"+discountPrice+"円です");
        int amount =(int)(discountPrice * 1.08);
        System.out.println("税込価格は"+amount+"円です");
        int person = 5;
        System.out.println("人数が"+person+"人の場合、");
        int amountPerPerson = amount / person;
        int remainder = amount % person;
        System.out.println("一人当たりは"+amountPerPerson+"円、余りは"+remainder+"円です");
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
		int number3 = 40;
        System.out.println(number3);
        if (number3 <= 30 || number3 >= 60){
            System.out.println("あたり");
        } else {
            System.out.println("残念");
        }
    }

    // 条件の評価結果

public class Main {
    public static void main(String[] args) {
        int number = 0;
        boolean flag = number == 1;
        if (flag) {
            System.out.println("好き");
        } else {
            System.out.println("嫌い");
        }
        System.out.println(flag);
    }
}
// データ型

public class Main {
    public static void main(String[] args) {
        System.out.println(10 / 3);
        System.out.println(10 / 3.0);

        double number1 = 3.14;
        System.out.println(number1);
        System.out.println((int)number1);

        int number2 = 2;
        System.out.println(number2);
        System.out.println((double)number2);

        String text = "123";
        System.out.println(text);
        System.out.println(Integer.parseInt(text));
        System.out.println(Double.parseDouble(text));
    }
}
// whileによるループ処理

public class Main {
    public static void main(String[] args) {
        int i = 0;// カウンタ変数の初期化
        while (i <= 5) {
            System.out.println("hello world" + i);// 繰り返し処理
            i = i + 1;// カウンタ変数の更新
        }
        System.out.println("last" + i);
    }
}
