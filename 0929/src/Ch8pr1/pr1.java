package Ch8pr1;

public class pr1 {

	public static void main(String[] args) {
		//RemoteControl rc;
		//rc=new Television();
		//rc=new Audio();
		
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;

	}

}
