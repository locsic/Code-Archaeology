/* AST Crawler
 * @Author Loc Nguyen
 * @Date 10/10/11
 * @Version 0.1 Lets crawl
 *
 */
//import java.util.HashSet;
//import java.util.Set;
//import org.eclipse.jdt.core.dom.AST;
//import org.eclipse.jdt.core.dom.ASTParser;
//import org.eclipse.jdt.core.dom.ASTVisitor;
//import org.eclipse.jdt.core.dom.CompilationUnit;
//import org.eclipse.jdt.core.dom.SimpleName;
//import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import java.io.FileInputStream;
import japa.parser.JavaParser;
import japa.parser.ast.CompilationUnit;

public class Test {
	public static void main(String args[]) throws Exception{
		// creates an input stream for the file to be parsed
		System.getProperty("java.classpath");
		FileInputStream in = new FileInputStream(args[0]);

		CompilationUnit cu;
		try {
			//parse the file
			cu = JavaParser.parse(in);
		} finally {
			in.close();
		}
		System.out.println(cu.toString());
	}
}
