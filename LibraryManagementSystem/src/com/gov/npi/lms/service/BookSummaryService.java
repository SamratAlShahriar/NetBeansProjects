package com.gov.npi.lms.service;

import com.gov.npi.lms.connection.DbConnection;
import com.gov.npi.lms.dao.BookSummaryDAO;
import com.gov.npi.lms.domain.BookSummary;
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
 * @author MSAS Nayeem
 */
public class BookSummaryService implements BookSummaryDAO {

    Connection conn = DbConnection.getConnection();

    @Override
    public void saveWhenBookPurchase(BookSummary s) {
        try {
            if (s.getBookId() != null) {

                PreparedStatement stmt = conn.prepareStatement("insert into lmsdb_book_summary (book_id, book_name, total_stock, already_lend, available_stock, lost_quantity) values(?,?,?,?,?,?)");

                stmt.setString(1, s.getBookId());
                stmt.setString(2, s.getBookName());
                stmt.setInt(3, s.getTotalStock());
                stmt.setInt(4, s.getAlreadyLend());
                stmt.setInt(5, s.getAvilableStock());
                stmt.setInt(6, s.getLostQuantity());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(BookSummary s, String bookID) {
        try {
            if (s.getBookId() != null) {

                PreparedStatement stmt = conn.prepareStatement("update lmsdb_book_summary SET book_id=?, book_name=?, total_stock=?, available_stock=? where book_id=?");
                stmt.setString(1, s.getBookId());
                stmt.setString(2, s.getBookName());
                stmt.setInt(3, s.getTotalStock());
                stmt.setInt(4, s.getAvilableStock());
                stmt.setString(5, bookID);
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateWhenBookPurchase(BookSummary s) {
        try {
            if (s.getId() != 0) {

                PreparedStatement stmt = conn.prepareStatement("update lmsdb_book_summary SET total_stock=?,avilable_stock=? where id=?");
                stmt.setInt(1, s.getTotalStock());
                stmt.setInt(2, s.getAvilableStock());
                stmt.setInt(3, s.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BookSummary> getList() {
        List<BookSummary> list = new ArrayList<>();
        try {
            BookSummary p;
            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_book_summary");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new BookSummary();
                p.setId(rs.getInt(1));
                p.setBookId(rs.getString(2));
                p.setBookName(rs.getString(3));
                p.setTotalStock(rs.getInt(4));
                p.setAlreadyLend(rs.getInt(5));
                p.setAvilableStock(rs.getInt(6));
                p.setLostQuantity(rs.getInt(7));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public BookSummary getBookSummaryByBookId(String bookId) {
        BookSummary bs = new BookSummary();
        try {
            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_book_summary where book_id=?");
            stmt.setString(1, bookId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {

                bs.setId(rs.getInt(1));
                bs.setBookId(rs.getString(2));
                bs.setBookName(rs.getString(3));
                bs.setTotalStock(rs.getInt(4));
                bs.setAlreadyLend(rs.getInt(5));
                bs.setAvilableStock(rs.getInt(6));
                bs.setLostQuantity(rs.getInt(7));
            }

        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bs;
    }

    @Override
    public BookSummary getBookSummaryById(int id) {
        BookSummary p = new BookSummary();
        try {

            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_book_summary where id=?");
            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p.setId(rs.getInt(1));
                p.setBookId(rs.getString(2));
                p.setBookName(rs.getString(3));
                p.setTotalStock(rs.getInt(4));
                p.setAlreadyLend(rs.getInt(5));
                p.setAvilableStock(rs.getInt(6));
                p.setLostQuantity(rs.getInt(7));

            }

        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return p;
    }

    @Override
    public void delete(String s) {
        //delete data from the database
        try {
            if (s != null) {
                PreparedStatement stmt = conn.prepareStatement("delete from lmsdb_book_summary where book_id=?");

                stmt.setString(1, s);

                int i = stmt.executeUpdate();
                System.out.println(i + " record Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void updateWhenBookIssueOrReturn(BookSummary s, int nowAlreadyLend, int nowAvailableStock) {
        try {
            if (s.getId() != 0) {

                PreparedStatement stmt = conn.prepareStatement("update lmsdb_book_summary SET already_lend=?, available_stock=? where id=?");
                stmt.setInt(1, nowAlreadyLend);
                stmt.setInt(2, nowAvailableStock);
                stmt.setInt(3, s.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BookSummary> getListByBookID(String bookID) {
       List<BookSummary> list = new ArrayList<>();
        try {
            BookSummary p;
            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_book_summary where book_id=?");
            stmt.setString(1, bookID);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new BookSummary();
                p.setId(rs.getInt(1));
                p.setBookId(rs.getString(2));
                p.setBookName(rs.getString(3));
                p.setTotalStock(rs.getInt(4));
                p.setAlreadyLend(rs.getInt(5));
                p.setAvilableStock(rs.getInt(6));
                p.setLostQuantity(rs.getInt(7));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookSummary> getListByBookName(String bookName) {
       List<BookSummary> list = new ArrayList<>();
        try {
            BookSummary p;
            PreparedStatement stmt = conn.prepareStatement("select * from lmsdb_book_summary where book_name=?");
            stmt.setString(1, bookName);
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                p = new BookSummary();
                p.setId(rs.getInt(1));
                p.setBookId(rs.getString(2));
                p.setBookName(rs.getString(3));
                p.setTotalStock(rs.getInt(4));
                p.setAlreadyLend(rs.getInt(5));
                p.setAvilableStock(rs.getInt(6));
                p.setLostQuantity(rs.getInt(7));

                list.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookSummary.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
