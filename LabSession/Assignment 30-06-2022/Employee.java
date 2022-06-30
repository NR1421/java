//Java program to demonstrate employee details
package corejava;
class Employee 
{ 
	//Creating an attributes
    private long employeeId,employeephone; 
    private String employeeName,employeeAddress; 
    private double basicSalary,specialAllowance,Hra;
//Create a class Employee with the following instance variables
    Employee() 
    {
    
        setEmployeeId(0); 
        setEmployeephone(0); 
        setEmployeeName(""); 
        setEmployeeAddress(""); 
        basicSalary=0.0; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    } 
    //Create an overloaded constructor in the employee class
    Employee(long id,String n,String a,long p,double s) 
    {
        setEmployeeId(id); 
        setEmployeephone(p); 
        setEmployeeName(n); 
        setEmployeeAddress(a); 
        basicSalary=s; 
        specialAllowance=250.00; 
        Hra = 1000.50; 
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }
// Create a method calculateSalary 
    public double calculateSalary()
    {
        double salary = basicSalary+(basicSalary*specialAllowance*0.01)+(basicSalary* Hra/100);
        return salary;
    }

    public double calculateTransportAllowance()
    {
        return 0.01*basicSalary;
    }
	public long getEmployeephone() {
		return employeephone;
	}
	public void setEmployeephone(long employeephone) {
		this.employeephone = employeephone;
	}
	public String getEmployeeAddress() {
		return employeeAddress;
	}
	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
}
//Create the sub classes Manager and Trainee with base class Employee
class Manager extends Employee
{
    Manager(long id,String n,String a,long p,double s) 
    { 
        super(id,n,a,p,s);
    }
    
    public double calculateTransportAllowance(Manager m,int a)
    {
        return 0.15*getBasicSalary();
    } 
}
//Create a class "Source.java" with a main method.
 class Source
{
    public static void main(String[] args) {
        
        Manager m = new Manager(126534, "Peter", "Chennai India", 237844, 65000.0);
        double salary = m.calculateSalary(); 
        System.out.println("Manager's Salary : "+salary);
        System.out.println("Manager's Transport Allowance (15%) : "+m.calculateTransportAllowance(m, 15));   
    }
}