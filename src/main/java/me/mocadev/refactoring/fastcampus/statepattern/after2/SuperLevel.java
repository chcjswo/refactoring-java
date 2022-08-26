package me.mocadev.refactoring.fastcampus.statepattern.after2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class SuperLevel extends PlayerLevel {

	private static final SuperLevel instance = new SuperLevel();

	private SuperLevel() {}

	public static SuperLevel getInstance() {
		return instance;
	}

	@Override
	public void run() {
		System.out.println("엄청 빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("엄청 빨리 점프");
	}

	@Override
	public void turn() {
		System.out.println("엄청 빨리 턴");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 엄청 잘하는 레벨 *****");
	}
}
