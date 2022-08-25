package me.mocadev.refactoring.fastcampus.factorymethod.after2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class BronzeCustomer extends Customer {

	public static BronzeCustomer create(String customerName) {
		return new BronzeCustomer(customerName);
	}

	private BronzeCustomer(String customerName) {
		super(customerName);
	}

	@Override
	public String getCustomerGrade() {
		return "bronze";
	}

	@Override
	public int calculatorPrice(int price) {
		return price;
	}

	@Override
	public int calculatorBonusPoint(int price) {
		return bonusPoint += (price * 0.01);
	}

}
