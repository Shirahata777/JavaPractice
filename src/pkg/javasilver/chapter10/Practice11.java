package pkg.javasilver.chapter10;

public class Practice11 {

//	throw宣言を記載
//	TestExceptionはなくてもよい
	public void hello(String name) throws SampleException {
		if (name == null) {
			throw new SampleException();
		}
		
		if ("".equals(name)) {
			throw new TestException();
		}

	}

}
