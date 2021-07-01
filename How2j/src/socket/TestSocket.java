package socket;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class TestSocket {
public static void main(String[] args) throws UnknownHostException{
	InetAddress host=InetAddress.getLocalHost();
	String ip=host.getHostAddress();
	System.out.println("local IP Address: "+ ip);
	// in windows cmd ,type ping +local ip(192.168.1.11 for this laptop) to check the address response time
}
}
