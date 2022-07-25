import java.util.Scanner;

public class Employee {
    float salary,working_hours;

    public void getinfo(float salary,float working_hours){
        this.salary=salary;
        this.working_hours=working_hours;
    }
    public void addsal(){
        if(salary<500){
            salary=salary+10;
        }
    }
    public void addwork(){
        if(working_hours>6){
            salary=salary+5;

        }
    }
    public void printsal(){
        System.out.println("final salary of employee"+salary+"$");
    }





}
