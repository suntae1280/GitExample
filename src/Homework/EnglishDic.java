package Homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EnglishDic {
	public static void main(String[] args) {
		
		Map<String, String> st = new HashMap<String,String>();
		
		st.put("Map", "����");
		st.put("school","�б�");
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("���� �ܾ �Է��ϼ��� >> ");
			String key = input.next();
			if(key.equals("quit"))
				break;
			else if(st.get(key) == null) {
				System.out.println("��ϵ��� ���� �ܾ��Դϴ�.");
				break;
			}
			System.out.println("�ܾ��� �ǹ̴� : "+ st.get(key));
		}while(true);
	}

}
