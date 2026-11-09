/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public abstract class Peer {
    protected jaclib.peer.PeerReference reference;

    protected long releaseReference() {
        return this.reference.release(0);
    }

    private final native static void init(Class param0);

    static {
        jaclib.peer.Peer.init(jaclib.peer.PeerReference.class);
    }
}
