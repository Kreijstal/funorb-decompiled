/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class sha {
    private jaclib.peer.PeerReference c;
    java.lang.ref.ReferenceQueue a;
    private jaclib.peer.PeerReference b;

    public final void b(int param0) {
        this.a(8841);
        L0: while (true) {
          if (this.b == null) {
            if (param0 != 14203) {
              this.c = (jaclib.peer.PeerReference) null;
              this.a(8841);
              return;
            } else {
              this.a(8841);
              return;
            }
          } else {
            this.b(-27558, this.b);
            continue L0;
          }
        }
    }

    public final void c(int param0) {
        if (param0 != -24122) {
            return;
        }
        this.a(8841);
    }

    private final void a(int param0) {
        java.lang.ref.Reference var2 = null;
        jaclib.peer.PeerReference var3 = null;
        jaclib.peer.PeerReference var4 = null;
        L0: while (true) {
          var2 = this.a.poll();
          if (var2 != null) {
            var3 = (jaclib.peer.PeerReference) ((Object) var2);
            this.b(-27558, var3);
            continue L0;
          } else {
            if (param0 != 8841) {
              var4 = (jaclib.peer.PeerReference) null;
              this.b(-120, (jaclib.peer.PeerReference) null);
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void b(int param0, jaclib.peer.PeerReference param1) {
        jaclib.peer.PeerReference var4 = null;
        L0: {
          if (this.c == param1) {
            this.c = param1.b;
            break L0;
          } else {
            break L0;
          }
        }
        if (param1 != this.b) {
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
              var4 = (jaclib.peer.PeerReference) null;
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
            this.b = param1.a;
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
              var4 = (jaclib.peer.PeerReference) null;
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
        this.a = new java.lang.ref.ReferenceQueue();
    }

    final void a(int param0, jaclib.peer.PeerReference param1) {
        jaclib.peer.PeerReference var4 = null;
        param1.b = null;
        param1.a = this.b;
        if (param0 <= 61) {
          L0: {
            var4 = (jaclib.peer.PeerReference) null;
            this.a(114, (jaclib.peer.PeerReference) null);
            if (null == this.c) {
              this.c = param1;
              break L0;
            } else {
              this.b.b = param1;
              break L0;
            }
          }
          this.b = param1;
          return;
        } else {
          L1: {
            if (null == this.c) {
              this.c = param1;
              break L1;
            } else {
              this.b.b = param1;
              break L1;
            }
          }
          this.b = param1;
          return;
        }
    }
}
