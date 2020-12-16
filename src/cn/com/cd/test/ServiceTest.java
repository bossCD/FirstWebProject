package cn.com.cd.test;

import cn.com.cd.entity.Emp;
import cn.com.cd.service.EmpService;
import cn.com.cd.service.impl.EmpServiceImpl;
import org.junit.Test;

import java.util.List;

public class ServiceTest {

    @Test
    public void test(){
        EmpService empService = new EmpServiceImpl();
        List<Emp> emps = empService.findAllEmp();
        for (Emp e:emps) {
            System.out.println(e.toString());
        }
    }
}
