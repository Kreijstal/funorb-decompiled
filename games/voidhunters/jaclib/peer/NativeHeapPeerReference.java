/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

class NativeHeapPeerReference extends jaclib.peer.PeerReference {
    NativeHeapPeerReference(jaclib.peer.doa param0, jaclib.peer.tqb param1) {
        super((jaclib.peer.Peer) (Object) param0, param1);
    }

    protected final native long releasePeer(long param0);
}
