package spring.demo.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigDemo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(Config.class);
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		context.close();
	}

}
