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
        jaclib.peer.PeerReference var4 = null;
        jaclib.peer.PeerReference var5 = null;
        if (param0 == -18289) {
          L0: while (true) {
            var2 = this.b.poll();
            if (var2 != null) {
              var4 = (jaclib.peer.PeerReference) ((Object) var2);
              this.a(-22216, var4);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          this.a = (jaclib.peer.PeerReference) null;
          L1: while (true) {
            var2 = this.b.poll();
            if (var2 != null) {
              var5 = (jaclib.peer.PeerReference) ((Object) var2);
              this.a(-22216, var5);
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public tqb() {
        this.b = new java.lang.ref.ReferenceQueue();
    }

    public final void a(byte param0) {
        this.a(-18289);
        L0: while (true) {
          if (null == this.c) {
            if (param0 <= 56) {
              this.b = (java.lang.ref.ReferenceQueue) null;
              this.a(-18289);
              return;
            } else {
              this.a(-18289);
              return;
            }
          } else {
            this.a(-22216, this.c);
            continue L0;
          }
        }
    }

    private final void a(int param0, jaclib.peer.PeerReference param1) {
        L0: {
          if (param1 == this.c) {
            this.c = param1.b;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (param1 == this.a) {
            this.a = param1.a;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1.a != null) {
            param1.a.b = param1.b;
            break L2;
          } else {
            break L2;
          }
        }
        if (param0 != -22216) {
          return;
        } else {
          L3: {
            if (param1.b != null) {
              param1.b.a = param1.a;
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    final void a(jaclib.peer.PeerReference param0, int param1) {
        param0.a = null;
        if (param1 != 25362) {
          L0: {
            this.a = (jaclib.peer.PeerReference) null;
            param0.b = this.c;
            if (null == this.a) {
              this.a = param0;
              break L0;
            } else {
              this.c.a = param0;
              break L0;
            }
          }
          this.c = param0;
          return;
        } else {
          L1: {
            param0.b = this.c;
            if (null == this.a) {
              this.a = param0;
              break L1;
            } else {
              this.c.a = param0;
              break L1;
            }
          }
          this.c = param0;
          return;
        }
    }

    public final void a(boolean param0) {
        this.a(-18289);
        if (!param0) {
            return;
        }
        this.c = (jaclib.peer.PeerReference) null;
    }
}
