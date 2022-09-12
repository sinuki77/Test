package spring01.di;

import spring01.di.ui.ExamConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Program {

	public static void main(String[] args) {
		
		/*
		 * Exam exam = new NewlecExam(); ExamConsole console = new
		 * GrideExamConsole(exam); console.setExam(exam);
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring01/di/setting.xml");
//		ExamConsole console = (ExamConsole) context.getBean("console");
		ExamConsole console = context.getBean(ExamConsole.class);
		
	}

}
