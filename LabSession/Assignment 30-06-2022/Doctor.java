//Java program to demonstrate designation details
package corejava;
import java.util.*;

class Doctor
{
	//variable with data types
    private int doctorId;
    private String doctorName, location;
    // parametrized constructor
    Doctor(int i,String n,String l)
    {
        doctorId = i;
        doctorName = n;
        location = l;
    }
 // Getter and Setter method
    public void setDoctorId(int i) {
        doctorId = i;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public void setLocation(String location) {
        this.location = location;
    }

    public void getDetails()
    {
        System.out.println("Doctor ID: "+doctorId);
        System.out.println("Doctor Name: "+doctorName);
        System.out.println("Location: "+location);
    }
}

class SpecialistDoctor extends Doctor
{
	// Getter and Setter method
    private String specialist;
    //set Specialist
    public void setSpecialist(String s) {
        this.specialist = s;
    }
    //get Specialist
    public String getSpecialist() {
        return specialist;
    }
    // parametrized constructor
    SpecialistDoctor(int i,String n,String l,String s)
    {
        super(i, n, l);
        specialist = s;
    }
   // get Details
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Specialist: "+specialist);
    }
}

class Profil {
    public static void main(String[] args) 
    {
    	//Creating Scannar class
        Scanner sc = new Scanner(System.in);
        //Taking input from user
        String t = sc.nextLine();
        //if statement
        if(t.equalsIgnoreCase("Specialist"))
        {
            SpecialistDoctor s = new SpecialistDoctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        //else-if statement
        else if(t.equalsIgnoreCase("Doctor"))
        {
            Doctor s = new Doctor(Integer.parseInt(sc.nextLine()), sc.nextLine(), sc.nextLine());
            s.getDetails();
        }
        //else statement
        else
        {
            System.out.println("Invalid Input");
        }     
        sc.close();  
    }
}