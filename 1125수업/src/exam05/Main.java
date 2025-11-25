package exam05;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		Key key1 = new Key(1234);
		Key key2 = new Key(1234);
		
		System.out.println(key1.hashCode());
		System.out.println(key2.hashCode());
		
		if(key1.equals(key2))
		{
			System.out.println("Equal");
		} else
		{
			System.out.println("Not equal");
		}
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1234), "Park");
		
		System.out.println(hashMap.get(new Key(1234)));
		
		

	}

}
