package com.gov.npi.lms.domain;

/**
 *
 * @author Samrat Al Shahriar
 */
public class BookIssueReturn {

    private int id;
    private String bookId;
    private String bookName;
    private String studentId;
    private String studentName;
    private String issueDate;
    private String returnDate;
    private String status;
    private String ExpireDay;
    private String ExpireMonth;
    private String ExpireYear;

    public BookIssueReturn() {
    }

    public BookIssueReturn(String bookId, String bookName, String studentId, String studentName, String issueDate, String returnDate, String status, String ExpireDay, String ExpireMonth, String ExpireYear) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.studentId = studentId;
        this.studentName = studentName;
        this.issueDate = issueDate;
        this.returnDate = returnDate;
        this.status = status;
        this.ExpireDay = ExpireDay;
        this.ExpireMonth = ExpireMonth;
        this.ExpireYear = ExpireYear;
    }

    public BookIssueReturn(String bookId, String bookName, String studentId, String studentName, String issueDate, String status, String ExpireDay, String ExpireMonth, String ExpireYear) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.studentId = studentId;
        this.studentName = studentName;
        this.issueDate = issueDate;
        this.status = status;
        this.ExpireDay = ExpireDay;
        this.ExpireMonth = ExpireMonth;
        this.ExpireYear = ExpireYear;
    }

    public BookIssueReturn(String returnDate, String status) {
        this.returnDate = returnDate;
        this.status = status;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getExpireDay() {
        return ExpireDay;
    }

    public void setExpireDay(String ExpireDay) {
        this.ExpireDay = ExpireDay;
    }

    public String getExpireMonth() {
        return ExpireMonth;
    }

    public void setExpireMonth(String ExpireMonth) {
        this.ExpireMonth = ExpireMonth;
    }

    public String getExpireYear() {
        return ExpireYear;
    }

    public void setExpireYear(String ExpireYear) {
        this.ExpireYear = ExpireYear;
    }

    
}
