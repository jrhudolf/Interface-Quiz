package interfaceQuiz;

public interface Map<K,V> {

	V get(Object key);
	
	void put(K key, V value);
}
