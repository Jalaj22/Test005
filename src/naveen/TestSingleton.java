package naveen;

public class TestSingleton {

	private static TestSingleton ts = null;
	public String str;
	
	private TestSingleton(){
		str = "porsche";
		System.out.println("object created");
	}
	
	
	public static TestSingleton getInstance(){
		if(ts==null){
			ts = new TestSingleton();
		}
		
		return ts;
	}
	public static void main(String[] args) {
		TestSingleton f = getInstance();
		System.out.println(f.str);
		
		TestSingleton f2 = getInstance();
		System.out.println(f2.str);
	
												
	}

}
