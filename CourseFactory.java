import java.util.Date;

public class CourseFactory {
    public static Courses getcourse(int coursetype, Integer courseId, String courseName, Date startDate, Date endDate, Integer maxEnrollment, Integer numCredits) {
        if (coursetype ==1) {
        	System.out.println("Factory BI course");
            return new BiCourse(courseId,  courseName,  startDate,  endDate,  maxEnrollment, numCredits);
        } else if (coursetype == 2) {
            return new OmCourse(courseId,  courseName,  startDate,  endDate,  maxEnrollment, numCredits);
        } else if (coursetype == 3) {
            return new SecurityCourse(courseId,  courseName,  startDate,  endDate,  maxEnrollment, numCredits);
        } else {
            return null;
        }

    }
}
