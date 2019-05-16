import java.util.Date;
import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args)
    {
        Boolean quit = false;
        while(!quit) {
            System.out.println("Please choose your role:");
            System.out.println("1.Admin");
            System.out.println("2.Instructor");
            System.out.println("3.Student");
            System.out.println("0.Quit");
            Scanner in = new Scanner(System.in);
            Boolean quit1= false;
            Boolean quit2= false;
            Boolean quit3= false;
            int selection = in.nextInt();
         
    		Courses c1 = new Courses(1, "EDM", new Date( ), new Date( ), 23, 3);
    		Courses c2 = new Courses(2, "Accounting", new Date( ), new Date( ), 23, 3);
    		Courses c3 = new Courses(3, "System Administrator", new Date( ), new Date( ), 23, 3);
    		Courses c4 = new Courses(4, "Business Communications", new Date( ), new Date( ), 23, 3);
    		
    		Courses [] myCourses = new Courses[10];
    		
    		//some courses initialized 
    		myCourses[0] = c1; 	myCourses[1] = c2; 	myCourses[2] = c3; 	myCourses[3] = c4; 
    		
    		Student s1 = new Student(1,"John Doe",23);
    		Student s2 = new Student(2,"Jane Doe",21);
    		Student myStudents[] = new Student[10];
    		
    		//some students initialized
    		myStudents[0] = s1; myStudents[1] = s2;
    		
    		Instructor inst1=new Instructor(1,"Dr. Currim",2);
    	    Instructor inst2=new Instructor(2,"Dr. Ram",3);
    	    
    	    //some instructors initialized
    	    Instructor [] instructors = new Instructor[10];
    	    instructors[0] = inst1; instructors[1] = inst2;
    		
            switch (selection) {
                case 1:
                    while(!quit1) {
                    System.out.println("Please choose your option:");
                    System.out.println("1.CreateCourse");
                    System.out.println("2.ViewCourse");
                    System.out.println("3.EditCourse");
                    System.out.println("4.CreateInstructor");
                    System.out.println("5.ViewInstructor");
                    System.out.println("6.EditInstructor");
                    System.out.println("7.CreateStudent");
                    System.out.println("8.ViewStudent");
                    System.out.println("9.EditStudent");
                    System.out.println("10.DeleteCourse");
                    System.out.println("11.DeleteInstructor");
                    System.out.println("12.DeleteStudent");
                    System.out.println("0.Back");
                    int selection1 = in.nextInt();
                        switch (selection1) {
                            case 1:
                        		
                        		
                        		System.out.println("What is the Course ID? ");
                            	Scanner input = new Scanner(System.in);
                            	int cID = input.nextInt();
                            	
                            	System.out.println("What is the Course name? ");
                            	Scanner input1 = new Scanner(System.in);
                            	String cname = input1.next();
                            	
                            	System.out.println("What is the max enrollment? ");
                            	Scanner input2 = new Scanner(System.in);
                            	int cenrol = input2.nextInt();
                            	
                            	System.out.println("What are the number of credits? ");
                            	Scanner input3 = new Scanner(System.in);
                            	int cred = input3.nextInt();
                            	
                            	System.out.println("What is the type of course ?");
                            	System.out.println("1.BI");
                                System.out.println("2.OM");
                                System.out.println("3.Security");
                            	input3 = new Scanner(System.in);
                            	int ctype = input3.nextInt();
                            	
                            	int j = 0;
                            	for(j = 0; j<myCourses.length ; j++) {
                            		if(myCourses[j] == null) {
                            			break;
                            		}
                            	}
                            	
                            	myCourses[j] = myCourses[3].AddCourse(cID, cname, new Date(), new Date(), cenrol, cred,ctype);  //factory pattern course factory
                                break;
                            
                            case 2:
                            	System.out.println("View Courses");
                        		for(int i=0;i<myCourses.length;i++) {
                        			if(myCourses[i] != null)
                        			myCourses[i].ViewCourse(myCourses[i]);
                        		}
                                break;
                                
                            case 3:
                            	System.out.println("Edit Courses");
                        		System.out.println("What is the Course ID to edits? ");
                            	Scanner input4 = new Scanner(System.in);
                            	cID = input4.nextInt();
                            	myCourses[cID-1].EditCourse(myCourses[cID-1]);
                                break;
                                
                            case 4:
                            	System.out.println("What is the Instructor ID? ");
                            	input = new Scanner(System.in);
                            	int iID = input.nextInt();
                            	
                            	System.out.println("What is the Instructor name? ");
                            	input1 = new Scanner(System.in);
                            	String iname = input1.next();
                            	
                            	System.out.println("What is course id to assign? ");
                            	input2 = new Scanner(System.in);
                            	cID = input2.nextInt();
                            	
                            	int k = 0;
                            	for(k = 0; k<instructors.length ; k++) {
                            		if(instructors[k] == null) {
                            			break;
                            		}
                            	}
                            	
                            	instructors[k] = instructors[1].AddInstructor(iID, iname, cID);
                                break;
                                
                            case 5:
                            	System.out.println("View Instructor");
                        		for(int i=0;i<instructors.length;i++) {
                        			if(instructors[i] != null)
                        				instructors[i].ViewInstructor(instructors[i]);
                        		}
                                break;
                                
                            case 6:
                            	System.out.println("Edit instructor");
                        		System.out.println("What is the instructor ID to edit? ");
                            	input4 = new Scanner(System.in);
                            	iID = input4.nextInt();
                            	instructors[iID-1].EditInstructor(instructors[iID-1]);
                                break;
                                
                            case 7:
                            	System.out.println("What is the Student ID? ");
                            	input = new Scanner(System.in);
                            	int sID = input.nextInt();
                            	
                            	System.out.println("What is the Student name? ");
                            	input1 = new Scanner(System.in);
                            	String sname = input1.next();
                            	
                            	System.out.println("What is the student's age? ");
                            	input2 = new Scanner(System.in);
                            	int sage = input2.nextInt();
                            	
                            	System.out.println("What is the Student type? ");
                            	System.out.println("1.MIS");
                                System.out.println("2.MBA");
                            	input1 = new Scanner(System.in);
                            	int stype = input1.nextInt(); //factory pattern student factory
                            	
                            	int l = 0;
                            	for(l = 0; l<myStudents.length ; l++) {
                            		if(myStudents[l] == null) {
                            			break;
                            		}
                            	}
                            	
                            	
                            	myStudents[l] = myStudents[1].AddStudent(sID, sname, sage,stype); 
                                break;
                                
                            case 8:
                            	System.out.println("View Student");
                        		for(int i=0;i<myStudents.length;i++) {
                        			if(myStudents[i] != null) {
                        			myStudents[i].ViewStudent(myStudents[i]);
                        			myStudents[i].getStudentCourses();
                        			
                        			}
                        		}
                                break;
                                
                            case 9:
                            	System.out.println("Edit Student");
                        		System.out.println("What is the Student ID to edit? ");
                            	input4 = new Scanner(System.in);
                            	sID = input4.nextInt();
                            	myStudents[sID-1].EditStudent(myStudents[sID-1]);
                                break;
                                
                            case 10:
                            	System.out.println("Delete Courses");
                        		System.out.println("What is the Course ID to delete? ");
                            	input4 = new Scanner(System.in);
                            	cID = input4.nextInt();
                            	myCourses[cID-1] = myCourses[cID-1].DeleteCourse(myCourses[cID-1]);
                            	break;
                            	
                            case 11:
                            	System.out.println("Delete instructor");
                        		System.out.println("What is the instructor ID to delete? ");
                            	input4 = new Scanner(System.in);
                            	iID = input4.nextInt();
                            	instructors[iID-1] = instructors[iID-1].DeleteInstructor(instructors[iID-1]);
                            	break;
                            	
                            case 12:
                            	System.out.println("Delete Student");
                        		System.out.println("What is the student ID to delete? ");
                            	input4 = new Scanner(System.in);
                            	sID = input4.nextInt();
                            	myStudents[sID-1] = myStudents[sID-1].DeleteStudent(myStudents[sID-1]);
                            	break;	
                        
                            case 0:
                                quit1=true;
                                break;
                            default:
                                System.out.println("Incorrect Option Please select again:");
                        }
                    }
                    break;
                case 2:
                    while(!quit2) {
                    System.out.println("Please choose your option:");
                    System.out.println("1.ViewCourse");
                    System.out.println("2.Assign Grades to Course");
                    System.out.println("0.Back");
                    int selection2 = in.nextInt();
                        switch (selection2) {
                            case 1:
                            	System.out.println("View Courses");
                        		for(int i=0;i<myCourses.length;i++) {
                        			if(myCourses[i] != null)
                        			myCourses[i].ViewCourse(myCourses[i]);
                        		}
                                break;
                                
                            case 2:
                            	System.out.println("What is your instructor ID? ");
                            	Scanner input4 = new Scanner(System.in);
                            	int iID = input4.nextInt();
                            	instructors[iID-1].assignGrades(myStudents);
                                break;
                            case 0:
                                quit2=true;
                                break;
                            default:
                                System.out.println("Incorrect Option Please select again:");
                        }
                    }
                    break;
                case 3:
                    while(!quit3) {
                    System.out.println("Please choose your option:");
                    System.out.println("1.AddCourse");
                    System.out.println("2.ViewCourse");
                    System.out.println("3.DropCourse");
                    System.out.println("0.Back");
                    int selection3 = in.nextInt();
                        switch (selection3) {
                            case 1:
                            	System.out.println("What is your SID?");
                            	Scanner input4 = new Scanner(System.in);
                            	int sID = input4.nextInt();
                            	
                            	System.out.println("Select the course id to add");
                            	input4 = new Scanner(System.in);
                            	int cID = input4.nextInt();
                            	myStudents[sID-1].Addcourse(myCourses[cID -1]);	
                                break;
                            case 2:
                            	System.out.println("What is your SID?");
                            	input4 = new Scanner(System.in);
                            	sID = input4.nextInt();
                            	myStudents[sID-1].getStudentCourses();
                                break;
                            case 3:
                            	System.out.println("What is your SID?");
                            	input4 = new Scanner(System.in);
                            	sID = input4.nextInt();
                            	System.out.println("Select the course id to drop");
                            	input4 = new Scanner(System.in);
                            	cID = input4.nextInt();
                            	myStudents[sID-1].setCourses(myStudents[sID-1].Dropcourse(cID -1));
                                break;
                            case 0:
                                quit3 = true;
                                break;
                            default:
                                System.out.println("Incorrect Option Please select again:");
                                break;
                        }
                    }
                    break;
                case 0:
                    quit=true;
                    break;
                default:
                    System.out.println("Incorrect Option Please select again:");
                    selection = in.nextInt();

            }
        }
    }
}