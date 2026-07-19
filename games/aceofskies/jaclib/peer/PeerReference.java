/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

abstract class PeerReference extends java.lang.ref.WeakReference {
    jaclib.peer.PeerReference b;
    private long peer;
    jaclib.peer.PeerReference a;

    final long a(int param0) {
        long var2 = 0L;
        if (-1L == (this.peer ^ -1L)) {
            var2 = 0L;
        } else {
            var2 = this.releasePeer(this.peer);
            this.peer = 0L;
        }
        int var4 = -53 % ((-30 - param0) / 60);
        return var2;
    }

    PeerReference(jaclib.peer.Peer param0, jaclib.peer.qt param1) {
        super(param0, param1.a);
        param1.b((jaclib.peer.PeerReference) (this), -19676);
    }

    final void setPeer(long param0) {
        this.peer = param0;
    }

    protected abstract long releasePeer(long param0);
}
