package Homework;

import java.util.ArrayList;
import java.util.Scanner;

public class Programming5 {

	public static void main(String[] args) {
		String name;
		Student c1 = new Student();
		String address;
		int phone_num;

		ArrayList<Student> ar = new ArrayList<>();
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1.학생정보 추가  2. 학생정보 조회 3.학생정보 삭제  0.종료");
			int choice = input.nextInt();
			if (choice == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			switch (choice) {
			case 1:
				System.out.print("학생 이름 입력 >> ");
				name = input.next();
				System.out.print("학생 전화번호 입력 >>");
				phone_num = input.nextInt();
				System.out.print("학생 주소 입력 >>");
				address = input.next();

				c1.setAddress(address);
				c1.setName(name);
				c1.setPhone_num(phone_num);
				ar.add(c1);
				System.out.println("등록되었습니다.");

				break;
			case 2:

				System.out.println("학생들의 정보입니다.");
//				for(int i=0; i<ar.size();i++)
//				{
//					System.out.println(ar.get(i));
//				}
//				break;

				for (Student c2 : ar) {
					c2.printInfo();
					System.out.println("---------------------");
				}

				break;
			case 3:
				System.out.println("삭제하고자 하는 학생을 입력해주세요: ");
				name = input.next();

				for (Student c2 : ar) {
					System.out.println(c2.getName());
					if (c2.getName().equals(name)) {
						ar.remove(c2);
						System.out.println("삭제되었습니다.");
					}
				}

//				for(int i=0; i<ar.size();i++)
//				{
//					if(ar.get(i).getName().equals(name))
//					{
//						ar.remove(i);
//						System.out.println("삭제되었습니다.");
//					}
//				}
				break;

			}

		} while (true);
	}
}
