package spring_demo_one;

public class BasedBallCoach implements Coach {
	private FortuneService fortuneService;
	
	public BasedBallCoach(FortuneService thefortuneService) {
		
	fortuneService = thefortuneService;
	}

	@Override
 public String getDailyWork () {
	 return "Spend 30 minutues on batting practice";
 }

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getForture();
	}
}
