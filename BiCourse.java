import java.util.Date;

public class BiCourse extends Courses
{
    public BiCourse(Integer courseId, String courseName, Date startDate, Date endDate, Integer maxEnrollment, Integer numCredits){
        this.courseId = courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxEnrollment = maxEnrollment;
        this.numCredits = numCredits;
        System.out.println("BICourse created from factory method");
    }

}