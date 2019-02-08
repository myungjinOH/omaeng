package testNHN;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test1 {
	public static void main(String[] args) {
		String input = new Scanner(System.in).nextLine().trim();
		final StringTokenizer tokenizer = new StringTokenizer(input);
		int balance = 20000;
		while (tokenizer.hasMoreTokens()) {
			int distance = Integer.parseInt(tokenizer.nextToken());
			if ((distance < 4) || (distance > 178)) {
				System.out.println(balance);
				System.exit(-1);
			} else {
				if (distance < 41) {
					balance -= 720;
				} else if (distance >= 41) {
					distance -= 40;
					double extra = 0;
					extra = Math.ceil((double)distance / (double)8);
					
					balance = (int) (balance - (720 + (extra * 80)));

					if (balance < 0) {						
						balance = (int) (balance + (720 + (extra * 80)));
						System.out.println(balance);
						System.exit(-1);
					}
				}
			}
		}
		System.out.println(balance);
	}
}
