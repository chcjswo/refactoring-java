package me.mocadev.refactoring.fastcampus.typecodewithsubclass.before;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class Customer {

	private int customerType;
	private String customerName;
	private String customerGrade;
	private int bonusPoint;

	public static final int BRONZE_CUSTOMER = 1;
	public static final int SILVER_CUSTOMER = 2;
	public static final int GOLD_CUSTOMER = 3;

	public Customer(int customerType, String customerName) {
		this.customerType = customerType;
		this.customerName = customerName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		switch (customerType) {
			case BRONZE_CUSTOMER:
				return "bronze";
			case SILVER_CUSTOMER:
				return "silver";
			case GOLD_CUSTOMER:
				return "gold";
			default:
				return "no grade";
		}
	}

	public int calculatorPrice(int price) {
		switch (customerType) {
			case BRONZE_CUSTOMER:
			default:
				return price;
			case SILVER_CUSTOMER:
				price = price - (int) (price * 0.05);
				return price;
			case GOLD_CUSTOMER:
				price = price - (int) (price * 0.1);
				return price;
		}
	}

	public int calculatorBonusPoint(int price) {
		switch (customerType) {
			case BRONZE_CUSTOMER:
				return bonusPoint += (price * 0.01);
			case SILVER_CUSTOMER:
				return bonusPoint += (price * 0.05);
			case GOLD_CUSTOMER:
				return bonusPoint += (price * 0.1);
			default:
				return price;
		}
	}

	@Override
	public String toString() {
		return customerName + "님의 등급은 " +
			getCustomerGrade() + "입니다.";
	}
}
