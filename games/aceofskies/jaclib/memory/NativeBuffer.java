/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public class NativeBuffer implements jaclib.memory.Buffer, jaclib.memory.Source {
    private int b;
    private long a;

    public void a(byte[] param0, int param1, int param2, int param3) {
        if (!(((((jaclib.memory.NativeBuffer) this).b < param3 + param2 ? 1 : 0) | ((((jaclib.memory.NativeBuffer) this).a == 0L ? 1 : 0) | (param0 == null ? 1 : 0) | (param1 < 0 ? 1 : 0) | (param0.length < param3 + param1 ? 1 : 0) | (param2 < 0 ? 1 : 0))) == 0)) {
            throw new RuntimeException();
        }
        this.put(((jaclib.memory.NativeBuffer) this).a, param0, param1, param2, param3);
    }

    protected final void a(long param0, int param1) {
        ((jaclib.memory.NativeBuffer) this).a = param0;
        ((jaclib.memory.NativeBuffer) this).b = param1;
    }

    private final native void get(long param0, byte[] param1, int param2, int param3, int param4);

    private final native void put(long param0, byte[] param1, int param2, int param3, int param4);

    protected NativeBuffer() {
        ((jaclib.memory.NativeBuffer) this).b = -1;
    }

    public final int getSize() {
        return ((jaclib.memory.NativeBuffer) this).b;
    }
}
