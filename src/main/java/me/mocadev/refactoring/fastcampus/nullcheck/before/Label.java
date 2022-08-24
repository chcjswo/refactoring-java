package me.mocadev.refactoring.fastcampus.nullcheck.before;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-24
 **/
public class Label {

	private String label;

	public Label(String label) {
		this.label = label;
	}

	public void display() {
		System.out.println("label = " + label);
	}

	@Override
	public String toString() {
		return "Before {" +
			"label='" + label + '\'' +
			'}';
	}
}
