package by.htp.less.book;

public class BookView {
	
	public void printBook(BookAgregator library) {
		for(int i = 0; i < library.getLibrary().size(); i++) {
			
			Book book = library.getBook(i);
			
			System.out.println("Id = " + book.getId());
			
			System.out.println("Name = " + book.getName());
			
			System.out.println("Author = " + book.getAuthor());
			
			System.out.println("Publisher = " + book.getPublisher());
			
			System.out.println("yearBub = " + book.getYearPub());
			
			System.out.println("Page = " + book.getPage());
			
			System.out.println("Price = " + book.getPrice());
			
			System.out.println("Type = " + book.getType());
		}
	}

}
