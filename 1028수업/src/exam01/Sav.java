package exam01;

public class Sav extends Acc {
	int bal;
	
	Sav(int bal) {
		super(bal);
	}
	
	void ShowBal()
	{
		System.out.println("Sav bal : " + bal);
	}
	
}
