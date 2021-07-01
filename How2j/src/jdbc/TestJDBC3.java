/*
 * Statement和PreparedStatement，性能差异
 * */
package jdbc;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
 
public class TestJDBC3 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        int count = 1000;
        long start = System.currentTimeMillis();
        insertByPreparedStatment(count);
        long end = System.currentTimeMillis();
        System.out.printf("使用预编译Statement插入%d条数据，耗时: %d毫秒%n", count, end - start);
 
        start = System.currentTimeMillis();
        insertStatment(count);
        end = System.currentTimeMillis();
        System.out.printf("使用Statement插入%d条数据，耗时: %d 毫秒%n", count, end - start);
 
    }
 
    private static void insertByPreparedStatment(int count) {
        String sql = "insert into hero values(null,?,?,?)";
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin");
            PreparedStatement ps = c.prepareStatement(sql);) {
            for (int i = 0; i < count; i++) {
                ps.setString(1, "提莫");
                ps.setFloat(2, 313.0f);
                ps.setInt(3, 50);
                ps.execute();
            }
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
    private static void insertStatment(int count) {
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin");
                Statement s = c.createStatement();) {
            for (int i = 0; i < count; i++) {
                String sql = "insert into hero values(null," + "'提莫'" + "," + i + "," + i + ")";
                s.execute(sql);            
            }
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}