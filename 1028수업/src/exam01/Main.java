package exam01;

public class Main {

	public static void main(String[] args) {
		
		Acc acc;
		Sav sav = new Sav(5000);
		acc = sav;
		
		sav.ShowBal();
		acc.ShowBal();
		
		System.out.println("Sav : " + sav.bal);
		System.out.println("Acc : " + acc.bal);

	}

}
