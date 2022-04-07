package com.company;

public class EmployeeBuilder {
    private int empno;
    private String empname;
    private double salary;

    public EmployeeBuilder setEmpno(int empno) {
        this.empno = empno;
        return this;
    }

    public EmployeeBuilder setEmpname(String empname) {
        this.empname = empname;
        return this;
    }

    public EmployeeBuilder setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee createEmployee() {
        return new Employee(empno, empname, salary);
    }
}