package com.AllenXue.JavaBase.Homeork4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdNumber{
	/**
	 * 根据所给的身份证号，输出信息
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
	 * 判断是否为正确的身份证号
	 * @param idNumber
	 * @return
	 */
	public static boolean isID(String idNumber) {
		int count = idNumber.length();
		if (count != 18 ) {
			PrintInformations("身份证号");
			return false;
		}else if(!(isIDDate(idNumber))){		
			return false;
		}
		for (int i = 0; i < count - 1; i++) {
			if(!(idNumber.charAt(i) >= '0' && idNumber.charAt(i) <= '9')){
				PrintInformations("身份证号");
				return false;
			}	
		}

		if (!(idNumber.charAt(count-1) >= '0' && idNumber.charAt(count-1) <= '9' 
				|| idNumber.charAt(count-1) == 'x' || idNumber.charAt(count-1) == 'X')){
			PrintInformations("身份证号");
			return false;
		}
		
		return true;
	}
	
	/**
	 * 获取出生年月并判断该出生年月是否有误
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
		int d = yyyymmdd % 10;          //日的个位
		int d1 = (yyyymmdd % 100 - d)/10;	//日的十位
		String yyyyMMdd = String.valueOf(yyyy) + '-' + String.valueOf(MM) + '-' + String.valueOf(d1) + String.valueOf(d);
		if (!isValidDate(yyyyMMdd)) {
			PrintInformations("身份证号");
			return false;
		}
		return true;
	}
	
	/**
	 * 身份证的出生日期段判断
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
     * 获取并打印出生年月
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
		int d = yyyymmdd % 10;          //日的个位
		int d1 = (yyyymmdd % 100 - d)/10;	//日的十位
		if (d1 == 0 ) {
			System.out.print("此人是" + yyyy + "年" + MM + "月" + d + "日出生,");
		}else {
			System.out.print("此人是" + yyyy + "年" + MM + "月" + d1 + d + "日出生,");
		}
		
	}
    
    /**
     * 性别判断并输出性别
     * @return
     */
    public static void PrintSex(String idNumber){
        String sex=idNumber.substring(14,17);
        int s=Integer.parseInt(sex);
        if(s%2==0){
            System.out.println("是女性");
        }else{
            System.out.println("是男性");
        }
    }

	/**
	 * 打印错误信息
	 * @param Type
	 */
	public static void PrintInformations(String Type){
		System.out.println("对不起，您输入的" + Type + "有误，请验证后重新输入！！！");
	}
	
	
	public static void main(String[] args) {
		String idNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入要查询的身份证号：");
		idNumber = input.next();
		Printer(idNumber);
	}

}
