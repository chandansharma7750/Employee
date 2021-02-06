package com.empmgt.ui;
import com.empmgt.entities.*;
public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeMain app=new EmployeeMain();
app.run();
	}
	public void run() {
		Employee employees[]= new Employee[4];
		Department department1= new Department("Department 1","Development");
		Department department2= new Department("Department 2","Testing");
		Developer developer1=new Developer(1,"chandan",department1,"Java");
		Developer developer2=new Developer(2,"akhil",department1,"Java");
		Tester tester1=new Tester(3,"bhanu",department2,"c++");
		Tester tester2=new Tester(4,"nitin",department2,"c++");
		employees[0]=developer1;
		employees[1]=developer2;
		employees[2]=tester1;
		employees[3]=tester1;
		for(int i=0;i<employees.length;i++) {
			if(employees[i] instanceof Developer) {
				Developer developer= (Developer) employees[i];
				displayemployees(developer);
			}else {
				Tester tester=(Tester) employees[i];
				displayemployees(tester);

			}
		}
		
	}
	private void displayemployees(Tester employee) {
		System.out.println("Employee id is"+ employee.getId());
		System.out.println("Employee name is"+ employee.getName());
		System.out.println("Employee id is"+ employee.getId());
		Department deapartment=employee.getDepartment();
		System.out.println("Department id is"+ deapartment.getDeptId());
		System.out.println("Department name is"+ deapartment.getDeptName());
		System.out.println("tester tool"+ employee.getTools());
		}
	private void displayemployees(Developer employee) {
		System.out.println("Employee id is"+ employee.getId());
		System.out.println("Employee name is"+ employee.getName());
		System.out.println("Employee id is"+ employee.getId());
		Department deapartment=employee.getDepartment();
		System.out.println("Department id is"+ deapartment.getDeptId());
		System.out.println("Department name is"+ deapartment.getDeptName());
		System.out.println("Language used by devoloper"+ employee.getLanguage());
		}

}
