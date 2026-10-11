/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class PixelBuffer extends jaclib.peer.nca implements jaclib.memory.Buffer {
    public final void a(int[] param0, int param1, int param2, int param3) {
        if (((param1 < 0 ? 1 : 0) | (param0 == null ? 1 : 0) | (param1 + param3 > param0.length ? 1 : 0) | (param2 < 0 ? 1 : 0)) != 0) {
          throw new jagdx.eva();
        }
        if (this.getSize() >= param2 + 4 * param3) {
          this.puti(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.eva();
    }

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((param2 < 0 ? 1 : 0) | ((param0 == null ? 1 : 0) | (param1 < 0 ? 1 : 0) | (param3 + param1 > param0.length ? 1 : 0))) != 0) {
          throw new jagdx.eva();
        }
        if (this.getSize() >= param2 + param3) {
          this.putub(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.eva();
    }

    public final native int getSize();

    public PixelBuffer(jaclib.peer.sha param0) {
        super(param0);
        this.init();
    }

    private final native void puti(int[] param0, int param1, int param2, int param3);

    public final native int getRowPitch();

    public final native int getSlicePitch();

    private final native void init();

    public final long getAddress() {
        return 0L;
    }

    private final native void geti(int[] param0, int param1, int param2, int param3);
}
