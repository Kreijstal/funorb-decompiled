/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jagdx;

public class GeometryBuffer extends jaclib.peer.doa implements jaclib.memory.Buffer {
    public GeometryBuffer(jaclib.peer.tqb param0) {
        super(param0);
        this.init();
    }

    private final native void getub(byte[] param0, int param1, int param2, int param3);

    public final native long getAddress();

    private final native void init();

    public final void a(byte[] param0, int param1, int param2, int param3) {
        if (((0 > param2 ? 1 : 0) | ((param1 < 0 ? 1 : 0) | (param0 == null ? 1 : 0) | (param0.length < param3 + param1 ? 1 : 0))) != 0) {
          throw new jagdx.nba();
        }
        if (param2 + param3 <= this.getSize()) {
          this.putub(param0, param1, param2, param3);
          return;
        }
        throw new jagdx.nba();
    }

    private final native void putub(byte[] param0, int param1, int param2, int param3);

    public final native int getSize();
}
