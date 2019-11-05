package com.AllenXue.JavaBase.Homeork4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdNumber{
	/**
	 * �������������֤�ţ������Ϣ
	 * @param idNumber
	 */
	public static void Printer(String idNumber) {
		if (!isID(idNumber)) {
			System.exit(0);
		}
		PrintDate(idNumber);
		PrintSex(idNumber);
	}
	
	/**
	 * �ж��Ƿ�Ϊ��ȷ�����֤��
	 * @param idNumber
	 * @return
	 */
	public static boolean isID(String idNumber) {
		int count = idNumber.length();
		if (count != 18 ) {
			PrintInformations("���֤��");
			return false;
		}else if(!(isIDDate(idNumber))){		
			return false;
		}
		for (int i = 0; i < count - 1; i++) {
			if(!(idNumber.charAt(i) >= '0' && idNumber.charAt(i) <= '9')){
				PrintInformations("���֤��");
				return false;
			}	
		}

		if (!(idNumber.charAt(count-1) >= '0' && idNumber.charAt(count-1) <= '9' 
				|| idNumber.charAt(count-1) == 'x' || idNumber.charAt(count-1) == 'X')){
			PrintInformations("���֤��");
			return false;
		}
		
		return true;
	}
	
	/**
	 * ��ȡ�������²��жϸó��������Ƿ�����
	 * @param idNumber
	 * @return
	 */
	public static boolean isIDDate(String idNumber) {
		int yyyymmdd = 0;
		for (int i = 6; i < idNumber.length() - 4; i++) {
				yyyymmdd = (idNumber.charAt(i) - 48) + yyyymmdd * 10;
		}
		int yyyy = yyyymmdd /10000;
		int MM = (yyyymmdd - yyyy * 10000) / 100;
		int d = yyyymmdd % 10;          //�յĸ�λ
		int d1 = (yyyymmdd % 100 - d)/10;	//�յ�ʮλ
		String yyyyMMdd = String.valueOf(yyyy) + '-' + String.valueOf(MM) + '-' + String.valueOf(d1) + String.valueOf(d);
		if (!isValidDate(yyyyMMdd)) {
			PrintInformations("���֤��");
			return false;
		}
		return true;
	}
	
	/**
	 * ���֤�ĳ������ڶ��ж�
	 * @param str
	 * @return
	 */
    public static boolean isValidDate(String date)  
    {  
        
        String rexp = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";                
        Pattern pat = Pattern.compile(rexp);                  
        Matcher mat = pat.matcher(date);    
        boolean dateType = mat.matches();  
       return dateType;  
    }
    /**
     * ��ȡ����ӡ��������
     * @param idNumber
     * @return
     */
    public static void PrintDate(String idNumber) {
		int yyyymmdd = 0;
		for (int i = 6; i < idNumber.length() - 4; i++) {
				yyyymmdd = (idNumber.charAt(i) - 48) + yyyymmdd * 10;
		}
		int yyyy = yyyymmdd /10000;
		int MM = (yyyymmdd - yyyy * 10000) / 100;
		int d = yyyymmdd % 10;          //�յĸ�λ
		int d1 = (yyyymmdd % 100 - d)/10;	//�յ�ʮλ
		if (d1 == 0 ) {
			System.out.print("������" + yyyy + "��" + MM + "��" + d + "�ճ���,");
		}else {
			System.out.print("������" + yyyy + "��" + MM + "��" + d1 + d + "�ճ���,");
		}
		
	}
    
    /**
     * �Ա��жϲ�����Ա�
     * @return
     */
    public static void PrintSex(String idNumber){
        String sex=idNumber.substring(14,17);
        int s=Integer.parseInt(sex);
        if(s%2==0){
            System.out.println("��Ů��");
        }else{
            System.out.println("������");
        }
    }

	/**
	 * ��ӡ������Ϣ
	 * @param Type
	 */
	public static void PrintInformations(String Type){
		System.out.println("�Բ����������" + Type + "��������֤���������룡����");
	}
	
	
	public static void main(String[] args) {
		String idNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("������Ҫ��ѯ�����֤�ţ�");
		idNumber = input.next();
		Printer(idNumber);
	}

}
