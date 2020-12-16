package cn.com.cd.entity;

import lombok.Getter;
import lombok.Setter;

/**
 * 部门实体封装类
 */
@Setter @Getter
public class Dept {
    // 部门编号
    private Integer deptno;
    // 部门名称
    private String dname;
    // 部门地址
    private String loc;

    public Dept() {
    }

    public Dept(Integer deptno, String dname, String loc) {
        this.deptno = deptno;
        this.dname = dname;
        this.loc = loc;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
