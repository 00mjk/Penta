/* Generated by JTB 1.4.7 */
package parser.visitor;

import parser.syntaxtree.*;

public interface IVoidArguVisitor<A> {

  public void visit(final NodeChoice n, final A argu);

  public void visit(final NodeList n, final A argu);

  public void visit(final NodeListOptional n, final A argu);

  public void visit(final NodeOptional n, final A argu);

  public void visit(final NodeSequence n, final A argu);

  public void visit(final NodeTCF n, final A argu);

  public void visit(final NodeToken n, final A argu);

  public void visit(final Scope n, final A argu);

  public void visit(final Declarations n, final A argu);

  public void visit(final BeatDeclaration n, final A argu);

  public void visit(final VelocityDeclaration n, final A argu);

  public void visit(final SpeedDeclaration n, final A argu);

  public void visit(final InstrumentDeclaration n, final A argu);

  public void visit(final StropheDeclaration n, final A argu);

  public void visit(final Essay n, final A argu);

  public void visit(final Sequence n, final A argu);

  public void visit(final Notes n, final A argu);

  public void visit(final Beat n, final A argu);

  public void visit(final Sign n, final A argu);

  public void visit(final Group n, final A argu);

  public void visit(final Others n, final A argu);

  public void visit(final Single n, final A argu);

  public void visit(final Note n, final A argu);

  public void visit(final Duration n, final A argu);

  public void visit(final Extend n, final A argu);

  public void visit(final Flagged n, final A argu);

  public void visit(final Unflagged n, final A argu);

}
