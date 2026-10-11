/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

abstract class PeerReference extends java.lang.ref.WeakReference {
    private long peer;
    jaclib.peer.PeerReference a;
    jaclib.peer.PeerReference b;

    PeerReference(jaclib.peer.Peer param0, jaclib.peer.sha param1) {
        super(param0, param1.a);
        param1.a(63, this);
    }

    final long a(byte param0) {
        long var2 = 0L;
        long var2Lifetime1;
        if (param0 == 34) {
          if (this.peer == 0L) {
            var2 = 0L;
          } else {
            var2 = this.releasePeer(this.peer);
            this.peer = 0L;
          }
          return var2;
        }
        this.a = (jaclib.peer.PeerReference) null;
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
        this.a((byte) 34);
        this.peer = param0;
    }
}
