/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

abstract class PeerReference extends java.lang.ref.WeakReference {
    jaclib.peer.PeerReference previous;
    private long peer;
    jaclib.peer.PeerReference next;

    protected abstract long releasePeer(long param0);

    final long release(int guard) {
        long var2 = 0L;
        long var2Lifetime1;
        if (guard == 0) {
          if (this.peer != 0L) {
            var2 = this.releasePeer(this.peer);
            this.peer = 0L;
          } else {
            var2 = 0L;
          }
          return var2;
        }
        this.release(-109);
        if (this.peer != 0L) {
          var2Lifetime1 = this.releasePeer(this.peer);
          this.peer = 0L;
        } else {
          var2Lifetime1 = 0L;
        }
        return var2Lifetime1;
    }

    final void setPeer(long param0) {
        this.release(0);
        this.peer = param0;
    }

    PeerReference(jaclib.peer.Peer owner, jaclib.peer.PeerReferenceManager manager) {
        super(owner, manager.queue);
        manager.add(this, -13587);
    }
}
