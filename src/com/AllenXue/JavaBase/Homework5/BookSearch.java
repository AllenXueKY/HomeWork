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
		System.out.println("��ʼ��ȡͼ�飡");
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
        	System.out.println("ͼ���ȡ�ɹ���" + "\n");
        } catch (IOException e) {
        	if (e.getSuppressed() != null) {
				Throwable[] throwables = e.getSuppressed();
				for(Throwable t : throwables){
					System.err.println("ͼ���ȡʧ�ܣ�");
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
	 * ���ݳ��������Ʋ����鼮�������ܼ۸�
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
        System.out.println("��������"+ num + "\t" + "�ܼ۸�" +sumPrice);
    }
	/**
	 * ����ISBN�Ż�ȡͼ����Ϣ
	 * @param isbnNum
	 */
    public void SearchByIsbnNum(String isbnNum){
        for (Book book:books) {
            if(isbnNum.compareTo(book.getIsbnNum()) == 0){
                System.out.println("������" + book.getBookName() + "\t" + "���ߣ�"+book.getAuthor() + "\t" + "�����磺"+book.getPublishingCompany());
                return;
            }	
        }System.err.println("�Բ��𣬲��޴��飡����");
    }
    /**
     * ͳ��ҳ��ֵ������ĳ��ֵ���������
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
        System.out.println("������" + pageNum + "��������" + num);
    }

}


