package spring01.di;

import spring01.di.entity.Exam;
import spring01.di.ui.ExamConsole;
import spring01.di.ui.GrideExamConsole;
import spring01.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		
		Exam exam = new NewlecExam();
		ExamConsole console = new GrideExamConsole(exam);
		console.setExam(exam);
		
//		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
	}

}
