package me.mocadev.refactoring.fastcampus.statepattern.after;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class Player {

	private PlayerLevel level;

	public Player() {
		this.level = new BeginnerLevel();
		level.showLevelMessage();
	}

	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showLevelMessage();
	}

	public void play(int count) {
		level.go(count);
	}
}
