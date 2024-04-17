package spring_demo_one;

public class Myapp {
	public static void main(String[] args) {
		Coach theCoach  = new TrackCoach();
		 System.out.println( theCoach.getDailyWork());
	      FortuneService fortune = new HappyFortuneService();
	   
	      System.out.println(fortune.getForture());
	}
 }
