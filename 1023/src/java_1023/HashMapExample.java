package java_1023;

import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		
		System.out.println(map.size());
		
		System.out.println(map.get("홍길동"));
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while(keyIterator.hasNext())
		{
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println(key + value);
		}
		
		map.remove("홍길동");
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext())
		{
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println(key + value);
		}
		
		map.clear();
		
		Map<Student, Integer> map2 = new HashMap<Student, Integer>();
		
		map2.put(new Student(1, "홍길동"), 95);
		map2.put(new Student(1, "홍길동"), 95);
		
		System.out.println(map2.size());

	}

}
