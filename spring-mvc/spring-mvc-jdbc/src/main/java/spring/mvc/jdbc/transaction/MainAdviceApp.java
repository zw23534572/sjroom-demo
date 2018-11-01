package spring.mvc.jdbc.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.mvc.jdbc.StudentJDBCTemplate;
import spring.mvc.jdbc.StudentMarks;

import java.util.List;

/**
 * 声明式事务
 */
public class MainAdviceApp {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean-transaction-advice.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

        System.out.println("------Records creation--------");
        studentJDBCTemplate.createAdvice("Zara", 11, 99, 2010);
        studentJDBCTemplate.createAdvice("Nuha", 20, 97, 2010);
        studentJDBCTemplate.createAdvice("Ayan", 25, 100, 2011);

        System.out.println("------Listing all the records--------");
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudentsMarks();
        for (StudentMarks record : studentMarks) {
            System.out.print("advice ID : " + record.getId());

            System.out.print(",advice Name : " + record.getName());

            System.out.print(",advice Marks : " + record.getMarks());

            System.out.print(",advice Year : " + record.getYear());

            System.out.println(",advice Age : " + record.getAge());
        }
    }
}
