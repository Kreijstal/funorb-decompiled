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
        param1.a(param0 - 19176);
        if (this.b == param1) {
          this.b = param1.b;
        }
        if (this.c == param1) {
          this.c = param1.a;
        }
        if (param1.b != null) {
          param1.b.a = param1.a;
        }
        if (param1.a != null) {
          param1.a.b = param1.b;
        }
        if (param0 == 19176) {
          return;
        }
        this.b = (jaclib.peer.PeerReference) null;
    }

    public final void a(int param0) {
        jaclib.peer.PeerReference var3 = null;
        if (param0 != -25924) {
          var3 = (jaclib.peer.PeerReference) null;
          this.a((jaclib.peer.PeerReference) null, -79);
        } else {
          this.a(false);
          while (this.c != null) {
            this.a(19176, this.c);
          }
          this.a(false);
          return;
        }
        this.a(false);
        while (this.c != null) {
          this.a(19176, this.c);
        }
        this.a(false);
    }

    final void a(jaclib.peer.PeerReference param0, int param1) {
        if (param1 == -13587) {
          param0.b = null;
          param0.a = this.c;
          if (null != this.b) {
            this.c.b = param0;
          } else {
            this.b = param0;
          }
          this.c = param0;
          return;
        }
    }

    private final void a(boolean param0) {
        java.lang.ref.Reference var2;
        jaclib.peer.PeerReference var3;
        if (param0) {
          return;
        }
        while (true) {
          var2 = this.a.poll();
          if (var2 == null) {
            return;
          }
          var3 = (jaclib.peer.PeerReference) ((Object) var2);
          this.a(19176, var3);
        }
    }

    public pf() {
        this.a = new java.lang.ref.ReferenceQueue();
    }
}
