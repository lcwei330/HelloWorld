package charactor;

import java.util.Scanner;

public class inputScanner {
	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("first integer:"+a);
        int b = s.nextInt();
        System.out.println("second integer:"+b);
        float c = s.nextFloat();
        System.out.println("float value is:"+c);
//        String d = s.nextLine();
//        System.out.println("input string:"+d);
        int i = s.nextInt();
        System.out.println("read integer:"+ i);
        String rn = s.nextLine();
        String e = s.nextLine();
        System.out.println("read string:"+e);
 
    }
}
