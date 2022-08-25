package me.mocadev.refactoring.fastcampus.typecodewithclass.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-25
 **/
public class Main {

	public static void main(String[] args) {
		final Item book = new Item(
			ItemType.BOOK, "초천재", 100000);
		final Item dvd = new Item(
			ItemType.DVD, "신세계", 200000);
		final Item software = new Item(
			ItemType.SOFTWARE, "윈도우 10", 400000);

		System.out.println("book = " + book);
		System.out.println("dvd = " + dvd);
		System.out.println("software = " + software);
	}
}
