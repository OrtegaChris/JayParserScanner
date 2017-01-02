public class ParserDemo {
 private static String file1;          //= "src\\prog2.jay";
	public static void main(String[] args) {
		selectFile sFile = new selectFile();
		sFile.displayDirContents();
		sFile.setFileName(); 
		file1 = sFile.getFileName();
		TokenStream tStream = new TokenStream(file1);
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		Program p = cSyntax.program();
		System.out.println(p.display());		
	}
}
