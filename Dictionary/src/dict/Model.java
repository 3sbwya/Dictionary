package dict;
/**
 * 
 * @author Matthew Greene <mgreen85@uncc.edu>
 * 
 * Stores the key/definition pairs
 *
 */
public class Model {
	private String key, definition;
	
	/**
	 * Primary constructor. Takes in key and 
	 * definition to create the Model object.
	 *  
	 * @param key
	 * @param definition
	 */
	public Model(String key, String definition) {
		this.key = key;
		this.definition = definition;
	}
	
	/**
	 * Default constructor
	 */
	public Model(){
		this(null, null);
	}
	
	/**
	 * Returns key.
	 * @return
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * Sets key
	 * @param key
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	/**
	 * Returns definition.
	 * @return
	 */
	public String getDefinition() {
		return definition;
	}

	/**
	 * Sets definition.
	 * @param definition
	 */
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	
	public String toString(){
		return this.key + ": " + this.definition;
	}
}
