package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		

		ArrayList<Double> ar = new ArrayList<>();
		double max = 0;
		double min = 9999;
		int index1=0,index2=0;

		System.out.println("�ɻ����� ���� �Է����ּ��� >>");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		for (int i = 0; i < N; i++) {
			double ran = Math.random() * 10;
			ar.add(ran);
			System.out.printf("%d ��° �ɻ����� ���� :  %.1f\n", i + 1, ar.get(i));
			if (ar.get(i) > max) {
				max = ar.get(i);
				index1=i;
			} else if (ar.get(i) < min) {
				min = ar.get(i);
				index2=i;
			}
		}
		System.out.println("------���� ���--------");
		
		for(int j=0; j<N;j++)
		{
			if(j==index1 || j ==index2) {
				continue;
			}
			System.out.printf("�ְ��� �������� ������ ���� : %.1f \n",ar.get(j));
		}
		System.out.println("");
		
		

		System.out.println("");

	}

}
