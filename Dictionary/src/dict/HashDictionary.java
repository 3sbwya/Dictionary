package dict;

public class HashDictionary implements Dictionary {
	HashTable hash = new HashTable();
	/**
	 * Adds an Ojbect pair to the dictionary. Does not allow 
	 * null keys or values. 
	 */
	@Override
	public void put(String key, Model value) {
		hash.add(key, value);
	}

	/**
	 * Returns and deletes the first object associated with
	 * the key.
	 */
	@Override
	public Model remove(String key) {
		return hash.remove(key);
	}

	/**
	 * Returns the first value object associated with the 
	 * key.
	 */
	@Override
	public Model get(String key) {
		return hash.find(key);
	}
	
	/**
	 * Returns a string of the key/value pairs.
	 */
	public String toString(){
		return hash.toString();
	}

}
