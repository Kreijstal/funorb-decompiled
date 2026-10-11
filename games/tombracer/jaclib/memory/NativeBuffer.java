/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public class NativeBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private int a;
    private long b;

    private final native void get(long param0, byte[] param1, int param2, int param3, int param4);

    public final int getSize() {
        return this.a;
    }

    public void a(byte[] param0, int param1, int param2, int param3) {
        if (((0 > param2 ? 1 : 0) | ((param1 < 0 ? 1 : 0) | ((this.b == 0L ? 1 : 0) | (param0 == null ? 1 : 0)) | (param3 + param1 > param0.length ? 1 : 0)) | (param2 + param3 > this.a ? 1 : 0)) == 0) {
          this.put(this.b, param0, param1, param2, param3);
          return;
        }
        throw new RuntimeException();
    }

    private final native void put(long param0, byte[] param1, int param2, int param3, int param4);

    protected NativeBuffer() {
        this.a = -1;
    }

    public final long getAddress() {
        return this.b;
    }

    protected final void a(long param0, int param1) {
        this.b = param0;
        this.a = param1;
    }
}
