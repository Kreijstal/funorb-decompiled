/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

class NativeHeapPeerReference extends jaclib.peer.PeerReference {
    NativeHeapPeerReference(jaclib.peer.NativeHeapPeer owner, jaclib.peer.PeerReferenceManager manager) {
        super(owner, manager);
    }

    protected final native long releasePeer(long param0);
}
