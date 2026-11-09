/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public class NativeBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private long address;
    private int size;

    private final native void get(long param0, byte[] param1, int param2, int param3, int param4);

    protected final void bindAddress(long address, int size) {
        this.size = size;
        this.address = address;
    }

    private final native void put(long param0, byte[] param1, int param2, int param3, int param4);

    public final int getSize() {
        return this.size;
    }

    protected NativeBuffer() {
        this.size = -1;
    }

    public void putBytes(byte[] source, int sourceOffset, int destinationOffset, int length) {
        if (((source.length < length + sourceOffset ? 1 : 0) | ((source == null ? 1 : 0) | (this.address == 0L ? 1 : 0) | (sourceOffset < 0 ? 1 : 0)) | (destinationOffset < 0 ? 1 : 0) | (destinationOffset + length > this.size ? 1 : 0)) == 0) {
          this.put(this.address, source, sourceOffset, destinationOffset, length);
          return;
        }
        throw new RuntimeException();
    }
}
