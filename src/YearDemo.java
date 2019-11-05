import java.util.Scanner;

public class YearDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("请输入要查询的年份：");
		int year = input.nextInt();
		System.out.print(year+"年所对应的生肖为："+WhatZodiac(year));
	}
	public static String WhatZodiac(int year) {
		String[]  Zodiac = {"鼠","牛","虎","兔","龙","蛇","马","羊","猴","鸡","狗","猪"};
		return Zodiac[(year-1900)%12];
	}

}
