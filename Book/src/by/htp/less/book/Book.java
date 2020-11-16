package by.htp.less.book;

public class Book {

	private int id;
	private String name;
	private String author;
	private String publisher;
	private int yearPub;
	private int page;
	private int price;
	private String type;
	
	public Book (int _id, String _name, String _author, String _publisher, int _yearPub, int _page, int _price, String _type) {
		id = _id;
		name = _name;
		author = _author;
		publisher = _publisher;
		yearPub = _yearPub;
		page = _page;
		price = _price;
		type = _type;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getYearPub() {
		return yearPub;
	}

	public void setYearPub(int yearPub) {
		this.yearPub = yearPub;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + page;
		result = prime * result + price;
		result = prime * result + ((publisher == null) ? 0 : publisher.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + yearPub;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (page != other.page)
			return false;
		if (price != other.price)
			return false;
		if (publisher == null) {
			if (other.publisher != null)
				return false;
		} else if (!publisher.equals(other.publisher))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (yearPub != other.yearPub)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", yearPub="
				+ yearPub + ", page=" + page + ", price=" + price + ", type=" + type + "]";
	}
	

}
