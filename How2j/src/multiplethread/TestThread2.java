package multiplethread;
import java.io.File;

public class TestThread2 {
public static void search(File file, String search) {
	if(file.isFile()) {
		if(file.getName().toLowerCase().endsWith(".txt")) {
			new SearchFileThread(file,search).start();
		}
	}
	if(file.isDirectory()) {
		File[] fs=file.listFiles();
		for(File f:fs) {
			search(f,search);
		}
	}
}
public static void main(String[] args) {
	File f=new File("C:\\Users\\lcwei\\Desktop\\LeetCode");
	search(f,"sort");
}
}
