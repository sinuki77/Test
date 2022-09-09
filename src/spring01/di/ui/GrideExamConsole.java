package spring01.di.ui;

import spring01.di.entity.Exam;

public class GrideExamConsole implements ExamConsole {

	private Exam exam;
	
	public GrideExamConsole() {
		// TODO Auto-generated constructor stub
	}
	
	public GrideExamConsole(Exam exam) {
		this.exam = exam;
	}



	@Override
	public void print() {
		System.out.printf("Grid is %d, avg is %f\n", exam.total(), exam.avg());
	}



	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
		
	}
}
