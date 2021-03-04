package interfaceQuiz;

import java.util.ArrayList;

public class InterfaceQuiz<K, V> implements Map<K,V>{
	
	static ArrayList<Object> keys;
	static ArrayList<Object> vals;
	
	public static void main(String[] args) {
		keys= new ArrayList<>();
		vals= new ArrayList<>();
		
		InterfaceQuiz x = new InterfaceQuiz();
		//returning null if the value is not filled
		System.out.println(x.get("sample"));
		x.put("sample", 1);
		x.put("sample2", 'b');
		x.put("sample3", 1.1);
		x.put("sample4", 10);
		//return the value if the key is present
		System.out.println(x.get("sample2"));
		//return the last value if the key is not present
		System.out.println(x.get("keysNotPresent"));
		
	}

	@Override
	public V get(Object key) {
		// TODO Auto-generated method stub
		
		if (keys.isEmpty()){
			return null;
		} else if (keys.contains(key)) {
			V valueFound=(V) vals.get(keys.indexOf(key));
			return valueFound;
		}else {
			V lastValue=(V) vals.get(keys.size()-1);
			return lastValue;
		}
	}

	@Override
	public void put(K key, V value) {
		keys.add(key);
		vals.add(value);
	}

}
