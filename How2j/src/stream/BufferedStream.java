package stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedStream {

	public static void removeComments(File javaFile) {
		StringBuffer sb = new StringBuffer();
		try (FileReader fr = new FileReader(javaFile); BufferedReader br = new BufferedReader(fr);) {
			while (true) {
				String line = br.readLine();
				if (null == line)
					break;

				if (!line.trim().startsWith("//"))
					sb.append(line).append("\r\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		try (FileWriter fw = new FileWriter(javaFile); PrintWriter pw = new PrintWriter(fw);) {

			pw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	///////////////////////////////////////////////////////////////

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File f = new File("C:\\Users\\lcwei\\Desktop\\LeetCode\\sort.txt");
		System.out.println(f.exists());
		System.out.println(f.length());
		removeComments(f);//delete the content line begins with //

		try (FileReader fr = new FileReader(f); BufferedReader br = new BufferedReader(fr);
//		    	
		) {
			while (true) {
				String line = br.readLine();
				if (null == line)
					break;
				System.out.println(line);
			}
		}

		try (FileWriter fw = new FileWriter(f); PrintWriter pw = new PrintWriter(fw);) {
			pw.println("add this line to test");
			pw.flush(); // force to write the data into hard driver imediatelly
		}

		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
