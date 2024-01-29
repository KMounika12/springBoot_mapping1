package text.com.Repository;

import java.awt.print.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
	public interface BookRepository extends JpaRepository<Book, String>
	{

public	Book findByBookId(int bookId);
	   

	}

