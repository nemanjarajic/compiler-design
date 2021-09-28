package lexical_analyzer.lexer;

import java.util.*;


public class Tag {
    public final static int
      AND   = 256,  BASIC = 257,  BREAK = 258,  DO   = 259, ELSE  = 260,
      EQ    = 261,  FALSE = 262,  GE    = 263,  ID   = 264, IF    = 265,
      INDEX = 266,  LE    = 267,  MINUS = 268,  NE   = 269, NUM   = 270,
      OR    = 271,  REAL  = 272,  TEMP  = 273,  TRUE = 274, WHILE = 275;

    public static HashMap<Integer, String> tagName = new HashMap<>();

    public static void init(){
      tagName.put(256, "AND");
      tagName.put(257, "BASE_TYPE");
      tagName.put(258, "BREAK");
      tagName.put(259, "DO");
      tagName.put(260, "ELSE");
      tagName.put(261, "EQ");
      tagName.put(262, "FALSE");
      tagName.put(263, "GE");
      tagName.put(264, "ID");
      tagName.put(265, "IF");
      tagName.put(267, "LE");
      tagName.put(266, "INDEX");
      tagName.put(268, "MINUS");
      tagName.put(269, "NE");
      tagName.put(270, "NUM");
      tagName.put(271, "OR");
      tagName.put(272, "REAL");
      tagName.put(274, "TRUE");
      tagName.put(275, "WHILE");
      tagName.put(276, "FOR");
      
    }
}
