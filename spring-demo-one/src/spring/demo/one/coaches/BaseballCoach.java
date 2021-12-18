package spring.demo.one.coaches;

public class BaseballCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService fortuneService) {
		this.setFortuneService(fortuneService);
	}
	
	@Override
	public String getDailyWorkout() {
		return "Baseball Workout";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return getFortuneService().getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
}
