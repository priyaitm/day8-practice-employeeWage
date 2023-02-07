package day8prob.employee.wage;

public class EmpWage8UC3 {
    double check_pre= Math.floor(Math.random() * 10)%3;
    int is_part_time=1;
    int is_full_time=2;
    int emp_rate_per_hour=20;
    int empHrs=0;
    int empWage=0;
    void empCheck() {
        if(check_pre==is_part_time){
            System.out.println("Employee is present part time ");
            empHrs=4;
        }
       else if (check_pre == is_full_time) {
            System.out.println("Employee is present");
            empHrs=8;
        }
        else {
            System.out.println("Employee is Absent");
            empHrs=0;
        }
        empWage=empHrs*emp_rate_per_hour;
        System.out.println("Emp Wage: " +empWage);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program");
        EmpWage8UC3 t=new EmpWage8UC3();
        t.empCheck();
    }

}
