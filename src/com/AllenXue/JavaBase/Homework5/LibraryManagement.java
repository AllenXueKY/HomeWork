package com.AllenXue.JavaBase.Homework5;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		System.out.println("1������\t2����ѯ�鼮�����Ϣ");
		System.out.print("��ѡ��");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		switch (i) {
		case 1:
			WirteBook wirteBook = new WirteBook();
			wirteBook.WiterDemo();
			break;
		case 2:
			BookSearch bookSearch = new BookSearch();
			bookSearch.ReaderDemo();
			System.out.println("1�����ݳ��������Ʋ����鼮�������ܼ۸�\n2������ISBN�Ż�ȡͼ����Ϣ\n3��ͳ��ҳ��ֵ������ĳ��ֵ���������");
			System.out.print("��ѡ��");
			int j = input.nextInt();
			switch (j) {
				case 1:
					System.out.print("������Ҫ���ҵĳ��������ƣ�");
					String publishingCompany = input.next();
					bookSearch.SearchByPublishingCompany(publishingCompany);
					break;
				case 2:
					System.out.print("������Ҫ���ҵ�ISBN�ţ�");
					String isbnNum = input.next();
					bookSearch.SearchByIsbnNum(isbnNum);
					break;
				case 3:
					System.out.print("������Ҫͳ�Ƶ�ҳ�룺");
					int pageNum = input.nextInt();
					bookSearch.CountByNum(pageNum);
					break;
				default:
					System.err.println("�������󣡣���");
					System.exit(0);
			}
			break;
		default:
			System.err.println("�������󣡣���");
			System.exit(0);
		}

	}

}
