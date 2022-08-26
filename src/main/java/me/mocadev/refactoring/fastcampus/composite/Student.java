package me.mocadev.refactoring.fastcampus.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chcjswo
 * @version 1.0.0
 * @blog https://mocadev.tistory.com
 * @github https://github.com/chcjswo
 * @since 2022-08-27
 **/
public class Student {

	private String studentName;
	private String studentId;

	private Subject majorSubject;
	private List<Subject> subjects = new ArrayList<>();

	public Student(String studentName, String studentId, String subjectName, int subjectCode) {
		this.studentName = studentName;
		this.studentId = studentId;
		majorSubject = new Subject(subjectName, subjectCode);
		subjects.add(majorSubject);
	}

	public void addSubject(String subjectName, int subjectCode) {
		final Subject subject = new Subject(subjectName, subjectCode);
		subjects.add(subject);
	}

	public void setSubjectScore(int subjectCode, int score) {
		for (Subject subject : subjects) {
			int code = subject.getSubjectCode();
			if (code == subjectCode) {
				subject.setScore(score);
				return;
			}
		}
		System.out.println("no subject");
	}

	public void getReport() {
		int total = majorSubject.getScore();
		System.out.println(studentName + "님 전공과목은 " + majorSubject.getSubjectName() + " 이고, 점수는 " + majorSubject.getScore() + " 입니다.");

		for (Subject subject : subjects) {
			System.out.println(subject.getSubjectName() + " : " + subject.getScore());
			total += subject.getScore();
		}

		System.out.println("total = " + total);
	}

}
