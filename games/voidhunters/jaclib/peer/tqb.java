/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public final class tqb {
    java.lang.ref.ReferenceQueue b;
    private jaclib.peer.PeerReference c;
    private jaclib.peer.PeerReference a;

    private final void a(int param0) {
        java.lang.ref.Reference var2;
        jaclib.peer.PeerReference var5;
        jaclib.peer.PeerReference var4;
        java.lang.ref.Reference var2Lifetime1;
        if (param0 == -18289) {
          while (true) {
            var2 = this.b.poll();
            if (var2 == null) {
              return;
            }
            var4 = (jaclib.peer.PeerReference) ((Object) var2);
            this.a(-22216, var4);
          }
        }
        this.a = (jaclib.peer.PeerReference) null;
        while (true) {
          var2Lifetime1 = this.b.poll();
          if (var2Lifetime1 == null) {
            return;
          }
          var5 = (jaclib.peer.PeerReference) ((Object) var2Lifetime1);
          this.a(-22216, var5);
        }
    }

    public tqb() {
        this.b = new java.lang.ref.ReferenceQueue();
    }

    public final void a(byte param0) {
        this.a(-18289);
        while (null != this.c) {
          this.a(-22216, this.c);
        }
        if (param0 > 56) {
          this.a(-18289);
          return;
        }
        this.b = (java.lang.ref.ReferenceQueue) null;
        this.a(-18289);
    }

    private final void a(int param0, jaclib.peer.PeerReference param1) {
        param1.a(0);
        if (param1 == this.c) {
          this.c = param1.b;
        }
        if (param1 == this.a) {
          this.a = param1.a;
        }
        if (param1.a != null) {
          param1.a.b = param1.b;
        }
        if (param0 == -22216) {
          if (param1.b != null) {
            param1.b.a = param1.a;
          }
          return;
        }
    }

    final void a(jaclib.peer.PeerReference param0, int param1) {
        param0.a = null;
        if (param1 == 25362) {
          param0.b = this.c;
          if (null != this.a) {
            this.c.a = param0;
          } else {
            this.a = param0;
          }
          this.c = param0;
          return;
        }
        this.a = (jaclib.peer.PeerReference) null;
        param0.b = this.c;
        if (null != this.a) {
          this.c.a = param0;
        } else {
          this.a = param0;
        }
        this.c = param0;
    }

    public final void a(boolean param0) {
        this.a(-18289);
        if (!param0) {
          return;
        }
        this.c = (jaclib.peer.PeerReference) null;
    }
}
