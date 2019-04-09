package com.gov.npi.lms.dao;

import com.gov.npi.lms.domain.BookIssueReturn;
import java.util.List;

/**
 *
 * @author MSAS Nayeem
 */
public interface BookIssueReturnDAO {

    public void issueBook(BookIssueReturn bkisrtib);

    public void returnBook(BookIssueReturn bkisrtrb);
    
    public void deleteBook(String bkitd);

    List<BookIssueReturn> getList();

    List<BookIssueReturn> getListForNotRetBook();

    List<BookIssueReturn> getIssuedBookById(int ID);

    List<BookIssueReturn> getIssuedBookByBookId(String bookID);

    List<BookIssueReturn> getIssuedStudentByStudentId(String studentId);

    List<BookIssueReturn> getListIssueReturnByStuIdReturned(String studentId);

    List<BookIssueReturn> getListIssueReturnByStuIdNotReturned(String studentId);

    List<BookIssueReturn> getListIssueReturnByIssueId(String issueID);

    List<BookIssueReturn> getListIssueReturnByBookIdReturned(String bookID);

    List<BookIssueReturn> getListIssueReturnByBookIdNotReturned(String bookID);

}
