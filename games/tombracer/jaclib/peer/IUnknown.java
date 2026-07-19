/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    protected IUnknown(jaclib.peer.sha param0) {
        try {
            this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference((jaclib.peer.IUnknown) (this), param0));
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public final native long AddRef();

    public final long a(boolean param0) {
        RuntimeException var2 = null;
        if (!param0) {
          return super.a();
        } else {
          return 101L;
        }
    }
}
