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
		System.out.println("*********계좌 개설 완료 ********");
		System.out.println("계좌번호 >> " + this.account);
		System.out.println("이름 >> " + this.pw);
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
		System.out.println("계좌 금액이 " + money + "로 설정되었습니다.");
		amount = money;
	}

	public int getAmount() {
		return amount;
	}

	public void withDraw(int money) {
		if (money > 0) {
			System.out.println("*********출금완료 **********");
			System.out.println(money + "원을 출금합니다.");
			System.out.println("**************************");
			amount -= money;
		} else {
			System.out.println("잘못된 금액 정보입니다.");
		}

	}

	public void deposit(int money) {
		if (money > 0) {
			System.out.println("*********입금완료 **********");
			System.out.println(money + "원을 입금합니다.");
			System.out.println("**************************");
			amount += money;
		} else {
			System.out.println("잘못된 금액 정보입니다.");
		}

	}

	public int transfer(int amount, BankAccount otherAccount) {
		this.amount -= amount;
		otherAccount.deposit(amount);
		return amount;
	}

	public void printBankAccount() {
		System.out.println("**************************");
		System.out.println("계좌번호 >> " + this.account);
		System.out.println("이름 >> " + this.pw);
		System.out.println("현재 잔액 : " + this.amount);
		System.out.println("**************************");

	}

}
