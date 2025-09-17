package Ch6pr2;

import hankok.*;

public class pr2 {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.SetGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState)
		{
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if(myCar.isLeftGas())
		{
			System.out.println("가스를 주입할 필요가 없습니다.");
		} else
			System.out.println("가스를 주입하세요");

	}

}
