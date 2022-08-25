package me.mocadev.refactoring.fastcampus.typecodewithclass.before;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-25
 **/
public class Item {

	public static final int BOOK = 0;
	public static final int DVD = 1;
	public static final int SOFTWARE = 2;

	private int typeCode;
	private String title;
	private int price;

	public Item(int typeCode, String title, int price) {
		this.typeCode = typeCode;
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item{" +
			"typeCode=" + typeCode +
			", title='" + title + '\'' +
			", price=" + price +
			'}';
	}

	public int getTypeCode() {
		return typeCode;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}
}
