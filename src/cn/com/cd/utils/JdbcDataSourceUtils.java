package cn.com.cd.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author cd
 */
public class JdbcDataSourceUtils {
    private static DataSource dataSource = new ComboPooledDataSource();

    public static Connection getConn(){
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            System.err.println("数据库连接失败");
            return null;
        }
    }

    public static DataSource getDataSource() {
        return dataSource;
    }
}
