package me.mocadev.refactoring.fastcampus.factorymethod.after2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class Main {

	public static void main(String[] args) {
		final Customer customer1 = BronzeCustomer.create("tony");
		final Customer customer2 = SilverCustomer.create("chcjswo");
		final Customer customer3 = GoldCustomer.create("mc.jeon");

		int price = 11000;

		System.out.println("customer1 = " + customer1);
		System.out.println("customer1 = " + customer1.getCustomerName());
		System.out.println("customer1 = " + customer1.calculatorPrice(price));
		System.out.println("customer1 = " + customer1.calculatorBonusPoint(price));
		System.out.println("customer2 = " + customer2);
		System.out.println("customer1 = " + customer2.getCustomerName());
		System.out.println("customer1 = " + customer2.calculatorPrice(price));
		System.out.println("customer1 = " + customer2.calculatorBonusPoint(price));
		System.out.println("customer3 = " + customer3);
		System.out.println("customer1 = " + customer3.getCustomerName());
		System.out.println("customer1 = " + customer3.calculatorPrice(price));
		System.out.println("customer1 = " + customer3.calculatorBonusPoint(price));
	}

}
