package charactor;

public class LogicOperators {
	public static void main(String[] args) {
        
        int i = 2;
        int j = 2;
        System.out.println( i== 1 & i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);
         
        System.out.println( j== 1 && j++ ==2  );  //因为j==1返回false,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);    

    
        System.out.println( i== 1 | i++ ==2  ); //无论如何i++都会被执行，所以i的值变成了3
        System.out.println(i);
         
        System.out.println( j== 2 || j++ ==2  );  //因为j==2返回true,所以右边的j++就没有执行了，所以j的值，还是2
        System.out.println(j);  
       
        
      
        boolean a = true;
        boolean b = false;
        System.out.println(b); //输出true
        System.out.println(!b);//输出false
        System.out.println(a^b); //不同返回真
        System.out.println(a^!b); //相同返回假
         
    }
}
//长路与  无论第一个表达式的值是true或者false,第二个的值，都会被运算
//短路与 只要第一个表达式的值是false的，第二个表达式的值，就不需要进行运算了
//长路或  无论第一个表达式的值是true或者false,第二个的值，都会被运算
//短路或 只要第一个表达式的值是true的，第二个表达式的值，就不需要进行运算了
