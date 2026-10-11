/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class qt {
    java.lang.ref.ReferenceQueue a;
    private jaclib.peer.PeerReference b;
    private jaclib.peer.PeerReference c;

    public final void a(byte param0) {
        this.a(-25120);
        if (param0 != 23) {
          jaclib.peer.PeerReference var3 = (jaclib.peer.PeerReference) null;
          this.a((jaclib.peer.PeerReference) null, 2);
        }
    }

    private final void a(jaclib.peer.PeerReference param0, int param1) {
        param0.a(param1 + 26222);
        if (param1 != -26315) {
          this.a = (java.lang.ref.ReferenceQueue) null;
        }
        if (param0 == this.c) {
          this.c = param0.b;
        }
        if (param0 == this.b) {
          this.b = param0.a;
        }
        if (null != param0.a) {
          param0.a.b = param0.b;
        }
        if (null != param0.b) {
          param0.b.a = param0.a;
        }
    }

    public final void b(byte param0) {
        this.a(-25120);
        while (this.c != null) {
          this.a(this.c, -26315);
        }
        if (param0 >= 46) {
          this.a(-25120);
          return;
        }
        this.a = (java.lang.ref.ReferenceQueue) null;
        this.a(-25120);
    }

    private final void a(int param0) {
        java.lang.ref.Reference var2;
        jaclib.peer.PeerReference var3;
        while (true) {
          var2 = this.a.poll();
          if (var2 != null) {
            var3 = (jaclib.peer.PeerReference) ((Object) var2);
            this.a(var3, -26315);
            continue;
          }
          break;
        }
        if (param0 == -25120) {
          return;
        }
        this.b((byte) 50);
        return;
    }

    public qt() {
        this.a = new java.lang.ref.ReferenceQueue();
    }

    final void b(jaclib.peer.PeerReference param0, int param1) {
        param0.a = null;
        param0.b = this.c;
        if (param1 == -19676) {
          if (null != this.b) {
            this.c.a = param0;
          } else {
            this.b = param0;
          }
          this.c = param0;
          return;
        }
    }
}
