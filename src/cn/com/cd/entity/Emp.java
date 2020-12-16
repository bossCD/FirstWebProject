package cn.com.cd.entity;

import java.util.Date;

/**
 * 角色封装类
 * 处理mysql数据库中的cd_hero数据
 * 员工对应部门:多对一
 */
public class Emp {
    // 员工编号
    private Integer empno;
    // 员工姓名
    private String ename;
    // 员工工作
    private String job;
    // 上级编号
    private Integer mgr;
    // 入职时间
    private Date hiredate;
    // 工资
    private Double sal;
    // 奖金
    private Double comm;
    // 部门编号
    private Integer deptno;

    //部门对象
    private Dept dept;

    public Emp() {
    }

    public Emp(Integer empno, String ename, Double sal, Double comm) {
        this.empno = empno;
        this.ename = ename;
        this.sal = sal;
        this.comm = comm;
    }

    public Emp(Integer empno, String ename, String job, Double sal) {
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
    }

    public Emp(String ename, String job, Integer mgr, Date hiredate, Double sal, Double comm, Integer deptno) {
        this.ename = ename;
        this.job = job;
        this.mgr = mgr;
        this.hiredate = hiredate;
        this.sal = sal;
        this.comm = comm;
        this.deptno = deptno;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", job='" + job + '\'' +
                ", mgr=" + mgr +
                ", hiredate=" + hiredate +
                ", sal=" + sal +
                ", comm=" + (comm == null ? "0.0" : comm.toString()) +
                ", deptno=" + deptno +
                (dept == null ? "" : ", dept=" + dept.toString()) +
                '}';
    }

    public Integer getEmpno() {
        return empno;
    }

    public void setEmpno(Integer empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getMgr() {
        return mgr;
    }

    public void setMgr(Integer mgr) {
        this.mgr = mgr;
    }

    public Date getHiredate() {
        return hiredate;
    }

    public void setHiredate(Date hiredate) {
        this.hiredate = hiredate;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }

    public Double getComm() {
        return comm;
    }

    public void setComm(Double comm) {
        this.comm = comm;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public void setDeptno(Integer deptno) {
        this.deptno = deptno;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
