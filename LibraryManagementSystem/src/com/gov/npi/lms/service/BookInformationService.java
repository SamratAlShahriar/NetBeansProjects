package com.gov.npi.lms.service;

import com.gov.npi.lms.connection.DbConnection;
import com.gov.npi.lms.dao.BookInformationDAO;
import com.gov.npi.lms.domain.BookInformation;
import com.gov.npi.lms.domain.BookIssueReturn;
import com.gov.npi.lms.domain.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nayeem
 */
public class BookInformationService implements BookInformationDAO {

    Connection conn = DbConnection.getConnection();

    @Override
    public void add(BookInformation bkinfa) {
        //insert data in the database
        try {
            if (bkinfa.getBookId() != null) {
                PreparedStatement stmt = conn.prepareStatement("INSERT INTO lmsdb_book_information(book_id, book_name, author, publisher, edition, price, quantity, category, rack_no, isbn_no, purchase_day, purchase_month, purchase_year)" + "values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
                stmt.setString(1, bkinfa.getBookId());
                stmt.setString(2, bkinfa.getBookName());
                stmt.setString(3, bkinfa.getAuthor());
                stmt.setString(4, bkinfa.getPublisher());
                stmt.setString(5, bkinfa.getEdition());
                stmt.setString(6, bkinfa.getPrice());
                stmt.setString(7, bkinfa.getQuantity());
                stmt.setString(8, bkinfa.getCategory());
                stmt.setString(9, bkinfa.getRackNo());
                stmt.setString(10, bkinfa.getIsbnNo());
                stmt.setString(11, bkinfa.getPurchaseDay());
                stmt.setString(12, bkinfa.getPurchaseMonth());
                stmt.setString(13, bkinfa.getPurchaseYear());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(BookInformation bkinfu, String bookID) {
        //update data in the database
        try {
            if (bkinfu.getBookId() != null) {
                PreparedStatement stmt = conn.prepareStatement("update lmsdb_book_information SET book_id=?, book_name=?, author=?, publisher=?, edition=?, price=?, quantity=?, category=?, rack_no=?, isbn_no=?, purchase_day=?, purchase_month=?, purchase_year=? where book_id=?");

                stmt.setString(1, bkinfu.getBookId());
                stmt.setString(2, bkinfu.getBookName());
                stmt.setString(3, bkinfu.getAuthor());
                stmt.setString(4, bkinfu.getPublisher());
                stmt.setString(5, bkinfu.getEdition());
                stmt.setString(6, bkinfu.getPrice());
                stmt.setString(7, bkinfu.getQuantity());
                stmt.setString(8, bkinfu.getCategory());
                stmt.setString(9, bkinfu.getRackNo());
                stmt.setString(10, bkinfu.getIsbnNo());
                stmt.setString(11, bkinfu.getPurchaseDay());
                stmt.setString(12, bkinfu.getPurchaseMonth());
                stmt.setString(13, bkinfu.getPurchaseYear());
                stmt.setString(14, bookID);
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String bkinfd) {
        //delete data from the database
        try {
            if (bkinfd != null) {
                PreparedStatement stmt = conn.prepareStatement("delete from lmsdb_book_information where book_id=?");

                stmt.setString(1, bkinfd);

                int i = stmt.executeUpdate();
                System.out.println(i + " record Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BookInformation> getList() {
        List<BookInformation> list = new ArrayList<>();
        try {
            BookInformation bi;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_information");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bi = new BookInformation();
                bi.setId(rs.getInt(1));
                bi.setBookId(rs.getString(2));
                bi.setBookName(rs.getString(3));
                bi.setAuthor(rs.getString(4));
                bi.setPublisher(rs.getString(5));
                bi.setEdition(rs.getString(6));
                bi.setPrice(rs.getString(7));
                bi.setQuantity(rs.getString(8));
                bi.setCategory(rs.getString(9));
                bi.setRackNo(rs.getString(10));
                bi.setIsbnNo(rs.getString(11));
                bi.setPurchaseDay(rs.getString(12));
                bi.setPurchaseMonth(rs.getString(13));
                bi.setPurchaseYear(rs.getString(14));
                list.add(bi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public BookInformation getBookInformationByBookID(String bookId) {
        BookInformation bookInfo = new BookInformation();
        try {
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_information where book_id=?");
            stmt.setString(1, bookId);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bookInfo.setId(rs.getInt(1));
                bookInfo.setBookId(rs.getString(2));
                bookInfo.setBookName(rs.getString(3));
                bookInfo.setAuthor(rs.getString(4));
                bookInfo.setPublisher(rs.getString(5));
                bookInfo.setEdition(rs.getString(6));
                bookInfo.setPrice(rs.getString(7));
                bookInfo.setQuantity(rs.getString(8));
                bookInfo.setCategory(rs.getString(9));
                bookInfo.setRackNo(rs.getString(10));
                bookInfo.setIsbnNo(rs.getString(11));
                bookInfo.setPurchaseDay(rs.getString(12));
                bookInfo.setPurchaseMonth(rs.getString(13));
                bookInfo.setPurchaseYear(rs.getString(14));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bookInfo;
    }

    @Override
    public List<BookInformation> getListByBookID(String bookID) {
        List<BookInformation> list = new ArrayList<>();
        try {
            BookInformation bi;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_information WHERE book_id=?");
            stmt.setString(1, bookID);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bi = new BookInformation();
                bi.setId(rs.getInt(1));
                bi.setBookId(rs.getString(2));
                bi.setBookName(rs.getString(3));
                bi.setAuthor(rs.getString(4));
                bi.setPublisher(rs.getString(5));
                bi.setEdition(rs.getString(6));
                bi.setPrice(rs.getString(7));
                bi.setQuantity(rs.getString(8));
                bi.setCategory(rs.getString(9));
                bi.setRackNo(rs.getString(10));
                bi.setIsbnNo(rs.getString(11));
                bi.setPurchaseDay(rs.getString(12));
                bi.setPurchaseMonth(rs.getString(13));
                bi.setPurchaseYear(rs.getString(14));
                list.add(bi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookInformation> getListByBookName(String bookName) {
       List<BookInformation> list = new ArrayList<>();
        try {
            BookInformation bi;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_information WHERE book_name=?");
            stmt.setString(1, bookName);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bi = new BookInformation();
                bi.setId(rs.getInt(1));
                bi.setBookId(rs.getString(2));
                bi.setBookName(rs.getString(3));
                bi.setAuthor(rs.getString(4));
                bi.setPublisher(rs.getString(5));
                bi.setEdition(rs.getString(6));
                bi.setPrice(rs.getString(7));
                bi.setQuantity(rs.getString(8));
                bi.setCategory(rs.getString(9));
                bi.setRackNo(rs.getString(10));
                bi.setIsbnNo(rs.getString(11));
                bi.setPurchaseDay(rs.getString(12));
                bi.setPurchaseMonth(rs.getString(13));
                bi.setPurchaseYear(rs.getString(14));
                list.add(bi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookInformation> getListByAuthor(String author) {
        List<BookInformation> list = new ArrayList<>();
        try {
            BookInformation bi;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_information WHERE author=?");
            stmt.setString(1, author);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bi = new BookInformation();
                bi.setId(rs.getInt(1));
                bi.setBookId(rs.getString(2));
                bi.setBookName(rs.getString(3));
                bi.setAuthor(rs.getString(4));
                bi.setPublisher(rs.getString(5));
                bi.setEdition(rs.getString(6));
                bi.setPrice(rs.getString(7));
                bi.setQuantity(rs.getString(8));
                bi.setCategory(rs.getString(9));
                bi.setRackNo(rs.getString(10));
                bi.setIsbnNo(rs.getString(11));
                bi.setPurchaseDay(rs.getString(12));
                bi.setPurchaseMonth(rs.getString(13));
                bi.setPurchaseYear(rs.getString(14));
                list.add(bi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookInformation> getListByPublisher(String publisher) {
        List<BookInformation> list = new ArrayList<>();
        try {
            BookInformation bi;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_information WHERE publisher=?");
            stmt.setString(1, publisher);
            
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bi = new BookInformation();
                bi.setId(rs.getInt(1));
                bi.setBookId(rs.getString(2));
                bi.setBookName(rs.getString(3));
                bi.setAuthor(rs.getString(4));
                bi.setPublisher(rs.getString(5));
                bi.setEdition(rs.getString(6));
                bi.setPrice(rs.getString(7));
                bi.setQuantity(rs.getString(8));
                bi.setCategory(rs.getString(9));
                bi.setRackNo(rs.getString(10));
                bi.setIsbnNo(rs.getString(11));
                bi.setPurchaseDay(rs.getString(12));
                bi.setPurchaseMonth(rs.getString(13));
                bi.setPurchaseYear(rs.getString(14));
                list.add(bi);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

}
