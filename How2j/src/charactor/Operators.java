package charactor;

public class Operators {
	  public static void main(String[] args) {
	         
	        int i  =5;
	        int j = 6;
	         
	        System.out.println(Integer.toBinaryString(i)); //5的二进制是101
	         
	        System.out.println(Integer.toBinaryString(j)); //6的二进制是110
	         
	        System.out.println(i|j); //所以 5|6 对每一位进行或运算，得到 111->7
	        System.out.println(i^j); //所以 5^6 对每一位进行或运算，得到 011->3
	        System.out.println(i&j); //所以 5&6 对每一位进行与运算，得到 100->4
	        System.out.println(i^0);//任何数和0 进行异或 都等于自己
	        System.out.println(~i);//5的二进制是00000101,所以取非即为11111010,即为-6  
	        System.out.println(i<<1);  //6向左移1位后，变成1100，对应的10进制是12
	        System.out.println(i>>1);    //6向右移1位后，变成11，对应的10进制是3
	    }
}
