/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class GeometryBuffer extends jaclib.peer.sw implements jaclib.memory.Buffer {
    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final native long getAddress();

    private final native void init();

    public final native int getSize();

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((param0 == null ? 1 : 0) | (param1 < 0 ? 1 : 0) | (param0.length < param1 + param3 ? 1 : 0) | (0 > param2 ? 1 : 0)) != 0) {
          throw new jagdx.fg();
        }
        if (param3 + param2 <= this.getSize()) {
          this.putub(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.fg();
    }

    public GeometryBuffer(jaclib.peer.pf param0) {
        super(param0);
        this.init();
    }
}
