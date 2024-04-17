package spring_demo_one;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getForture() {
		
		return "Today is your lucky day";
	}

}
