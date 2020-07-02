package by.htp.les.view;

import java.util.List;

import by.htp.les.entity.Book;

public class BookView {

	public void printAllBook(String message, List<Book> books) {
		System.out.println(message);
		for (Book b : books) {
			printOneBook(b);
		}
	}

	public void printOneBook(Book book) {
		System.out.println("id:" + book.getId() + "/Title:" + book.getTitle() + "/Author:" + book.getAuthor()
				+ "/Publishing Office:" + book.getPublishingOffice() + "/Year of publishing:" + book.getYearPublishing()
				+ "/Number of pages:" + book.getNumberPages() + "/Binding type:" + book.getBindingType());
	}

}
