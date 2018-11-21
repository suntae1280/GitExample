package test03;

import java.util.Random;

public class BankAccount {

	int amount;
	String ID;
	int pw;
	int account;

	public BankAccount(String id, int pw) {
		// TODO Auto-generated constructor stub
		this.amount = 0;
		this.ID = id;
		this.pw = pw;
		this.account = new Random().nextInt(9999);
		System.out.println("*********���� ���� �Ϸ� ********");
		System.out.println("���¹�ȣ >> " + this.account);
		System.out.println("�̸� >> " + this.pw);
		System.out.println("**************************");
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public int getPw() {
		return pw;
	}

	public void setPw(int pw) {
		this.pw = pw;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public void setAmount(int money) {
		System.out.println("���� �ݾ��� " + money + "�� �����Ǿ����ϴ�.");
		amount = money;
	}

	public int getAmount() {
		return amount;
	}

	public void withDraw(int money) {
		if (money > 0) {
			System.out.println("*********��ݿϷ� **********");
			System.out.println(money + "���� ����մϴ�.");
			System.out.println("**************************");
			amount -= money;
		} else {
			System.out.println("�߸��� �ݾ� �����Դϴ�.");
		}

	}

	public void deposit(int money) {
		if (money > 0) {
			System.out.println("*********�ԱݿϷ� **********");
			System.out.println(money + "���� �Ա��մϴ�.");
			System.out.println("**************************");
			amount += money;
		} else {
			System.out.println("�߸��� �ݾ� �����Դϴ�.");
		}

	}

	public int transfer(int amount, BankAccount otherAccount) {
		this.amount -= amount;
		otherAccount.deposit(amount);
		return amount;
	}

	public void printBankAccount() {
		System.out.println("**************************");
		System.out.println("���¹�ȣ >> " + this.account);
		System.out.println("�̸� >> " + this.pw);
		System.out.println("���� �ܾ� : " + this.amount);
		System.out.println("**************************");

	}

}
