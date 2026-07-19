/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

class IUnknownReference extends jaclib.peer.PeerReference {
    protected final native long releasePeer(long param0);

    IUnknownReference(jaclib.peer.IUnknown param0, jaclib.peer.qt param1) {
        super(param0, param1);
    }
}
