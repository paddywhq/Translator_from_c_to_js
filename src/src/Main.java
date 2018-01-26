import org.antlr.runtime.*;

public class Main {
	public static void main(String[] args) throws Exception {
		CharStream input = new ANTLRFileStream(args[0]);
		calculatorLexer lex = new calculatorLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lex);
		// System.out.println("tokens="+tokens);
		calculatorParser parser = new calculatorParser(tokens);
		parser.program();
	}
}
