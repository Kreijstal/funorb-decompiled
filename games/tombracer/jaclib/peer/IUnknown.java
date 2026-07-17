/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    protected IUnknown(jaclib.peer.sha param0) {
        ((jaclib.peer.IUnknown) this).reference = (jaclib.peer.PeerReference) (Object) new jaclib.peer.IUnknownReference((jaclib.peer.IUnknown) this, param0);
    }

    public final native long AddRef();

    public final long a(boolean param0) {
        if (param0) {
            return 101L;
        }
        return super.a();
    }
}
