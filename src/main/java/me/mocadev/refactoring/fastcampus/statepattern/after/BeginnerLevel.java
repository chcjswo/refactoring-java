package me.mocadev.refactoring.fastcampus.statepattern.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class BeginnerLevel extends PlayerLevel {

	@Override
	public void run() {
		System.out.println("천천히 달립니다.");
	}

	@Override
	public void jump() {
		System.out.println("점프 못함");
	}

	@Override
	public void turn() {
		System.out.println("천천히 턴");
	}

	@Override
	public void showLevelMessage() {
		System.out.println("***** 초보 레벨 *****");
	}
}
