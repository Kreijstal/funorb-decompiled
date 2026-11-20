/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    protected IUnknown(jaclib.peer.PeerReferenceManager param0) {
        this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference(this, param0));
    }

    public final long release(boolean param0) {
        RuntimeException var2;
        if (param0) {
          this.AddRef();
        }
        return super.release();
    }

    public final native long AddRef();
}
