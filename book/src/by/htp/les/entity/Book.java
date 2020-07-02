package by.htp.les.entity;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publishingOffice;
	private int yearPublishing;
	private int numberPages;
	private String bindingType;

	public Book() {
		this.id = 0;
		this.title = null;
		this.author = null;
		this.publishingOffice = null;
		this.yearPublishing = 0;
		this.numberPages = 0;
		this.bindingType = null;
	}

	public Book(int id, String title, String author, String publishingOffice, int yearPublishing, int numberPages,
			String bindingType) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publishingOffice = publishingOffice;
		this.yearPublishing = yearPublishing;
		this.numberPages = numberPages;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingOffice() {
		return publishingOffice;
	}

	public void setPublishingOffice(String publishingOffice) {
		this.publishingOffice = publishingOffice;
	}

	public int getYearPublishing() {
		return yearPublishing;
	}

	public void setYearPublishing(int yearPublishing) {
		this.yearPublishing = yearPublishing;
	}

	public int getNumberPages() {
		return numberPages;
	}

	public void setNumberPages(int numberPages) {
		this.numberPages = numberPages;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + numberPages;
		result = prime * result + ((publishingOffice == null) ? 0 : publishingOffice.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearPublishing;
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
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (numberPages != other.numberPages)
			return false;
		if (publishingOffice == null) {
			if (other.publishingOffice != null)
				return false;
		} else if (!publishingOffice.equals(other.publishingOffice))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearPublishing != other.yearPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishingOffice=" + publishingOffice
				+ ", yearPublishing=" + yearPublishing + ", numberPages=" + numberPages + ", bindingType=" + bindingType
				+ "]";
	}

}
