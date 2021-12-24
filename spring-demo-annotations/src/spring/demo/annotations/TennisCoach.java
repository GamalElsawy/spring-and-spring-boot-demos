package spring.demo.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	/*
	 * In this case of injection: Field Injection,
	 * injection done using java reflection. 
	 */
	
	@Autowired
	@Qualifier("happyFortuneService")
	public FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("Inside default construtor");
	}

	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println(this.fortuneService.getDailyFortune());
	}
	
	@Override
	public String getDailyWorkout() {
		return "getDailyWorkout: TennisCoach";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getDailyFortune();
	}

}
