package me.mocadev.refactoring.fastcampus.nullcheck.before;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-24
 **/
public class Main {

	public static void main(String[] args) {
		Person[] people = {
			new Person(new Label("tony1"), new Label("test1@test.com")),
			new Person(new Label("tony2"), new Label("test2@test.com")),
			new Person(new Label("tony3"))
		};

		for (Person person : people) {
			System.out.println("person = " + person);
		}
	}

}
