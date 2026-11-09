/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

public class NativeHeapPeer extends jaclib.peer.Peer {
    protected NativeHeapPeer(jaclib.peer.PeerReferenceManager manager) {
        this.reference = (jaclib.peer.PeerReference) ((Object) new jaclib.peer.NativeHeapPeerReference(this, manager));
    }
}
