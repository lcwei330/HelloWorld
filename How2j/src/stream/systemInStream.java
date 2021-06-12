package stream;

import java.io.IOException;
import java.io.InputStream;

public class systemInStream {
	public static void main(String[] args) {
		try (InputStream is = System.in;) {
			while (true) {
				// 敲入a,然后敲回车可以看到
				// 97 13 10
				// 97是a的ASCII码
				// 13 10分别对应回车\r 换行\n
				int i = is.read();
				System.out.println(i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
