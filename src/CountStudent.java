import java.util.Scanner;
public class CountStudent {
/**
 * 根据所给的学生数组以及专业名称，分别统计该专业男生和女生的个数
 * 学生数组：姓名、性别、专业
 * String names[]  String sex[]  String majors[]
 * @param args
 */
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the total number of students:");
		int counts = input.nextInt();
		String[] names = new String[counts];//姓名
		String[] sex = new String[counts];  //性别
		String[] majors = new String[counts];//专业名称
		System.out.println("***Note:This program must be input in English.(eg:ZhangSan Male ComputerScience)***");
		for (int i = 0; i < counts; i++) {
			System.out.println("Please enter the names, gender and professional names of the students in the order of "+(i+1));
			names[i] = input.next();
			sex[i] = input.next();
			majors[i] = input.next();
		}
		System.out.println("The generated student information is as follows:");
		for (int i = 0; i < counts; i++) {
			System.out.println(names[i] + "\t" + sex[i] + "\t" + majors[i]);
		}
		System.out.println("Please enter the professional name to query:");
		String findMajor = input.next();//要查找的专业名称
		int[] numbers = new int[counts];//该数组用于记录该专业学生所在的数组序号
		int j = 0;                      //该专业的人数
		for (int i = 0; i < counts; i++) {
			if (majors[i].compareTo(findMajor)==0){				
				numbers[j] = i;
				j++;
			}
		}
		int MaleConut=0;			//该专业男生人数
		for (int i = 0; i < j; i++) {
			if(sex[i].compareTo("Male") == 0) {
				MaleConut++;		
			}
		}
		System.out.println("The number of Male students in this major is:"+ MaleConut);
		System.out.println("The number of Female students in this major is:"+ (j-MaleConut));
	}
}
