package utilities;

public class Useful {
	
	
	public static void waitASec(int a) {
		int b = a*1000;
		try {
			Thread.sleep(b);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
