package me.mocadev.refactoring.fastcampus.typecodewithsubclass.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class GoldCustomer extends Customer {

	public GoldCustomer(String customerName) {
		super(customerName);
	}

	@Override
	public String getCustomerGrade() {
		return "gold";
	}

	@Override
	public int calculatorPrice(int price) {
		return price - (int) (price * 0.1);
	}

	@Override
	public int calculatorBonusPoint(int price) {
		return bonusPoint += (price * 0.1);
	}

}
