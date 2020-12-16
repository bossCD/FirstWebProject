package cn.com.cd.servlet;

import cn.com.cd.entity.Emp;
import cn.com.cd.service.EmpService;
import cn.com.cd.service.impl.EmpServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class EmpServlet extends HttpServlet {
    EmpService empService = new EmpServiceImpl();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Emp> emps = empService.findAllEmp();
        request.setAttribute("emps", emps);

        request.getRequestDispatcher("/WEB-INF/jsp/showEmp.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
