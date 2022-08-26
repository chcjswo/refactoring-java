package me.mocadev.refactoring.fastcampus.statepattern.after2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class AdvancedLevel extends PlayerLevel {

	private static final AdvancedLevel instance = new AdvancedLevel();

	private AdvancedLevel() {}

	public static AdvancedLevel getInstance() {
		return instance;
	}

	@Override
	public void run() {
		System.out.println("빨리 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("빨리 점프");
	}

	@Override
	public void turn() {
		System.out.println("빨리 턴");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 잘하는 레벨 *****");
	}
}
