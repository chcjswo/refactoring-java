package me.mocadev.refactoring.fastcampus.typecodewithclass.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-25
 **/
public class Item {

	public static final int BOOK = ItemType.BOOK.getItemType();
	public static final int DVD = ItemType.DVD.getItemType();
	public static final int SOFTWARE = ItemType.SOFTWARE.getItemType();

	private final ItemType itemType;
	private final String title;
	private final int price;

	public Item(ItemType itemType, String title, int price) {
		this.itemType = itemType;
		this.title = title;
		this.price = price;
	}

	public ItemType getItemType() {
		return itemType;
	}

	public String getTitle() {
		return title;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Item{" +
			"itemType=" + itemType.getItemType() +
			", title='" + title + '\'' +
			", price=" + price +
			'}';
	}
}
