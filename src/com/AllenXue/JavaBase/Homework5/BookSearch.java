package com.AllenXue.JavaBase.Homework5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class BookSearch {
	private static final String FilePath = "src/com/AllenXue/JavaBase/Homework5/book.txt";
	private FileReader fileReader;
	private BufferedReader bufferedReader;
	private List<Book> books = new ArrayList<Book>();
	public void ReaderDemo(){
		System.out.println("开始读取图书！");
        try {
        	fileReader = new FileReader(FilePath);
        	bufferedReader = new BufferedReader(fileReader);
            String str;
            while(((str=bufferedReader.readLine())!=null)){
               String[] booksInfor=str.split("\t");
               String isbnNum = booksInfor[0];
               String bookName = booksInfor[1];
           	   String author = booksInfor[2];
           	   String publishingCompany = booksInfor[3];
           	   double price = Double.parseDouble(booksInfor[4]);
           	   int pageNum = Integer.parseInt(booksInfor[5]);
               Book book=new Book(isbnNum,bookName,author,publishingCompany,price,pageNum);
               books.add(book);
            }
        	System.out.println("图书读取成功！" + "\n");
        } catch (IOException e) {
        	if (e.getSuppressed() != null) {
				Throwable[] throwables = e.getSuppressed();
				for(Throwable t : throwables){
					System.err.println("图书读取失败！");
					System.err.println(t.getMessage() + "cased by " + t.getClass().getSimpleName());
				}
			}
        }finally {
        	try {
        		if(bufferedReader!=null){
				bufferedReader.close();
				fileReader.close();
			} }catch (IOException e) {
				e.printStackTrace();
			}
		
       }
    }
	/**
	 * 根据出版社名称查找书籍数量和总价格
	 * @param publishingCompany
	 */
	public void SearchByPublishingCompany(String publishingCompany){
        int num=0;
        double sumPrice = 0;
        for (Book book:books) {
            if(book.getPublishingCompany().compareTo(publishingCompany) == 0){
                num ++;
                sumPrice += book.getPrice();
            }
        }
        System.out.println(publishingCompany);
        System.out.println("总数量："+ num + "\t" + "总价格：" +sumPrice);
    }
	/**
	 * 根据ISBN号获取图书信息
	 * @param isbnNum
	 */
    public void SearchByIsbnNum(String isbnNum){
        for (Book book:books) {
            if(isbnNum.compareTo(book.getIsbnNum()) == 0){
                System.out.println("书名：" + book.getBookName() + "\t" + "作者："+book.getAuthor() + "\t" + "出版社："+book.getPublishingCompany());
                return;
            }	
        }System.err.println("对不起，查无此书！！！");
    }
    /**
     * 统计页码值不少于某个值的书的数量
     * @param pageNum
     * @return
     */
    public void CountByNum(int pageNum){
        int num=0;
        for (Book book:books) {
            if(book.getPageNum() >= pageNum){
                num++;
            }
        }
        System.out.println("不少于" + pageNum + "的数量：" + num);
    }

}


