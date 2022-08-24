package me.mocadev.refactoring.fastcampus.nullcheck.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-24
 **/
public class Label {

	private final String label;

	public Label(String label) {
		this.label = label;
	}

	public void display() {
		System.out.println("label = " + label);
	}

	public boolean isNull() {
		return false;
	}

	@Override
	public String toString() {
		return "After {" +
			"label='" + label + '\'' +
			'}';
	}
}
