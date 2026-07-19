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
        if (param0 != 0) {
          L0: {
            this.peer = -1L;
            if ((this.peer ^ -1L) != -1L) {
              var2 = this.releasePeer(this.peer);
              this.peer = 0L;
              break L0;
            } else {
              var2 = 0L;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if ((this.peer ^ -1L) != -1L) {
              var2 = this.releasePeer(this.peer);
              this.peer = 0L;
              break L1;
            } else {
              var2 = 0L;
              break L1;
            }
          }
          return var2;
        }
    }

    protected abstract long releasePeer(long param0);

    final void setPeer(long param0) {
        this.peer = param0;
    }

    PeerReference(jaclib.peer.Peer param0, jaclib.peer.tqb param1) {
        super(param0, param1.b);
        param1.a((jaclib.peer.PeerReference) (this), 25362);
    }
}
