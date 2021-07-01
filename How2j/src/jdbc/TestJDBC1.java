/*CRUD是最常见的数据库操作，即增删改查
C 增加(Create)
R 读取查询(Retrieve)
U 更新(Update)
D 删除(Delete)
在JDBC中增加，删除，修改的操作都很类似，只是传递不同的SQL语句就行了。
********************************************************
execute与executeUpdate的相同点：都可以执行增加，删除，修改
不同1：
execute可以执行查询语句
然后通过getResultSet，把结果集取出来
executeUpdate不能执行查询语句
不同2:
execute返回boolean类型，true表示执行的是查询语句，false表示执行的是insert,delete,update等等
executeUpdate返回的是int，表示有多少条数据受到了影响
*/


package jdbc;
  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;//for query把查询结果提取出来
  
public class TestJDBC1 {
    public static void main(String[] args) {
  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
  
        try (
            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",// // 数据库的端口号： 3306 （mysql专用端口号）
                    "root", "060810314wlcWLC!");
            Statement s = c.createStatement();             
        )
        {// 4 Operations:CRUD : Create; Retrieve ; Update;Delete
        	//1.Create
        	for (int i = 0; i < 100; i++) {
        	  String sql = "insert into hero values(null," + "'hero"+i+"'" + ", " + 313.0f + ", " + 50 + ")";
              s.execute(sql);
		}
        	System.out.println("insertion succeed");
        	//2.Update
        	String sql1 = "update hero set name = 'name 5' where id = 3";
        	s.execute(sql1);
        	System.out.println("insertion succeed");
          // 3.Delete
        	for (int i = 100; i < 300; i++) {
        		String sqlInsert = "delete from hero where id = " +i;
            	s.execute(sqlInsert);
            	s.executeUpdate(sqlInsert);
			}
        	
              System.out.println("deletion succeed");
            //4. Retrieve(query)
              String sql3 = "select * from hero";
            
              ResultSet rs = s.executeQuery(sql3);
              while (rs.next()) {
                  int id = rs.getInt("id");// 可以使用字段名
                  String name = rs.getString(2);//  在取第二列的数据的时候，用的是rs.get(2) ，而不是get(1). 
                  //这个是整个Java自带的api里唯二的地方，使用基1的，即2就代表第二个。
                  float hp = rs.getFloat("hp");
                  int damage = rs.getInt(4);
                  System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
              }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}