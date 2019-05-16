import java.util.Date;

public class OmCourse extends Courses
{
    public OmCourse(Integer courseId, String courseName, Date startDate, Date endDate, Integer maxEnrollment, Integer numCredits){
        this.courseId = courseId;
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxEnrollment = maxEnrollment;
        this.numCredits = numCredits;
        System.out.println("OMCourse created from factory method");
    }

}
