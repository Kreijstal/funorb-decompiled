/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    protected IUnknown(jaclib.peer.qt param0) {
        this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference(this, param0));
    }

    public final long a(int param0) {
        RuntimeException var2;
        if (param0 != 1618) {
          this.a(-78);
        }
        return super.a();
    }

    public final native long AddRef();
}
