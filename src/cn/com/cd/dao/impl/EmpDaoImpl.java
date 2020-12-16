package cn.com.cd.dao.impl;

import cn.com.cd.dao.EmpDao;
import cn.com.cd.entity.Emp;
import cn.com.cd.utils.JdbcDataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class EmpDaoImpl implements EmpDao {
    private QueryRunner queryRunner = new QueryRunner(JdbcDataSourceUtils.getDataSource());

    @Override
    public List<Emp> selectAllEmp() {
        String sql = "select * from emp";
        try {
            return queryRunner.query(sql, new BeanListHandler<Emp>(Emp.class));
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
