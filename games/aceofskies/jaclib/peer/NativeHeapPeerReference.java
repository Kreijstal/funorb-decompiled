/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

class NativeHeapPeerReference extends jaclib.peer.PeerReference {
    NativeHeapPeerReference(jaclib.peer.nd param0, jaclib.peer.qt param1) {
        super(param0, param1);
    }

    protected final native long releasePeer(long param0);
}
