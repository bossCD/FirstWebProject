package cn.com.cd.test;

import cn.com.cd.utils.JdbcDataSourceUtils;
import org.junit.Test;

import java.sql.Connection;

/**
 * @author cd
 */
public class JdbcTest {

    @Test
    public void test(){
        for (int i = 0; i < 10; i++) {
            Connection connection = JdbcDataSourceUtils.getConn();
            System.out.println(connection);
        }
    }
}
