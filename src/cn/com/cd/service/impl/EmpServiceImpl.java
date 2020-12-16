package cn.com.cd.service.impl;

import cn.com.cd.dao.EmpDao;
import cn.com.cd.dao.impl.EmpDaoImpl;
import cn.com.cd.entity.Emp;
import cn.com.cd.service.EmpService;

import java.util.List;

public class EmpServiceImpl implements EmpService {
    EmpDao empDao = new EmpDaoImpl();

    @Override
    public List<Emp> findAllEmp() {
        return empDao.selectAllEmp();
    }
}
