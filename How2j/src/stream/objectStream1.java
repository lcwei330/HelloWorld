package stream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class objectStream1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please input the class name:");
		String className = s.nextLine();
		System.out.println("please input the attribute type:");
		String type = s.nextLine();
		System.out.println("please input the attribute name:");
		String property = s.nextLine();
		String Uproperty = toUpperFirstLetter(property);

	 File modelFile =new File("C:\\Users\\lcwei\\Desktop\\LeetCode\\sort.txt");
		String modelContent = null;
		try (FileReader fr = new FileReader(modelFile)) {
			char cs[] = new char[(int) modelFile.length()];
			fr.read(cs);
			modelContent = new String(cs);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 替换

		String fileContent = modelContent.replaceAll("@class@", className);
		fileContent = fileContent.replaceAll("@type@", type);
		fileContent = fileContent.replaceAll("@property@", property);
		fileContent = fileContent.replaceAll("@Uproperty@", Uproperty);
		String fileName = className + ".java";

		// 替换后的内容
		System.out.println("content after substitution：");
		System.out.println(fileContent);
		File file = new File("C:\\Users\\lcwei\\Desktop\\LeetCode\\sort.txt", fileName);

		try (FileWriter fw = new FileWriter(file);) {
			fw.write(fileContent);
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("File position:" + file.getAbsolutePath());
	}

	public static String toUpperFirstLetter(String str) {
		char upperCaseFirst = Character.toUpperCase(str.charAt(0));
		String rest = str.substring(1);
		return upperCaseFirst + rest;

	}
}
