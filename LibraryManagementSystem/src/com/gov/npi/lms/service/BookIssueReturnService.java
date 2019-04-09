/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gov.npi.lms.service;

import com.gov.npi.lms.connection.DbConnection;
import com.gov.npi.lms.dao.BookIssueReturnDAO;
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
public class BookIssueReturnService implements BookIssueReturnDAO {

    Connection conn = DbConnection.getConnection();

    @Override
    public void issueBook(BookIssueReturn bkisrtib) {
        try {
            if (bkisrtib.getBookId() != null && bkisrtib.getStudentId() != null) {

                PreparedStatement stmt = conn.prepareStatement("INSERT INTO lmsdb_book_issue_return(book_id, book_name, student_id, student_name, issue_date, return_date, status, expire_day, expire_month, expire_year)" + "values(?,?,?,?,?,?,?,?,?,?)");
                stmt.setString(1, bkisrtib.getBookId());
                stmt.setString(2, bkisrtib.getBookName());
                stmt.setString(3, bkisrtib.getStudentId());
                stmt.setString(4, bkisrtib.getStudentName());
                stmt.setString(5, bkisrtib.getIssueDate());
                stmt.setString(6, bkisrtib.getReturnDate());
                stmt.setString(7, bkisrtib.getStatus());
                stmt.setString(8, bkisrtib.getExpireDay());
                stmt.setString(9, bkisrtib.getExpireMonth());
                stmt.setString(10, bkisrtib.getExpireYear());

                int i = stmt.executeUpdate();
                System.out.println(i + " record inserted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void returnBook(BookIssueReturn bkisrtrb) {
        try {
            if (bkisrtrb.getId() != 0) {
                PreparedStatement stmt = conn.prepareStatement("update lmsdb_book_issue_return SET return_date=?, status=? where id=?");

                stmt.setString(1, bkisrtrb.getReturnDate());
                stmt.setString(2, bkisrtrb.getStatus());
                stmt.setInt(3, bkisrtrb.getId());
                int i = stmt.executeUpdate();

                System.out.println(i + " record Updated");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public List<BookIssueReturn> getList() {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getListForNotRetBook() {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE status='no'");
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getIssuedBookById(int ID) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE id=?");
            stmt.setInt(1, ID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getIssuedBookByBookId(String bookID) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE book_id=?");
            stmt.setString(1, bookID);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getIssuedStudentByStudentId(String studentId) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE student_id=?");
            stmt.setString(1, studentId);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getListIssueReturnByStuIdReturned(String studentId) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE status='Yes' AND student_id=?");
            stmt.setString(1, studentId);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getListIssueReturnByStuIdNotReturned(String studentId) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE status='No' AND student_id=?");
            stmt.setString(1, studentId);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getListIssueReturnByIssueId(String issueID) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE id=?");
            stmt.setString(1, issueID);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getListIssueReturnByBookIdReturned(String bookID) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE status='Yes' AND book_id=?");
            stmt.setString(1, bookID);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public List<BookIssueReturn> getListIssueReturnByBookIdNotReturned(String bookID) {
        List<BookIssueReturn> list = new ArrayList<>();
        try {
            BookIssueReturn bir;
            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM lmsdb_book_issue_return WHERE status='No' AND book_id=?");
            stmt.setString(1, bookID);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                bir = new BookIssueReturn();
                bir.setId(rs.getInt(1));
                bir.setBookId(rs.getString(2));
                bir.setBookName(rs.getString(3));
                bir.setStudentId(rs.getString(4));
                bir.setStudentName(rs.getString(5));
                bir.setIssueDate(rs.getString(6));
                bir.setReturnDate(rs.getString(7));
                bir.setStatus(rs.getString(8));
                bir.setExpireDay(rs.getString(9));
                bir.setExpireMonth(rs.getString(10));
                bir.setExpireYear(rs.getString(11));
                list.add(bir);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BookIssueReturn.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    @Override
    public void deleteBook(String bkitd) {
        //delete data from the database
        try {
            if (bkitd != null) {
                PreparedStatement stmt = conn.prepareStatement("delete from lmsdb_book_issue_return where book_id=?");
                stmt.setString(1, bkitd);

                int i = stmt.executeUpdate();
                System.out.println(i + " record Deleted");
            }
            // con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
