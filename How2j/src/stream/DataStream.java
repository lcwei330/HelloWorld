package stream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.*;

@SuppressWarnings("unused")
public class DataStream {
	static File f = new File("C:\\Users\\lcwei\\Desktop\\LeetCode\\sort.txt");
    static int x = 31;
    static int y = 15;
	public static void main(String[] args) {
		method1();
        method2();
	}

	   private static void method2() {
	        try (
	                FileInputStream fis  = new FileInputStream(f);
	                DataInputStream dis =new DataInputStream(fis);
	                FileOutputStream fos  = new FileOutputStream(f);
	                DataOutputStream dos =new DataOutputStream(fos);
	                 
	        ){
	        	dos.writeInt(x);
	            dos.writeInt(y);
	             
	            int x = dis.readInt();
	            int y = dis.readInt();
	            System.out.printf("data stream method: x is %d y is  %d%n",x,y);
	             
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	         
	    }
	 
	    private static void method1() {
	         try (
	                 FileWriter fw = new FileWriter(f);
	                 PrintWriter pw = new PrintWriter(fw);
	                 FileReader fr = new FileReader(f);
	                 BufferedReader br = new BufferedReader(fr);                
	                  
	         ) {
	             pw.print(x+"@"+y);//use @ as the split mark
	             pw.flush();
	             String str = br.readLine();
	             /////////////////////////这一段
	             String[] ss =str.split("@");
	             int x = Integer.parseInt(ss[0]);
	             int y = Integer.parseInt(ss[1]);
	             System.out.printf("Buffer stream method: x is %d y is  %d%n",x,y);
	              
	         } catch (IOException e) {
	             // TODO Auto-generated catch block
	             e.printStackTrace();
	         }
	    
	    }
	private static void read() {
		File f = new File("C:\\\\Users\\\\lcwei\\\\Desktop\\\\LeetCode\\\\sort.txt");
		try (FileInputStream fis = new FileInputStream(f); DataInputStream dis = new DataInputStream(fis);) {
		//	boolean b = dis.readBoolean();
			//int i = dis.readInt();
			String str = dis.readUTF();
//			System.out.println("the read boolean value is:" + b);
//			System.out.println("the read int value is:" + i);
			System.out.println("the read string value is:" + str);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void write() {
		File f = new File("C:\\\\Users\\\\lcwei\\\\Desktop\\\\LeetCode\\\\sort.txt");
		try (FileOutputStream fos = new FileOutputStream(f); DataOutputStream dos = new DataOutputStream(fos);) {
			// dos.writeBoolean(true);
			// dos.writeInt(300);
			// dos.writeUTF("123 this is garee");
			dos.writeUTF("12@31");
		
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
