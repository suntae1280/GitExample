package Homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exercise1 {
	public static void main(String[] args) {
		String[] s = { "���", "��", "�ٳ���" };

		ArrayList list = new ArrayList(Arrays.asList(s));
		ArrayList<Double> ls = new ArrayList<>();

		

		for(String a : (List<String>)list) {
			System.out.print(a);
		}
		System.out.println();
		System.out.println(list.indexOf("���"));
		
		Iterator<Double> itr = ls.listIterator();
		
	

	}
}
