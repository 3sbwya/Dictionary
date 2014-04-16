package dict;
/**
 * Creates a Node which store a searchable key and the Model object.
 * @author Matthew Greene <mgreen85@uncc.edu>
 *
 */
public class Node {
	private Model pair;
	private Node next;
	private String key;
	
	/**
	 * Primary constructor. Takes in String key and 
	 * Model object to create the Node object.
	 * 
	 * @param key
	 * @param pair
	 */
	public Node(String key, Model pair) {
		this.key = key;
		this.pair = pair;
	}
	
	/**
	 * Default constructor.
	 */
	public Node(){
		this("", null);
	}
	
	/**
	 * Sets the key/value pair.
	 * 
	 * @param key
	 * @param definition
	 */
	public void setPair(String key, String definition){
		pair = new Model(key, definition);
	}
	
	/**
	 * Sets the key.
	 * 
	 * @param key
	 */
	public void setKey(String key){
		this.key = key;
	}
	
	/**
	 * Returns the key.
	 * @return
	 */
	public String getKey(){
		return key;
	}
	
	/**
	 * Returns key/value pair.
	 * 
	 * @return
	 */
	public Model getPair(){
		return pair;
	}
	
	/**
	 * Sets the next Node object to be linked to.
	 * 
	 * @param next
	 */
	public void setNext(Node next){
		this.next = next;
	}
	
	/**
	 * Returns next Node object.
	 * @return
	 */
	public Node getNext(){
		return next;
	}

	@Override
	public String toString() {
		return pair.toString();//pair.getKey() + ": " + pair.getDefinition();
	}
	
	
}
