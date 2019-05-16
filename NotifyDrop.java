
public class NotifyDrop implements Observer {
	static public void NotifyDrop() {
		// do something 
		System.out.println("....verifying dropping new course");
	}

	public void update(Student myStudent) {
		//can get more information about student
		//in question using myStudent 
		NotifyDrop();
		System.out.println("....done with dropping new course notified Admin and Instructor");
	}

}
