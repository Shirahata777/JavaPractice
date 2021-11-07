package pkg.javasilver.chapter8;

public class Sample1_2 {
	
	private Sample1_1 logic;
	
	public void setLogic(Sample1_1 logic) {
		this.logic = logic;
	}
	
	public void doProcess(String name) {
		System.out.println("strat");
		this.logic.perform(name);
		System.out.println("end");
	}
	

}
