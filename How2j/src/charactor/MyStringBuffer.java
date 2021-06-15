package charactor;

public class MyStringBuffer implements IStringBuffer {

	int capacity = 16;
	int length = 0;
	char[] value;
	public MyStringBuffer(){
        value = new char[capacity];
    }

	 public MyStringBuffer(String str){
	        this();
	        if(null==str)
	            return;
	          
	        if(capacity<str.length()){
	            capacity  = value.length*2;
	            value=new char[capacity];
	        }
	          
	        if(capacity>=str.length())
	            System.arraycopy(str.toCharArray(), 0, value, 0, str.length());
	          
	        length = str.length();
	          
	    }
	      
	    @Override
	    public void append(String str) {
	        insert(length,str);
	    }
	  
	    @Override
	    public void append(char c) {
	        append(String.valueOf(c));
	          
	    }
	  
	    @Override
	    public void insert(int pos, char b) {
	        insert(pos,String.valueOf(b));
	    }
	  
	    @Override
	    public void delete(int start) {
	        // TODO Auto-generated method stub
	          
	    }
	  
	    @Override
	    public void delete(int start, int end) {
	    	if(start<0)
	            return;
	         
	        if(start>length)
	            return;
	         
	        if(end<0)
	            return;
	         
	        if(end>length)
	            return;
	         
	        if(start>=end)
	            return;
	         
	        System.arraycopy(value, end, value, start, length- end);
	        length-=end-start;
	          
	    }
	  

	@Override
	public void reverse() {
		for (int i = 0; i < length / 2; i++) {
			char temp = value[i];
			value[i] = value[length - i - 1];
			value[length - i - 1] = temp;
		}
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return length;
	}

	@Override
	public void insert(int pos, String b) {
		  
        if(pos<0)
            return;
          
        if(pos>length)
            return;
          
        if(null==b)
            return;
          
        while(length+b.length()>capacity){
            capacity = (int) ((length+b.length())*1.5f);
            char[] newValue = new char[capacity];
            System.arraycopy(value, 0, newValue, 0, length);
            value = newValue;
        }
          
        char[] cs = b.toCharArray();
          
          
        System.arraycopy(value, pos, value,pos+ cs.length, length-pos);
        System.arraycopy(cs, 0, value, pos, cs.length);
          
        length = length+cs.length;
          
    }

	public String toString() {
		char[] realValue = new char[length];

		System.arraycopy(value, 0, realValue, 0, length);

		return new String(realValue);
	}
	 @SuppressWarnings("unused")
	private static String randomString(int length) {
	        String pool = "";
	        for (short i = '0'; i <= '9'; i++) {
	            pool += (char) i;
	        }
	        for (short i = 'a'; i <= 'z'; i++) {
	            pool += (char) i;
	        }
	        for (short i = 'A'; i <= 'Z'; i++) {
	            pool += (char) i;
	        }
	        char cs[] = new char[length];
	        for (int i = 0; i < cs.length; i++) {
	            int index = (int) (Math.random() * pool.length());
	            cs[i] = pool.charAt(index);
	        }
	        String result = new String(cs);
	        return result;
	    }
	public static void main(String[] args) {
		MyStringBuffer sb = new MyStringBuffer("there light");
        System.out.println(sb);
        sb.insert(0, "let ");
        System.out.println(sb);
 
        sb.insert(10, "be ");
        System.out.println(sb);
        sb.insert(0, "God Say:");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.append('?');
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
         
        sb.reverse();
        System.out.println(sb);
         
        sb.delete(0,4);
        System.out.println(sb);
        sb.delete(4);
        System.out.println(sb);
 

	}

}