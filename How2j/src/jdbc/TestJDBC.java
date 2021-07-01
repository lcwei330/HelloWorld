/*
 * step1:import the project jar package:  project->property->java build path->libaries->add external jars
 * step2:initialize  drivers:  Class.forName("com.mysql.cj.jdbc.Driver"); use exception method(try catch finally)
 * step3:Create Connection; Connection c = DriverManager
                                                .getConnection(
                                                    "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                                                          "root", "060810314wlcWLC!");
 * step4:Create Statement: Statement s = c.createStatement();//c refers to the connection created in step3;
 * step5: execution ; use string to input command 
 *  String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
            s.execute(sql);
 * */
package jdbc;
  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
  
public class TestJDBC {
    public static void main(String[] args) {
    	 Connection c = null;
         Statement s = null;
  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
             c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",// // 数据库的端口号： 3306 （mysql专用端口号）
                            "root", "060810314wlcWLC!");
            s = c.createStatement();
            String sql = "insert into hero values(null,"+"'timo'"+","+313.0f+","+50+")";
            s.execute(sql);
  
           // System.out.println("get statement Object: " );
            System.out.println("insert succeed! " );
  
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            // 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
            if (s != null)
                try {
                    s.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            // 后关闭Connection
            if (c != null)
                try {
                    c.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }
  
    }
}