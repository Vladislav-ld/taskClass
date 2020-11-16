package by.htp.less.book;

import java.util.ArrayList;
import java.util.List;

public class BookAgregator {
	
	private List<Book> library;
	
	public BookAgregator () {
		library = new ArrayList<Book>();
	}
	
	public void add(Book book) {
		library.add(book);
	}
	
	public List<Book> getLibrary() {
		return library;
	}
	
	public Book getBook(int index) {
		if( index >= library.size()) {
			return null;
		}
		return library.get(index);
	}
	

}
