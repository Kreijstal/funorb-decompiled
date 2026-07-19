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
        this.c = (jaclib.peer.PeerReference) null;
    }

    private final void a(int param0, jaclib.peer.PeerReference param1) {
        L0: {
          if (this.b == param1) {
            this.b = param1.b;
            break L0;
          } else {
            break L0;
          }
        }
        if (this.c != param1) {
          if (param1.b == null) {
            L1: {
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 19176) {
              return;
            } else {
              this.b = (jaclib.peer.PeerReference) null;
              return;
            }
          } else {
            L2: {
              param1.b.a = param1.a;
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 == 19176) {
              return;
            } else {
              this.b = (jaclib.peer.PeerReference) null;
              return;
            }
          }
        } else {
          this.c = param1.a;
          if (param1.b != null) {
            L3: {
              param1.b.a = param1.a;
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L3;
              } else {
                break L3;
              }
            }
            if (param0 == 19176) {
              return;
            } else {
              this.b = (jaclib.peer.PeerReference) null;
              return;
            }
          } else {
            L4: {
              if (param1.a != null) {
                param1.a.b = param1.b;
                break L4;
              } else {
                break L4;
              }
            }
            if (param0 == 19176) {
              return;
            } else {
              this.b = (jaclib.peer.PeerReference) null;
              return;
            }
          }
        }
    }

    public final void a(int param0) {
        jaclib.peer.PeerReference var3 = null;
        if (param0 == -25924) {
          this.a(false);
          L0: while (true) {
            if (this.c == null) {
              this.a(false);
              return;
            } else {
              this.a(19176, this.c);
              continue L0;
            }
          }
        } else {
          var3 = (jaclib.peer.PeerReference) null;
          this.a((jaclib.peer.PeerReference) null, -79);
          this.a(false);
          L1: while (true) {
            if (this.c == null) {
              this.a(false);
              return;
            } else {
              this.a(19176, this.c);
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
            param0.a = this.c;
            if (null == this.b) {
              this.b = param0;
              break L0;
            } else {
              this.c.b = param0;
              break L0;
            }
          }
          this.c = param0;
          return;
        }
    }

    private final void a(boolean param0) {
        java.lang.ref.Reference var2 = null;
        jaclib.peer.PeerReference var3 = null;
        if (!param0) {
          L0: while (true) {
            var2 = this.a.poll();
            if (var2 != null) {
              var3 = (jaclib.peer.PeerReference) ((Object) var2);
              this.a(19176, var3);
              continue L0;
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    public pf() {
        this.a = new java.lang.ref.ReferenceQueue();
    }
}
