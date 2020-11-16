package by.htp.less.book;

public class BookLogic {
	
	public BookAgregator findAuthor(BookAgregator library, String author) {
		BookAgregator _library = new BookAgregator();
		
		for(int i = 0; i < library.getLibrary().size(); i++) {
			if(library.getBook(i).getAuthor().compareTo(author) == 0) {
				_library.add(library.getBook(i));
			}
		}
		return _library;
	}

	public BookAgregator findPublisher(BookAgregator library, String publisher) {
		BookAgregator _library = new BookAgregator();
		
		for(int i = 0; i < library.getLibrary().size(); i++) {
			if(library.getBook(i).getPublisher().compareTo(publisher) == 0) {
				_library.add(library.getBook(i));
			}
		}
		
		return _library;
	}
	
	public BookAgregator findYear(BookAgregator library, int year) {
		BookAgregator _library = new BookAgregator();
		
		for(int i = 0; i < library.getLibrary().size(); i++) {
			if(library.getBook(i).getYearPub() > year) {
				_library.add(library.getBook(i));
			}
		}
		
		return _library;
	}
}
