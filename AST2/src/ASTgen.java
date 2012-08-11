import japa.parser.*;
import japa.parser.ast.body.*;
import japa.parser.ast.CompilationUnit;
import japa.parser.ast.visitor.VoidVisitorAdapter;
import japa.parser.ast.visitor.DumpVisitor;
import java.io.*;
public class ASTgen {

    public static void main(String[] args) throws Exception {
        // creates an input stream for the file to be parsed
        FileInputStream in = new FileInputStream("test.java");

        CompilationUnit cu;
        try {
            // parse the file
            cu = JavaParser.parse(in);
        } finally {
            in.close();
        }

        // visit and print the methods names
        new DumpVisitor().visit(cu, null);
    }
}
