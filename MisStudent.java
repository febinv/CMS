public class MisStudent extends Student{
    public MisStudent(int studentid, String studentname, int age){
        this.studentName=studentname;
        this.studentID=studentid;
        this.studentAge = age;
        System.out.println("Mbastudent created from factory method");
    }

}
