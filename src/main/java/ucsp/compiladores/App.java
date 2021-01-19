package ucsp.compiladores;

/**
 * Hello world!
 *
 */
// public class App
// {
//     public static void main( String[] args )
//     {
//         System.out.println( "Hello World!" );
//     }
// }

import java.io.IOException;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
public class App {
    public static void main(String[] args) {
        try {
            // args[0] es el primer argumento de la linea de comando
            CharStream cs = CharStreams.fromFileName(args[0]);
            AlgumaLexer lex = new AlgumaLexer(cs);
            System.out.println(cs);
            while (lex.nextToken().getType() != Token.EOF) {
                System.out.println(lex);
            }
        } catch (IOException ex) {
        }
    }
}
