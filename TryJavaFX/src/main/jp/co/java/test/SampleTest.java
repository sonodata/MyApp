package main.jp.co.java.test;

import java.util.ResourceBundle;

public class SampleTest {

	public static void main(String[] args){
		
		trySomeMethod();
		
	}
	
	
	private static void trySomeMethod(){
		
		String str = "";
		
		ResourceBundle resource = ResourceBundle.getBundle("setting");
		str = resource.getString("key");
		
		
		System.out.println(str);
		
		return;
	}
	
	
}
