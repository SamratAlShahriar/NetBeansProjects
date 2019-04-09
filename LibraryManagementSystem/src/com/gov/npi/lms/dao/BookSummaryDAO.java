package com.gov.npi.lms.dao;

import com.gov.npi.lms.domain.BookSummary;
import java.util.List;

/**
 *
 * @author Md. Samrat Al Shahriar Nayeem
 */
public interface BookSummaryDAO {

    void saveWhenBookPurchase(BookSummary s);

    void update(BookSummary s, String bookID);

    void updateWhenBookPurchase(BookSummary s);

    void updateWhenBookIssueOrReturn(BookSummary s, int nowAlreadyLend, int nowAvailableStock);

    void delete(String s);

    List<BookSummary> getList();

    public BookSummary getBookSummaryByBookId(String bookCode);

    public BookSummary getBookSummaryById(int id);
    
    List<BookSummary> getListByBookID(String bookID);
    
    List<BookSummary> getListByBookName(String bookName);
}
