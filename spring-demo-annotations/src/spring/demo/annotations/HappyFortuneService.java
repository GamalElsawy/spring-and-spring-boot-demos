package spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "getDailyFortune: HappyFortuneService";
	}

}
