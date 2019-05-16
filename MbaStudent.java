public class MbaStudent extends Student{
    public MbaStudent(int studentid, String studentname, int age){
        this.studentName=studentname;
        this.studentID=studentid;
        this.studentAge = age;
        System.out.println("Mbastudent created from factory method");
    }

}
