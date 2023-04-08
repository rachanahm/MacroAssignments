import java.util.*;
class Employee{
    private int eId;
    private String name;
    private double salary;

 

    void setEid(int eId){
        this.eId=eId;
    }
    void setName(String name){
        this.name=name;
    }
    void setSalary(double salary){
        this.salary=salary;
    }

 

    int getEid(){
        return eId;
    }
    String getName(){
        return name;
    }
    double getSalary(){
        return salary;
    }
}

 

public class EmployeeExample{
    Scanner s=new Scanner(System.in);
    Employee emp[]=new Employee[5];
    int n=0;
    Random random=new Random();
    
    void setDetails(){
        Employee e=new Employee();
        int eid=(int)random.nextInt(900000)+100000;
        e.setEid(eid);
        
        while(true){
            System.out.println("Enter employee name");
            String name=s.nextLine();
            if(name.length()<5){
                System.out.println("name must contain 5 characters ");
            }else{
                e.setName(name);
                break;
            }
        }
        
        while(true){
            System.out.println("Enter employee salary");
            String salary=s.next();
            if(salary.length()<5 && salary.length()<10){
                System.out.println("salary length sould be between 5 to 10 digits ");
            }else{
                double sal=Double.parseDouble(salary);
                e.setSalary(sal);
                break;
            }
        }
        
        emp[n]=e;
        n++;
    }
    
    void getDetails(){
        for(int i=0;i<emp.length;i++){
            System.out.println("id :"+emp[i].getEid()+"name : "+emp[i].getName()+"salary : "+emp[i].getSalary());
        }
    }
    public static void main(String[] args){
        EmployeeExample emp1=new EmployeeExample();
        for(int i=0;i<5;i++){
            emp1.setDetails();
        }
        emp1.getDetails();
    }
}