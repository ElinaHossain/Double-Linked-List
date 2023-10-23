import java.util.Scanner;
class Driver {

	public static void main(String[] args) {
   
   Scanner sc = new Scanner(System.in);
	
		// TODO: Use Scanner for ALL inputs (when creating new objects of Book)
	
		DoubleLinkedList<Book> bookList = new DoubleLinkedList<Book>(); // Complete ALL unimplemented Methods
     		
		System.out.print("Enter number of books: " );
		String numberOfBooksStr = sc.nextLine();
		int numberOfBooks = Integer.parseInt(numberOfBooksStr);
		
		System.out.println("numberOfBooksStr: " + numberOfBooksStr);
		System.out.println("numberOfBooks: " + numberOfBooks);
		
		Book[] booksA = new Book[numberOfBooks];
      
      	System.out.println("Printing List: ");
      	bookList.print();
      
      	for(int i = 0; i < numberOfBooks; i++) {
			System.out.print("Enter name of book: ");
			String name = sc.nextLine();
			System.out.print("Enter ISBN of book: ");
			int ISBN = Integer.parseInt(sc.nextLine());
			booksA[i] = new Book(name, ISBN); 
			bookList.insertStart((booksA[i])); 
		}
        System.out.println("\nPrinting List: ");
        bookList.print(); 
      	
      	boolean IsEmpty = bookList.isEmpty();
      	System.out.println(" \n "+ "Is the List Empty? " + IsEmpty);
      	System.out.println("Size: " + bookList.size());

      	System.out.println("Enter the name of book: ");
      	String name = sc.nextLine();
      	System.out.print("Enter ISBN of book: ");
      	int ISBN = Integer.parseInt(sc.nextLine());
      	Book book1 = new Book(name, ISBN);
      	System.out.println("Enter the position to insert book: ");
      	int pos = Integer.parseInt(sc.nextLine());
      	bookList.insertAtPos(book1, pos);
      
      	System.out.println("\nPrinting List: ");
        bookList.print();
      
      	System.out.println("\n " + "Enter the name of book: ");
      	name = sc.nextLine();
      	System.out.print("Enter ISBN of book: ");
      	ISBN = Integer.parseInt(sc.nextLine());
      	Book book2 = new Book(name, ISBN);
      	System.out.println("Enter the position to insert book: ");
      	pos = Integer.parseInt(sc.nextLine());
      	bookList.insertAtPos(book2, pos);
      
      	System.out.println("Printing List: ");
        bookList.print();
      
      	System.out.println("\n " + "Enter the name of book: ");
         name = sc.nextLine();
         System.out.print("Enter ISBN of book: ");
         ISBN = Integer.parseInt(sc.nextLine());
         Book book3 = new Book(name, ISBN);
         bookList.insertAtEnd(book3);
         System.out.println("Printing List: ");
         bookList.print();
      
      	System.out.println("Printing List: ");
         bookList.print();
         
         System.out.println("\n " + "Enter a position to remove:");
         int pos1 = Integer.parseInt(sc.nextLine());
         bookList.removeAtPos(pos1);
      
         System.out.println("\n " + "Enter a position to remove:");
         int pos2 = Integer.parseInt(sc.nextLine());
         bookList.removeAtPos(pos2);
      
      	System.out.println("\n " + "Enter a position to remove:");
         int pos3 = Integer.parseInt(sc.nextLine());
         bookList.removeAtPos(pos3);
      	
      	System.out.println("Printing List: ");
         bookList.print();

      }
    }