import java.util.Date;

public class SecurityCourse extends Courses
{
    public SecurityCourse(Integer courseId, String courseName, Date startDate, Date endDate, Integer maxEnrollment, Integer numCredits){
    this.courseId = courseId;
    this.courseName = courseName;
    this.startDate = startDate;
    this.endDate = endDate;
    this.maxEnrollment = maxEnrollment;
    this.numCredits = numCredits;
        System.out.println("Security Course created from factory method");
    }
}