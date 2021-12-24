package spring.demo.annotations;

import org.springframework.stereotype.Component;

@Component
public class SadFortuneService implements FortuneService {

	@Override
	public String getDailyFortune() {
		return "getDailyFortune: SadFortuneService";
	}

}
