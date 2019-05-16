import java.util.Date;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Student extends User {
	protected String studentName;
	protected int studentID;
	protected int studentAge;
	private Courses[] myCourses = new Courses[10];
	public Character[] myGrades =  new Character[10];
	
	public TakeCourse tc; //Strategy pattern
	
	//constructor
	public Student () {
		System.out.println("Student Constructor");
	}
	
	public Student (int ID, String name, int age) {
		studentName = name;
		studentID = ID;
		studentAge = age;
	}
	
	public void setCourses(Courses[] courses) {
		this.myCourses = courses;
	}
	
	public void setName(String sname) {
		this.studentName = sname;
	}
	
	//getter
	public String getStudentName () {
		return this.studentName;
	}
	
	
	public int getStudeAge () {
		return this.studentAge;
	}
	
	public int getStudentID () {
		return this.studentID;
	}
	
	public void getStudentCourses () {
		int i = 0;
		while(this.myCourses[i] != null) {
			myCourses[i].ViewCourse(myCourses[i]);
			i++;
		}
	}

	
	
	//functions
	public void Addcourse(Courses c) {
		for(int i=0;i<myCourses.length;i++) {
			if(myCourses[i] == null)
			{
				myCourses[i] = c;
				break;
			}
		}
		
		Student myStudents[] = c.getStudents();
		
		for(int i=0; i< myStudents.length; i++) {
			if(myStudents[i] == null) {
				myStudents[i] = this;
				break;
			}	
			
		}
		
		c.setMyStudent(myStudents);
		
		System.out.println("What is the type of the course(Select the number)?");
		System.out.println("1.BI");
        System.out.println("2.Operation Management");
        System.out.println("3.Security");
        Scanner input4 = new Scanner(System.in);
    	int ct = input4.nextInt();
    	
    	if(ct == 1) {		//strategy pattern
    		tc = new BI();
    		tc.tc();
    	}
    	if(ct == 2) {
    		tc = new OM();
    		tc.tc();
    	}
    	if(ct == 3) {
    		tc = new Security();
    		tc.tc();
    	}
		
		NotifyAdd o = new NotifyAdd();
		this.attach(o);
		notifyObserver();
		this.detach(o);
    	
    }
        //method to add course
    public void Viewcourse() {
    	System.out.println("These are the courses you have+ ");
    }
    
    public void ViewStudent()
    {
    	
    System.out.println("Name | "+this.getStudentName());	
    
    }
    
    public Student AddStudent(int sID, String sName, int sage, int stype)
    {
    	System.out.println("Student add begins");
    	Student s1 = StudentFactory.getstudent(stype,sName,sID,sage); //factory pattern student factory
    	System.out.println("Student Added");
    	return s1;
    }
    
    public void ViewStudent(Student s1)
    {
    	
    System.out.println("Name | "+s1.getStudentName()+" | ID | "+s1.getStudentID()+" | Age | "+s1.getStudeAge());	
    
    }
    
    public void EditStudent(Student s)
    {
    	System.out.println("Existing Name: "+ s.getStudentName());
    	System.out.println("New Name? ");
    	Scanner input4 = new Scanner(System.in);
    	String sname= input4.nextLine();
    	s.setName(sname);
    	
    	ViewStudent(s);
    	
    System.out.println("Student Edited");
    }
    
    public Student DeleteStudent(Student s)
    {
    	return null;
    //System.out.println("Your course has been Deleted");
    }
    
        //method to view courses taken by student
    public Courses[] Dropcourse(int index) {
    	for(int i = index; i < myCourses.length -1; i++){
    		myCourses[i] = myCourses[i + 1];
    	      }
    	
    	NotifyDrop o = new NotifyDrop();
		this.attach(o);
    	notifyObserver();
    	this.detach(o);
    	return myCourses;
    }
    
// method to drop any course already enrolled
//Observer pattern implementation
    static private Vector myObs;
    static {
    	myObs= new Vector();
    }
    public static void attach(Observer o) {
		myObs.addElement(o);
    } 

    public static void detach(Observer o) {
    	myObs.remove(o);
    } 
    public void notifyObserver () {
		Observer oo;
		Enumeration e = myObs.elements();
		while(e.hasMoreElements()){
		    oo = (Observer) e.nextElement();
		    oo.update(this);
		}
    }
   
}
