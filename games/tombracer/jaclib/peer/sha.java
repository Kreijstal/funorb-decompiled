/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class sha {
    private jaclib.peer.PeerReference c;
    java.lang.ref.ReferenceQueue a;
    private jaclib.peer.PeerReference b;

    public final void b(int param0) {
        int discarded$6 = 8841;
        this.a();
        L0: while (true) {
          if (((jaclib.peer.sha) this).b == null) {
            if (param0 != 14203) {
              ((jaclib.peer.sha) this).c = null;
              int discarded$7 = 8841;
              this.a();
              return;
            } else {
              int discarded$8 = 8841;
              this.a();
              return;
            }
          } else {
            this.b(-27558, ((jaclib.peer.sha) this).b);
            continue L0;
          }
        }
    }

    public final void c(int param0) {
        if (param0 != -24122) {
            return;
        }
        int discarded$0 = 8841;
        this.a();
    }

    private final void a() {
        java.lang.ref.Reference var2 = null;
        jaclib.peer.PeerReference var3 = null;
        L0: while (true) {
          var2 = ((jaclib.peer.sha) this).a.poll();
          if (var2 != null) {
            var3 = (jaclib.peer.PeerReference) (Object) var2;
            this.b(-27558, var3);
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void b(int param0, jaclib.peer.PeerReference param1) {
        Object var4 = null;
        L0: {
          if (((jaclib.peer.sha) this).c == param1) {
            ((jaclib.peer.sha) this).c = param1.b;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != ((jaclib.peer.sha) this).b) {
          L1: {
            if (param1.b != null) {
              param1.b.a = param1.a;
              break L1;
            } else {
              break L1;
            }
          }
          if (param0 != -27558) {
            L2: {
              var4 = null;
              this.b(-21, (jaclib.peer.PeerReference) null);
              if (null != param1.a) {
                param1.a.b = param1.b;
                break L2;
              } else {
                break L2;
              }
            }
            return;
          } else {
            L3: {
              if (null != param1.a) {
                param1.a.b = param1.b;
                break L3;
              } else {
                break L3;
              }
            }
            return;
          }
        } else {
          L4: {
            ((jaclib.peer.sha) this).b = param1.a;
            if (param1.b != null) {
              param1.b.a = param1.a;
              break L4;
            } else {
              break L4;
            }
          }
          if (param0 == -27558) {
            L5: {
              if (null != param1.a) {
                param1.a.b = param1.b;
                break L5;
              } else {
                break L5;
              }
            }
            return;
          } else {
            L6: {
              var4 = null;
              this.b(-21, (jaclib.peer.PeerReference) null);
              if (null != param1.a) {
                param1.a.b = param1.b;
                break L6;
              } else {
                break L6;
              }
            }
            return;
          }
        }
    }

    public sha() {
        ((jaclib.peer.sha) this).a = new java.lang.ref.ReferenceQueue();
    }

    final void a(int param0, jaclib.peer.PeerReference param1) {
        Object var4 = null;
        param1.b = null;
        param1.a = ((jaclib.peer.sha) this).b;
        if (param0 <= 61) {
          L0: {
            var4 = null;
            ((jaclib.peer.sha) this).a(114, (jaclib.peer.PeerReference) null);
            if (null == ((jaclib.peer.sha) this).c) {
              ((jaclib.peer.sha) this).c = param1;
              break L0;
            } else {
              ((jaclib.peer.sha) this).b.b = param1;
              break L0;
            }
          }
          ((jaclib.peer.sha) this).b = param1;
          return;
        } else {
          L1: {
            if (null == ((jaclib.peer.sha) this).c) {
              ((jaclib.peer.sha) this).c = param1;
              break L1;
            } else {
              ((jaclib.peer.sha) this).b.b = param1;
              break L1;
            }
          }
          ((jaclib.peer.sha) this).b = param1;
          return;
        }
    }
}
