package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		
		Map<String, String> st = new HashMap<String,String>();
		
		st.put("Map", "지도");
		st.put("school","학교");
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("영어 단어를 입력하세요 >> ");
			String key = input.next();
			if(key.equals("quit"))
				break;
			else if(st.get(key) == null) {
				System.out.println("등록되지 않은 단어입니다.");
				break;
			}
			System.out.println("단어의 의미는 : "+ st.get(key));
		}while(true);
	}

}
