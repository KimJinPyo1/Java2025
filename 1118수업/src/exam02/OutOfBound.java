package exam02;

public class OutOfBound {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		}
		catch(Exception e) {
			System.out.println("Array Index Exception!!");
			
		}
		
		System.out.println("args[0] : " + args[0]);
		System.out.println("args[1] : " + args[1]);

	}

}
