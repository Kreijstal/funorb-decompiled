/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class IUnknown extends jaclib.peer.Peer {
    protected IUnknown(jaclib.peer.qt param0) {
        try {
            this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.IUnknownReference((jaclib.peer.IUnknown) (this), param0));
        } catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
    }

    public final long a(int param0) {
        RuntimeException var2 = null;
        L0: {
          if (param0 == 1618) {
            break L0;
          } else {
            break L0;
          }
        }
        return super.a();
    }

    public final native long AddRef();
}
