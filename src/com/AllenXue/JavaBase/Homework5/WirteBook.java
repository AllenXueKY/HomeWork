package com.AllenXue.JavaBase.Homework5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WirteBook {
	private static final String FilePath = "src/com/AllenXue/JavaBase/Homework5/book.txt";
	public void WiterDemo(){
		FileWriter fileWriter = null;
		BufferedWriter bufferedWriter = null;
		String bookInfor = "";
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要存的书的总数量：");
		int num = input.nextInt();	
		try {
			fileWriter = new FileWriter(FilePath);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			for (int i = 0; i < num; i++) {
				System.out.println("请输入" + (i+1) + "的信息");
				Book book = new Book();
	            System.out.println("请输入图书ISBN号:");
	            book.setIsbnNum(input.next());
	            System.out.println("请输入图书名：");
	            book.setBookName(input.next());
	            System.out.println("请输入作者名：");
	            book.setAuthor(input.next());
	            System.out.println("请输入出版社名：");
	            book.setPublishingCompany(input.next());
	            System.out.println("请输入图书价格：");
	            book.setPrice(input.nextDouble());
	            System.out.println("请输入页码数：");
	            book.setPageNum(input.nextInt());
	            bookInfor += book.getIsbnNum() + "\t" + book.getBookName() + "\t" + book.getAuthor() + "\t"
	            		+ book.getPublishingCompany() + "\t" + book.getPrice() + "\t" + book.getPageNum() + "\n";	
				System.out.println("图书" + (i+1) + "写入成功！" + "\n");
			}
			bufferedWriter.write(bookInfor);	//将字符串写入到缓冲中	
		}catch (IOException e) {
			if (e.getSuppressed() != null) {
				Throwable[] throwables = e.getSuppressed();
				for(Throwable t : throwables){
					System.err.println("图书写入失败！");
					System.err.println(t.getMessage() + "cased by " + t.getClass().getSimpleName());
				}
			}
		}finally {
			try {
				bufferedWriter.close();
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

