package com.gov.npi.lms.domain;

/**
 *
 * @author Samrat Al Shahriar
 */
public class BookSummary {

    private int id;
    private String bookId;
    private String bookName;
    private int totalStock;
    private int avilableStock;
    private int alreadyLend;
    private int lostQuantity;

    public BookSummary() {
    }

    public BookSummary(String bookId, String bookName, int totalStock, int alreadyLend, int avilableStock, int lostQuantity) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
        this.alreadyLend = alreadyLend;
        this.lostQuantity = lostQuantity;
    }

    public BookSummary(String bookId, String bookName, int totalStock, int avilableStock) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
    }

    public BookSummary(int totalStock, int alreadyLend, int avilableStock) {
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
        this.alreadyLend = alreadyLend;
    }

    public BookSummary(int totalStock, int alreadyLend, int avilableStock, int lostQuantity) {
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
        this.alreadyLend = alreadyLend;
        this.lostQuantity = lostQuantity;
    }

    public BookSummary(int totalStock, int avilableStock) {
        this.totalStock = totalStock;
        this.avilableStock = avilableStock;
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

    public int getTotalStock() {
        return totalStock;
    }

    public void setTotalStock(int totalStock) {
        this.totalStock = totalStock;
    }

    public int getAvilableStock() {
        return avilableStock;
    }

    public void setAvilableStock(int avilableStock) {
        this.avilableStock = avilableStock;
    }

    public int getAlreadyLend() {
        return alreadyLend;
    }

    public void setAlreadyLend(int alreadyLend) {
        this.alreadyLend = alreadyLend;
    }

    public int getLostQuantity() {
        return lostQuantity;
    }

    public void setLostQuantity(int lostQuantity) {
        this.lostQuantity = lostQuantity;
    }

}
