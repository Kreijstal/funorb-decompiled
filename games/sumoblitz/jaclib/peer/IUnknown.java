/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    public final long a(int param0) {
        if (param0 != -22671) {
            return -115L;
        }
        return super.a();
    }

    public final native long AddRef();

    protected IUnknown(jaclib.peer.pf param0) {
        ((jaclib.peer.IUnknown) this).reference = (jaclib.peer.PeerReference) (Object) new jaclib.peer.IUnknownReference((jaclib.peer.IUnknown) this, param0);
    }
}
