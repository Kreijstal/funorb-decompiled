/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class GeometryBuffer extends jaclib.peer.NativeHeapPeer implements jaclib.memory.Buffer {
    private final native void nativeGetBytes(byte[] param0, int param1, int param2, int param3);

    public final native long getAddress();

    private final native void init();

    public final native int getSize();

    private final native void nativePutBytes(byte[] param0, int param1, int param2, int param3);

    public final void putBytes(byte[] source, int sourceOffset, int destinationOffset, int length) {
        if (((source == null ? 1 : 0) | (sourceOffset < 0 ? 1 : 0) | (source.length < sourceOffset + length ? 1 : 0) | (0 > destinationOffset ? 1 : 0)) != 0) {
          throw new jagdx.DirectXException();
        }
        if (length + destinationOffset <= this.getSize()) {
          this.nativePutBytes(source, sourceOffset, destinationOffset, length);
          return;
        }
        throw new jagdx.DirectXException();
    }

    public GeometryBuffer(jaclib.peer.PeerReferenceManager param0) {
        super(param0);
        this.init();
    }
}
