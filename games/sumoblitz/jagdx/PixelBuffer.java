/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class PixelBuffer extends jaclib.peer.sw implements jaclib.memory.Buffer {
    private final native void init();

    public PixelBuffer(jaclib.peer.pf param0) {
        super(param0);
        this.init();
    }

    private final native void geti(int[] param0, int param1, int param2, int param3);

    public final native int getSize();

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((param2 < 0 ? 1 : 0) | ((param0.length < param1 + param3 ? 1 : 0) | ((param0 == null ? 1 : 0) | (param1 < 0 ? 1 : 0)))) != 0) {
          throw new jagdx.fg();
        }
        if (param3 + param2 <= this.getSize()) {
          this.putub(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.fg();
    }

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final void a(int[] param0, int param1, int param2, int param3) {
        if (((param2 < 0 ? 1 : 0) | ((0 > param1 ? 1 : 0) | (param0 == null ? 1 : 0) | (param0.length < param3 + param1 ? 1 : 0))) != 0) {
          throw new jagdx.fg();
        }
        if (4 * param3 + param2 <= this.getSize()) {
          this.puti(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.fg();
    }

    public final native int getRowPitch();

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    private final native void puti(int[] param0, int param1, int param2, int param3);

    public final native int getSlicePitch();
}
