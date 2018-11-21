package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Programming1 {
	public static void main(String[] args) {
		

		ArrayList<Double> ar = new ArrayList<>();
		double max = 0;
		double min = 9999;
		int index1=0,index2=0;

		System.out.println("심사위원 수를 입력해주세요 >>");
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();

		for (int i = 0; i < N; i++) {
			double ran = Math.random() * 10;
			ar.add(ran);
			System.out.printf("%d 번째 심사위원 점수 :  %.1f\n", i + 1, ar.get(i));
			if (ar.get(i) > max) {
				max = ar.get(i);
				index1=i;
			} else if (ar.get(i) < min) {
				min = ar.get(i);
				index2=i;
			}
		}
		System.out.println("------집계 결과--------");
		
		for(int j=0; j<N;j++)
		{
			if(j==index1 || j ==index2) {
				continue;
			}
			System.out.printf("최고점 최하점을 제외한 점수 : %.1f \n",ar.get(j));
		}
		System.out.println("");
		
		

		System.out.println("");

	}

}
