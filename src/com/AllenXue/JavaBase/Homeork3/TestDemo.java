package com.AllenXue.JavaBase.Homeork3;

import java.util.Scanner;

public class TestDemo {
	
	public static void main(String[] args) {
		Person person = new Person();
		Scanner input = new Scanner(System.in);
		System.out.println("����������֤�ţ�");
		person.setID(input.next());
		if (!person.isID(person)) {
			System.exit(0);
		}
		System.out.println("������������");
		person.setName(input.next()); 
		if (!person.isName(person)) {
			System.exit(0);
		}
		System.out.println("�������Ա𣺣���/Ů��");
		person.setSex(input.next());
		if (!person.isSex(person)) {
			System.exit(0);
		}
		System.out.println("���������ߣ�������1.82������λ��m��");
		person.setStature(input.nextFloat());
		if (!person.isStature(person)) {
			System.exit(0);
		}
		System.out.println("���������أ�������81.1������λ��kg��");
		person.setWeight(input.nextFloat());
		if (!person.isWeight(person)) {
			System.exit(0);
		}
		System.out.println("����֤��\t\t\t����\t�Ա�\t����\t����\t" );
		System.out.print(person.getID() + '\t' + person.getName() + '\t' 
				+ person.getSex() + '\t');
		System.out.printf("%.2fm\t%.2fkg",person.getStature(),person.getWeight());
	}

}