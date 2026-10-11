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
        while (this.b != null) {
          this.b(-27558, this.b);
        }
        if (param0 == 14203) {
          this.a(8841);
          return;
        }
        this.c = (jaclib.peer.PeerReference) null;
        this.a(8841);
    }

    public final void c(int param0) {
        if (param0 != -24122) {
          return;
        }
        this.a(8841);
    }

    private final void a(int param0) {
        java.lang.ref.Reference var2;
        jaclib.peer.PeerReference var3;
        jaclib.peer.PeerReference var4;
        while (true) {
          var2 = this.a.poll();
          if (var2 != null) {
            var3 = (jaclib.peer.PeerReference) ((Object) var2);
            this.b(-27558, var3);
            continue;
          }
          break;
        }
        if (param0 == 8841) {
          return;
        }
        var4 = (jaclib.peer.PeerReference) null;
        this.b(-120, (jaclib.peer.PeerReference) null);
        return;
    }

    private final void b(int param0, jaclib.peer.PeerReference param1) {
        jaclib.peer.PeerReference var4;
        jaclib.peer.PeerReference var4Lifetime1;
        param1.a((byte) 34);
        if (this.c == param1) {
          this.c = param1.b;
        }
        if (param1 == this.b) {
          this.b = param1.a;
          if (param1.b != null) {
            param1.b.a = param1.a;
          }
          if (param0 != -27558) {
            var4 = (jaclib.peer.PeerReference) null;
            this.b(-21, (jaclib.peer.PeerReference) null);
          }
          if (null != param1.a) {
            param1.a.b = param1.b;
          }
          return;
        }
        if (param1.b != null) {
          param1.b.a = param1.a;
        }
        if (param0 == -27558) {
          if (null != param1.a) {
            param1.a.b = param1.b;
          }
          return;
        }
        var4Lifetime1 = (jaclib.peer.PeerReference) null;
        this.b(-21, (jaclib.peer.PeerReference) null);
        if (null != param1.a) {
          param1.a.b = param1.b;
        }
        return;
    }

    public sha() {
        this.a = new java.lang.ref.ReferenceQueue();
    }

    final void a(int param0, jaclib.peer.PeerReference param1) {
        param1.b = null;
        param1.a = this.b;
        if (param0 > 61) {
          if (null != this.c) {
            this.b.b = param1;
          } else {
            this.c = param1;
          }
          this.b = param1;
          return;
        }
        jaclib.peer.PeerReference var4 = (jaclib.peer.PeerReference) null;
        this.a(114, (jaclib.peer.PeerReference) null);
        if (null != this.c) {
          this.b.b = param1;
        } else {
          this.c = param1;
        }
        this.b = param1;
    }
}
