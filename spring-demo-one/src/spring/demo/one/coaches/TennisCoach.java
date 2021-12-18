package spring.demo.one.coaches;

public class TennisCoach implements Coach {

	private FortuneService fortuneService;
	
	public TennisCoach(FortuneService fortuneService) {
		this.setFortuneService(fortuneService);
	}
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Tennis Workout";
	}

	@Override
	public String getDailyFortunes() {
		// TODO Auto-generated method stub
		return "From Tennis: " + getFortuneService().getFortune();
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

}
