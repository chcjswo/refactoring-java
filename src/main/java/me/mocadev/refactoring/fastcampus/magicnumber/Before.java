package me.mocadev.refactoring.fastcampus.magicnumber;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-24
 **/
public class Before {

	public String name;

	public Before(String name) {
		this.name = name;
	}

	public void order(int command) {
		if (command == 0) {
			System.out.println("walk " + name);
		} else if (command == 1) {
			System.out.println("stop " + name);
		} else if (command == 2) {
			System.out.println("jump " + name);
		} else {
			System.out.println("error ");
		}
	}

	public static void main(String[] args) {
		final Before tony = new Before("tony");
		tony.order(0);
		tony.order(1);
		tony.order(2);
		tony.order(30);
	}
}
