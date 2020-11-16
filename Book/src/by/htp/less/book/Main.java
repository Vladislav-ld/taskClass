package by.htp.less.book;

public class Main {

	public static void main(String[] args) {
		
		Book book1 = new Book(1,"a","a","a",1900,200,100,"a");
		Book book2 = new Book(2,"b","a","e",1910,200,100,"a");
		Book book3 = new Book(3,"c","b","e",1920,200,100,"a");
		Book book4 = new Book(4,"d","b","a",1930,200,100,"a");
		Book book5 = new Book(5,"e","c","a",1925,200,100,"b");
		Book book6 = new Book(6,"f","d","e",1935,200,100,"b");
		Book book7 = new Book(7,"g","d","d",1915,200,100,"b");
		Book book8 = new Book(8,"h","d","d",1940,200,100,"b");
		
		BookAgregator library = new BookAgregator();
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		library.add(book4);
		library.add(book5);
		library.add(book6);
		library.add(book7);
		library.add(book8);
		
		BookView view = new BookView();
		
		BookLogic logic = new BookLogic();
		
		view.printBook(logic.findAuthor(library, "a"));
		System.out.println();
		
		view.printBook(logic.findPublisher(library, "d"));
		System.out.println();
		
		view.printBook(logic.findYear(library, 1920));
		System.out.println();

	}

}
