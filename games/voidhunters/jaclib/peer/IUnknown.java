/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    protected IUnknown(jaclib.peer.tqb param0) {
        ((jaclib.peer.IUnknown) this).reference = (jaclib.peer.PeerReference) (Object) new jaclib.peer.IUnknownReference((jaclib.peer.IUnknown) this, param0);
    }

    public final long a(boolean param0) {
        if (param0) {
            return super.a();
        }
        return super.a();
    }

    public final native long AddRef();
}
