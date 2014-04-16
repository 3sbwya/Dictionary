package dict;

public interface Dictionary {
	public void put(String key, Model value);

	public Model remove(String key);

	public Model get(String key);

	public String toString();
}
