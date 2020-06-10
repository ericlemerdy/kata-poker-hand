package name.lemerdy.eric.solid.model.book;

import java.util.List;

public interface Books {

	void add(Book book);

	List<Book> all();

	double totalPriceFor(BookType bookType);

	long countBy(BookType bookType);
	
}
