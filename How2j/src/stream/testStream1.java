package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import charactor.Hero;

public class testStream1 {
	public static void main(String[] args) {
		Hero hs[] = new Hero[10];
		for (int j = 0; j < hs.length; j++) {
			// hs[j] = new Hero("hero:" +j);
		}
		File f = new File("C:\\Users\\lcwei\\Desktop\\LeetCode\\sort.txt");
		try (FileOutputStream fos = new FileOutputStream(f);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(f);
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			// 把数组序列化到文件heros.lol
			oos.writeObject(hs);
			Hero[] hs2 = (Hero[]) ois.readObject();
			System.out.println("查看中文件中反序列化出来的数组中的每一个元素：");
			for (Hero hero : hs2) {
				System.out.println(hero.name);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
