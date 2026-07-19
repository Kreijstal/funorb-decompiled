/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public abstract class Peer {
    protected jaclib.peer.PeerReference reference;

    protected long a() {
        return this.reference.a((byte) 34);
    }

    private final native static void init(Class param0);

    static {
        jaclib.peer.Peer.init(jaclib.peer.PeerReference.class);
    }
}
