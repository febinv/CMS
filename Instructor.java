import java.util.Scanner;

public class Instructor extends User {
	private int instructorID;
	private String instructorName;
    private int courseID;
    
    public Instructor(int instructorID, String instructorName, int courseID) {
    	this.instructorID = instructorID;
    	this.courseID = courseID;
    	this.instructorName = instructorName;
    }
    
    public String getInstructorName() {
    	return this.instructorName;
    }
    
    public void setInstructorName(String sname) {
    	this.instructorName = sname;
    }
    
    public Instructor AddInstructor(int iID,String iname,int cID) {
    	System.out.println("Instructor Added Instructor");
    	Instructor i1 = new Instructor(iID,iname,cID);
    	System.out.println("Instructor Added");
    	return i1;
    }
    
    
    public void ViewInstructor(Instructor i)
    {
    	
    System.out.println("Name | "+i.instructorName+" | Instructor Id | "+i.instructorID+" | Course Id | "+i.courseID);	
    
    }
    
    public void EditInstructor(Instructor i) {
    System.out.println("Existing Name: "+ i.instructorName);
	System.out.println("New Name? ");
	Scanner input4 = new Scanner(System.in);
	String cname= input4.nextLine();
	i.setInstructorName(cname);
	
	ViewInstructor(i);
	System.out.println("Instructor Edited");
    }
    
    public Instructor DeleteInstructor(Instructor c)
    {
    	return null;
    //System.out.println("Your course has been Deleted");
    }
    
    public void assignGrades(Student[] st) {
    	System.out.println("What is the ID of the student for whom grades to assign? ");
    	Scanner input4 = new Scanner(System.in);
    	int sID= input4.nextInt();
    	
    	st[sID-1].getStudentCourses();
    	
    	System.out.println("What is the ID of the course? ");
    	input4 = new Scanner(System.in);
    	int cID = input4.nextInt();
    	
    	System.out.println("What is the grade for the course? ");
    	input4 = new Scanner(System.in);
    	char grade = input4.next().charAt(0);
    	
    	st[sID-1].myGrades[cID-1] = grade;
    	
    	
    	
    	
    }
 
    
    }
