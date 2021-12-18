package spring.demo.one.coaches;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	private String coachName;
	
	public FootballCoach() {
		System.out.println("Football - Inside the no-arg constractor");
	}
	
	public FootballCoach(FortuneService fortuneService) {
		this.setFortuneService(fortuneService);
	}
	
	@Override
	public String getDailyWorkout() {
		return "Football Workout";
	}

	@Override
	public String getDailyFortunes() {
		return getFortuneService().getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside the fortune setter");
		this.fortuneService = fortuneService;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		System.out.println("Inside coachName setter - " + coachName);
		this.coachName = coachName;
	}
	
	public void doInitialization() {
		System.out.println("Inside doInitialization");
	}
	
	public void doDestroying() {
		System.out.println("Inside doDestroying");
	}
}
