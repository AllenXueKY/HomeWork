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
		System.out.print("������Ҫ��������������");
		int num = input.nextInt();	
		try {
			fileWriter = new FileWriter(FilePath);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			for (int i = 0; i < num; i++) {
				System.out.println("������" + (i+1) + "����Ϣ");
				Book book = new Book();
	            System.out.println("������ͼ��ISBN��:");
	            book.setIsbnNum(input.next());
	            System.out.println("������ͼ������");
	            book.setBookName(input.next());
	            System.out.println("��������������");
	            book.setAuthor(input.next());
	            System.out.println("���������������");
	            book.setPublishingCompany(input.next());
	            System.out.println("������ͼ��۸�");
	            book.setPrice(input.nextDouble());
	            System.out.println("������ҳ������");
	            book.setPageNum(input.nextInt());
	            bookInfor += book.getIsbnNum() + "\t" + book.getBookName() + "\t" + book.getAuthor() + "\t"
	            		+ book.getPublishingCompany() + "\t" + book.getPrice() + "\t" + book.getPageNum() + "\n";	
				System.out.println("ͼ��" + (i+1) + "д��ɹ���" + "\n");
			}
			bufferedWriter.write(bookInfor);	//���ַ���д�뵽������	
		}catch (IOException e) {
			if (e.getSuppressed() != null) {
				Throwable[] throwables = e.getSuppressed();
				for(Throwable t : throwables){
					System.err.println("ͼ��д��ʧ�ܣ�");
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

