package com.gov.npi.lms.domain;

/**
 *
 * @author Samrat Al Shahriar
 */
public class BookInformation {

    private int id;
    private String bookId;
    private String bookName;
    private String author;
    private String publisher;
    private String edition;
    private String price;
    private String Quantity;
    private String category;
    private String rackNo;
    private String isbnNo;
    private String purchaseDay;
    private String purchaseMonth;
    private String purchaseYear;

    public BookInformation() {
    }

    public BookInformation(String bookId, String bookName, String author, String publisher, String edition, String price, String Quantity, String category, String rackNo, String isbnNo, String purchaseDay, String purchaseMonth, String purchaseYear) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
        this.edition = edition;
        this.price = price;
        this.Quantity = Quantity;
        this.category = category;
        this.rackNo = rackNo;
        this.isbnNo = isbnNo;
        this.purchaseDay = purchaseDay;
        this.purchaseMonth = purchaseMonth;
        this.purchaseYear = purchaseYear;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getRackNo() {
        return rackNo;
    }

    public void setRackNo(String rackNo) {
        this.rackNo = rackNo;
    }

    public String getIsbnNo() {
        return isbnNo;
    }

    public void setIsbnNo(String isbnNo) {
        this.isbnNo = isbnNo;
    }

    public String getPurchaseDay() {
        return purchaseDay;
    }

    public void setPurchaseDay(String purchaseDay) {
        this.purchaseDay = purchaseDay;
    }

    public String getPurchaseMonth() {
        return purchaseMonth;
    }

    public void setPurchaseMonth(String purchaseMonth) {
        this.purchaseMonth = purchaseMonth;
    }

    public String getPurchaseYear() {
        return purchaseYear;
    }

    public void setPurchaseYear(String purchaseYear) {
        this.purchaseYear = purchaseYear;
    }

}
