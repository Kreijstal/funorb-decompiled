/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public interface Buffer {
    public abstract void putBytes(byte[] source, int sourceOffset, int destinationOffset, int length);

    public abstract int getSize();
}
