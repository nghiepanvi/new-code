package spring_demo_one;

public class CrickketCoach implements Coach{
	private FortuneService fortuneService;
	public CrickketCoach () {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	@Override
	public String getDailyWork() {
		// TODO Auto-generated method stub
		return  " Practice fast bowling for 15 minutes ";

	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getForture();
	}
	
//out setter method
	public void setFortuneService (FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService ");
	}
}
