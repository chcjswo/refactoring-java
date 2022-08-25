package me.mocadev.refactoring.fastcampus.factorymethod.after2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public abstract class Customer {

	protected final String customerName;
	protected int bonusPoint;

	protected Customer(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public abstract String getCustomerGrade();
	public abstract int calculatorPrice(int price);
	public abstract int calculatorBonusPoint(int price);

	@Override
	public String toString() {
		return customerName + "님의 등급은 " +
			getCustomerGrade() + "입니다.";
	}
}
