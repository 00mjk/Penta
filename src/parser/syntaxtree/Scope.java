/* Generated by JTB 1.4.7 */
package parser.syntaxtree;

import parser.visitor.*;

public class Scope implements INode {

  public NodeToken f0;

  public NodeToken f1;

  public NodeToken f2;

  public Declarations f3;

  public Essay f4;

  public NodeToken f5;

  private static final long serialVersionUID = 147L;

  public Scope(final NodeToken n0, final NodeToken n1, final NodeToken n2, final Declarations n3, final Essay n4, final NodeToken n5) {
    f0 = n0;
    f1 = n1;
    f2 = n2;
    f3 = n3;
    f4 = n4;
    f5 = n5;
  }

  public <R, A> R accept(final IRetArguVisitor<R, A> vis, final A argu) {
    return vis.visit(this, argu);
  }

  public <R> R accept(final IRetVisitor<R> vis) {
    return vis.visit(this);
  }

  public <A> void accept(final IVoidArguVisitor<A> vis, final A argu) {
    vis.visit(this, argu);
  }

  public void accept(final IVoidVisitor vis) {
    vis.visit(this);
  }

}
