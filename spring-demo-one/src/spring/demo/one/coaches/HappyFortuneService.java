package spring.demo.one.coaches;

import java.util.*;

public class HappyFortuneService implements FortuneService {

	List<String> fortuneList;
	Random rand;
	
	public HappyFortuneService() {
		this.fortuneList = new ArrayList<>();
		fortuneList.add("Random fortune 1");
		fortuneList.add("Random fortune 2");
		fortuneList.add("Random fortune 3");
		rand = new Random();
	}
	@Override
	public String getFortune() {
		return this.fortuneList.get(rand.nextInt(this.fortuneList.size()));
	}
	
	
}
