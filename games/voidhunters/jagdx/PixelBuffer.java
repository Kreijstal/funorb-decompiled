/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class PixelBuffer extends jaclib.peer.doa implements jaclib.memory.Buffer {
    private final native void init();

    public final void a(int[] param0, int param1, int param2, int param3) {
        if (((param2 < 0 ? 1 : 0) | ((param1 + param3 > param0.length ? 1 : 0) | ((param0 == null ? 1 : 0) | (param1 < 0 ? 1 : 0)))) != 0) {
          throw new jagdx.nba();
        }
        if (this.getSize() >= param2 + 4 * param3) {
          this.puti(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.nba();
    }

    private final native void puti(int[] param0, int param1, int param2, int param3);

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final void b(int[] param0, int param1, int param2, int param3) {
        if (((param1 < 0 ? 1 : 0) | (param0 == null ? 1 : 0) | (param3 + param1 > param0.length ? 1 : 0) | (0 > param2 ? 1 : 0)) != 0) {
          throw new jagdx.nba();
        }
        if (4 * param3 + param2 <= this.getSize()) {
          this.geti(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.nba();
    }

    public PixelBuffer(jaclib.peer.tqb param0) {
        super(param0);
        this.init();
    }

    public final native int getRowPitch();

    public final native int getSize();

    public final native int getSlicePitch();

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((param1 + param3 > param0.length ? 1 : 0) | ((param1 < 0 ? 1 : 0) | (param0 == null ? 1 : 0)) | (param2 < 0 ? 1 : 0)) != 0) {
          throw new jagdx.nba();
        }
        if (param2 + param3 <= this.getSize()) {
          this.putub(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.nba();
    }

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    private final native void geti(int[] param0, int param1, int param2, int param3);
}
