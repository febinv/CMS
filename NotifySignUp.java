
public class NotifySignUp implements Observer{
	static public void NotifySignUp() {
		// do something 
		System.out.println("....verifying sign up");
	}
	public void update(Student myStudent) {
		//can get more information about student
		//in question using myStudent 
		NotifySignUp();
		System.out.println("......done with signing up");
	}

}
