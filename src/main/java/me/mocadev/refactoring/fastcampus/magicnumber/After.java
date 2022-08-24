package me.mocadev.refactoring.fastcampus.magicnumber;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-24
 **/
public class After {

	private static final int COMMAND_WALK = 1;
	private static final int COMMAND_STOP = 2;
	private static final int COMMAND_JUMP = 3;

	public enum Command {
		WALK,
		STOP,
		JUMP
	}

	public String name;

	public After(String name) {
		this.name = name;
	}

	public void order(Command command) {
		if (command == Command.WALK) {
			System.out.println("walk " + name);
		} else if (command == Command.STOP) {
			System.out.println("stop " + name);
		} else if (command == Command.JUMP) {
			System.out.println("jump " + name);
		} else {
			System.out.println("error ");
		}
	}

	public static void main(String[] args) {
		final After tony = new After("tony");
		tony.order(Command.WALK);
		tony.order(Command.STOP);
		tony.order(Command.JUMP);
	}

}
