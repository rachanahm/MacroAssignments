/*
4. Employee Management: Create a class called Employee that represents an employee and a class called Company that represents a company. The company class should have methods to add, remove, and display employees. You can also create a custom exception called InvalidSalaryException to throw when an employee's salary is below the minimum wage.
*/

 

import java.util.Scanner;
class InvalidSalaryException extends Exception{
    InvalidSalaryException(String str){
        super(str);
    }
}

 

class Employee{
    String ename;
    int salary;
}

 

class Company{
    Scanner s=new Scanner(System.in);
    Employee emp[]=new Employee[3];
    int min=10000;
    int n=0;
    
    void add() throws InvalidSalaryException{
        Employee e=new Employee();
        System.out.println("enter employee name");
        e.ename=s.nextLine();
        System.out.println("enter Employee salary");
        e.salary=s.nextInt();
        s.nextLine();
        if(e.salary<min){
         throw new InvalidSalaryException("invalid Salary!");
        }else{
            emp[n]=e;
            n++;
        }
    }
    
    void display(){
        for(int i=0;i<emp.length;i++){
            System.out.println((i+1)+". Name :"+emp[i].ename+" Salary: "+emp[i].salary);
          }
    }

 

    public static void main(String[] args){
        Company comp=new Company();
        while(comp.n<3){
            try{
                comp.add();
            }catch(InvalidSalaryException e){
                System.out.println(e);
            }
        }
        comp.display();
    }
}