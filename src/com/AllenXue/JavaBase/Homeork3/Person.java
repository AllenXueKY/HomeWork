package com.AllenXue.JavaBase.Homeork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;  
import java.util.regex.Pattern;  

public class Person {
	private String ID;      //身份证号
	private String Name;  //姓名
	private String Sex;	  //性别
	private double Stature;  //身高
	private double Weight;   //体重
	
	/**
	 * 判断身份证号
	 * @param person
	 * @return
	 */
	public boolean isID(Person person) {
		int count = person.ID.length();
		if (count != 18 ) {
			PrintInformations("身份证号");
			return false;
		}else if(!(isIDDate(person))){		
			return false;
		}
		for (int i = 0; i < count - 1; i++) {
			if(!(person.ID.charAt(i) >= '0' && person.ID.charAt(i) <= '9')){
				PrintInformations("身份证号");
				return false;
			}	
		}

		if (!(person.ID.charAt(count-1) >= '0' && person.ID.charAt(count-1) <= '9' 
				|| person.ID.charAt(count-1) == 'x' || person.ID.charAt(count-1) == 'X')){
			PrintInformations("身份证号");
			return false;
		}
		
		return true;
	}
	public boolean isIDDate(Person person) {
		int yyyymmdd = 0;
		for (int i = 6; i < person.ID.length() - 4; i++) {
				yyyymmdd = (person.ID.charAt(i) - 48) + yyyymmdd * 10;
		}
		int yyyy = yyyymmdd /10000;
		int MM = (yyyymmdd - yyyy * 10000) / 100;
		int d = yyyymmdd % 10;          //日的个位
		int d1 = (yyyymmdd % 100 - d)/10;	//日的十位
		String yyyyMMdd = String.valueOf(yyyy) + '-' + String.valueOf(MM) + '-' + String.valueOf(d1) + String.valueOf(d);
		if (!person.isValidDate(yyyyMMdd)) {
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
    public boolean isValidDate(String date)  
    {  
        
        String rexp = "^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))";                
        Pattern pat = Pattern.compile(rexp);                  
        Matcher mat = pat.matcher(date);    
        boolean dateType = mat.matches();  
       return dateType;  
    }   
	
	/**
	 * 校验姓名
	 */
	public boolean isName(Person person){
		if (person.Name.length() < 2 ) {
			PrintInformations("姓名");
			return false;
		}
		//判断是否有符号
		char[] unValidChar = {' ', '\'', '"', '?', '<', '>', ','};
		for(char ch : unValidChar){
			if(person.Name.contains(Character.toString(ch))){
				PrintInformations("姓名");
				return false;
			}
		}
		//判断是否有数字
		for (int j = 0; j < person.Name.length(); j++) {
			if(person.Name.charAt(j) >= '0' && person.Name.charAt(j) <= '9' 
					|| person.Name.charAt(j) >= 'a' && person.Name.charAt(j) <= 'z' 
					|| person.Name.charAt(j) >= 'A' && person.Name.charAt(j) <= 'Z' ) {
				PrintInformations("姓名");
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 判断性别
	 */
	public boolean isSex(Person person) {
		if (!(person.Sex.equals("男") || person.Sex.equals("女"))) {
			PrintInformations("性别");
			return false;
		}
		return true;
	}
	
	/**
	 * 判断身高
	 */
	public boolean isStature(Person person) {
		if (!(person.Stature > 0.0 && person.Stature < 3.0)) {
			PrintInformations("身高");
			return false;
		}
		return true;
	}
	
	/**
	 * 判断体重
	 */
	public boolean isWeight(Person person) {
		if (!(person.Weight > 0.0 && person.Weight < 800.0)) {
			PrintInformations("体重");
			return false;
		}
		return true;
	}
	
	/**
	 * 打印函数
	 */
	public  void PrintInformations(String Type){
		System.out.println("对不起，您输入的" + Type + "有误，请验证后重新输入！！！");
	}	
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		this.Sex = sex;
	}

	public double getStature() {
		return Stature;
	}

	public void setStature(double stature) {
		this.Stature = stature;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		this.Weight = weight;
	}


		
		
	
}
