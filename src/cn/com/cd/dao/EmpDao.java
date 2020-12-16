package cn.com.cd.dao;

import cn.com.cd.entity.Emp;

import java.util.List;

public interface EmpDao {
    List<Emp> selectAllEmp();
}
