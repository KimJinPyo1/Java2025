package exam01;

public class Main {

	public static void main(String[] args) {
		String data = null;
		
		try {
			//data = new String("HI");
			System.out.println(data.toString());
			System.out.println("It is OK!!");
		}
		catch(Exception e) {
//		catch(ClassCastException e) {
//			System.out.println(e);
			System.out.println("Null Pointer Exception!");
			
		}
		finally {
			System.out.println("Exception module done");
		}
		
		System.out.println("Program is running");
		
		

	}

}
