package cn.mrzero.dome;

public class LoadTest {
	
	private LoadTest loadTest = null;
	
	static{
		System.out.println("SLoad");
	}
	
	public static void main(String[] args) {
		new LoadTest();
		new StaticTest();
	}
	
	private LoadTest() {
		System.out.println("CLoadTest");
	}
	
	public LoadTest getLoadTest() {
		if(this.loadTest == null){
			
			this.loadTest = new LoadTest();
		}
		return loadTest;
	}

}

class StaticTest {
	static{
		System.out.println("hello");;
	}
	public StaticTest() {
		System.out.println("cHello");
	}
}