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
			System.out.println("�޴��� �������ּ���");
			System.out.println("1.�л����� �߰�  2. �л����� ��ȸ 3.�л����� ����  0.����");
			int choice = input.nextInt();
			if (choice == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			switch (choice) {
			case 1:
				System.out.print("�л� �̸� �Է� >> ");
				name = input.next();
				System.out.print("�л� ��ȭ��ȣ �Է� >>");
				phone_num = input.nextInt();
				System.out.print("�л� �ּ� �Է� >>");
				address = input.next();

				c1.setAddress(address);
				c1.setName(name);
				c1.setPhone_num(phone_num);
				ar.add(c1);
				System.out.println("��ϵǾ����ϴ�.");

				break;
			case 2:

				System.out.println("�л����� �����Դϴ�.");
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
				System.out.println("�����ϰ��� �ϴ� �л��� �Է����ּ���: ");
				name = input.next();

				for (Student c2 : ar) {
					System.out.println(c2.getName());
					if (c2.getName().equals(name)) {
						ar.remove(c2);
						System.out.println("�����Ǿ����ϴ�.");
					}
				}

//				for(int i=0; i<ar.size();i++)
//				{
//					if(ar.get(i).getName().equals(name))
//					{
//						ar.remove(i);
//						System.out.println("�����Ǿ����ϴ�.");
//					}
//				}
				break;

			}

		} while (true);
	}
}
