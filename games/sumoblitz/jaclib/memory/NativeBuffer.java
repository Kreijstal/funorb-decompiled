/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public class NativeBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private long a;
    private int b;

    private final native void get(long param0, byte[] param1, int param2, int param3, int param4);

    protected final void a(long param0, int param1) {
        this.b = param1;
        this.a = param0;
    }

    private final native void put(long param0, byte[] param1, int param2, int param3, int param4);

    public final int getSize() {
        return this.b;
    }

    protected NativeBuffer() {
        this.b = -1;
    }

    public void a(byte[] param0, int param1, int param2, int param3) {
        if (((param0.length < param3 + param1 ? 1 : 0) | ((param0 == null ? 1 : 0) | (this.a == 0L ? 1 : 0) | (param1 < 0 ? 1 : 0)) | (param2 < 0 ? 1 : 0) | (param2 + param3 > this.b ? 1 : 0)) == 0) {
          this.put(this.a, param0, param1, param2, param3);
          return;
        }
        throw new RuntimeException();
    }
}
