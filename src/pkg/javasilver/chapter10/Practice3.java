package pkg.javasilver.chapter10;

public class Practice3 {

	public static void main(String[] args) {
		try {
			sample();
			sub();
		} catch(SampleException e) {
			System.out.println("a");

		} 
//		以下catchは到達できないコード
//		上のcatchで処理済みと判定されるため
//		catch(SubSampleException e) {
//			System.out.println("b");
//		}

	}

	private static void sub() throws SampleException {
		throw new SampleException();
	}

	private static void sample() throws SubSampleException {
		throw new SubSampleException();
	}

}
