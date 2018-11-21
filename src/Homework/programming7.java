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
		System.out.println("로또 번호 생성 프로그램입니다.");

		System.out.println("번호를 생성합니다.");

		for (int i = 0; i < 6; i++) {
			int ran = (int) (Math.random() * 45) + 1;
			if (se.contains(ran)) {
				i--;
			}
			se.add(ran);
		
		}
		List<Integer> ls = new ArrayList<Integer>(se);
		Collections.sort(ls);
		
		System.out.print("생성된 로또번호 : " + ls);

	}

}
