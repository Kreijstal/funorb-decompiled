/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

class IUnknownReference extends jaclib.peer.PeerReference {
    IUnknownReference(jaclib.peer.IUnknown owner, jaclib.peer.PeerReferenceManager manager) {
        super(owner, manager);
    }

    protected final native long releasePeer(long param0);
}
