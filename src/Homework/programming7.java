package Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class programming7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> se = new HashSet<>();
		System.out.println("�ζ� ��ȣ ���� ���α׷��Դϴ�.");

		System.out.println("��ȣ�� �����մϴ�.");

		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			if (se.contains(ran)) {
				i--;
			}
			se.add(ran);
		
		}
		List<Integer> ls = new ArrayList<Integer>(se);
		Collections.sort(ls);
		
		System.out.print("������ �ζǹ�ȣ : " + ls);

	}

}
