/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class GeometryBuffer extends jaclib.peer.nd implements jaclib.memory.Buffer {
    private final native void putub(byte[] param0, int param1, int param2, int param3);

    public final native long getAddress();

    public final native int getSize();

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    private final native void init();

    public GeometryBuffer(jaclib.peer.qt param0) {
        super(param0);
        this.init();
    }

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((param2 < 0 ? 1 : 0) | ((param1 < 0 ? 1 : 0) | (param0 == null ? 1 : 0) | (param0.length < param1 + param3 ? 1 : 0))) != 0) {
          throw new jagdx.ie();
        }
        if (this.getSize() >= param3 + param2) {
          this.putub(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.ie();
    }
}
