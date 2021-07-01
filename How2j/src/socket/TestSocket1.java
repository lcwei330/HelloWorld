package socket;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSocket1 {
public static void main(String[] args) throws IOException{
	Process p=Runtime.getRuntime().exec("ping " + "192.168.1.11");
	BufferedReader br=new BufferedReader(new InputStreamReader(p.getInputStream()));
	String line=null;
	StringBuilder sb=new StringBuilder();
	  while ((line = br.readLine()) != null) {
          if (line.length() != 0)
              sb.append(line + "\r\n");
      }
	System.out.println("the return infomation from this instruction is:");
	System.out.println(sb.toString());
}
}
