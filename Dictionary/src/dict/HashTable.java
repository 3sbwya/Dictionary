package dict;

public class HashTable {
	LinkedList[] table;
	private final int tableSize = 31;
	private int index = 0,size;
	private String[] keys = new String[tableSize];;
	
	public HashTable(){
		table = new LinkedList[tableSize];
		size = tableSize - 1;
		for(int i = 0; i < size; i++){
			table[i] = new LinkedList();
		}
	}
	
	/**
	 * Returns the modulus of the sum of the key by 
	 * size of the table.
	 * 
	 * @param key	String to calculate the hash function.
	 * @return		int hash function
	 */
	public int hashFunction(String key){
		String input = key.toLowerCase();
		int hashNum = 0;
		for(int i = 0; i < input.length(); i++){
			hashNum += (int) input.charAt(i);
		}
		return (hashNum % tableSize);
	}
	
	/**
	 * Added a valid key and pair to the Linked List. 
	 * Nothing is added if key or pair is invalid or null.
	 * 
	 * @param key
	 * @param pair
	 */
	public void add(String key, Model pair){
		if(key == null || pair == null){
			System.out.println("Nothing was added.");
			return;
		}
		else{
			int location = hashFunction(key);
			keys[index] = key;
			index++;
			
			table[location].add(key, pair);
			}
	}
	
	/**
	 * Returns the first Model pair associated with the key and 
	 * removes that pair from the hash table. Returns null if 
	 * no pair is found.
	 * 
	 * @param key	Searchable string
	 * @return		Model pair
	 */
	public Model remove(String key){
		Model element = null;
		int slot = hashFunction(key);
		
		element = table[slot].remove(key);
		return element;
	}
	
	/**
	 * Returns the first Model pair associated with the key.
	 * Returns null if no pair is found.
	 * 
	 * @param key	Searchable string
	 * @return		Model pair
	 */
	public Model find(String key){
		int slot = hashFunction(key);
		Model output = table[slot].find(key);
		
		return output;
	}
	
	/**
	 * Returns a string of all Model pairs in the hash table.
	 */
	public String toString(){
		String output = null;
		for(int i = 0; i < tableSize; i++){
			
			if(table[i] != null){
				output += table[i].toString();
			}
		}
		return output;
	}
}
