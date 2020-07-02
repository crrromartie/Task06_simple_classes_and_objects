package by.htp.les.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.les.entity.Book;

public class BookLogic {

	public List<Book> findByAuthor(String author, List<Book> books) {
		List<Book> booksByAuthor = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (author.compareTo(books.get(i).getAuthor()) == 0) {
				booksByAuthor.add(books.get(i));
			}
		}

		return booksByAuthor;
	}

	public List<Book> findByPublishingOffice(String publishingOffice, List<Book> books) {
		List<Book> booksByPublishingOffice = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (publishingOffice.compareTo(books.get(i).getPublishingOffice()) == 0) {
				booksByPublishingOffice.add(books.get(i));
			}
		}

		return booksByPublishingOffice;
	}

	public List<Book> findAfterYear(int yearAfter, List<Book> books) {
		List<Book> booksAfterYear = new ArrayList<Book>();
		for (int i = 0; i < books.size(); i++) {
			if (yearAfter < books.get(i).getYearPublishing()) {
				booksAfterYear.add(books.get(i));
			}
		}
		return booksAfterYear;
	}
}
