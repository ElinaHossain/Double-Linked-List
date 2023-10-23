class Book implements Comparable<Book> {

	private String name;
	private int ISBN;
	
	public Book(String name, int ISBN) {
		this.name = name;
		this.ISBN = ISBN;
	}
	
	// for Comparable interface
	@Override
	public int compareTo(Book aBook) {
		if(ISBN > aBook.getISBN()) {
			return 1;
		}
		else if(ISBN < aBook.getISBN()) {
			return -1;
		}
		return 0;
	}
	
	public String getName() {
		return name;
	}
	
	public int getISBN() {
		return ISBN;
	}
	
	public String toString() {
		return "(" + name + "," + ISBN + ")";
	}
   
       @Override
    public boolean equals(Object o) {
    
        // If the object is compared with itself then return true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(o instanceof Book)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members 
        Book c = (Book) o;
        return this.ISBN == c.ISBN;
    }

}