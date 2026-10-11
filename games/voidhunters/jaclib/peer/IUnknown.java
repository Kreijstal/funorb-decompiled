/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    protected IUnknown(jaclib.peer.tqb param0) {
        this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference(this, param0));
    }

    public final long a(boolean param0) {
        RuntimeException var2;
        if (param0) {
          this.AddRef();
        }
        return super.a();
    }

    public final native long AddRef();
}
