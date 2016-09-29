package c2_java;

//import java.awt.List;
import java.util.ArrayList;
import java.util.*;

public class Main {
	private int age;
	
	public static void print(int index, Object obj){
		System.out.println(index+","+obj);
	}

	public static void demoControFlow(){
		String str = "Hello";
		for(char r : str.toCharArray()){
			print(2, r);
		}
	}
	
	public static void demoString(){
		String str = "Hello FD!";
		print(1, str.indexOf('e'));
		print(2, str.charAt(6));
		print(3, str.codePointAt(1));
		print(4, str.compareTo("Hellp"));
	}
	
	public static void demoList(){
		List<String> strList = new ArrayList<String>();
		for (int i = 0;i < 4; ++i){
			strList.add(String.valueOf(i));
		}
		print(1, strList);
		List<String> strListB = new ArrayList<String>();
		for(int i=0;i<4;++i){
			strListB.add(String.valueOf(i*i));	
		}
	//	strList.addAll()
		Collections.reverse(strList);
		print(2, strList);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print(1,5+3);
		//demoControFlow();
		//demoString();
		demoList();
	}

}
