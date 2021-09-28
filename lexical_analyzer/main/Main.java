package lexical_analyzer.main;

import java.io.IOException;

import lexical_analyzer.lexer.*;


public class Main {
    public static void main(String[] args) throws IOException {
		Lexer lex = new Lexer();
	    while(true){
            Token t = lex.nextToken();
            if(t.tag == '\uFFFF' || t == null){
                break;
            }else{
                String response = Tag.tagName.get(t.tag);

                System.out.println(response + "     " + t.toString());
            }
        }
		System.out.write('\n');
	}
}
