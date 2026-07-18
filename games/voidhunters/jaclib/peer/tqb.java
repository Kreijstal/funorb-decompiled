/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class tqb {
    java.lang.ref.ReferenceQueue b;
    private jaclib.peer.PeerReference c;
    private jaclib.peer.PeerReference a;

    private final void a(int param0) {
        java.lang.ref.Reference var2 = null;
        jaclib.peer.PeerReference var3 = null;
        L0: while (true) {
          var2 = ((jaclib.peer.tqb) this).b.poll();
          if (var2 != null) {
            var3 = (jaclib.peer.PeerReference) (Object) var2;
            this.a(-22216, var3);
            continue L0;
          } else {
            return;
          }
        }
    }

    public tqb() {
        ((jaclib.peer.tqb) this).b = new java.lang.ref.ReferenceQueue();
    }

    public final void a(byte param0) {
        this.a(-18289);
        L0: while (true) {
          if (null == ((jaclib.peer.tqb) this).c) {
            if (param0 <= 56) {
              ((jaclib.peer.tqb) this).b = null;
              this.a(-18289);
              return;
            } else {
              this.a(-18289);
              return;
            }
          } else {
            this.a(-22216, ((jaclib.peer.tqb) this).c);
            continue L0;
          }
        }
    }

    private final void a(int param0, jaclib.peer.PeerReference param1) {
        if (!(param1 != ((jaclib.peer.tqb) this).c)) {
            ((jaclib.peer.tqb) this).c = param1.b;
        }
        if (!(param1 != ((jaclib.peer.tqb) this).a)) {
            ((jaclib.peer.tqb) this).a = param1.a;
        }
        if (!(param1.a == null)) {
            param1.a.b = param1.b;
        }
        if (!(param1.b == null)) {
            param1.b.a = param1.a;
        }
    }

    final void a(jaclib.peer.PeerReference param0, int param1) {
        param0.a = null;
        if (param1 != 25362) {
          L0: {
            ((jaclib.peer.tqb) this).a = null;
            param0.b = ((jaclib.peer.tqb) this).c;
            if (null == ((jaclib.peer.tqb) this).a) {
              ((jaclib.peer.tqb) this).a = param0;
              break L0;
            } else {
              ((jaclib.peer.tqb) this).c.a = param0;
              break L0;
            }
          }
          ((jaclib.peer.tqb) this).c = param0;
          return;
        } else {
          L1: {
            param0.b = ((jaclib.peer.tqb) this).c;
            if (null == ((jaclib.peer.tqb) this).a) {
              ((jaclib.peer.tqb) this).a = param0;
              break L1;
            } else {
              ((jaclib.peer.tqb) this).c.a = param0;
              break L1;
            }
          }
          ((jaclib.peer.tqb) this).c = param0;
          return;
        }
    }

    public final void a(boolean param0) {
        this.a(-18289);
        if (!param0) {
            return;
        }
        ((jaclib.peer.tqb) this).c = null;
    }
}
