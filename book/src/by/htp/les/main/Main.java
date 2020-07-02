package by.htp.les.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.les.entity.Book;
import by.htp.les.entity.Library;
import by.htp.les.logic.BookLogic;
import by.htp.les.view.BookView;

public class Main {

	public static void main(String[] args) {

		Library library = new Library();
		BookView bv = new BookView();
		BookLogic bl = new BookLogic();

		library.addBook(
				new Book(314, "Thinking in Java", "Bruce Eckel", "Prentice Hall", 2006, 1164, "Solid cardboard"));
		library.addBook(new Book(278, "Clean Code", "Robert C.Martin", "Prentice Hall", 2008, 464, "All-fabric"));
		library.addBook(new Book(411, "C++ Primer Plus", "Stephen prata", " Addison-Wesley Professional", 2011, 1440,
				"Solid cardboard"));
		library.addBook(new Book(314, "UNIX primer plus", "Stephen prata", "H.W. Sams", 1983, 4414, "Solid cardboard"));
		library.addBook(
				new Book(314, "Clean Architecture", "Robert C.Martin", "Prentice Hall", 2017, 428, "All-fabric"));
		library.addBook(new Book(314, "Effective Java", "Joshua Bloch", "Addison-Wesley Professional", 2018, 412,
				"All-fabric"));

		List<Book> booksByAuthor = new ArrayList<Book>();
		booksByAuthor.addAll(bl.findByAuthor("Stephen prata", library.getBooks()));
		bv.printAllBook("By author", booksByAuthor);

		System.out.println();
		List<Book> booksByPublishingOffice = new ArrayList<Book>();
		booksByPublishingOffice.addAll(bl.findByPublishingOffice("Prentice Hall", library.getBooks()));
		bv.printAllBook("By publishing office", booksByPublishingOffice);

		System.out.println();
		List<Book> booksAfterYear = new ArrayList<Book>();
		booksAfterYear.addAll(bl.findAfterYear(2010, library.getBooks()));
		bv.printAllBook("After year", booksAfterYear);
		
		

	}

}
