/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    public final long a(int param0) {
        RuntimeException var2 = null;
        if (param0 == -22671) {
          return super.a();
        } else {
          return -115L;
        }
    }

    public final native long AddRef();

    protected IUnknown(jaclib.peer.pf param0) {
        try {
            this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference((jaclib.peer.IUnknown) (this), param0));
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }
}
