// Node class used for Double Linked List data structure
class Node<T> {

	// memebers
	private    T item;
	private Node<T> next;
	private Node<T> prev;
	
	// constructor #1
	public Node(T item) {
		this.item = item;
		next = null;
		prev = null;
	}
	
	// constructor #2
	public Node(T item, Node<T> next, Node<T> prev) {
		this.item = item;
		this.next = next;
		this.prev = prev;
	}
	
	// getters
	public T getItem() {
		return item;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public Node<T> getPrev() {
		return prev;
	}
	
	// setters
	public void setItem(T item) {
		this.item = item;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public void setPrev(Node<T> prev) {
		this.prev = prev;
	}

}