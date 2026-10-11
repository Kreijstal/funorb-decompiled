/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    public final long a(int param0) {
        RuntimeException var2;
        if (param0 == -22671) {
          return super.a();
        }
        return -115L;
    }

    public final native long AddRef();

    protected IUnknown(jaclib.peer.pf param0) {
        this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference(this, param0));
    }
}
