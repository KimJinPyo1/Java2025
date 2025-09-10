package sec01.problem4;

public class problem4 {

	public static void main(String[] args) {
		int v1 = 0;
		if(true)
		{
			int v2=0;
			if(true) 
			{
				int v3 = 0;
				v1=1;
				v2=1;
				v3=1;
			}
			//v1=v2+v3; // v3 변수는 위의 조건문 안에서 선언되었기 때문에
					 // 위의 조건문을 빠져나가면 v3라는 변수는 사라짐
					// v2 v3를 v1과 같이 처음에 선언해주던지 아니면 위의 조건문에서 v1에 v2 v3 를 더해주면 됨
		}
		
		System.out.println(v1);

	}

}
