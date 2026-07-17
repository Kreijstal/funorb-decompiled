/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public abstract class Peer {
    protected jaclib.peer.PeerReference reference;

    protected long a() {
        return ((jaclib.peer.Peer) this).reference.a(0);
    }

    private final native static void init(Class param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        Peer.init(jaclib.peer.PeerReference.class);
    }
}
