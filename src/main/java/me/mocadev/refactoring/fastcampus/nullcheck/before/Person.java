package me.mocadev.refactoring.fastcampus.nullcheck.before;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-24
 **/
public class Person {

	private final Label name;
	private final Label mail;

	public Person(Label name, Label mail) {
		this.name = name;
		this.mail = mail;
	}

	public Person(Label name) {
		this(name, null);
	}

	public void display() {
		if (name != null) {
			name.display();
		}
		if (mail != null) {
			mail.display();
		}
	}

	@Override
	public String toString() {
		return "Person{" +
			"name=" + name +
			", mail=" + mail +
			'}';
	}
}
