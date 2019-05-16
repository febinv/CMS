public class StudentFactory {
    public static Student getstudent(int studenttype,String studentname, int studentid, int age)
    {
        if(studenttype== 1)
        {
            return new MisStudent(studentid,studentname, age);
        }
        else if (studenttype==2)
        {
            return new MbaStudent(studentid,studentname,age);
        }
        else
        {
            return null;
        }
    }

}
