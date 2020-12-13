package javaExample;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		// 產生一個隨機數
		int number = (int) (Math.random() * 100);

		// 加入count
		int count = 0;

		// 在這裡加入最大值，和最小值
		int max = 100;
		int min = 1;

		while (true) {
			// 鍵盤錄入資料
			Scanner sc = new Scanner(System.in);
			System.out.println("請輸入你要猜的資料：(" + min + "~" + max + ")");
			try {
				int guessNumber = sc.nextInt();
				// 判斷
				if (guessNumber > number) {
					max = guessNumber;
					System.out.println("你猜大了");
				} else if (guessNumber < number) {
					min = guessNumber;
					System.out.println("你猜小了");
				} else {
					System.out.println("恭喜你, 花了" + count + "次就猜中了");
					// 問是否繼續
					System.out.println("請問還要繼續嗎？(yes)");
					sc = new Scanner(System.in);
					String str = sc.nextLine();
					if ("yes".equals(str)) {
						// 重寫賦值隨機數
						number = (int) (Math.random() * 100);
						count = 0;
						max = 100;
						min = 1;
					} else {
						break;
					}
				}
			} catch (InputMismatchException e) {
				System.out.println("你輸入的資料有誤");
			}
		}

	}

}
