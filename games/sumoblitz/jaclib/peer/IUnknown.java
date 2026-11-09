/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    public final long release(int guard) {
        RuntimeException var2;
        if (guard == -22671) {
          return super.releaseReference();
        }
        return -115L;
    }

    public final native long AddRef();

    protected IUnknown(jaclib.peer.PeerReferenceManager manager) {
        this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference(this, manager));
    }
}
