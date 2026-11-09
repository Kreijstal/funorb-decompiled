/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class PixelBuffer extends jaclib.peer.NativeHeapPeer implements jaclib.memory.Buffer {
    private final native void init();

    public PixelBuffer(jaclib.peer.PeerReferenceManager param0) {
        super(param0);
        this.init();
    }

    private final native void nativeGetInts(int[] param0, int param1, int param2, int param3);

    public final native int getSize();

    public final void putBytes(byte[] source, int sourceOffset, int destinationOffset, int length) {
        if (((destinationOffset < 0 ? 1 : 0) | ((source.length < sourceOffset + length ? 1 : 0) | ((source == null ? 1 : 0) | (sourceOffset < 0 ? 1 : 0)))) != 0) {
          throw new jagdx.DirectXException();
        }
        if (length + destinationOffset <= this.getSize()) {
          this.nativePutBytes(source, sourceOffset, destinationOffset, length);
          return;
        }
        throw new jagdx.DirectXException();
    }

    private final native void nativeGetBytes(byte[] param0, int param1, int param2, int param3);

    public final void putInts(int[] source, int sourceOffset, int destinationByteOffset, int length) {
        if (((destinationByteOffset < 0 ? 1 : 0) | ((0 > sourceOffset ? 1 : 0) | (source == null ? 1 : 0) | (source.length < length + sourceOffset ? 1 : 0))) != 0) {
          throw new jagdx.DirectXException();
        }
        if (4 * length + destinationByteOffset <= this.getSize()) {
          this.nativePutInts(source, sourceOffset, destinationByteOffset, length);
          return;
        }
        throw new jagdx.DirectXException();
    }

    public final native int getRowPitch();

    private final native void nativePutBytes(byte[] param0, int param1, int param2, int param3);

    private final native void nativePutInts(int[] param0, int param1, int param2, int param3);

    public final native int getSlicePitch();
}
