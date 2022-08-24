package me.mocadev.refactoring.fastcampus.nullcheck.after;

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
		this(name, new NullLabel());
	}

	public void display() {
		name.display();
		mail.display();
	}

	@Override
	public String toString() {
		return "Person{" +
			"name=" + name +
			", mail=" + mail +
			'}';
	}
}
