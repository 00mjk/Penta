/* Generated by JTB 1.4.7 */
package parser.visitor;

import parser.syntaxtree.*;
import java.util.*;

public class DepthFirstRetVisitor<R> implements IRetVisitor<R> {


  public R visit(final NodeChoice n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    final R nRes = n.choice.accept(this);
    return nRes;
  }

  public R visit(final NodeList n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      @SuppressWarnings("unused")
      final R sRes = e.next().accept(this);
    }
    return nRes;
  }

  public R visit(final NodeListOptional n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    if (n.present()) {
      R nRes = null;
      for (final Iterator<INode> e = n.elements(); e.hasNext();) {
        @SuppressWarnings("unused")
        R sRes = e.next().accept(this);
        }
      return nRes;
    } else
      return null;
  }

  public R visit(final NodeOptional n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    if (n.present()) {
      final R nRes = n.node.accept(this);
      return nRes;
    } else
      return null;
  }

  public R visit(final NodeSequence n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    for (final Iterator<INode> e = n.elements(); e.hasNext();) {
      @SuppressWarnings("unused")
      R subRet = e.next().accept(this);
    }
    return nRes;
  }

  public R visit(final NodeTCF n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return nRes;
  }

  public R visit(final NodeToken n) {
    /* You have to adapt which data is returned (result variables below are just examples) */
    R nRes = null;
    @SuppressWarnings("unused")
    final String tkIm = n.tokenImage;
    return nRes;
  }

  public R visit(final Scope n) {
    R nRes = null;
    // f0 -> "SHEET "
    n.f0.accept(this);
    // f1 -> <ID>
    n.f1.accept(this);
    // f2 -> "{"
    n.f2.accept(this);
    // f3 -> Declarations()
    n.f3.accept(this);
    // f4 -> Essay()
    n.f4.accept(this);
    // f5 -> "}"
    n.f5.accept(this);
    return nRes;
  }

  public R visit(final Declarations n) {
    R nRes = null;
    // f0 -> ( BeatDeclaration() )?
    n.f0.accept(this);
    // f1 -> SpeedDeclaration()
    n.f1.accept(this);
    // f2 -> InstrumentDeclaration()
    n.f2.accept(this);
    // f3 -> VelocityDeclaration()
    n.f3.accept(this);
    // f4 -> ( StropheDeclaration() )*
    n.f4.accept(this);
    return nRes;
  }

  public R visit(final BeatDeclaration n) {
    R nRes = null;
    // f0 -> "BEAT"
    n.f0.accept(this);
    // f1 -> "="
    n.f1.accept(this);
    // f2 -> <DIGIT>
    n.f2.accept(this);
    // f3 -> "/"
    n.f3.accept(this);
    // f4 -> ( %0 <SEMIBREVE>
    // .. .. | %1 <MINIM>
    // .. .. | %2 <CROTCHET>
    // .. .. | %3 <QUAVER>
    // .. .. | %4 <SEMIQUAVER>
    // .. .. | %5 <DEMISEMIQUAVER>
    // .. .. | %6 <HEMIDEMISEMIQUAVER> )
    n.f4.accept(this);
    // f5 -> ";"
    n.f5.accept(this);
    return nRes;
  }

  public R visit(final VelocityDeclaration n) {
    R nRes = null;
    // f0 -> "VELOCITY"
    n.f0.accept(this);
    // f1 -> "="
    n.f1.accept(this);
    // f2 -> <INTEGER>
    n.f2.accept(this);
    // f3 -> ";"
    n.f3.accept(this);
    return nRes;
  }

  public R visit(final SpeedDeclaration n) {
    R nRes = null;
    // f0 -> "SPEED"
    n.f0.accept(this);
    // f1 -> "="
    n.f1.accept(this);
    // f2 -> <INTEGER>
    n.f2.accept(this);
    // f3 -> ";"
    n.f3.accept(this);
    return nRes;
  }

  public R visit(final InstrumentDeclaration n) {
    R nRes = null;
    // f0 -> "INSTRUMENT"
    n.f0.accept(this);
    // f1 -> "="
    n.f1.accept(this);
    // f2 -> <ID>
    n.f2.accept(this);
    // f3 -> ";"
    n.f3.accept(this);
    return nRes;
  }

  public R visit(final StropheDeclaration n) {
    R nRes = null;
    // f0 -> "STROPHE"
    n.f0.accept(this);
    // f1 -> <ID>
    n.f1.accept(this);
    // f2 -> "{"
    n.f2.accept(this);
    // f3 -> ( Sequence() )?
    n.f3.accept(this);
    // f4 -> "}"
    n.f4.accept(this);
    return nRes;
  }

  public R visit(final Essay n) {
    R nRes = null;
    // f0 -> "ESSAY"
    n.f0.accept(this);
    // f1 -> <ID>
    n.f1.accept(this);
    // f2 -> "{"
    n.f2.accept(this);
    // f3 -> ( Sequence() )?
    n.f3.accept(this);
    // f4 -> "}"
    n.f4.accept(this);
    return nRes;
  }

  public R visit(final Sequence n) {
    R nRes = null;
    // f0 -> ( Notes() )+
    n.f0.accept(this);
    return nRes;
  }

  public R visit(final Notes n) {
    R nRes = null;
    // f0 -> . %0 Beat()
    // .. .. | %1 <ID>
    n.f0.accept(this);
    return nRes;
  }

  public R visit(final Beat n) {
    R nRes = null;
    // f0 -> ( Sign() )+
    n.f0.accept(this);
    // f1 -> <ENDOFBEAT>
    n.f1.accept(this);
    return nRes;
  }

  public R visit(final Sign n) {
    R nRes = null;
    // f0 -> . %0 Group()
    // .. .. | %1 Single()
    n.f0.accept(this);
    return nRes;
  }

  public R visit(final Group n) {
    R nRes = null;
    // f0 -> "["
    n.f0.accept(this);
    // f1 -> Note()
    n.f1.accept(this);
    // f2 -> ( Others() )*
    n.f2.accept(this);
    // f3 -> "]"
    n.f3.accept(this);
    // f4 -> Flagged()
    n.f4.accept(this);
    return nRes;
  }

  public R visit(final Others n) {
    R nRes = null;
    // f0 -> ","
    n.f0.accept(this);
    // f1 -> Note()
    n.f1.accept(this);
    return nRes;
  }

  public R visit(final Single n) {
    R nRes = null;
    // f0 -> ( %0 Note()
    // .. .. | %1 <SILENCE> )
    n.f0.accept(this);
    // f1 -> Duration()
    n.f1.accept(this);
    return nRes;
  }

  public R visit(final Note n) {
    R nRes = null;
    // f0 -> ( <SEMITUNE> )?
    n.f0.accept(this);
    // f1 -> <TUNE>
    n.f1.accept(this);
    return nRes;
  }

  public R visit(final Duration n) {
    R nRes = null;
    // f0 -> ( %0 Flagged()
    // .. .. | %1 Unflagged() )
    n.f0.accept(this);
    // f1 -> ( <DOT> )?
    n.f1.accept(this);
    // f2 -> ( Extend() )*
    n.f2.accept(this);
    return nRes;
  }

  public R visit(final Extend n) {
    R nRes = null;
    // f0 -> ( <CROSSBEAT> )?
    n.f0.accept(this);
    // f1 -> ( %0 Flagged()
    // .. .. | %1 Unflagged() )
    n.f1.accept(this);
    // f2 -> ( <DOT> )?
    n.f2.accept(this);
    return nRes;
  }

  public R visit(final Flagged n) {
    R nRes = null;
    // f0 -> . %0 <QUAVER>
    // .. .. | %1 <SEMIQUAVER>
    // .. .. | %2 <DEMISEMIQUAVER>
    // .. .. | %3 <HEMIDEMISEMIQUAVER>
    n.f0.accept(this);
    return nRes;
  }

  public R visit(final Unflagged n) {
    R nRes = null;
    // f0 -> . %0 <SEMIBREVE>
    // .. .. | %1 <MINIM>
    // .. .. | %2 <CROTCHET>
    n.f0.accept(this);
    return nRes;
  }

}
