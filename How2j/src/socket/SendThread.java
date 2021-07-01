package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SendThread extends Thread {
	private Socket s;

	public SendThread(Socket s) {
		this.s = s;
	}

	public void run() {
		try {
			OutputStream os = s.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			InputStream is = s.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			while (true) {
				Scanner sc = new Scanner(System.in);
				String str = sc.next();
				dos.writeUTF(str);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
