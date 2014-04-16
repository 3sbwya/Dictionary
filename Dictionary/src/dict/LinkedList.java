package dict;


/**
 * 
 * @author Matthew Greene <mgreen85@uncc.edu>
 *
 */
public class LinkedList {
	private Node first, last;
	private int size = 0;
	
	/**
	 * Constructor.
	 */
	public LinkedList() {
		this.first = null;
		this.last = null;
	}
	
	/**
	 * Add the [key: definition] pairs to the list and sets tne
	 * next node to null.
	 * 
	 * @param key	Searchable value
	 * @param pair	Key: Definition pair
	 */
	public void add(String key, Model pair){		
		if(pair.getKey() == null || pair.getDefinition() == null){
			System.out.println("Nothing was added");
			return;
		}
		else{
			
			Node currentNode = new Node(key, pair);
			
			if(isEmpty()){
				first = last = currentNode;
				first.setNext(last);
				System.out.println(first.toString() + " was added to position " + (size + 1));
			}
			else{
				last.setNext(currentNode);
				last = currentNode;
				System.out.println(last.toString() + " was added to position " + (size + 1));
			}
		}
		size++;
		
	}
	
	/**
     * Searches for the Node associated with the key
     * from the dictionary and removes it from the 
     * linked list.
     * 
     * @param key	Search value
     * @return		the Model object associated with key
     */
	public Model remove(String key){
		Node currentNode, tempNode= new Node();
		boolean deleted = false;
		if(isEmpty()){
			
		}
		else{
			if(first.getKey() == key){
				tempNode = first;
				first = first.getNext();
				deleted = true;
				//return tempNode;
			}
			else{
				currentNode = first;
				for(int i = 0; i < size; i++){
					if(currentNode.getNext().getKey() == key){
						tempNode = currentNode.getNext();
						currentNode.setNext(tempNode.getNext());
						deleted = true;
						//return tempNode;
						break;
					}
					else{
						currentNode = currentNode.getNext();
					}
				}
			}
		}
		if(deleted){
			System.out.println(tempNode.toString() + " was deleted.");
			size--;
		}
		else{
			System.out.println("Nothing was deleted.");
		}
		return tempNode.getPair();
	}
	
	/**
     * Searches for the Node object associated 
     * with key. If no object is found, return null.
     * 
     * @param key	Search value
     * @return		Model object associated with key
     */
	public Model find(String key){
		Node currentNode = first;
		boolean found = false;
		for(int i = 0; i < size; i++){
			if(currentNode.getKey() != key){
				currentNode = currentNode.getNext();
			}
			else{
				found = true;
				break;
			}
		}
		if(!found){
			System.out.println("Key not found.");
			return null;
		}
		else{
			System.out.println(currentNode.toString() + " was found.");
			return currentNode.getPair();
		}
		
	}
	
	/**
	 * Returns a string of all our Nodes.
	 * 
	 * @return	String
	 */
	public String toString(){
		String output = "[";
		Node currentNode = first;
		for(int i = 0; i < size; i++){
			output += currentNode.toString();
			currentNode = currentNode.getNext();
			if(i < size-1){
				output += ", ";
			}
		}
		output += "]";
		return output;
	}
	
	public void printSize(){
		System.out.println("Size of list: " + size);
	}
	
	/**
	 * Returns boolean true if size of linkedlist
	 * is empty, false otherwise.
	 * 
	 * @return
	 */
	public boolean isEmpty(){
		if(size == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
