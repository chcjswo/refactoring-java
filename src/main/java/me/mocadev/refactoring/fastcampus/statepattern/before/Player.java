package me.mocadev.refactoring.fastcampus.statepattern.before;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class Player {

	public static final int BEGINNER_LEVEL = 1;
	public static final int ADVANCED_LEVEL = 2;
	public static final int SUPER_LEVEL = 3;
	private int level;

	public Player() {
		this.level = BEGINNER_LEVEL;
		showLevelMessage();
	}

	public int getLevel() {
		return level;
	}

	public void upgradeLevel() {
		if (level == BEGINNER_LEVEL) {
			level = ADVANCED_LEVEL;
		} else if (level == ADVANCED_LEVEL) {
			level = SUPER_LEVEL;
		} else {
			System.out.println("not support level");
		}
		showLevelMessage();
	}

	public void play(int count) {
		run();
		for (int i = 0; i < count; i++) {
			jump();
		}
		turn();
	}

	private void turn() {
		if (level == BEGINNER_LEVEL) {
			System.out.println("천천히 턴.");
		} else if (level == ADVANCED_LEVEL) {
			System.out.println("빨리 턴");
		} else if (level == SUPER_LEVEL) {
			System.out.println("엄청 빨리 턴");
		} else {
			System.out.println("not support level");
		}
	}

	private void jump() {
		if (level == BEGINNER_LEVEL) {
			System.out.println("점프 못함");
		} else if (level == ADVANCED_LEVEL) {
			System.out.println("높이 점프");
		} else if (level == SUPER_LEVEL) {
			System.out.println("엄청 높이 점프");
		} else {
			System.out.println("not support level");
		}

	}

	private void run() {
		if (level == BEGINNER_LEVEL) {
			System.out.println("천천히 달립니다.");
		} else if (level == ADVANCED_LEVEL) {
			System.out.println("빨리 달립니다.");
		} else if (level == SUPER_LEVEL) {
			System.out.println("엄청 빨리 달립니다.");
		} else {
			System.out.println("not support level");
		}
	}

	private void showLevelMessage() {
		if (level == BEGINNER_LEVEL) {
			System.out.println("***** 초보 레벨 *****");
		} else if (level == ADVANCED_LEVEL) {
			System.out.println("***** 좀 하는 레벨 *****");
		} else if (level == SUPER_LEVEL) {
			System.out.println("***** 엄청 잘 하는 레벨 *****");
		} else {
			System.out.println("not support level");
		}
	}
}
