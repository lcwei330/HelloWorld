package stream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class TestStream {
	  public static void main(String[] args) {
		     
		        	File f=new File("C:\\Users\\lcwei\\Desktop\\LeetCode\\sort.txt");
		        	
		        	
		            f.list();
		      
		           
		            File[]fs= f.listFiles();

		            f.getParent();
		      
		            f.getParentFile();
		         
		            f.mkdir();
		      
		           
		            f.mkdirs();
		      
		           // f.createNewFile();
		      
		            f.getParentFile().mkdirs();
		      
		      
		            f.listRoots();
		      
		            f.delete();
		     
		            f.deleteOnExit();
		          
		    }
		}