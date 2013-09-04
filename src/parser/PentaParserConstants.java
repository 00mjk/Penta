/* Generated By:JavaCC: Do not edit this line. PentaParserConstants.java */
package parser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface PentaParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int SEMITUNE = 20;
  /** RegularExpression Id. */
  int SILENCE = 21;
  /** RegularExpression Id. */
  int TUNE = 22;
  /** RegularExpression Id. */
  int GROUP = 23;
  /** RegularExpression Id. */
  int SEMIBREVE = 24;
  /** RegularExpression Id. */
  int MINIM = 25;
  /** RegularExpression Id. */
  int CROTCHET = 26;
  /** RegularExpression Id. */
  int QUAVER = 27;
  /** RegularExpression Id. */
  int SEMIQUAVER = 28;
  /** RegularExpression Id. */
  int DEMISEMIQUAVER = 29;
  /** RegularExpression Id. */
  int HEMIDEMISEMIQUAVER = 30;
  /** RegularExpression Id. */
  int ENDOFBEAT = 31;
  /** RegularExpression Id. */
  int CROSSBEAT = 32;
  /** RegularExpression Id. */
  int DOT = 33;
  /** RegularExpression Id. */
  int DIGIT = 34;
  /** RegularExpression Id. */
  int INTEGER = 35;
  /** RegularExpression Id. */
  int ID = 36;
  /** RegularExpression Id. */
  int CHAR = 37;

  /** Lexical state. */
  int DEFAULT = 0;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\r\"",
    "\"\\t\"",
    "\"\\n\"",
    "\"SHEET \"",
    "\"{\"",
    "\"}\"",
    "\"BEAT\"",
    "\"=\"",
    "\"/\"",
    "\";\"",
    "\"VELOCITY\"",
    "\"SPEED\"",
    "\"INSTRUMENT\"",
    "\"STROPHE\"",
    "\"ESSAY\"",
    "\"[\"",
    "\"]\"",
    "\",\"",
    "<SEMITUNE>",
    "\"SILENCE\"",
    "<TUNE>",
    "\"_\"",
    "\"(1)\"",
    "\"(2)\"",
    "\"(4)\"",
    "\"(8)\"",
    "\"(16)\"",
    "\"(32)\"",
    "\"(64)\"",
    "\"|\"",
    "\"+\"",
    "\".\"",
    "<DIGIT>",
    "<INTEGER>",
    "<ID>",
    "<CHAR>",
  };

}