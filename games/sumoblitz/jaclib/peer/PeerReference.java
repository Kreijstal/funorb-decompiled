/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

abstract class PeerReference extends java.lang.ref.WeakReference {
    jaclib.peer.PeerReference a;
    private long peer;
    jaclib.peer.PeerReference b;

    protected abstract long releasePeer(long param0);

    final long a(int param0) {
        long var2 = 0L;
        if (param0 != 0) {
          L0: {
            if (((jaclib.peer.PeerReference) this).peer == 0L) {
              var2 = 0L;
              break L0;
            } else {
              var2 = ((jaclib.peer.PeerReference) this).releasePeer(((jaclib.peer.PeerReference) this).peer);
              ((jaclib.peer.PeerReference) this).peer = 0L;
              break L0;
            }
          }
          return var2;
        } else {
          L1: {
            if (((jaclib.peer.PeerReference) this).peer == 0L) {
              var2 = 0L;
              break L1;
            } else {
              var2 = ((jaclib.peer.PeerReference) this).releasePeer(((jaclib.peer.PeerReference) this).peer);
              ((jaclib.peer.PeerReference) this).peer = 0L;
              break L1;
            }
          }
          return var2;
        }
    }

    final void setPeer(long param0) {
        ((jaclib.peer.PeerReference) this).peer = param0;
    }

    PeerReference(jaclib.peer.Peer param0, jaclib.peer.pf param1) {
        super((Object) (Object) param0, param1.a);
        param1.a((jaclib.peer.PeerReference) this, -13587);
    }
}
