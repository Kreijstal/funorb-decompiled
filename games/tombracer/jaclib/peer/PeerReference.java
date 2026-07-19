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
        param1.a(63, (jaclib.peer.PeerReference) (this));
    }

    final long a(byte param0) {
        long var2 = 0L;
        if (param0 != 34) {
          L0: {
            this.a = (jaclib.peer.PeerReference) null;
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
}
