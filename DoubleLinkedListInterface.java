public interface DoubleLinkedListInterface<T> {

	// O(1)
	public void insertStart(T item);
	// O(n)
	public void insertAtPos(T item, int pos);
	// O(1)
	public void insertAtEnd(T item);
	// O(n)
	public void removeAtPos(int pos);
	// O(1)
	public int size();
	// O(1)
    public boolean isEmpty();
	// O(n)
	public void print();

}