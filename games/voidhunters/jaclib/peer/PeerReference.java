/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

abstract class PeerReference extends java.lang.ref.WeakReference {
    jaclib.peer.PeerReference a;
    private long peer;
    jaclib.peer.PeerReference b;

    final long a(int param0) {
        long var2 = 0L;
        long var2Lifetime1;
        if (param0 == 0) {
          if (this.peer == 0L) {
            var2 = 0L;
          } else {
            var2 = this.releasePeer(this.peer);
            this.peer = 0L;
          }
          return var2;
        }
        this.peer = -1L;
        if (this.peer == 0L) {
          var2Lifetime1 = 0L;
        } else {
          var2Lifetime1 = this.releasePeer(this.peer);
          this.peer = 0L;
        }
        return var2Lifetime1;
    }

    protected abstract long releasePeer(long param0);

    final void setPeer(long param0) {
        this.a(0);
        this.peer = param0;
    }

    PeerReference(jaclib.peer.Peer param0, jaclib.peer.tqb param1) {
        super(param0, param1.b);
        param1.a(this, 25362);
    }
}
