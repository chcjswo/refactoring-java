package me.mocadev.refactoring.fastcampus.composite;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-27
 **/
public class Main {

	public static void main(String[] args) {
		final Student student1 = new Student("초천재1", "1", "컴공", 100);
		final Student student2 = new Student("초천재2", "2", "경영", 200);

		student1.addSubject("국문", 300);
		student1.setSubjectScore(100, 100);
		student1.setSubjectScore(300, 55);
		student2.addSubject("국문", 300);
		student2.addSubject("영문", 400);
		student2.setSubjectScore(200, 100);
		student2.setSubjectScore(300, 60);
		student2.setSubjectScore(400, 25);

		student1.getReport();
		student2.getReport();

	}

}
