import java.util.Date;
import java.util.Scanner;


public class Courses {

    protected Integer courseId;

    protected String courseName;

    protected Date startDate;

    protected Date endDate;

    protected Integer maxEnrollment;

    protected Integer numCredits;
    
    Student[] myStudent =  new Student[10];

    //constructor
    
    public Courses() {
    	
    }
    public Courses(Integer _courseId, String courseName, Date startDate, Date endDate, Integer maxEnrollment, Integer numCredits)
    {
        courseId = _courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxEnrollment = maxEnrollment;
        this.numCredits = numCredits;
    }
    
    public Student[] getStudents() {
    	return this.myStudent;
    }

    //setter functions
    public void setCourseId(Integer courseId)
    {
        this.courseId = courseId;
    }

    public void SetCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    public void SetStartCourse(Date startDate)
     {
       this.startDate = startDate;
     }

    public void SetEndCourse(Date endDate)
     {
        this.endDate = endDate;
     }

     public void setMaxEnrollment(Integer maxEnrollment)
     {
        this.maxEnrollment = maxEnrollment;
     }

     public void setNumCredits(Integer numCredits)
     {
        this.numCredits = numCredits;
     }
     
     public void setMyStudent(Student[] s1)
     {
        this.myStudent = s1;
     }
     
    
    
     // Getter functions
     public String GetCourseName()
     {
        return this.courseName;
     }

     public Date GetStartCourse()
     {
        return this.startDate;
     }
     public Date GetEndCourse()
     {
       return this.endDate;
     }

     public Integer GetMaxEnrollment()
     {
       return this.maxEnrollment;
     }

     public Integer GetNumCredits()
     {
       return this.numCredits;
     }



    public Courses AddCourse(int courseID, String courseName, Date d1, Date d2, int num, int cred,int ctype)
    {
    	System.out.println("Course Added begins");
    	Courses c1 = CourseFactory.getcourse(ctype,courseID, courseName, d1, d2, num, cred); //factory pattern course factory
    	System.out.println("Course Added");
    	return c1;
    }
    
    public void EditCourse(Courses c)
    {
    	System.out.println("Existing Name: "+ c.GetCourseName());
    	System.out.println("New Name? ");
    	Scanner input4 = new Scanner(System.in);
    	String cname= input4.nextLine();
    	c.SetCourseName(cname);
    	System.out.println("New max enrollment? ");
    	Scanner input5 = new Scanner(System.in);
    	int cenr= input5.nextInt();
    	c.setMaxEnrollment(cenr);
    	
    	ViewCourse(c);
    	
    System.out.println("Course Edited");
    }

    public void ViewCourse(Courses c1)
    {
    	
    System.out.println("Name | "+c1.GetCourseName()+" | Max Enrollement | "+c1.GetMaxEnrollment()+" | Credits | "+c1.GetNumCredits());	
    
    }
    
   

    public Courses DeleteCourse(Courses c)
    {
    	return null;
    //System.out.println("Your course has been Deleted");
    }

    public void RegisterCourse(Integer courseId)
    {
    System.out.println("Your course has been Registered");
    }


}
