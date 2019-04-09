package com.gov.npi.lms.dao;

import com.gov.npi.lms.domain.BookInformation;
import java.util.List;

/**
 *
 * @author Samrat Al Shahriar Nayeem
 */
public interface BookInformationDAO {

    public void add(BookInformation bkinfa);

    public void update(BookInformation bkinfu, String bookID);

    public void delete(String bkinfd);

    List<BookInformation> getList();

    BookInformation getBookInformationByBookID(String bookId);

    List<BookInformation> getListByBookID(String bookID);

    List<BookInformation> getListByBookName(String bookName);

    List<BookInformation> getListByAuthor(String author);

    List<BookInformation> getListByPublisher(String publisher);
}
