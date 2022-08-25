package me.mocadev.refactoring.fastcampus.typecodewithsubclass.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class SilverCustomer extends Customer {

	public SilverCustomer(String customerName) {
		super(customerName);
	}

	@Override
	public String getCustomerGrade() {
		return "silver";
	}

	@Override
	public int calculatorPrice(int price) {
		return price - (int) (price * 0.05);
	}

	@Override
	public int calculatorBonusPoint(int price) {
		return bonusPoint += (price * 0.05);
	}

}
