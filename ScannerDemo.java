
public class ScannerDemo {
	
	private static String file1= "src\\prog2.jay";//edit file path for personal testing of the Scanner (e.g prog2.jay)
	private static int counter = 1;
	public static void main(String args[]) {
		TokenStream ts = new TokenStream(file1);
		while (!ts.isEndofFile()) {
			// TO BE COMPLETED - Done
			Token tt = ts.nextToken();
			System.out.println(tt);
		}
	}
}

