package com.AllenXue.JavaBase.Homework5;

import java.io.Serializable;

public class Book{
	private String isbnNum;		//ISBN
	private String bookName;	//����
	private String author;		//����
	private String publishingCompany;//������
	private double price;		//�۸�
	private int pageNum;		//ҳ��
	
	public Book() {
	}
	
	public Book(String isbnNum, String bookName, String author, String publishingCompany, double price, int pageNum) {
		super();
		this.isbnNum = isbnNum;
		this.bookName = bookName;
		this.author = author;
		this.publishingCompany = publishingCompany;
		this.price = price;
		this.pageNum = pageNum;
	}
	public String getIsbnNum() {
		return isbnNum;
	}
	public void setIsbnNum(String isbnNum) {
		this.isbnNum = isbnNum;
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
	public String getPublishingCompany() {
		return publishingCompany;
	}
	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	
}
