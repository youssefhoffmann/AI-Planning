/* Generated By:JavaCC: Do not edit this line. GParserTokenManager.java */
package parser;
import graphplan.*;
import java.util.*;

public class GParserTokenManager implements GParserConstants
{
  public static  java.io.PrintStream debugStream = System.out;
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0xd80800L) != 0L)
         {
            jjmatchedKind = 8;
            return 9;
         }
         return -1;
      case 1:
         if ((active0 & 0xd80800L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 1;
            return 9;
         }
         return -1;
      case 2:
         if ((active0 & 0xd80800L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 2;
            return 9;
         }
         return -1;
      case 3:
         if ((active0 & 0xd80000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 3;
            return 9;
         }
         if ((active0 & 0x800L) != 0L)
            return 9;
         return -1;
      case 4:
         if ((active0 & 0x180000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 4;
            return 9;
         }
         return -1;
      case 5:
         if ((active0 & 0x180000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 5;
            return 9;
         }
         return -1;
      case 6:
         if ((active0 & 0x180000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 6;
            return 9;
         }
         return -1;
      case 7:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 12;
            jjmatchedPos = 7;
            return 9;
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
static private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 13:
         jjmatchedKind = 4;
         return jjMoveStringLiteralDfa1_0(0x20L);
      case 38:
         return jjStopAtPos(0, 10);
      case 40:
         return jjStopAtPos(0, 15);
      case 41:
         return jjStopAtPos(0, 16);
      case 44:
         return jjStopAtPos(0, 14);
      case 59:
         return jjStopAtPos(0, 21);
      case 91:
         return jjStopAtPos(0, 17);
      case 93:
         return jjStopAtPos(0, 18);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x400000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x180000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x800L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 10:
         if ((active0 & 0x20L) != 0L)
            return jjStopAtPos(1, 5);
         break;
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x100000L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x400000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L);
      case 112:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x80000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 106:
         return jjMoveStringLiteralDfa3_0(active0, 0x100000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 9);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
      case 58:
         if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(4, 22);
         else if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(4, 23);
         break;
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x180000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
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
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x100000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
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
      case 58:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(7, 20);
         break;
      case 114:
         return jjMoveStringLiteralDfa8_0(active0, 0x80000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
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
      case 58:
         if ((active0 & 0x80000L) != 0L)
            return jjStopAtPos(8, 19);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
static private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
static private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 10;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 6)
                        kind = 6;
                     jjCheckNAdd(7);
                  }
                  else if (curChar == 33)
                     jjCheckNAdd(0);
                  else if (curChar == 61)
                     jjCheckNAdd(0);
                  else if (curChar == 63)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 0:
                  if (curChar == 61 && kind > 9)
                     kind = 9;
                  break;
               case 2:
                  if (curChar == 33)
                     jjCheckNAdd(0);
                  break;
               case 3:
                  if (curChar == 63)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 6)
                     kind = 6;
                  jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAdd(7);
                  break;
               case 9:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjstateSet[jjnewStateCnt++] = 9;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 8)
                        kind = 8;
                     jjCheckNAdd(9);
                  }
                  else if (curChar == 64)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 3:
                  if (curChar == 64)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 4:
               case 5:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 13)
                     kind = 13;
                  jjCheckNAdd(5);
                  break;
               case 8:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 8)
                     kind = 8;
                  jjCheckNAdd(9);
                  break;
               case 9:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 12)
                     kind = 12;
                  jjCheckNAdd(9);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
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
      if ((i = jjnewStateCnt) == (startsAt = 10 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, "\46", 
"\164\162\165\145", null, null, "\54", "\50", "\51", "\133", "\135", 
"\157\160\145\162\141\164\157\162\72", "\157\142\152\145\143\164\163\72", "\73", "\151\156\151\164\72", 
"\147\157\141\154\72", };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0xffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[10];
static private final int[] jjstateSet = new int[20];
static protected char curChar;
public GParserTokenManager(SimpleCharStream stream)
{
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}
public GParserTokenManager(SimpleCharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 10; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

public static Token getNextToken() 
{
  int kind;
  Token specialToken = null;
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
      while (curChar <= 32 && (0x100000600L & (1L << curChar)) != 0L)
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

}
