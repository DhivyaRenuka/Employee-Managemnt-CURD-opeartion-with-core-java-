package com.company;

import java.util.*;

public class Employee {
    private int empno;
    private String empname;
    private Double salary;
    Employee(int empno, String empname , double salary)
    {
        this.empno=empno;
        this.empname=empname;
        this.salary=salary;
    }
    // the variables are in private so we are using getter method to get the value outside in public
    public int getEmpno(){
        return empno;
    }
    public double getSalary()
    {
        return salary;
    }
    public String getEmpname(){
        return  empname;
    }
    public String  toString()
    {
        return empno+"   "+empname+"   "+salary;
    }
}
class CRUDImplementation
{
    public static void main(String[] args) {
        List<Employee> c=new ArrayList<Employee>();
        Scanner sc= new Scanner(System.in);
        Scanner s= new Scanner(System.in); // get string input
        int ch ;
        do
        {
            System.out.println("1.Insert new Employee");
            System.out.println("2. Display Record");
            System.out.println("3. Search employee detail");
            System.out.println("4. Delete employee record");
            System.out.println("5. Update employee details");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                {
                    System.out.println("Enter employee ID:");
                    int eno=sc.nextInt();
                    System.out.println("Enter Employee name:");
                    String ename=s.nextLine();
                    System.out.println("Enter Employee salary");
                    double sal=sc.nextDouble();
                    c.add(new Employee(eno,ename,sal));
                    break;
                }
                case 2:
                {
                    System.out.println("----------------------------------------------------");
                    Iterator<Employee> i= c.iterator();
                    while(i.hasNext())
                    {
                        Employee e=i.next();
                        System.out.println(e);
                    }
                    System.out.println("----------------------------------------------------");
                    System.out.println("----------------------------------------------------");
                    break;
                }
                case 3:
                {
                    boolean found=false;
                    System.out.println("Enter the employee Id to search");
                    int empno=sc.nextInt();
                    System.out.println("----------------------------------------------------");
                    Iterator<Employee> i= c.iterator();
                    while(i.hasNext())
                    {
                        Employee e=i.next();
                        if( e.getEmpno()== empno)
                        {System.out.println(e);
                            found=true;
                        }
                    }

                    if(! found)
                    {
                        System.out.println("Employee record not found " );
                    }
                    System.out.println("----------------------------------------------------");
                    System.out.println("----------------------------------------------------");
                    break;
                }
                case 4:
                {
                    boolean found=false;
                    System.out.println("Enter the employee Id to Delete");
                    int empno1=sc.nextInt();
                    System.out.println("----------------------------------------------------");
                    Iterator<Employee> i= c.iterator();
                    while(i.hasNext())
                    {
                        Employee e=i.next();
                        if( e.getEmpno()== empno1)
                        { i.remove();
                            found=true;
                        }
                    }

                    if(! found)
                    {
                        System.out.println("Employee record not found " );
                    }
                    else
                    {
                        System.out.println("Record is deleted successfully");
                    }
                    System.out.println("----------------------------------------------------");
                    System.out.println("----------------------------------------------------");
                    break;
                }
                case 5:
                {
                    boolean found=false;
                    System.out.println("Enter the employee Id to Update");
                    int empno2=sc.nextInt();
                    System.out.println("----------------------------------------------------");
                    ListIterator<Employee> li= c.listIterator();
                    while(li.hasNext())
                    {
                        Employee e=li.next();
                        if( e.getEmpno()== empno2)
                        {
                            System.out.println("Enter new name");
                            String ename1=s.nextLine();
                            System.out.println("Enter new salary" );
                            double salary=sc.nextDouble();
                            li.set(new Employee(empno2,ename1, salary));
                            found=true;
                        }
                    }

                    if(! found)
                    {
                        System.out.println("Employee record not found " );
                    }
                    else
                    {
                        System.out.println("Record is updated successfully");
                    }
                    System.out.println("----------------------------------------------------");
                    System.out.println("----------------------------------------------------");
                    break;
                }
                default:
                    System.out.println("select from the choice");


            }

        }while(ch !=0);
        }
    }

