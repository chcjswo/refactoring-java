package me.mocadev.refactoring.fastcampus.statepattern.after2;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-26
 **/
public class Main {

	public static void main(String[] args) {
		final Player player = new Player();
		player.play(1);
		player.upgradeLevel(AdvancedLevel.getInstance());
		player.play(2);
		player.upgradeLevel(SuperLevel.getInstance());
		player.play(3);
	}
}
