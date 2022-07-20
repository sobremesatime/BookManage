package cn.jxufe.lyl.util;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.commons.dbcp2.BasicDataSourceFactory;

public class ConnectionUtil {
    //	本地线程对象，保证同一个线程获得的是同一个连接对象
    private static ThreadLocal<Connection> local = new ThreadLocal<>();
    private static DataSource dataSource;
    // 静态初始化模块：加载properties文件生成datasource
    static {
        Properties properties = new Properties();
        try {
            properties.load(ConnectionUtil.class.getResourceAsStream("/resources/mysql.properties"));
            dataSource = BasicDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // 对外公开的getConnection方法，用来获得连接
    public static Connection getConnection() throws SQLException {
        Connection conn = local.get();
        if (conn == null || conn.isClosed()) {
            conn = dataSource.getConnection();
            System.out.println(conn);
            local.set(conn);
        }
        return conn;
    }
    // 对外公开的关闭连接的方法
    public static void closeConnetion() throws SQLException {
        Connection conn = local.get();
        if (conn != null && !conn.isClosed()) {
            conn.close();
        }
    }

}
