
public class NotifyAdd implements Observer {
	static public void NotifyAdd() {
		// do something 
		System.out.println("....verifying add course");
	}
	public void update(Student myStudent) {
		//can get more information about student
		//in question using myStudent 
		NotifyAdd();
		System.out.println("....done with adding new course and notified Admin and Instructor");
	}

}
