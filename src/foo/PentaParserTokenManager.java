/* Generated By:JavaCC: Do not edit this line. PentaParserTokenManager.java */
package foo;

/** Token Manager. */
public class PentaParserTokenManager implements PentaParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20a020L) != 0L)
         {
            jjmatchedKind = 36;
            return 16;
         }
         if ((active0 & 0x15100L) != 0L)
         {
            jjmatchedKind = 36;
            return 25;
         }
         return -1;
      case 1:
         if ((active0 & 0x1f120L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 1;
            return 25;
         }
         if ((active0 & 0x200000L) != 0L)
         {
            jjmatchedKind = 22;
            jjmatchedPos = 1;
            return 26;
         }
         return -1;
      case 2:
         if ((active0 & 0x21f120L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 2;
            return 25;
         }
         return -1;
      case 3:
         if ((active0 & 0x100L) != 0L)
            return 25;
         if ((active0 & 0x21f020L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 3;
            return 25;
         }
         return -1;
      case 4:
         if ((active0 & 0x20d020L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 4;
            return 25;
         }
         if ((active0 & 0x12000L) != 0L)
            return 25;
         return -1;
      case 5:
         if ((active0 & 0x20d000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 5;
            return 25;
         }
         return -1;
      case 6:
         if ((active0 & 0x5000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 6;
            return 25;
         }
         if ((active0 & 0x208000L) != 0L)
            return 25;
         return -1;
      case 7:
         if ((active0 & 0x1000L) != 0L)
            return 25;
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 7;
            return 25;
         }
         return -1;
      case 8:
         if ((active0 & 0x4000L) != 0L)
         {
            jjmatchedKind = 36;
            jjmatchedPos = 8;
            return 25;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjMoveStringLiteralDfa1_0(0x7f000000L);
      case 43:
         return jjStopAtPos(0, 32);
      case 44:
         return jjStopAtPos(0, 19);
      case 46:
         return jjStopAtPos(0, 33);
      case 47:
         return jjStopAtPos(0, 10);
      case 59:
         return jjStopAtPos(0, 11);
      case 61:
         return jjStopAtPos(0, 9);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x10000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x20a020L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 91:
         return jjStopAtPos(0, 17);
      case 93:
         return jjStopAtPos(0, 18);
      case 95:
         return jjStopAtPos(0, 23);
      case 123:
         return jjStopAtPos(0, 6);
      case 124:
         return jjStopAtPos(0, 31);
      case 125:
         return jjStopAtPos(0, 7);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 49:
         return jjMoveStringLiteralDfa2_0(active0, 0x11000000L);
      case 50:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 51:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000000L);
      case 52:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L);
      case 54:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L);
      case 56:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x1100L);
      case 72:
         return jjMoveStringLiteralDfa2_0(active0, 0x20L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 80:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000L);
      case 83:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 84:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(2, 24);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(2, 25);
         else if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(2, 26);
         else if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(2, 27);
         break;
      case 50:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000000L);
      case 52:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000L);
      case 54:
         return jjMoveStringLiteralDfa3_0(active0, 0x10000000L);
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x2020L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x201000L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 83:
         return jjMoveStringLiteralDfa3_0(active0, 0x14000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 41:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(3, 28);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(3, 29);
         else if ((active0 & 0x40000000L) != 0L)
            return jjStopAtPos(3, 30);
         break;
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x10000L);
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x202020L);
      case 79:
         return jjMoveStringLiteralDfa4_0(active0, 0x9000L);
      case 84:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(3, 8, 25);
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 67:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      case 68:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(4, 13, 25);
         break;
      case 78:
         return jjMoveStringLiteralDfa5_0(active0, 0x200000L);
      case 80:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000L);
      case 82:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x20L);
      case 89:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(4, 16, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(5, 5);
         break;
      case 67:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000L);
      case 72:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 73:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000L);
      case 85:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 69:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(6, 15, 25);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(6, 21, 25);
         break;
      case 77:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000L);
      case 84:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000L);
      case 89:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(7, 12, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 78:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 84:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(9, 14, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 26;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 26:
               case 25:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(25);
                  break;
               case 16:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(25);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 34)
                        kind = 34;
                     jjCheckNAdd(23);
                  }
                  else if ((0xa00000000L & l) != 0L)
                  {
                     if (kind > 20)
                        kind = 20;
                  }
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 34)
                     kind = 34;
                  jjCheckNAdd(23);
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 35)
                     kind = 35;
                  jjCheckNAdd(23);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 26:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAdd(25);
                  }
                  else if (curChar == 94)
                  {
                     if (kind > 22)
                        kind = 22;
                  }
                  break;
               case 16:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAdd(25);
                  }
                  if (curChar == 73)
                     jjCheckNAdd(3);
                  else if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 17;
                  if (curChar == 73)
                  {
                     if (kind > 22)
                        kind = 22;
                  }
                  else if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 36)
                        kind = 36;
                     jjCheckNAdd(25);
                  }
                  if (curChar == 76)
                     jjCheckNAddTwoStates(12, 21);
                  else if (curChar == 83)
                     jjCheckNAddStates(0, 3);
                  else if (curChar == 70)
                     jjCheckNAddTwoStates(12, 13);
                  else if (curChar == 77)
                     jjCheckNAddTwoStates(9, 10);
                  else if (curChar == 82)
                     jjAddStates(4, 5);
                  else if (curChar == 68)
                     jjAddStates(6, 7);
                  break;
               case 1:
                  if (curChar == 68)
                     jjAddStates(6, 7);
                  break;
               case 2:
                  if (curChar == 79 && kind > 22)
                     kind = 22;
                  break;
               case 3:
                  if (curChar == 94)
                     kind = 22;
                  break;
               case 4:
                  if (curChar == 79)
                     jjCheckNAdd(3);
                  break;
               case 5:
                  if (curChar == 82)
                     jjAddStates(4, 5);
                  break;
               case 6:
                  if (curChar == 69 && kind > 22)
                     kind = 22;
                  break;
               case 7:
                  if (curChar == 69)
                     jjCheckNAdd(3);
                  break;
               case 8:
                  if (curChar == 77)
                     jjCheckNAddTwoStates(9, 10);
                  break;
               case 9:
                  if (curChar == 73 && kind > 22)
                     kind = 22;
                  break;
               case 10:
                  if (curChar == 73)
                     jjCheckNAdd(3);
                  break;
               case 11:
                  if (curChar == 70)
                     jjCheckNAddTwoStates(12, 13);
                  break;
               case 12:
                  if (curChar == 65 && kind > 22)
                     kind = 22;
                  break;
               case 13:
               case 21:
                  if (curChar == 65)
                     jjCheckNAdd(3);
                  break;
               case 14:
                  if (curChar == 83)
                     jjCheckNAddStates(0, 3);
                  break;
               case 15:
                  if (curChar == 76 && kind > 22)
                     kind = 22;
                  break;
               case 17:
                  if (curChar == 76)
                     jjCheckNAdd(3);
                  break;
               case 18:
                  if (curChar == 79)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 73)
                     jjCheckNAdd(3);
                  break;
               case 20:
                  if (curChar == 76)
                     jjCheckNAddTwoStates(12, 21);
                  break;
               case 24:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(25);
                  break;
               case 25:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 36)
                     kind = 36;
                  jjCheckNAdd(25);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 26 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   16, 9, 18, 19, 6, 7, 2, 4, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, "\123\110\105\105\124\40", "\173", "\175", 
"\102\105\101\124", "\75", "\57", "\73", "\126\105\114\117\103\111\124\131", 
"\123\120\105\105\104", "\111\116\123\124\122\125\115\105\116\124", "\123\124\122\117\120\110\105", 
"\105\123\123\101\131", "\133", "\135", "\54", null, "\123\111\114\105\116\103\105", null, "\137", 
"\50\61\51", "\50\62\51", "\50\64\51", "\50\70\51", "\50\61\66\51", "\50\63\62\51", 
"\50\66\64\51", "\174", "\53", "\56", null, null, null, null, };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x3fffffffe1L, 
};
static final long[] jjtoSkip = {
   0x1eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[26];
static private final int[] jjstateSet = new int[52];
static protected char curChar;
/** Constructor. */
public PentaParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public PentaParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 26; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
