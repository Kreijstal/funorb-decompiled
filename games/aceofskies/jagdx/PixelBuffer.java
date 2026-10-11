/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class PixelBuffer extends jaclib.peer.nd implements jaclib.memory.Buffer {
    public PixelBuffer(jaclib.peer.qt param0) {
        super(param0);
        this.init();
    }

    public final native int getSize();

    public final native int getRowPitch();

    public final native int getSlicePitch();

    private final native void puti(int[] param0, int param1, int param2, int param3);

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final void a(int[] param0, int param1, int param2, int param3) {
        if (((param0.length < param1 + param3 ? 1 : 0) | ((param1 < 0 ? 1 : 0) | (param0 == null ? 1 : 0)) | (0 > param2 ? 1 : 0)) != 0) {
          throw new jagdx.ie();
        }
        if (this.getSize() >= param3 * 4 + param2) {
          this.puti(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.ie();
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((param2 < 0 ? 1 : 0) | ((param0 == null ? 1 : 0) | (0 > param1 ? 1 : 0) | (param0.length < param1 + param3 ? 1 : 0))) != 0) {
          throw new jagdx.ie();
        }
        if (param2 + param3 <= this.getSize()) {
          this.putub(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.ie();
    }

    private final native void init();

    private final native void geti(int[] param0, int param1, int param2, int param3);
}
