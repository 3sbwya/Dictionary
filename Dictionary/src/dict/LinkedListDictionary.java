package dict;

public class LinkedListDictionary implements Dictionary {
	LinkedList list = new LinkedList();
	Model pair;
	String output;
	
	/**
	 * Adds an Ojbect pair to the dictionary. Does not allow 
	 * null keys or values. 
	 */
	@Override
	public void put(String key, Model value) {
		list.add(key, value);
	}

	/**
	 * Returns and deletes the first object associated with
	 * the key.
	 */
	@Override
	public Model remove(String key) {
		pair = list.remove(key);
		return pair;
	}

	/**
	 * Returns the first value object associated with the 
	 * key.
	 */
	@Override
	public Model get(String key) {
		pair = list.find(key);
		return pair;
	}
	
	/**
	 * Returns a string of the key/value pairs.
	 */
	@Override
	public String toString(){
		output = list.toString();
		return output;
	}

}
