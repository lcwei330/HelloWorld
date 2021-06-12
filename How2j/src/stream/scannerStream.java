package stream;

import java.util.Scanner;

public class scannerStream {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int b=s.nextInt();
		while (true) {
			String line = s.nextLine();
			System.out.println(line);
		}
	}
}
