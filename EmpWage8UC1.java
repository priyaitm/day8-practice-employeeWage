package day8prob.employee.wage;

import day8practice.employee.EmployeeWage8;

public class EmpWage8UC1 {
    double check_pre= Math.floor(Math.random() * 10)%2;
    int is_full_time=1;
    void empCheck() {
        if (check_pre == is_full_time) {
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWage8UC1 t=new EmpWage8UC1();
        t.empCheck();
    }

}
