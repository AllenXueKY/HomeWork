package com.AllenXue.JavaBase.Homework5;

import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args) {
		System.out.println("1、存书\t2、查询书籍相关信息");
		System.out.print("请选择：");
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
			System.out.println("1、根据出版社名称查找书籍数量和总价格\n2、根据ISBN号获取图书信息\n3、统计页码值不少于某个值的书的数量");
			System.out.print("请选择：");
			int j = input.nextInt();
			switch (j) {
				case 1:
					System.out.print("请输入要查找的出版社名称：");
					String publishingCompany = input.next();
					bookSearch.SearchByPublishingCompany(publishingCompany);
					break;
				case 2:
					System.out.print("请输入要查找的ISBN号：");
					String isbnNum = input.next();
					bookSearch.SearchByIsbnNum(isbnNum);
					break;
				case 3:
					System.out.print("请输入要统计的页码：");
					int pageNum = input.nextInt();
					bookSearch.CountByNum(pageNum);
					break;
				default:
					System.err.println("输入有误！！！");
					System.exit(0);
			}
			break;
		default:
			System.err.println("输入有误！！！");
			System.exit(0);
		}

	}

}
