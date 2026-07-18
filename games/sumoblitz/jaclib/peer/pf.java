/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class pf {
    private jaclib.peer.PeerReference b;
    java.lang.ref.ReferenceQueue a;
    private jaclib.peer.PeerReference c;

    public final void b(int param0) {
        this.a(false);
        if (param0 == 12575) {
            return;
        }
        ((jaclib.peer.pf) this).c = null;
    }

    private final void a(int param0, jaclib.peer.PeerReference param1) {
        L0: {
          if (((jaclib.peer.pf) this).b == param1) {
            ((jaclib.peer.pf) this).b = param1.b;
            break L0;
          } else {
            break L0;
          }
        }
        if (((jaclib.peer.pf) this).c != param1) {
          if (param1.b != null) {
            L1: {
              param1.b.a = param1.a;
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            L2: {
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          }
        } else {
          ((jaclib.peer.pf) this).c = param1.a;
          if (param1.b == null) {
            L3: {
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          } else {
            L4: {
              param1.b.a = param1.a;
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L4;
              } else {
                break L4;
              }
            }
            return;
          }
        }
    }

    public final void a(int param0) {
        Object var3 = null;
        if (param0 == -25924) {
          this.a(false);
          L0: while (true) {
            if (((jaclib.peer.pf) this).c == null) {
              this.a(false);
              return;
            } else {
              this.a(19176, ((jaclib.peer.pf) this).c);
              continue L0;
            }
          }
        } else {
          var3 = null;
          ((jaclib.peer.pf) this).a((jaclib.peer.PeerReference) null, -79);
          this.a(false);
          L1: while (true) {
            if (((jaclib.peer.pf) this).c == null) {
              this.a(false);
              return;
            } else {
              this.a(19176, ((jaclib.peer.pf) this).c);
              continue L1;
            }
          }
        }
    }

    final void a(jaclib.peer.PeerReference param0, int param1) {
        if (param1 != -13587) {
          return;
        } else {
          L0: {
            param0.b = null;
            param0.a = ((jaclib.peer.pf) this).c;
            if (null == ((jaclib.peer.pf) this).b) {
              ((jaclib.peer.pf) this).b = param0;
              break L0;
            } else {
              ((jaclib.peer.pf) this).c.b = param0;
              break L0;
            }
          }
          ((jaclib.peer.pf) this).c = param0;
          return;
        }
    }

    private final void a(boolean param0) {
        java.lang.ref.Reference var2 = null;
        jaclib.peer.PeerReference var3 = null;
        L0: while (true) {
          var2 = ((jaclib.peer.pf) this).a.poll();
          if (var2 != null) {
            var3 = (jaclib.peer.PeerReference) (Object) var2;
            this.a(19176, var3);
            continue L0;
          } else {
            return;
          }
        }
    }

    public pf() {
        ((jaclib.peer.pf) this).a = new java.lang.ref.ReferenceQueue();
    }
}
