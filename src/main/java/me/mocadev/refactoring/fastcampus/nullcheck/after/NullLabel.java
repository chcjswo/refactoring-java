package me.mocadev.refactoring.fastcampus.nullcheck.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-24
 **/
public class NullLabel extends Label {

	public NullLabel() {
		super(" (none) ");
	}

	public boolean isNull() {
		return true;
	}

	@Override
	public void display() {
	}
}
