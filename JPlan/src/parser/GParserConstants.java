/* Generated By:JavaCC: Do not edit this line. GParserConstants.java */
package parser;

public interface GParserConstants {

  int EOF = 0;
  int DIGIT = 6;
  int NUMBER = 7;
  int LETTER = 8;
  int ROP = 9;
  int AND = 10;
  int TRUE = 11;
  int LITERAL = 12;
  int VARIABLE = 13;

  int DEFAULT = 0;

  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "\"\\r\\n\"",
    "<DIGIT>",
    "<NUMBER>",
    "<LETTER>",
    "<ROP>",
    "\"&\"",
    "\"true\"",
    "<LITERAL>",
    "<VARIABLE>",
    "\",\"",
    "\"(\"",
    "\")\"",
    "\"[\"",
    "\"]\"",
    "\"operator:\"",
    "\"objects:\"",
    "\";\"",
    "\"init:\"",
    "\"goal:\"",
  };

}
