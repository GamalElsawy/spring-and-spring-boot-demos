package spring.demo.one.coaches;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainUsingXML {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("coachType", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortunes());
		
		context.close();

	}

}
