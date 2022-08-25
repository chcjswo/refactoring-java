package me.mocadev.refactoring.fastcampus.typecodewithclass.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class ItemType {

	public static final ItemType BOOK = new ItemType(0);
	public static final ItemType DVD = new ItemType(1);
	public static final ItemType SOFTWARE = new ItemType(2);

	private final int itemType;

	public ItemType(int itemType) {
		this.itemType = itemType;
	}

	public int getItemType() {
		return itemType;
	}
}
