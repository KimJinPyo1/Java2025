package sec02.exam02;

public class ForTest {

	public static void main(String[] args) {
		Out: for(int x=0; x<10; x++)
		{
			for(int y = 0; y<10; y++)
			{
				System.out.println("x" + x + ", " + "y" + y);
				if(x==5 && y==5)
				{
					break Out;
				}
			}
		}

	}

}
