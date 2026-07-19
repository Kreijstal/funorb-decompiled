/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.peer;

class IUnknownReference extends jaclib.peer.PeerReference {
    IUnknownReference(jaclib.peer.IUnknown param0, jaclib.peer.sha param1) {
        super(param0, param1);
    }

    protected final native long releasePeer(long param0);
}
