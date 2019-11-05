package com.AllenXue.JavaBase.Homeork3;

import java.util.Scanner;

public class TestDemo {
	
	public static void main(String[] args) {
		Person person = new Person();
		Scanner input = new Scanner(System.in);
		System.out.println("请输入身份证号：");
		person.setID(input.next());
		if (!person.isID(person)) {
			System.exit(0);
		}
		System.out.println("请输入姓名：");
		person.setName(input.next()); 
		if (!person.isName(person)) {
			System.exit(0);
		}
		System.out.println("请输入性别：（男/女）");
		person.setSex(input.next());
		if (!person.isSex(person)) {
			System.exit(0);
		}
		System.out.println("请输入身高：（例：1.82）（单位：m）");
		person.setStature(input.nextFloat());
		if (!person.isStature(person)) {
			System.exit(0);
		}
		System.out.println("请输入体重：（例：81.1）（单位：kg）");
		person.setWeight(input.nextFloat());
		if (!person.isWeight(person)) {
			System.exit(0);
		}
		System.out.println("身份证号\t\t\t姓名\t性别\t身高\t体重\t" );
		System.out.print(person.getID() + '\t' + person.getName() + '\t' 
				+ person.getSex() + '\t');
		System.out.printf("%.2fm\t%.2fkg",person.getStature(),person.getWeight());
	}

}
