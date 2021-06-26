package collection;
 
public class TestCollection5 {
     
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            int length = (int) (Math.random()*8+2);
            String str = randomString(length);
            int hashcode = hashcode(str);
            System.out.printf("%-11s的自定义hashcode是:%d%n",str,hashcode);         
        }
         
    }
 
    private static int hashcode(String str) {
        // TODO Auto-generated method stub
        if(0==str.length())
            return 0;
         
        int hashcode = 0;
        char[]cs= str.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            hashcode +=cs[i];
            System.out.println(hashcode);
        }
        hashcode*=23;
        //取绝对值
        hashcode = hashcode<0?0-hashcode:hashcode;
        //落在0-1999之间
        hashcode %=2000;
         
        return hashcode;
    }
     
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
     
}